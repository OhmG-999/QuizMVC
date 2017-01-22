package quiz.view;
import quiz.controller.QuizController;

import javax.swing.JFrame;

/**
 * @author mikaelgoardet 
 */


public class QuizFrame extends JFrame {

	private QuizPanel quizPanel;
	
	/**
	 * Create a QuizzFrame object passing a reference to the QuizController for use by the QuizFrame object
	 * @param quizController, the reference to the QuizController object for MVC
	 */
	
	public QuizFrame(QuizController quizController){
	
		quizPanel = new QuizPanel(quizController);
		this.setupFrame();
	}
	
	/**
	 * Sets the content pane, size and makes the frame visible
	 */
	private void setupFrame(){
		
		this.setContentPane(quizPanel);
		this.setTitle("Quiz Game");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
