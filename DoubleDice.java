public class DoubleDice{
    public static void main(String[] args){
        rollDice();
        rollDice();

    }

	static int roll(){
		int dice;
		dice = (int)(Math.random()*6+1);

		return dice;
	}

    static int rollDice(){
        int face = roll();
        switch(face){
        case 1:
            one();
            break;
        case 2:
            two();
            break;
        case 3:
            three();
            break;
        case 4:
            four();
            break;
        case 5:
            five();
            break;
        case 6:
            six();
            break;
        }
		return face;
    }

    public static void one(){
    	System.out.println("+---+");
    	System.out.println("|   |");
    	System.out.println("| O |");
    	System.out.println("|   |");
    	System.out.println("+---+");
	}

	public static void two(){
    	System.out.println("+---+");
    	System.out.println("|  O|");
    	System.out.println("|   |");
    	System.out.println("|O  |");
    	System.out.println("+---+");
	}
	
    public static void three(){
    	System.out.println("+---+");
    	System.out.println("|O  |");
    	System.out.println("| O |");
    	System.out.println("|  O|");
    	System.out.println("+---+");
	}
	
    public static void four(){
    	System.out.println("+---+");
    	System.out.println("|O O|");
    	System.out.println("|   |");
    	System.out.println("|O O|");
    	System.out.println("+---+");
}

    public static void five(){
    	System.out.println("+---+");
    	System.out.println("|O O|");
    	System.out.println("| O |");
    	System.out.println("|O O|");
    	System.out.println("+---+");
	}

    public static void six(){
    	System.out.println("+---+");
    	System.out.println("|O O|");
    	System.out.println("|O O|");
    	System.out.println("|O O|");
    	System.out.println("+---+");
	}


}