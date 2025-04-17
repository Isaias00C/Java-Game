package JavaGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //init Game Board

        GameBoard gameBoard = new GameBoard("Easy");

        gameBoard.setGameBoard();
        gameBoard.printGameBoard();

        Player player = (Player) gameBoard.getCell(0,0).getCharacter();

        System.out.println(player.getStatus());

    }
}