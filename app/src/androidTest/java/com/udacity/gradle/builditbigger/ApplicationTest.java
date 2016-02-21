package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testJokeResponse() throws ExecutionException, InterruptedException {
        JokeEndpointsAsyncTask fetchJokesTask = new JokeEndpointsAsyncTask();
        String joke = fetchJokesTask.execute(getContext()).get();
        assertEquals(true, !joke.equals(""));
    }

}