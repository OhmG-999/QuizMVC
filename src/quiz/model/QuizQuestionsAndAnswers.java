package quiz.model;

public class QuizQuestionsAndAnswers {
	
	private int questionID;
	private String multimedia;
	private String question;
	private String correctAnswer;
	private String possibleAnswer1;
	private String possibleAnswer2;
	private String possibleAnswer3;
	private String possibleAnswer4;
	
	public QuizQuestionsAndAnswers(){
		
	}
	
	public QuizQuestionsAndAnswers(int questionID, String multimedia, String question, String correctAnswer, String possibleAnswer1,
			String possibleAnswer2, String possibleAnswer3, String possibleAnswer4){
		
		this.questionID = questionID;
		this.multimedia = multimedia;
		this.question = question;
		this.correctAnswer = correctAnswer;
		this.possibleAnswer1 = possibleAnswer1;
		this.possibleAnswer2 = possibleAnswer2;
		this.possibleAnswer3 = possibleAnswer3;
		this.possibleAnswer4 = possibleAnswer4;
	}
	
	public void setQuestionID(int questionID){
		this.questionID = questionID;
	}
	
	public int getQuestionID(){
		return questionID;
	
	}
	
	public void setMultimedia(String multimedia) {
		this.multimedia = multimedia;
	}

	public String getMultimedia() {
		return multimedia;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}
	
	public void setPossibleAnswer1(String possibleAnswer1){
		this.possibleAnswer1 = possibleAnswer1;
	}
	
	public String getPossibleAnswer1(){
		return possibleAnswer1;
	}
	
	public void setPossibleAnswer2(String possibleAnswer2){
		this.possibleAnswer2 = possibleAnswer2;
	}
	
	public String getPossibleAnswer2(){
		return possibleAnswer2;
	}
	
	public void setPossibleAnswer3(String possibleAnswer3){
		this.possibleAnswer3 = possibleAnswer3;
	}
	
	public String getPossibleAnswer3(){
		return possibleAnswer3;
	}
	
	public void setPossibleAnswer4(String possibleAnswer4){
		this.possibleAnswer4 = possibleAnswer4;
	}
	
	public String getPossibleAnswer4(){
		return possibleAnswer4;
	}
	
	public void setCorrectAnswer(String correctAnswer){
		this.correctAnswer = correctAnswer;	
	}
	
	public String getCorrectAnswer(){
		return this.correctAnswer;
	}
}
