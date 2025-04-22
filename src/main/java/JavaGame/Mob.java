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

    @Override
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


}
