package com.example.jz.qq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        i = 1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b1.setText("X");
                }else{
                    b1.setText("0");
                }
                i++;
                b1.setEnabled(false);
                if (b1.getText() == b2.getText()) {
                    if (b2.getText() == b3.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b1.getText());
                        t2.setText("win");
                    }
                }
                if (b1.getText() == b4.getText()) {
                    if (b4.getText() == b7.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b1.getText());
                        t2.setText("win");
                    }
                }
                if (b1.getText() == b5.getText()) {
                    if (b5.getText() == b8.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b1.getText());
                        t2.setText("win");
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b2.setText("X");
                }else{
                    b2.setText("0");
                }
                i++;
                b2.setEnabled(false);
                if (b2.getText() == b1.getText()) {
                    if (b1.getText() == b3.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b2.getText());
                        t2.setText("win");
                    }
                }
                if (b2.getText() == b5.getText()) {
                    if (b5.getText() == b8.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b2.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b3.setText("X");
                }else{
                    b3.setText("0");
                }
                i++;
                b3.setEnabled(false);
                if (b3.getText() == b2.getText()) {
                    if (b2.getText() == b1.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b3.getText());
                        t2.setText("win");
                    }
                }
                if (b3.getText() == b5.getText()) {
                    if (b5.getText() == b7.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b3.getText());
                        t2.setText("win");
                    }
                }
                if (b3.getText() == b6.getText()) {
                    if (b6.getText() == b9.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b3.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b4.setText("X");
                }else{
                    b4.setText("0");
                }
                i++;
                b4.setEnabled(false);
                if (b4.getText() == b1.getText()) {
                    if (b1.getText() == b7.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b4.getText());
                        t2.setText("win");
                    }
                }
                if (b4.getText() == b5.getText()) {
                    if (b5.getText() == b6.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b4.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b5.setText("X");
                }else{
                    b5.setText("0");
                }
                i++;
                b5.setEnabled(false);
                if (b5.getText() == b4.getText()) {
                    if (b4.getText() == b6.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b5.getText());
                        t2.setText("win");
                    }
                }
                if (b5.getText() == b2.getText()) {
                    if (b2.getText() == b8.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b5.getText());
                        t2.setText("win");
                    }
                }
                if (b5.getText() == b1.getText()) {
                    if (b1.getText() == b9.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b5.getText());
                        t2.setText("win");
                    }
                }
                if (b5.getText() == b7.getText()) {
                    if (b7.getText() == b3.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b5.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b6.setText("X");
                }else{
                    b6.setText("0");
                }
                i++;
                b6.setEnabled(false);
                if (b6.getText() == b5.getText()) {
                    if (b5.getText() == b4.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b6.getText());
                        t2.setText("win");
                    }
                }
                if (b6.getText() == b3.getText()) {
                    if (b3.getText() == b9.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b6.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b7.setText("X");
                }else{
                    b7.setText("0");
                }
                i++;
                b7.setEnabled(false);
                if (b7.getText() == b5.getText()) {
                    if (b5.getText() == b3.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b7.getText());
                        t2.setText("win");
                    }
                }
                if (b7.getText() == b8.getText()) {
                    if (b8.getText() == b9.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b7.getText());
                        t2.setText("win");
                    }
                }
                if (b7.getText() == b4.getText()) {
                    if (b4.getText() == b1.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b7.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b8.setText("X");
                }else{
                    b8.setText("0");
                }
                i++;
                b8.setEnabled(false);
                if (b8.getText() == b7.getText()) {
                    if (b7.getText() == b9.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b8.getText());
                        t2.setText("win");
                    }
                }
                if (b8.getText() == b5.getText()) {
                    if (b5.getText() == b2.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b8.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 >0) {
                    b9.setText("X");
                }else{
                    b9.setText("0");
                }
                i++;
                b9.setEnabled(false);
                if (b9.getText() == b8.getText()) {
                    if (b8.getText() == b7.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b9.getText());
                        t2.setText("win");
                    }
                }
                if (b9.getText() == b6.getText()) {
                    if (b6.getText() == b3.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b9.getText());
                        t2.setText("win");
                    }
                }
                if (b9.getText() == b5.getText()) {
                    if (b5.getText() == b1.getText()){
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        t1.setText(b9.getText());
                        t2.setText("win");
                    }
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                t1.setText("");
                t2.setText("");

            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}
