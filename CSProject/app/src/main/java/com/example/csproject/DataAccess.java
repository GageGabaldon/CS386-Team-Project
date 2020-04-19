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
     * @param filename
     * @return
     */
    public String getEventDescription(String filename)
    {
        String filepath = thefilepath + filename;
        File f = new File(filepath);
        String output = "";
        int c = 0;
        char endingchar = '1';
        try
        {
            FileReader fr=new FileReader(f);           //Creation of File Reader object
            BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
            while((c = br.read()) != -1)               //Read char by Char
            {
                char character = (char) c;             //converting integer to char
                if(character == endingchar)
                {
                    return output;
                }
                output += character;                                    //adding char to String
            }
        }
        catch(IOException e)
        {
            return "NOT FOUND";
        }
        return output;
    }

    /** Get the events choices of a text file.
     *
     * @param filename
     * @param choicenum
     * @return
     */
    public String getEventChoice(String filename, int choicenum)
    {
        String filepath = thefilepath + filename;
        File f = new File(filepath);
        String output = "";
        int c = 0;
        char startchar = (char)(choicenum + '0');
        char endingchar = (char)((choicenum + 1)+ '0');
        Boolean startread = false;                                          // flag if you get to the part of file
        try
        {
            FileReader fr = new FileReader(f);                              //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr);                     //Creation of BufferedReader object
            while((c = br.read()) != -1)                                    //Read char by Char
            {
                char character = (char) c;                                  //converting integer to char
                if(character == startchar)
                {
                    startread = true;
                }
                if(character == endingchar)
                {
                    return output;
                }
                // used to insert characters
                if(startread == true && character != '1' && character != '2' && character != '3' && character != '4')
                {
                    output += character;                                        //adding char to String
                }
            }
        }
        catch(IOException e)
        {
            return "NOT FOUND";
        }
        return output;
    }
}
