import java.io.*;
public class Hangman2 {
    public static void main(String args[])throws IOException{
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	String[] dictionary = {"apple","banana","orange","lemon","grape",
					       "strawberry","grapefruit","pear","lime","qiwi"};

	int random = (int)(Math.random()*10);

	String answer = new String(dictionary[random]);

	String guess=""; //‹ó‚Ì•¶š—ñ‚ğ¶¬
	for(int i=0; i<answer.length(); i++){ //answer‚Ì•¶š—ñ‚Ì’·‚³•ªƒ‹[ƒv
	    guess=guess+"-"; //•¶š‚ÌêŠ‚É '-' ‚ğ’Ç‰Á
	}
	System.out.println(guess); //‰æ–Ê‚É•\¦

	
	System.out.println("“š‚¦‚Í"+answer+"‚Å‚µ‚½");

    }

}