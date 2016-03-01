package io.github.kobakei.androidhowtotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdditionActivity extends AppCompatActivity {

    @Bind(R.id.editText1)
    EditText editText1;

    @Bind(R.id.editText2)
    EditText editText2;

    @Bind(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button1)
    void onAddClicked() {
        try {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            textView.setText(String.valueOf(num1 + num2));
        } catch (NumberFormatException e) {
            textView.setText("ERROR");
        }
    }
}
