import java.io.*;
public class Hangman3 {
    public static void main(String args[])throws IOException{
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	String[] dictionary = {"apple","banana","orange","lemon","grape",
					       "strawberry","grapefruit","pear","lime","qiwi"};

	int random = (int)(Math.random()*10);

	String answer = new String(dictionary[random]);

	String guess="";
	for(int i=0; i<answer.length(); i++){
	    guess=guess+"-";
	}

	System.out.println(guess);

	System.out.print("���̕�����?");

	String g = buf.readLine();
	char c = g.charAt(0); //���͂����������0�Ԗ�(�擪)��1�����������g��

	String newguess ="";

	for(int i=0; i<answer.length(); i++){ //�����̕����񂩂���͂���������T��
	    if(c == answer.charAt(i)){        //answer��i�Ԗڂ̕����Ɠ�������r

		newguess=newguess+answer.charAt(i); //������i�Ԗڂ̕������R�s�[
	    }else{                            //�O�ꂽ
		newguess=newguess+guess.charAt(i);  //�q���g��i�Ԗڂ̕������R�s�[
	    }
	}

	System.out.println(newguess); //���݂̃q���g��\��

	
	System.out.println("������"+answer+"�ł���"); //�����̕\��

    }

}
