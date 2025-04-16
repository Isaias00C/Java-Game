package JavaGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //init game
        Scanner scanner = new Scanner(System.in);
        System.out.print("To start your journey enter your name: ");
        String playerName = scanner.nextLine();

        //init the player and the enemy
        Player player = new Player(playerName);
        Mob orc = new Orc();

        int turn = 0; //first turn is always the player
        while(true){
            if (turn % 2 == 0){
                //player's turn
                System.out.println("Your turn");
                System.out.println("Status: ");
                System.out.println(player.getStatus());
                System.out.println("Choose your action: ");
                System.out.println("1.Pass your turn");
                System.out.println("2.Attack");

                if(scanner.nextInt() == 2){
                    player.attack(orc);
                }else{
                    continue;
                }

            }else{
                //mob's turn
                System.out.println("Mob turn");
                System.out.println("Status: ");
                System.out.println(player.getStatus());
                orc.attack(player);
            }

            turn++;


            if(player.getLifePoints() < 0) {
                //if player's life points is below 0 it's died
                System.out.println("You lose");
                break;
            }else if(orc.getLifePoints() < 0){
                //if orc's life points is below 0 it's died
                System.out.println("You win");
                break;
            }
        }
    }
}