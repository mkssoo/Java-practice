import java.io.*;
public class Hangman2 {
    public static void main(String args[])throws IOException{
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	String[] dictionary = {"apple","banana","orange","lemon","grape",
					       "strawberry","grapefruit","pear","lime","qiwi"};

	int random = (int)(Math.random()*10);

	String answer = new String(dictionary[random]);

	String guess=""; //��̕�����𐶐�
	for(int i=0; i<answer.length(); i++){ //answer�̕�����̒��������[�v
	    guess=guess+"-"; //�����̏ꏊ�� '-' ��ǉ�
	}
	System.out.println(guess); //��ʂɕ\��

	
	System.out.println("������"+answer+"�ł���");

    }

}