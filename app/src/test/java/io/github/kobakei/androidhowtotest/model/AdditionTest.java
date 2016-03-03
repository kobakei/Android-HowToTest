package io.github.kobakei.androidhowtotest.model;

import static org.junit.Assert.*;
import org.junit.Test;

import io.github.kobakei.androidhowtotest.model.Addition;

/**
 * Created by keisuke on 16/03/03.
 */
public class AdditionTest {
    @Test
    public void add_IsCorrect() {
        assertEquals(4, Addition.add(1, 3));
    }
}
