package quiz.controller;

import java.io.FileNotFoundException;

public class QuizRunner {
	
	/**
	 * Main method to start the quiz game.
	 * @author mikaelgoardet
	 * @param args
	 * @throws FileNotFoundException 
	 */

	public static void main(String[] args) throws FileNotFoundException {
		
		QuizController quizApp = new QuizController();
		quizApp.start();

	}

}
