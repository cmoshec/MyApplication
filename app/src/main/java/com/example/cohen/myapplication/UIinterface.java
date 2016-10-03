package com.example.cohen.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class UIinterface extends ActionBarActivity {

    RadioGroup radioSexGroup;
    RadioButton selectedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiinterface);

    }

    public void buttonClick (View view){
    radioSexGroup=(RadioGroup) findViewById(R.id.radioGroup);
        int selectedID=radioSexGroup.getCheckedRadioButtonId();
        selectedButton=(RadioButton) findViewById(selectedID);
        Toast.makeText(UIinterface.this, selectedButton.getText(), Toast.LENGTH_SHORT).show();
    }

}
