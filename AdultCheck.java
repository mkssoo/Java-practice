import java.io.*;

class AdultCheck {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("年齢を入力:");
		int i = Integer.parseInt(buf.readLine());
		adult( i ); //adult(int)メソッドを呼び出し
	}

    static void adult(int i){
    	if(i<20){
    		System.out.println(i+"才は未成年です。");
    	}else{
    		System.out.println(i+"才は成人です。");
    	}
    }

}