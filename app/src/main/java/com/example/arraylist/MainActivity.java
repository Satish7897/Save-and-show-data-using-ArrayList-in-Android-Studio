package com.example.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String>sat=new ArrayList<>();

EditText mEditText;
Button mButton;
TextView mTextView;
Button mButtonShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mTextView=(TextView) findViewById(R.id.listView);
       mButton=(Button)findViewById(R.id.save);
       mEditText=(EditText)findViewById(R.id.editText);
        mButtonShow=(Button)findViewById(R.id.button);
       mButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String getInput=mEditText.getText().toString();
               sat.add(getInput);


           }
       });
       mButtonShow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             for(int i=0;i<sat.size();i++)
             {
                 mTextView.setText(mTextView.getText()+" "+sat.get(i));
             }
           }
       });
    }
}
