package com.udacity.gradle.builditbigger.backend;

import com.example.jokefactory.JokeFactory;

/** The object model for the data we are sending through endpoints */

public class MyBean {

    private JokeFactory mJokeFactory;

    public MyBean() {
        mJokeFactory=new JokeFactory();

    }
    public String getJoke(){
        return mJokeFactory.getJoke();
    }

}