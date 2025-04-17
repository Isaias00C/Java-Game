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

    public void setNullCell(){
        this.character = null;
    }

    public void printCell(){
        if(this.character != null){
            System.out.print(this.character.toString());
        }else{
            System.out.print(" [     ] ");
        }
    }
}
