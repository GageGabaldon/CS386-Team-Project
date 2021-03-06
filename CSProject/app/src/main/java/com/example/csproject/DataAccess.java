package com.example.csproject;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.example.csproject.Characters.Player;

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
        String readText;

        AssetManager am = context.getAssets();

        InputStream isr;
        try{
            isr = am.open(path);

            int size = isr.available();

            byte[] buffer = new byte[size];

            isr.read(buffer);

            isr.close();

            readText = new String(buffer);

            Log.d( "The text description", readText );
        }
        catch (IOException c){
            Log.d("\n\nIO Exception: ", "Could not find File");
            return null;
        }
        return readText.concat( "\n " );
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
        String fileText =  readFile(path);

        String description;

        if( fileText != null )
        {
            description = fileText.substring(0, fileText.indexOf(">"));
        }
        else
        {
            return null;

        }
        return description.trim();
    }

    /** Get the events choices of a text file.
     *
     * @param folderName
     * @param fileName
     * @return
     */
    public String[] getEventChoices( String folderName, String fileName )
    {
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
        while ( index < text.length() && choiceNum < 4 )
        {
            //reached choice otherwise keep indexing
            if (text.charAt( index ) ==  '>')
            {
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
        choiceArray = redoArrayBasedOnItemRequirements(choiceArray);
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
        while ( index < text.length() && choiceNum < 4 )
        {
            //reached choice otherwise keep indexing
            if (text.charAt(index) == PATH_DELIMITER)
            {
                ++index;
                while (text.charAt(index) != '\n')
                {
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
    public String[] redoArrayBasedOnItemRequirements(String[] array)
    {
        String substring;
        int index;
        int substringindex;
        for (index = 0; index < 4; index++)
        {
            if(array[index].contains("&"))
            {
                substringindex = array[index].indexOf("&");
                substring = array[index].substring(substringindex);
                if(changePlayer(substring))
                {
                    array[index] = array[index].substring(0, substringindex);
                }
                else
                    {
                        array[index] = "";
                    }
            }
        }

        return array;
    }

    public boolean changePlayer(String string)
    {
        String substring;
        if(string.contains("NEED"))
        {
            substring = string.replace("Need", "");
            return false;
        }
        if(string.contains("ADD"))
        {
            substring = string.replace("ADD", "");
            return true;
        }
        return false;
    }
}
