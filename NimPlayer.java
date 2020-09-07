public class NimPlayer {
    private String name;
    private int total_game_played, player1_win_count, player2_win_count, UPPER_BOUND;


    public NimPlayer(String name){
        this.name = name;
    }

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}

    public void startGame(){
    }
    public void exit(){
    }
    public void help(){
        System.out.println("Hi, Type 'commands' to display a list of all the available commands ");
    }
    public void commandList(){

    }


}
