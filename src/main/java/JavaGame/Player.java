package JavaGame;

public class Player implements Character {
    private int lifePoints;
    private final int damage;
    private final String name;

    public Player(String name) {
        this.lifePoints = 100;
        this.damage = 0;
        this.name = name;
    }

    public void attack(Mob mob) {
        mob.damageReceive(this.damage);
    }

    @Override
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
}
