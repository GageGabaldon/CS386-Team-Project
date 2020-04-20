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
        String text;
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
        return null;
    }

    /** Get the events choices of a text file.
     *
     * @param folderName
     * @param fileName
     * @return
     */
    public String[][] getEventChoices( String folderName, String fileName ){
        String path = filepath + folderName + fileName;
        // this is the file in text form.
        String text;
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

        return null;
    }
}
