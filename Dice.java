public class Dice {


	static int roll(){
		int dice;

		dice = (int)(Math.random()*6)+1; //1-6 ÇóêêîÇ≈ê∂ê¨
		
		return dice;
	}


	public static void main(String[] args){
		int dice1, dice2, dice3;

		dice1 = roll();
		dice2 = roll();
		dice3 = roll();

		System.out.println("dice1 = "+dice1);
		System.out.println("dice2 = "+dice2);
		System.out.println("dice3 = "+dice3);
	}
    
}