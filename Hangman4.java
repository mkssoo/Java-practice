import java.io.*;
public class Hangman4 {
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


	while(true){

	    System.out.print("���̕�����?");

	    String g = buf.readLine();
	    char c = g.charAt(0); //���͂����������0�Ԗ�(�擪)��1�����������g��

	    String newguess ="";

	    for(int i=0; i<answer.length(); i++){
		if(c == answer.charAt(i)){        //answer��i�Ԗڂ̕����Ɠ�������r

		    newguess=newguess+answer.charAt(i);
		}else{
		    newguess=newguess+guess.charAt(i);
		}
	    }

	    System.out.println(newguess);

	    guess=newguess;
	    if(guess.equals(answer)){         //���� guess �� answer ������������Ȃ�
		System.out.println("����!");
		break;
	    }

	}
	
	System.out.println("������"+answer+"�ł���"); //�����̕\��

    }

}
