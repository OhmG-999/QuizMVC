package quiz.controller;
import java.io.FileNotFoundException;

import quiz.model.QuizFactory;
import quiz.model.QuizQuestionsAndAnswers;
import quiz.view.QuizFrame;

public class QuizController {
	
	private QuizFrame quizFrame;
	private QuizFactory quizFactory;
	private QuizQuestionsAndAnswers qanda;
	
	public QuizFactory getQuizFactory() {
		return quizFactory;
	}
	
	public QuizController() throws FileNotFoundException{
		
		quizFactory = new QuizFactory();
		
	}

	public void start(){
		
		quizFrame = new QuizFrame(this); 
	}

}
