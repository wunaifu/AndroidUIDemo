package com.wnf.androiduidemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wnf.androiduidemo.R;

import java.util.ArrayList;

/**
 * 程序主入口
 *
 * @author 赵小贱
 */
public class MainActivity extends Activity{

    private Button btOne;
    private Button btTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOne = (Button) findViewById(R.id.bt_one);
        btTwo = (Button) findViewById(R.id.bt_two);
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,StartActivity2.class));
            }
        });
        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,StartActivity1.class));
            }
        });

    }
}

