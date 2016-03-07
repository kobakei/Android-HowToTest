package io.github.kobakei.androidhowtotest.activity;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.kobakei.androidhowtotest.R;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    void onButtonClicked() {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_SETTINGS);
        startActivity(intent);
    }
}
