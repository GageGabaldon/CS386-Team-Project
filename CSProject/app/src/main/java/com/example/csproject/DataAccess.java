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

    /** Reads the file and returns a string of the file
     *
     * @param path
     * @return fileasstring
     */
    public String readFile(String path)
    {
        String readtext = null;

        AssetManager am = context.getAssets();

        InputStream isr;
        try{
            isr = am.open(path);

            int size = isr.available();

            byte[] buffer = new byte[size];

            isr.read(buffer);

            isr.close();

            readtext = new String(buffer);

            Log.d("The text description", readtext);
        }
        catch (IOException c){
            Log.d("\n\nIO Exception: ", "Could not find File");
        }
        return readtext;
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

        Log.d("File Path Used: ", path);
        // this is the text of the file.
        String filetext =  readFile(path);

        String description = "";

        if( filetext != null )
            description = filetext.substring( 0, filetext.lastIndexOf( "1" ) );
        else
            return null;

        return description;
    }

    /** Get the events choices of a text file.
     *
     * @param folderName
     * @param fileName
     * @return
     */
    public String[] getEventChoices( String folderName, String fileName ){
        String path = filepath + folderName + fileName;
        Log.d("File Path Used: ", path);
        String[] choiceArray = new String[] { "", "", "", "" };

        final char PATH_DELIMITER = '@';
        // this is the file in text form.
        String text = readFile(path);
        if( text == null )
            return null;

        int index = 0;
        int choiceNum = 0;
        //while characters are available to read
        while ( index < text.length() && choiceNum < 4 ){
            //reached choice otherwise keep indexing
            if (text.charAt( index ) < 53 && text.charAt( index ) > 48){
                index++;
                while( text.charAt( index ) != PATH_DELIMITER ){
                    choiceArray[ choiceNum ] += text.charAt( index );
                    index++;
                }
                //increment choice num to next index in array
                choiceNum++;
            }
            ++index;
        }

        return choiceArray;
    }

    public String[] getChoicePaths( String folderName, String fileName )
    {

        String path = filepath + folderName + fileName;
        Log.d("File Path Used: ", path);
        String[] choicePath = new String[] { "", "", "", "" };
        final char PATH_DELIMITER = '@';
        // this is the file in text form.
        String text = readFile(path);

        if( text == null )
            return null;
        int index = 0;
        int choiceNum = 0;

        //while characters are available to read
        while ( index < text.length() && choiceNum < 4 ){
            //reached choice otherwise keep indexing
            if (text.charAt(index) == PATH_DELIMITER){
                ++index;
                while (text.charAt(index) != '\n'){
                    choicePath[choiceNum] += text.charAt(index);
                    index++;
                }
                //increment choice num to next index in array
                choiceNum++;
            }
            ++index;
        }

        return choicePath;
    }
}
