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

	System.out.print("次の文字は?");

	String g = buf.readLine();
	char c = g.charAt(0); //入力した文字列の0番目(先頭)の1文字だけを使う

	String newguess ="";

	for(int i=0; i<answer.length(); i++){ //答えの文字列から入力した文字を探す
	    if(c == answer.charAt(i)){        //answerのi番目の文字と同じか比較

		newguess=newguess+answer.charAt(i); //答えのi番目の文字をコピー
	    }else{                            //外れた
		newguess=newguess+guess.charAt(i);  //ヒントのi番目の文字をコピー
	    }
	}

	System.out.println(newguess); //現在のヒントを表示

	
	System.out.println("答えは"+answer+"でした"); //答えの表示

    }

}
