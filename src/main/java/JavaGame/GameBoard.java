package JavaGame;
import java.util.Random;
import java.util.Scanner;

public class GameBoard {
    private Cell[][] grid;

    GameBoard(String difficulty){
        switch (difficulty) {
            case "Easy" -> grid = new Cell[7][7];
            case "Medium" -> grid = new Cell[13][13];
            case "Hard" -> grid = new Cell[21][21];
        }
    }

    public void setGameBoard(){
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                grid[row][col] = new Cell();
            }
        }

        int numberOfMobs = grid[0].length / 3;

        Scanner scanner = new Scanner(System.in);

        //set player
        System.out.print("To begin yout journey first enter your name: ");
        String name = scanner.nextLine();
        setPlayer(new Player(name));

        //set Mobs
        setMobs();

        scanner.close();
    }

    public void setPlayer(Player player){
        grid[0][0].setCharacter(player);
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
}
