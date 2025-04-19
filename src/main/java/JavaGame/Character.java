package JavaGame;

public interface Character {
    int getLifePoints();
    String getStatus();
    void setCoordinates(int XCoordinate, int YCoordinate);
    int getXCoordinate();
    int getYCoordinate();
    void moveCharacter(String direction);
}
