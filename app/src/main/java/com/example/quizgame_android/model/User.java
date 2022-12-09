package com.example.quizgame_android.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String name;
    private int score;

    public User(String userName) {
        this.name = userName;
        this.score = 0;
    }

    protected User(Parcel in) {
        name = in.readString();
        score = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScoreUser(int aScore) {
        this.score += aScore;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(score);
    }
}