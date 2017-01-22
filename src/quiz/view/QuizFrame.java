package quiz.view;
import quiz.controller.QuizController;

import javax.swing.JFrame;



public class QuizFrame extends JFrame {

	private QuizPanel quizPanel;
	
	public QuizFrame(QuizController quizController){
	
		quizPanel = new QuizPanel(quizController);
		this.setupFrame();
	}
	
	private void setupFrame(){
		
		this.setContentPane(quizPanel);
		this.setTitle("Quiz Game");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
