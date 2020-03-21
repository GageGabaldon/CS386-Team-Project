package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {

    String[] addresses = {"textadventuregame@gmail.com"};
    String subject;
    String body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void sendFeedbackInfo(View view)
    {
        EditText editsubject = (EditText) findViewById(R.id.subject);
        EditText editbody = (EditText) findViewById(R.id.message);

        subject = editsubject.getText().toString();
        body = editbody.getText().toString();


        composeEmail(addresses, subject, body);


    }

    public void composeEmail(String[] addresses, String subject, String body) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, body);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
