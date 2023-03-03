package com.example.helloconstraint;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.database.Observable;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =  "com.example.android.helloconstraint.extra.MESSAGE";;
    int mCount=0;
    int gray= Color.parseColor("#808080");
    int red=Color.parseColor("#FF0000");
    int blue1=Color.parseColor("#31c2fc");
    int blue2=Color.parseColor("#1493ff");
    int green=Color.parseColor("#b4eeb4");
    int orange=Color.parseColor("#ff7f50");
    TextView mShowCount;
    Button tst;
    Button count;
  int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.show_count);
        tst=(Button) findViewById(R.id.button_toast);
       count=(Button) findViewById(R.id.button_count);
      }



    public void showToast(View view) {
        Intent intent = new Intent(this, HelloToast.class);

        String message = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        Random rand=new Random();
        int c=Color.argb(255, rand.nextInt(),rand.nextInt(),rand.nextInt());
        view.setBackgroundColor(c);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

    }
}