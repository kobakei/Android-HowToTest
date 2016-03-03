package io.github.kobakei.androidhowtotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button1)
    void onButton1Clicked() {
        Intent intent = new Intent(this, AdditionActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button2)
    void onButton2Clicked() {
        Intent intent = new Intent(this, BrowserActivity.class);
        startActivity(intent);
    }
}
