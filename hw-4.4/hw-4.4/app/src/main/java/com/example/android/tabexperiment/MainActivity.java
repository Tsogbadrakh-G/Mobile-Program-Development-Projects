/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.tabexperiment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This app offers three view fragments and three tabs below the app bar to
 * navigate to them, as well as the options menu showing Settings.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Creates the content view and toolbar, sets up the tab layout, and sets up
     * a page adapter to manage views in fragments. The user clicks a tab and
     * navigates to the view fragment.
     *
     * @param savedInstanceState Saved instance state bundle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void froyo(View view){
        Intent intent=new Intent(this,froyo.class);
        startActivity(intent);
    }
    public void donut(View view){
        Intent intent=new Intent(this,donut.class);
        startActivity(intent);
    }
    public void icecream(View view){
        Intent intent=new Intent(this,icecream.class);
        startActivity(intent);
    }
}
