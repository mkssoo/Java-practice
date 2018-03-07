import java.io.*;
import java.text.*;

class Multiply_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###########.###########");
		
		System.out.print("����a�����:");
		double i = Double.parseDouble(buf.readLine());

		System.out.print("����b�����:");
		double j = Double.parseDouble(buf.readLine());

		double d = multiply( i, j ); //multiply(int,int)���\�b�h�̌Ăяo��
		System.out.println(df.format(i) + " x " + df.format(j) + " = " + df.format(d));

	}

	//������multiply(int,int)���\�b�h��ǉ�
	static double multiply(double i, double j){
		double a = i * j;
		return a;
	}
}