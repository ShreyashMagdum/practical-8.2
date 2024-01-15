package com.example.practical82;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String str []  = {"Mobile Application Development Development","Programming with Python","Web Based Application using PHP ",
            "Management","Emerging Trends in Computer and Information Technology","Network and Information Security",
            "Data Warehousing with Mining Techniques","Entrepreneurship Development","Capstone Project Execution "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,str);
        AutoCompleteTextView act = (AutoCompleteTextView) findViewById(R.id.autotxt);
        act.setThreshold(2);
        act.setAdapter(adapter);
        act.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You have Selected :"+parent.getSelectedItem(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}