package com.example.csproject;

import android.os.Environment;

import java.io.*;
public class DataAccess
{
    String thefilepath = Environment.getExternalStorageDirectory().getAbsolutePath();
    String path = getClass().getClassLoader().getResource(".").getPath();
    public DataAccess()
    {
        thefilepath = "";
    }
    public String getPath()
    {
        return path;
    }
    /** Get Event description
     *
     * @param fileName
     * @param folderName
     * @return
     */
    public String getEventDescription( String folderName, String fileName)
    {
        String filepath = thefilepath + folderName + fileName;
        File eventFile = new File(filepath);
        String description = "";
        try
        {
            //Creation of File Reader object and buffer reader object
            BufferedReader stringBuffer = new BufferedReader( new FileReader( eventFile ) );
            //Getting line from buffer
            String currentLine;
            int firstChar = 0;
            //While line exists
            while( ( currentLine = stringBuffer.readLine() ) != null
                    && !( currentLine.charAt( firstChar ) < 53
                            && currentLine.charAt( firstChar ) > 48 ) )
            {
                //concatenate line to description string
                description.concat( currentLine );
            }
        }
        catch(IOException e)
        {
            return null;
        }
        return description;
    }

    /** Get the events choices of a text file.
     *
     * @param folderName
     * @param fileName
     * @return
     */
    public String[][] getEventChoices( String folderName, String fileName )
    {
        String filepath = thefilepath + folderName + fileName;
        File eventFile = new File(filepath);
        String[] choiceArray = new String[ 4 ];
        String[] choicePath = new String[ 4 ];
        final char PATH_DELIMITER = '@';

        try
        {
            //Creation of File Reader object and buffer reader object
            BufferedReader stringBuffer = new BufferedReader( new FileReader( eventFile ) );
            //Getting line from buffer
            String currentLine;
            int charIndex = 0;
            int choiceNum = 0;
            //While line exists
            while( ( currentLine = stringBuffer.readLine() ) != null )
            {
                //index through choices from text file
                if( currentLine.charAt( charIndex ) < 53 && currentLine.charAt( charIndex ) > 48 )
                {
                    //counts length of characters in choice. Stops at @
                    while (currentLine.charAt(charIndex) != PATH_DELIMITER) {
                        charIndex++;
                    }
                    choiceArray[ choiceNum ] = currentLine.substring( 1, charIndex );
                    //step to next character after delimiter
                    ++charIndex;
                    //store remainder of line ( file name ) to choices path
                    choicePath[ choiceNum ] = currentLine.substring( charIndex );
                    //increment choice num to next index in array
                    choiceNum++;
                    //Reset charIndex to 0 for next line
                    charIndex = 0;
                }
            }
        }
        catch(IOException e)
        {
            return null;
        }
        return new String[][] { choiceArray, choicePath };
    }
}
