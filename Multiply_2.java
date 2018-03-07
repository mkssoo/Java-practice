import java.io.*;
import java.text.*;

class Multiply_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###########.###########");
		
		System.out.print("整数aを入力:");
		double i = Double.parseDouble(buf.readLine());

		System.out.print("整数bを入力:");
		double j = Double.parseDouble(buf.readLine());

		double d = multiply( i, j ); //multiply(int,int)メソッドの呼び出し
		System.out.println(df.format(i) + " x " + df.format(j) + " = " + df.format(d));

	}

	//ここにmultiply(int,int)メソッドを追加
	static double multiply(double i, double j){
		double a = i * j;
		return a;
	}
}