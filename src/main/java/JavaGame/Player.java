package JavaGame;
import java.util.Scanner;

public class Player implements Character {
    private int lifePoints;
    private final int damage;
    private final String name;
    private int XCoordinate;
    private int YCoordinate;

    public Player(String name) {
        this.lifePoints = 100;
        this.damage = 0;
        this.name = name;
    }

    public void damageReceive(int damage) {
        this.lifePoints -= damage;
    }

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public String getStatus() {
        return "->Player " + this.name + "\n->LifePoints: " + this.lifePoints + "\n->Damage: " + this.damage;
    }

    public String toString() {
        return " [ You ] ";
    }

    @Override
    public void setCoordinates(int XCoordinate, int YCoordinate){
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
    }

    @Override
    public int getXCoordinate() {
        return this.XCoordinate;
    }

    @Override
    public int getYCoordinate() {
        return this.YCoordinate;
    }

    @Override
    public void yourTurn(AttackSystem attackSystem, GameBoard gameBoard){
        System.out.println("Your turn, what is your move?");
        System.out.println("1. Move");
        if (attackSystem.hasMobInRange(gameBoard, this)) System.out.println("2. attack");

        Scanner scanner = ScannerSingleton.getInstance();

        System.out.print("What you want to do: ");
        String command = scanner.nextLine();
        switch (command) {
            case "1":
                gameBoard.moveCharacter(this);
                break;
            case "2":
                attackSystem.attack();
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}
