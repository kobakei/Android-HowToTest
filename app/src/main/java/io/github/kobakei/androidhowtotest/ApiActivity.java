package io.github.kobakei.androidhowtotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.kobakei.androidhowtotest.model.GitHubService;
import io.github.kobakei.androidhowtotest.model.GitHubUseCase;
import io.github.kobakei.androidhowtotest.model.Repo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiActivity extends AppCompatActivity {

    @Bind(R.id.textView)
    TextView textView;

    @Inject
    GitHubUseCase gitHubUseCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
        ButterKnife.bind(this);
        ((MyApplication)getApplication()).getComponent().inject(this);

        gitHubUseCase.getTotalForkCount("kobakei", new GitHubUseCase.Callback() {
            @Override
            public void onTotalForkCountReturned(int count) {
                textView.setText("Total fork count is " + count);
            }
        });
    }
}
