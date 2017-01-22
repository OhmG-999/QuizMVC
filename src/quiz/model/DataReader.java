package quiz.model;

import java.io.File;
import java.util.Scanner;

public interface DataReader {

	void readData(File file, Scanner fileReader);

	void readData(File fileOfQuestions, Scanner questionsReader, QuizQuestionsAndAnswers qanda);
}
