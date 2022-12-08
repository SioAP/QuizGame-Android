package com.example.quizgame_android.controller;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizgame_android.data.*;
import com.example.quizgame_android.model.*;

public class Controller {


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
}

