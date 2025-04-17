package JavaGame;

public class Cell {
    private Character character = null;
    private Weapon weapon = null;

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character getCharacter(){
        return this.character;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }


}
