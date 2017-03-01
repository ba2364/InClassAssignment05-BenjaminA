package com.example.benjaminantell.inclassassignment05_benjamina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    private TextView displayText;
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displayText = (TextView) findViewById(R.id.display_text);
        Intent i = getIntent();
        Team team = (Team) i.getSerializableExtra(Keys.TEAM);
        displayText.setText(("The " + team.getCity() + " " + team.getNickname() + " have " + team.getChamps() + " championships and it is " + team.isPlaying() + " that they are still playing"));
    }
}
