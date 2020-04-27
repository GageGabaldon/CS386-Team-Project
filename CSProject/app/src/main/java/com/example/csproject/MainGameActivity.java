package com.example.csproject;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainGameActivity extends AppCompatActivity
{
    UpdateGame upgame;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);
        // initialization
        upgame = new UpdateGame(MainGameActivity.this);
        setupGame();

        // setting up text view to scroll
        TextView tv = (TextView)findViewById(R.id.main_text);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }

    /** Button onclick method
     *
     * @param view
     */
    public void clickedOption(View view)
    {
        int buttonnumber = getButton(view.getId());
        Button button = (Button)findViewById(view.getId());
        if(button.getText() != "")
        {
            String newText;
            upgame.updateStory(buttonnumber);

            String[] choices = upgame.getChoices();

            newText = upgame.updateMainGameText();

            updateScreen(newText);
            updateButton1(choices[0]);
            updateButton2(choices[1]);
            updateButton3(choices[2]);
            updateButton4(choices[3]);
        }
    }

    /** This will setup the screen when you first launch app
     *
     */
    public void setupGame()
    {
        String[] choices = upgame.getChoices();
        updateScreen(upgame.updateMainGameText());
        updateButton1(choices[0]);
        updateButton2(choices[1]);
        updateButton3(choices[2]);
        updateButton4(choices[3]);
    }

    /** Updates main screen text
     *
     * @param text
     */
    public void updateScreen(String text)
    {
        TextView textview = (TextView) findViewById(R.id.main_text);
        textview.scrollTo( 0, 0 );
        textview.setText(text);
    }

    /** updates button
     *
     * @param newButtonText
     */
    public void updateButton1(String newButtonText)
    {
        Button button = (Button)findViewById(R.id.option1);

        button.setText(newButtonText);
    }

    /** updates button
     *
     * @param newButtonText
     */
    public void updateButton2(String newButtonText)
    {
        Button button = (Button) findViewById(R.id.option2);

        button.setText(newButtonText);
    }
    /** updates button
     *
     * @param newButtonText
     */
    public void updateButton3(String newButtonText)
    {
        Button button = (Button) findViewById(R.id.option3);

        button.setText(newButtonText);
    }
    /** updates button
     *
     * @param newButtonText
     */
    public void updateButton4(String newButtonText)
    {
        Button button = (Button) findViewById(R.id.option4);

        button.setText(newButtonText);
    }

    /** returns the button corresponding to the type of button clicked.
     *
     * @param integer
     * @return
     */
    public int getButton(int integer)
    {
        if(integer == R.id.option1)
        {
            return 0;
        }
        if (integer == R.id.option2)
        {
            return 1;
        }
        if(integer == R.id.option3)
        {
            return 2;
        }
        if(integer == R.id.option4)
        {
            return 3;
        }
        return -1;
    }
}
