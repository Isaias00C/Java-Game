package JavaGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //init Game Board

        GameBoard gameBoard = new GameBoard("Easy");

        gameBoard.setGameBoard();
        gameBoard.printGameBoard();

        //set player
        Player player = (Player) gameBoard.getCell(0,0).getCharacter();

        System.out.println(player.getStatus());

        //begin the game
            Scanner scanner = ScannerSingleton.getInstance();

            System.out.println("It's your turn, move!");
            System.out.print("For where: ");
            String move = scanner.nextLine().toLowerCase();

            player.moveCharacter(move);
            gameBoard.printGameBoard();


    }
}