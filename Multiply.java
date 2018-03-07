import java.io.*;

class Multiply {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("整数aを入力:");
		int i = Integer.parseInt(buf.readLine());

		System.out.print("整数bを入力:");
		int j = Integer.parseInt(buf.readLine());

		int d = multiply( i, j ); //multiply(int,int)メソッドの呼び出し
		System.out.println(i+"x"+j+"="+d);

	}

	//ここにmultiply(int,int)メソッドを追加
	static int multiply(int i, int j){
		int a = i * j;
		return a;
	}
}