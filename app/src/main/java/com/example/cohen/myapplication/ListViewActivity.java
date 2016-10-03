package com.example.cohen.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ListViewActivity extends ActionBarActivity {

    ArrayList<String> str = new ArrayList<String>(Arrays.asList("AAA", "BBB", "CCC"));
    ArrayAdapter adp;
    int numClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        populateListview();
        registerClickCallBack();
        ListView list = (ListView) findViewById(R.id.listView);

    }


    public void populateListview() {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_items, str);
        adp = adapter;
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

    }

    public void registerClickCallBack() {
        ListView list = (ListView) findViewById(R.id.listView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                String message = "you clicked # " + position + " - " + textView.getText().toString();
                Toast.makeText(ListViewActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });


    }

    private String getEditTextString() {
        EditText editText = (EditText) findViewById(R.id.editText_ListView);
        String text = editText.getText().toString();
        editText.setText("");
        return text;
    }

    public void addItem(View view) {

        str.add(getEditTextString());
        adp.notifyDataSetChanged();
    }


    public void removeItem(View view) {
        int i = str.indexOf(getEditTextString());
        if (i >= 0) {
            str.remove(i);
            adp.notifyDataSetChanged();
        } else return;
    }

    public void clearItems(View view) {
        str.clear();
        adp.notifyDataSetChanged();
    }

}
