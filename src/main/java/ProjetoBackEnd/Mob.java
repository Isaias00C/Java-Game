package ProjetoBackEnd;

public abstract class Mob implements Character{
    private int lifePoints;
    private final int damage;

    public Mob(){
        this.lifePoints = 100;
        this.damage = 5;
    }

    public void attack(Player player) {
        player.damageReceive(this.damage);
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
        return "->LifePoints: " + this.lifePoints + "\n->Damage: " + this.damage;
    }

}
