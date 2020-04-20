package com.example.csproject;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.*;

public class DataAccess
{
    String filepath;
    Context context;
    public DataAccess(Context context)
    {
        filepath = "Plot/Story/";
        this.context = context;
    }

    /** Get Event description
     *
     * @param fileName
     * @param folderName
     * @return
     */
    public String getEventDescription( String folderName, String fileName)
    {
        String path = filepath + folderName + fileName;
        // this is the text of the file.
        String text = null;
        String description = "";
        AssetManager am = context.getAssets();
        InputStream isr;
        try{
            isr = am.open(path);
            int size = isr.available();
            byte[] buffer = new byte[size];
            isr.read(buffer);
            isr.close();
            text = new String(buffer);
            Log.d("bye", text);
        }
        catch (IOException c)
        {
            Log.d("error", "errors");
        }
        if( text != null )
        description = text.substring( 0, text.lastIndexOf( "1" ) );

        return description;
    }

    /** Get the events choices of a text file.
     *
     * @param folderName
     * @param fileName
     * @return
     */
    public String[][] getEventChoices( String folderName, String fileName ){
        String path = filepath + folderName + fileName;
        String[] choiceArray = new String[ 4 ];
        String[] choicePath = new String[ 4 ];
        final char PATH_DELIMITER = '@';
        // this is the file in text form.
        String text = null;
        AssetManager am = context.getAssets();
        InputStream isr;
        try{
            isr = am.open(path);
            int size = isr.available();
            byte[] buffer = new byte[size];
            isr.read(buffer);
            isr.close();
            text = new String(buffer);
            Log.d("bye", text);
        }
        catch (IOException c)
        {
            Log.d("error", "errors");
        }
        int superIndex = 0;
        int choiceNum = 0;
        if( text != null ) {
            //while characters are available to read
            while ( superIndex < text.length() ) {
                //reached choice otherwise keep indexing
                if (text.charAt( superIndex ) < 53 && text.charAt( superIndex ) > 48) {
                    //counts length of characters in choice. Stops at @
                    int subIndex = superIndex;
                    while ( text.charAt(subIndex) != PATH_DELIMITER )
                        ++subIndex;
                    //increments index off integer 1/2/3/4
                    ++superIndex;
                    //stores the choice substring in array
                    choiceArray[choiceNum] = text.substring( superIndex, subIndex);
                    //step to next character after delimiter
                    ++subIndex;
                    //sets the super index to equal sub for further stepping
                    superIndex = subIndex;
                    //gets the file path at end of choice
                    while( text.charAt( subIndex ) != '\n' )
                        ++subIndex;
                    //store remainder of string line ( file name ) to choices path
                    choicePath[choiceNum] = text.substring( superIndex, subIndex );
                    //increment choice num to next index in array
                    choiceNum++;
                }
                ++superIndex;
            }
        }

        return new String[][] { choiceArray, choicePath };
    }
}
