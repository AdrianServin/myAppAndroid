package com.movil.desarrollo.myappandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addKeyListener();
    }

    public void addKeyListener() {

        // get edittext component
        edittext = (EditText) findViewById(R.id.editText);

        // add a keylistener to keep track user input
        edittext.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // if keydown and "enter" is pressed
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // display a floating message
                    Toast.makeText(MainActivity.this, edittext.getText(), Toast.LENGTH_LONG).show();
                    return true;
                }

                return false;
            }
        });
    }
}
