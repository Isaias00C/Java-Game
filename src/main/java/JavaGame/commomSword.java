package JavaGame;

public class commomSword implements Weapon{
    private int damage;

    @Override
    public int increaseDamege(){
        return 5;
    }

    @Override
    public int increaseArmor() {
        return 0;
    }
}
