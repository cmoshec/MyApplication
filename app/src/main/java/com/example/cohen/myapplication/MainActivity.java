package com.example.cohen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public void startNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    public void startOtherActivity(View view) {
        Intent intent = new Intent(this, UIinterface.class);
        startActivity(intent);

    }

    public void startSpinner(View view){
        Intent intent = new Intent(this, SpinerActivity.class);
        startActivity(intent);
    }

    public void startList(View view){
        Intent intent = new Intent(this,ListViewActivity.class);
        startActivity(intent);
    }

    public void startCanvas(View view){
        Intent intent = new Intent(this,CanvasAcitvity.class);
        startActivity(intent);
    }

    public void startSeekBar(View view) {
        Intent intent = new Intent(this, SeekBarActivity.class);
        startActivity(intent);
    }
}
