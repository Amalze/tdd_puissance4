
public class GridGame {
    private String[][] grid;

    public GridGame() {
        String[][] grid = {{"-", "-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-", "-"}};
        this.grid = grid;
    }

    public boolean insert(int column, String token) {
        if(column > getHeight()){
            throw new ArrayIndexOutOfBoundsException("column is out of range");
        }
        for(int i= getHeight()-1; i>=0; i--){
            if(grid[i][column].equals("-")){
                grid[i][column] = token;
                return true;
            }
        }
        return false;
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    public int getHeight(){
        return grid.length;
    }

    public int getWidth(){
        return grid[0].length;
    }

}


