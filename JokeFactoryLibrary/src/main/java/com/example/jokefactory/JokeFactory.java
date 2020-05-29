package com.example.jokefactory;

import java.util.ArrayList;
import java.util.Random;

public class JokeFactory {

    public ArrayList<String> jokes;
    public Random random;

    public JokeFactory(){
        jokes=new ArrayList<String>();
        random=new Random();
        jokes.add("joke1");
        jokes.add("joke2");
        jokes.add("joke3");
        jokes.add("joke4");
    }

    public  String getJoke(){
        int position=random.nextInt(jokes.size());
        return jokes.get(position);
    }

}
