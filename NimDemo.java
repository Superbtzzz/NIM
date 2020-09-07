public class NimDemo {
    public static void main(String[] args){
        Nimsys.welcome();
        Nimsys game = new Nimsys(5,15);
        game.createPlayer(1);
        game.createPlayer(2);
        game.setGame();
        game.printStars();
        game.removeStone(16);
        System.out.println("remaining stone: " + game.getRemainingStone());
    }
}



    /*public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to NIM");
    System.out.println();
    System.out.println("Please enter a command to continue");
    System.out.println();
    String Input = keyboard.nextLine();
    System.out.println();

    if(Input.equalsIgnoreCase("start")){

        System.out.print("Please enter player 1's name : ");
        String player1_name = keyboard.nextLine();
        NimPlayer player1 = new NimPlayer(player1_name);


        System.out.print("Please enter player 2's name : ");
        String player2_name = keyboard.nextLine();
        NimPlayer player2 = new NimPlayer(player2_name);

        System.out.print("Enter upper bound : ");
        int UPPER_BOUND = keyboard.nextInt();


        System.out.print("Enter initial number of stones : ");
        int iniNum = keyboard.nextInt();




        System.out.printf("%d stones left : ",iniNum);
        printStars(iniNum);


    }

    else if(Input.equalsIgnoreCase("exit")){
        System.out.println("Game exited");
        System.exit(1);
    }

    else if(Input.equalsIgnoreCase("help")){
        System.out.println("help");
    }

    else System.out.println("commands");

    }
    */