import java.io.*;

class AdultCheck {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�N������:");
		int i = Integer.parseInt(buf.readLine());
		adult( i ); //adult(int)���\�b�h���Ăяo��
	}

    static void adult(int i){
    	if(i<20){
    		System.out.println(i+"�˂͖����N�ł��B");
    	}else{
    		System.out.println(i+"�˂͐��l�ł��B");
    	}
    }

}