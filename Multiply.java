import java.io.*;

class Multiply {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("����a�����:");
		int i = Integer.parseInt(buf.readLine());

		System.out.print("����b�����:");
		int j = Integer.parseInt(buf.readLine());

		int d = multiply( i, j ); //multiply(int,int)���\�b�h�̌Ăяo��
		System.out.println(i+"x"+j+"="+d);

	}

	//������multiply(int,int)���\�b�h��ǉ�
	static int multiply(int i, int j){
		int a = i * j;
		return a;
	}
}