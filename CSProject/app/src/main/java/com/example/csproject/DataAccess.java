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
        Log.d("Filepathing", path);
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
    public String[] getEventChoices( String folderName, String fileName ){
        String path = filepath + folderName + fileName;
        Log.d("Filepathing", path);
        String[] choiceArray = new String[] { "", "", "", "" };

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
        int index = 0;
        int choiceNum = 0;
        //while characters are available to read
        while ( index < text.length() && choiceNum < 4 ) {
            //reached choice otherwise keep indexing
            if (text.charAt( index ) < 53 && text.charAt( index ) > 48)
            {
                index++;
                while( text.charAt( index ) != PATH_DELIMITER )
                {
                    choiceArray[ choiceNum ] += text.charAt( index );
                    index++;
                }
                //increment choice num to next index in array
                choiceNum++;
            }
            ++index;
        }

        for( String choice : choiceArray )
        {
            Log.d( "Invalid String Element: player choice", choice );
        }

        return choiceArray;
    }

    public String[] getChoicePaths( String folderName, String fileName )
    {

        String path = filepath + folderName + fileName;
        Log.d("Filepathingisforlosers", path);
        String[] choicePath = new String[] { "", "", "", "" };
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
        int index = 0;
        int choiceNum = 0;

        //while characters are available to read
        while ( index < text.length() && choiceNum < 4 ) {
            //reached choice otherwise keep indexing
            if (text.charAt( index ) == PATH_DELIMITER )
            {
                ++index;
                while( text.charAt( index ) != '\n' )
                {
                    choicePath[ choiceNum ] += text.charAt( index );
                    index++;
                }
                //increment choice num to next index in array
                choiceNum++;
            }
            ++index;
        }

        for( String filePath : choicePath )
        {
            Log.d( "Invalid String Element: file path", filePath );
        }
        Log.d("Choicepath", choicePath[0]);
        return choicePath;
    }
}
