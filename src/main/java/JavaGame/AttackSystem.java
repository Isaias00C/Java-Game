package JavaGame;
import java.util.Scanner;

public class AttackSystem {
    public void attack(){
        System.out.print("Enter the direction of the mob: ");
        Scanner input = ScannerSingleton.getInstance();
        String direction = input.nextLine().toLowerCase();


    }

    public void attack(Character attacker, Character defender) {
        System.out.println("Attacking " + attacker + " at " + defender);
    }

    boolean hasMobInRange(GameBoard gameBoard, Character attacker) {
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        for (int[] direction : directions) {
            int newX = direction[0] + attacker.getXCoordinate();
            int newY = direction[1] + attacker.getYCoordinate();

            if(isValidMove(gameBoard, newX, newY)) {
                return true;
            }
        }
        return false;
    }

    boolean isValidMove(GameBoard gameBoard, int XCoordinate, int YCoordinate) {
        int length = gameBoard.getLength();
        return (XCoordinate >= 0 && XCoordinate < length) && (YCoordinate >= 0 && YCoordinate < length);
    }
}
