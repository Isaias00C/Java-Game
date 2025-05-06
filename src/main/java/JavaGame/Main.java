package JavaGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //init Game Board

        GameBoard gameBoard = new GameBoard("Easy");
        AttackSystem attackSystem = new AttackSystem();

        gameBoard.setGameBoard();
        gameBoard.printGameBoard();

        //set player
        Player player = (Player) gameBoard.getCell(0,0).getCharacter();

        System.out.println(player.getStatus());

        //begin the game
        while(true){
            gameBoard.turn(attackSystem, player);
            gameBoard.printGameBoard();
        }
    }
}