package io.github.kobakei.androidhowtotest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.kobakei.androidhowtotest.MyApplication;
import io.github.kobakei.androidhowtotest.R;
import io.github.kobakei.androidhowtotest.di.MyComponent;
import io.github.kobakei.androidhowtotest.util.Addition;

public class AdditionActivity extends AppCompatActivity {

    @Bind(R.id.editText1)
    EditText editText1;

    @Bind(R.id.editText2)
    EditText editText2;

    @Bind(R.id.textView)
    TextView textView;

    @Inject
    Addition addition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        ButterKnife.bind(this);
        MyComponent component = ((MyApplication)getApplication()).getComponent();
        component.inject(this);
    }

    @OnClick(R.id.button1)
    void onAddClicked() {
        try {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            int sum = addition.add(num1, num2);
            textView.setText(String.valueOf(sum));
        } catch (NumberFormatException e) {
            textView.setText("ERROR");
        }
    }
}
