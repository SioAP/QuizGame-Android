package com.example.quizgame_android.model;

public class Users {
    private String userName;
    private int scoreUser;



    public Users(String userName) {
        this.userName = userName;
        this.scoreUser = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScoreUser() {
        return scoreUser;
    }

    public void setScoreUser(int scoreUser) {
        this.scoreUser = scoreUser;
    }
}