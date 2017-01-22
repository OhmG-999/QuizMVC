package quiz.model;

import quiz.controller.QuizController;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class QuizFactory implements DataReader{
	
	private Scanner questionsReader;
	private File fileOfQuestions;
	private QuizQuestionsAndAnswers qanda;
	private Random pickRandomQuestions;
	private QuizController quizController;
	private ArrayList <QuizQuestionsAndAnswers> listOfAllQandA;
	private ArrayList <QuizQuestionsAndAnswers> quizQandA;
	private int quizLength;
	private int listSizeOfAllQandA;
	private int question;

	public QuizFactory() throws FileNotFoundException{
		
		listOfAllQandA = new ArrayList <QuizQuestionsAndAnswers>();
		quizQandA = new ArrayList <QuizQuestionsAndAnswers>();
		qanda = new QuizQuestionsAndAnswers();
		fileOfQuestions = new File("multimedia/multimedia.txt");
		questionsReader = new Scanner(fileOfQuestions);
		quizLength = 20;
		
		this.getQuizLength();
		this.readData(getFileOfQuestions(), getQuestionsReader(), getQandA() );

	}

	public Scanner getQuestionsReader() {
		return questionsReader;
	}

	public void setQuestionsReader(Scanner questionsReader) {
		this.questionsReader = questionsReader;
	}

	public File getFileOfQuestions() {
		return fileOfQuestions;
	}

	public void setFileOfQuestions(File fileOfQuestions) {
		this.fileOfQuestions = fileOfQuestions;
	}

	public QuizQuestionsAndAnswers getQandA() {
		return qanda;
	}

	public void setQandA(QuizQuestionsAndAnswers qanda) {
		this.qanda = qanda;
	}

	public Random getPickRandomQuestions() {
		return pickRandomQuestions;
	}

	public void setPickRandomQuestions(Random pickRandomQuestions) {
		this.pickRandomQuestions = pickRandomQuestions;
	}

	public QuizController getQuizController() {
		return quizController;
	}

	public void setQuizController(QuizController quizController) {
		this.quizController = quizController;
	}

	public ArrayList<QuizQuestionsAndAnswers> getListOfAllQandA() {
		return listOfAllQandA;
	}

	public void setListOfAllQandA(ArrayList<QuizQuestionsAndAnswers> listOfAllQandA) {
		this.listOfAllQandA = listOfAllQandA;
	}

	public ArrayList<QuizQuestionsAndAnswers> getQuizQandA() {
		return quizQandA;
	}

	public void setQuizQandA(ArrayList<QuizQuestionsAndAnswers> quizQandA) {
		this.quizQandA = quizQandA;
	}

	public int getQuizLength() {
		return quizLength;
	}

	public void setQuizLength(int quizLength) {
		this.quizLength = quizLength;
	}

	public int getListSizeOfAllQandA() {
		return listSizeOfAllQandA;
	}

	public void setListSizeOfAllQandA(int listSizeOfAllQandA) {
		this.listSizeOfAllQandA = listSizeOfAllQandA;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

	@Override
	public void readData(File fileOfQuestions, Scanner questionsReader, QuizQuestionsAndAnswers qanda){
		
		try{
			
			this.fileOfQuestions = fileOfQuestions;
			this.questionsReader = questionsReader;
			this.qanda = qanda;
			
			while(questionsReader.hasNextLine()){
				
				qanda.setQuestionID(questionsReader.nextInt());
				qanda.setMultimedia(questionsReader.next());
				qanda.setQuestion(questionsReader.next());
				qanda.setCorrectAnswer(questionsReader.next());
				qanda.setPossibleAnswer1(questionsReader.next());
				qanda.setPossibleAnswer2(questionsReader.next());
				qanda.setPossibleAnswer3(questionsReader.next());
				qanda.setPossibleAnswer4(questionsReader.next());
				listOfAllQandA.add(qanda);
			}
		}
		catch (NoSuchElementException noSuchElementException){
			
			System.err.println("The data type contained in file mismatches data type expected !");
			noSuchElementException.printStackTrace();
			System.exit(1);
			
		}
		finally{
			questionsReader.close();
		}		
	}
	
	public boolean canPickQuizQuestion(int listSizeOfAllQandA){
		
		boolean canPickQuizQuestion = false;
		
		if(quizLength > 0){
			
			question = pickRandomQuestions.nextInt(listSizeOfAllQandA);
			quizLength--;
			quizQandA.add(listOfAllQandA.get(question));
			canPickQuizQuestion = true;		
			
		}
		
		return canPickQuizQuestion;
	}

	@Override
	public void readData(File file, Scanner fileReader) {
		// TODO Auto-generated method stub
		
	}
}
