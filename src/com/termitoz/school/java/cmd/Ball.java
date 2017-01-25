package com.termitoz.school.java.cmd;

/**
 * Created by ZOOPARK on 22.01.2017.
 */
public class Ball {

    String name;
    float r;

    public Ball() {
    }

    public Ball(String name) {
        this.name = name;
    }

    public Ball(float r) {
        this.r = r;
    }

    public Ball(String name, float r) {
        this.name = name;
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
