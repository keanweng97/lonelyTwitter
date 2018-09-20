package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Cat extends Animal implements FlyingBehaviour{

    @Override
    public void swim(){
        Log.d("weng","Hey I hate swimming");
    }
    public void fly(){
        Log.d("weng","I cannot fly");
    }
}
