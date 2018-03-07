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

	    System.out.print("ŽŸ‚Ì•¶Žš‚Í?");

	    String g = buf.readLine();
	    char c = g.charAt(0); //“ü—Í‚µ‚½•¶Žš—ñ‚Ì0”Ô–Ú(æ“ª)‚Ì1•¶Žš‚¾‚¯‚ðŽg‚¤

	    String newguess ="";

	    for(int i=0; i<answer.length(); i++){
		if(c == answer.charAt(i)){        //answer‚Ìi”Ô–Ú‚Ì•¶Žš‚Æ“¯‚¶‚©”äŠr

		    newguess=newguess+answer.charAt(i);
		}else{
		    newguess=newguess+guess.charAt(i);
		}
	    }

	    System.out.println(newguess);

	    guess=newguess;
	    if(guess.equals(answer)){         //‚à‚µ guess ‚Æ answer ‚ª“¯‚¶•¶Žš—ñ‚È‚ç
		System.out.println("³‰ð!");
		break;
	    }

	}
	
	System.out.println("“š‚¦‚Í"+answer+"‚Å‚µ‚½"); //“š‚¦‚Ì•\Ž¦

    }

}
