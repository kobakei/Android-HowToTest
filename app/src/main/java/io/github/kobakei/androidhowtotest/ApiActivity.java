package io.github.kobakei.androidhowtotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.kobakei.androidhowtotest.model.GitHubService;
import io.github.kobakei.androidhowtotest.model.Repo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiActivity extends AppCompatActivity {

    @Bind(R.id.textView)
    TextView textView;

    @Inject
    GitHubService gitHubService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
        ButterKnife.bind(this);
        ((MyApplication)getApplication()).getComponent().inject(this);

        // Calling api client from activity is not recommended but this is sample...
        Call<List<Repo>> call = gitHubService.listRepos("kobakei");
        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                if (response.isSuccess()) {
                    String text = "";
                    for (Repo repo : response.body()) {
                        text += repo.full_name + "\n";
                    }
                    textView.setText(text);
                } else {
                    textView.setText("ERROR");
                }
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                textView.setText("ERROR");
            }
        });
    }
}
