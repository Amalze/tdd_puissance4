import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


class GridGameTest {

    @Test
    void shouldReturn2dArrayWithHeightEqual6(){
        GridGame grid = new GridGame();
        int height = grid.getHeight();
        Assertions.assertEquals(6,height);
    }

    @Test
    void shouldReturn2dArrayWithWidthEqual7(){
        GridGame grid = new GridGame();
        int width = grid.getWidth();
        Assertions.assertEquals(7,width);
    }

    @Test
    void shouldReturnInitializedGrid(){
        GridGame grid = new GridGame();
        String[][] gridList ={{"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"}};
        String[][] result = grid.getGrid();
        Assertions.assertArrayEquals(gridList,result);
    }

    @Test
    void shouldInsertTokenInFirstColumn(){
        GridGame grid = new GridGame();
        String[][] expectedGrid ={{"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"-", "-", "-", "-", "-", "-","-"},
                {"R", "-", "-", "-", "-", "-","-"}};
        boolean result = grid.insert(0,"R");
        Assertions.assertTrue(result);
        Assertions.assertArrayEquals(expectedGrid,grid.getGrid());
    }

    @Test
    void shouldReturnExceptionWhenColumnIsOutOfRange(){
        GridGame grid = new GridGame();
        String[][] expectedGrid ={{"-", "-", "-", "-", "-", "-","-"},
                                {"-", "-", "-", "-", "-", "-","-"},
                                {"G", "-", "-", "-", "-", "-","-"},
                                {"R", "-", "-", "-", "-", "-","-"},
                                {"G", "-", "-", "-", "-", "-","-"},
                                {"R", "-", "-", "-", "-", "-","-"}};
        Executable executable = () -> grid.insert(10,"R");
        ArrayIndexOutOfBoundsException exception = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, executable);
        Assertions.assertEquals("column is out of range", exception.getMessage());
    }


}
