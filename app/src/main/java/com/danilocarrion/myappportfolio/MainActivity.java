package com.danilocarrion.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity  implements  View.OnClickListener{

    Button streamButton;
    Button scoresButton;
    Button libraryButton;
    Button biggerButton;
    Button xyzButton;
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaring the buttons
        streamButton   = (Button) findViewById(R.id.streamer_button);
        scoresButton   = (Button) findViewById(R.id.scores_button);
        libraryButton  = (Button) findViewById(R.id.library_button);
        biggerButton   = (Button) findViewById(R.id.bigger_button);
        xyzButton      = (Button) findViewById(R.id.xyz_button);
        capstoneButton = (Button) findViewById(R.id.capstone_button);

        //Making each button show a toast every time they are pressed
        streamButton.setOnClickListener(this);
        scoresButton.setOnClickListener(this);
        libraryButton.setOnClickListener(this);
        biggerButton.setOnClickListener(this);
        xyzButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        //For every button pressed, displayed a toast message
        Button b = (Button)view;
        Toast.makeText(MainActivity.this, "This button will launch " + b.getText().toString(), Toast.LENGTH_SHORT).show();

    }
}
