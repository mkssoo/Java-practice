import java.io.*;
class StringEquals {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello");
		String s1 = buf.readLine();

		if(s1.equals("hi")){
			System.out.println("Hi, nice to meet you.");
		}else{
			System.out.println("Bye");
		}
	}
}