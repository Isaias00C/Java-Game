package ProjetoBackEnd;
import java.util.Random;

public class gameBoard {
    private Cell[][] grid;

    public gameBoard(String difficulty){
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


    }
}
