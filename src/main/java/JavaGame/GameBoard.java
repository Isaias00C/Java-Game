package JavaGame;
import java.util.Random;
import java.util.Scanner;

public class GameBoard {
    private Cell[][] grid;
    private final Character[] turns;

    GameBoard(String difficulty){
        switch (difficulty) {
            case "Easy" -> grid = new Cell[7][7];
            case "Medium" -> grid = new Cell[13][13];
            case "Hard" -> grid = new Cell[21][21];
        }

        assert grid != null;
        turns = new Character[(grid.length / 3) + 1];
    }

    public void setGameBoard(){
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                grid[row][col] = new Cell();
            }
        }

        int numberOfMobs = grid[0].length / 3;

        Scanner scanner = ScannerSingleton.getInstance();

        //set player
        System.out.print("To begin yout journey first enter your name: ");
        String name = scanner.nextLine();
        setPlayer(new Player(name));

        //set Mobs
        setMobs();

    }

    public void setPlayer(Player player){
        grid[0][0].setCharacter(player);
        grid[0][0].getCharacter().setCoordinates(0, 0);
        turns[0] = grid[0][0].getCharacter();
    }

    public void setMobs(){
        Random rand = new Random();

        for(int i = 0; i < grid.length / 3; i++){
            int row = rand.nextInt(grid.length);
            int col = rand.nextInt(grid[0].length);

            if(row == 0 && col == 0){
                i--;
            }else {
                //set the mob in the cell
                grid[row][col].setCharacter(new Orc());
                turns[i+1] = grid[row][col].getCharacter();
                grid[row][col].getCharacter().setCoordinates(col, row);
            }
        }
    }

    public void printGameBoard(){
        System.out.println("\nThis is the current game board");

        for(Cell[] cells : grid){
            for (Cell cell : cells) {
                cell.printCell();
            }
            System.out.println();
        }
    }

    public Cell getCell(int row, int col){ return this.grid[row][col]; }

    public void moveCharacter(Character character){
        int x = character.getXCoordinate();
        int y = character.getYCoordinate();

        System.out.print("Enter the direction: ");
        Scanner scanner = ScannerSingleton.getInstance();
        String direction = scanner.nextLine().toLowerCase();
        switch(direction){
            case "right" -> grid[x + 1][y].setCharacter(character);
            case "left" -> grid[x - 1][y].setCharacter(character);
            case "down" -> grid[x][y + 1].setCharacter(character);
            case "up" -> grid[x][y - 1].setCharacter(character);
            default -> System.out.println("Invalid direction");
        }

        grid[x][y].setNullCell();

    }
}
