package com.example.counterhomework;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=0;
    TextView view1;
    EditText typing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1=(TextView) findViewById(R.id.textView);
        typing=(EditText) findViewById(R.id.editTextTextPersonName);
       if (savedInstanceState!=null){
            view1.setText(savedInstanceState.getString("edit_text"));
            i=savedInstanceState.getInt("count");
       }
    }


    public void countUp(View view) {
        i++;
        view1.setText(""+i);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("edit_text",view1.getText().toString());
        outState.putInt("count",i);
    }
}