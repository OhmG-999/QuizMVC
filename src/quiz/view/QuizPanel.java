package quiz.view;

import quiz.controller.QuizController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class QuizPanel extends JPanel {
	
	private QuizController quizController;
	
	private  JButton startAGame;
	private  JButton viewScores;
	private  JButton quitGame;
	private  String url;
	private  String flagURL;
	private  ImageIcon flag;
	private  JLabel flagDisplay;
	private  JLabel questionNumber;
	private  JLabel viewQuestion;
	private  JRadioButton answer1;
	private  JRadioButton answer2;
	private  JRadioButton answer3;
	private  JRadioButton answer4;
	private  JButton nextQuestion;
	private  ButtonGroup radioButtonGroup;
	private  String correctAnswer;
	private  String playerAnswer;
	int score;
	private JPanel multimediaPanel;
	private JPanel questionPanel;
	private JPanel answersPanel;
	private JPanel questionsAndAnswersPanel;
	private JPanel centreQandAPanel;
	private JPanel menuPanel;
	
	public QuizPanel(QuizController quizController){
		
		this.quizController = quizController;
		
		flag = new ImageIcon();
		flagDisplay = new JLabel();
		questionNumber = new JLabel();
		viewQuestion = new JLabel();
		radioButtonGroup = new ButtonGroup();
		answer1 = new JRadioButton();
		answer2 = new JRadioButton();
		answer3 = new JRadioButton();
		answer4 = new JRadioButton();
		startAGame = new JButton();
		viewScores = new JButton();
		quitGame = new JButton();
		nextQuestion = new JButton();
		
		flagDisplay.setIcon(flag);
		flagDisplay.setVisible(false);		
		viewQuestion.setVisible(false);		
		answer1.setVisible(false);
		answer2.setVisible(false);
		answer3.setVisible(false);
		answer4.setVisible(false);		
		startAGame.setText("Start a Quizz");
		startAGame.setVisible(true);		
		viewScores.setText("View Best Scores");		
		viewScores.setVisible(true);		
		quitGame.setText("Quit");		
		quitGame.setVisible(true);
		nextQuestion.setText("Next Question");		
		nextQuestion.setVisible(false);		
		
		setupLayouts();
		setupPanels();
		setupListeners();
	}
	
	private void setupLayouts(){
		
		multimediaPanel = new JPanel();
		questionPanel = new JPanel();
		answersPanel = new JPanel();
		radioButtonGroup = new ButtonGroup();
		questionsAndAnswersPanel = new JPanel();
		centreQandAPanel = new JPanel();
		menuPanel= new JPanel();
		multimediaPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		questionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		answersPanel.setLayout(new GridLayout(2, 2));
		questionsAndAnswersPanel.setLayout(new GridLayout(2, 1));
		centreQandAPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		setLayout(new BorderLayout(2,5));
		
	}
	
	private void setupPanels(){		
		
		this.setSize(800, 600);
		this.multimediaPanel.add(flagDisplay);
		this.questionPanel.add(questionNumber);
		this.questionPanel.add(viewQuestion);
		this.answersPanel.add(answer1);
		this.answersPanel.add(answer2);
		this.radioButtonGroup.add(answer1);
		this.radioButtonGroup.add(answer2);
		this.answersPanel.add(answer3);
		this.answersPanel.add(answer4);
		this.radioButtonGroup.add(answer3);
		this.radioButtonGroup.add(answer4);
		this.questionsAndAnswersPanel.add(questionPanel);
		this.questionsAndAnswersPanel.add(answersPanel);
		this.centreQandAPanel.add(questionsAndAnswersPanel);
		this.menuPanel.add(startAGame);
		this.menuPanel.add(viewScores);
		this.menuPanel.add(quitGame);
		this.menuPanel.add(nextQuestion);
		add(this.getMultimediaPanel(), BorderLayout.NORTH);
		add(this.getCentreQandAPanel(), BorderLayout.CENTER);
		add(this.getMenuPanel(), BorderLayout.SOUTH);
	}
	
	private void setupListeners(){
		
		startAGame.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent click){
				
			}
		});
		
	}
	
	public JPanel getMultimediaPanel() {
		return multimediaPanel;
	}

	public JPanel getQuestionPanel() {
		return questionPanel;
	}

	public JPanel getAnswersPanel() {
		return answersPanel;
	}

	public JPanel getQuestionsAndAnswersPanel() {
		return questionsAndAnswersPanel;
	}

	public JPanel getCentreQandAPanel() {
		return centreQandAPanel;
	}

	public JPanel getMenuPanel() {
		return menuPanel;
	}

	public JButton getStartAGame() {
		return startAGame;
	}

	public JButton getViewScores() {
		return viewScores;
	}

	public JButton getQuitGame() {
		return quitGame;
	}

	public void setFlagURL(String url){
		this.flagURL = url;
	}
	public String getFlagURL(){
		return flagURL;
	}
	public ImageIcon getFlag() {
		return flag;
	}

	public JLabel getFlagDisplay() {
		return flagDisplay;
	}
	
	public JLabel getQuestionNumber(){
		return questionNumber;
	}

	public JLabel getViewQuestion() {
		return viewQuestion;
	}

	public JRadioButton getAnswer1() {
		return answer1;
	}

	public JRadioButton getAnswer2() {
		return answer2;
	}

	public JRadioButton getAnswer3() {
		return answer3;
	}

	public JRadioButton getAnswer4() {
		return answer4;
	}

	public JButton getNextQuestion() {
		return nextQuestion;
	}

	public ButtonGroup getRadioButtonGroup() {
		return radioButtonGroup;
	}
	
	public void setCorrectAnswer(String correctAnswer){
		this.correctAnswer = correctAnswer;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public String getPlayerAnswer() {
		return playerAnswer;
	}

	public int getScore() {
		return score;
	}

}
