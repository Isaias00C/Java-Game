package JavaGame;

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

    public void attack(Mob mob) {
        mob.damageReceive(this.damage);
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

}
