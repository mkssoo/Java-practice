import java.io.*;

public class Hangman6 {
    public static void main(String args[])throws IOException{
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	String[] dictionary = {"apple","banana","orange","lemon","grape",
					       "strawberry","grapefruit","pear","lime","qiwi"};

	String[] hangman = {
	    "+---+\nI\nI\nI",
	    "+---+\nI   O\nI   I\nI",
	    "+---+\nI   O\nI  /I\nI",
	    "+---+\nI   O\nI  /I\\\nI",
	    "+---+\nI   O\nI  /I\\\nI  /",
	    "+---+\nI   O\nI  /I\\\nI  / \\",
	}; //�n���O�}���̃A�X�L�[�A�[�g

	int random = (int)(Math.random()*10);

	String answer = new String(dictionary[random]);

	String guess="";
	for(int i=0; i<answer.length(); i++){
	    guess=guess+"-";
	}

	System.out.println(guess);

	int miss=0; //�~�X�J�E���^��������

	System.out.println(hangman[miss]); //miss�Ԗڂ̃n���O�}����\��

	while(true){
	    System.out.print("���̕�����?");

	    String g = buf.readLine();
	    char c = g.charAt(0); //���͂����������0�Ԗ�(�擪)��1�����������g��

	    String newguess ="";
	    boolean hit=false;
	    for(int i=0; i<answer.length(); i++){ //�����̕����񂩂���͂���������T��
		if(c == answer.charAt(i)){        //answer��i�Ԗڂ̕����Ɠ�������r
		    hit=true;
		    newguess=newguess+answer.charAt(i); //������i�Ԗڂ̕������R�s�[
		}else{                            //�O�ꂽ
		    newguess=newguess+guess.charAt(i);  //�q���g��i�Ԗڂ̕������R�s�[
		}
	    }

	    if(hit==false){ //1������������Ȃ�������
			miss++;     //�~�X��1�񑝂₷
	    }

	    System.out.println(newguess);

	    System.out.println(hangman[miss]); //miss�Ԗڂ̃n���O�}����\��

	    guess=newguess;
	    if(guess.equals(answer)){         //���� guess �� answer ������������Ȃ�
		System.out.println("����!");
		break;
	    }

	    if(miss>4){     //�~�X��5��Ȃ�ΏI��
		System.out.println("�c�O!");
		break;
	    }

	}
	
	System.out.println("������"+answer+"�ł���"); //�����̕\��

    }

}
