package ouiz_number;

import java.util.Random;

public class QuizNumber {

	public int getQuizNumber(){

		Random rundom = new Random();
		return rundom.nextInt(3);

		//この個所を変更

	}

}
