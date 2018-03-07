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
	}; //ハングマンのアスキーアート

	int random = (int)(Math.random()*10);

	String answer = new String(dictionary[random]);

	String guess="";
	for(int i=0; i<answer.length(); i++){
	    guess=guess+"-";
	}

	System.out.println(guess);

	int miss=0; //ミスカウンタを初期化

	System.out.println(hangman[miss]); //miss番目のハングマンを表示

	while(true){
	    System.out.print("次の文字は?");

	    String g = buf.readLine();
	    char c = g.charAt(0); //入力した文字列の0番目(先頭)の1文字だけを使う

	    String newguess ="";
	    boolean hit=false;
	    for(int i=0; i<answer.length(); i++){ //答えの文字列から入力した文字を探す
		if(c == answer.charAt(i)){        //answerのi番目の文字と同じか比較
		    hit=true;
		    newguess=newguess+answer.charAt(i); //答えのi番目の文字をコピー
		}else{                            //外れた
		    newguess=newguess+guess.charAt(i);  //ヒントのi番目の文字をコピー
		}
	    }

	    if(hit==false){ //1文字も当たらなかったら
			miss++;     //ミスを1回増やす
	    }

	    System.out.println(newguess);

	    System.out.println(hangman[miss]); //miss番目のハングマンを表示

	    guess=newguess;
	    if(guess.equals(answer)){         //もし guess と answer が同じ文字列なら
		System.out.println("正解!");
		break;
	    }

	    if(miss>4){     //ミスが5回ならば終了
		System.out.println("残念!");
		break;
	    }

	}
	
	System.out.println("答えは"+answer+"でした"); //答えの表示

    }

}
