package JavaGame;

public abstract class Mob implements Character{
    private int lifePoints;
    private final int damage;
    private int xCoordinate;
    private int yCoordinate;

    public Mob(){
        this.lifePoints = 100;
        this.damage = 5;
    }

    public void attack(Player player) {
        player.damageReceive(this.damage);
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
        return "->LifePoints: " + this.lifePoints + "\n->Damage: " + this.damage;
    }

    public String toString() {
        return " [ Mob ] ";
    }

    @Override
    public void setCoordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public int getXCoordinate() {
        return this.xCoordinate;
    }

    @Override
    public int getYCoordinate() {
        return this.yCoordinate;
    }

    @Override
    public void moveCharacter(String direction) {
        switch (direction) {
            case "left" -> this.xCoordinate -= 1;
            case "right" -> this.xCoordinate += 1;
            case "up" -> this.yCoordinate -= 1;
            case "down" -> this.yCoordinate += 1;
            default -> System.out.println("Invalid direction");
        }
    }

}
