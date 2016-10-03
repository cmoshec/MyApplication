package com.example.cohen.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SeekBarActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        SeekBar seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(l1);

        ToggleButton tgBtn =(ToggleButton) findViewById(R.id.toggleButton);
        tgBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView=(TextView)findViewById(R.id.textViewSeekBar);
                if (isChecked) {
                    textView.setText("ON");
                } else {
                    textView.setText("OFF");
                }
            }
        });

        Switch switchBtn=(Switch) findViewById(R.id.switch1);
        switchBtn.setOnCheckedChangeListener(l2);
    }

private SeekBar.OnSeekBarChangeListener l1 =
        new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextView textView=(TextView)findViewById(R.id.textViewSeekBar);

                textView.setText(Integer.toString(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        };

private Switch.OnCheckedChangeListener l2=
        new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView=(TextView)findViewById(R.id.textViewSeekBar);
                if (isChecked) {
                    textView.setText("ON");
                } else {
                    textView.setText("OFF");
                }
            }
        };

}
