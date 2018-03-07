import java.io.*;
public class ReverseString {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input String:");
		String line = buf.readLine();
		StringBuffer reverse = new StringBuffer();

		for(int i=line.length()-1; i>=0; i--){
			reverse.append(line.charAt(i));
		}
		System.out.println(reverse);
	}
}