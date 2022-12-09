package com.example.quizgame_android.controller;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizgame_android.data.*;
import com.example.quizgame_android.model.*;

public class Controller implements Parcelable {


	//specifications
    private QuizGame myGame;
    private DAOMySQL myDAO;
	
	
	//implementation
	//constructor
	public Controller() throws Exception {
		
		//data interactions
		this.myDAO = new DAOMySQL(this);
		this.myDAO.connectDatabase();

		this.myGame = new QuizGame(this);
	}

	protected Controller(Parcel in) {
	}

	public static final Creator<Controller> CREATOR = new Creator<Controller>() {
		@Override
		public Controller createFromParcel(Parcel in) {
			return new Controller(in);
		}

		@Override
		public Controller[] newArray(int size) {
			return new Controller[size];
		}
	};

	public QuizGame getMyGame() {
		return myGame;
	}

	public void setMyGame(QuizGame theGame) {
		this.myGame = theGame;
	}

	public DAOMySQL getMyDAO() {
		return myDAO;
	}

	public void setMyDAO(DAOMySQL myDAO) {
		this.myDAO = myDAO;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
	}
}

