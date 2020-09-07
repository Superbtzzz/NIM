import java.util.Scanner;
public class Nimsys {
    private int numStars, total_game_played;
    Scanner keyboard = new Scanner(System.in);
    private static int UPPER_BOUND,initialNum, remainingStone=0;

    public Nimsys(int UPPER_BOUND, int initialNum){
        this.UPPER_BOUND = UPPER_BOUND;
        this.initialNum = initialNum;
        remainingStone = initialNum;
    }

    public Nimsys() {
    }

    public void createPlayer(int playernum){
        System.out.print("Please enter player "+ playernum + "'s name : ");
        String player1_name = keyboard.nextLine();
        NimPlayer player1 = new NimPlayer(player1_name);
        }

    public void setGame(){
        System.out.print("Enter upper bound : ");
        this.UPPER_BOUND = keyboard.nextInt();


        System.out.print("Enter initial number of stones : ");
        this.initialNum = keyboard.nextInt();
    }

    public static void welcome(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to NIM");
        System.out.println();
        System.out.println("Please enter a command to continue");
        System.out.println();
    }

    public void printStars() {
        System.out.print("Enter initial number of stones : ");
        for (int i = 0; i < initialNum; i++)
            System.out.print("*");
        System.out.println();
    }

    public int removeStone(int move){
        if(isValid(move)) {
            System.out.println(isValid(move));
            return remainingStone = remainingStone - move;
        }
        else return 1;
    }

    private boolean isValid(int move){
        if ((move > UPPER_BOUND) &&((remainingStone - move)>=0)){
            return false;
        }
        return true;
    }

    public static int getRemainingStone() {
        return remainingStone;
    }


}




