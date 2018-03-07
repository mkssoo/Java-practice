import java.io.*;
public class Hangman2 {
    public static void main(String args[])throws IOException{
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	String[] dictionary = {"apple","banana","orange","lemon","grape",
					       "strawberry","grapefruit","pear","lime","qiwi"};

	int random = (int)(Math.random()*10);

	String answer = new String(dictionary[random]);

	String guess=""; //空の文字列を生成
	for(int i=0; i<answer.length(); i++){ //answerの文字列の長さ分ループ
	    guess=guess+"-"; //文字の場所に '-' を追加
	}
	System.out.println(guess); //画面に表示

	
	System.out.println("答えは"+answer+"でした");

    }

}