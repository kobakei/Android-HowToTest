package io.github.kobakei.androidhowtotest.model;

/**
 * Created by keisuke on 16/03/03.
 */
public class Repo {
    public long id;
    public String full_name;
    public int forks_count;

    public Repo() {

    }

    public Repo(long id, String fullName, int forksCount) {
        this.id = id;
        this.full_name = fullName;
        this.forks_count = forksCount;
    }
}
