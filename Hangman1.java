import java.io.*;
public class Hangman1 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String[] dictionary = {"apple","banana","orange","lemon","grape",
						       "strawberry","grapefruit","pear","lime","qiwi"};

		int random = (int)(Math.random()*10);

		String answer = new String(dictionary[random]);


		System.out.println("“š‚¦‚Í"+answer+"‚Å‚µ‚½");

    }

}