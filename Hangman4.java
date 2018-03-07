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

	    System.out.print("次の文字は?");

	    String g = buf.readLine();
	    char c = g.charAt(0); //入力した文字列の0番目(先頭)の1文字だけを使う

	    String newguess ="";

	    for(int i=0; i<answer.length(); i++){
		if(c == answer.charAt(i)){        //answerのi番目の文字と同じか比較

		    newguess=newguess+answer.charAt(i);
		}else{
		    newguess=newguess+guess.charAt(i);
		}
	    }

	    System.out.println(newguess);

	    guess=newguess;
	    if(guess.equals(answer)){         //もし guess と answer が同じ文字列なら
		System.out.println("正解!");
		break;
	    }

	}
	
	System.out.println("答えは"+answer+"でした"); //答えの表示

    }

}
