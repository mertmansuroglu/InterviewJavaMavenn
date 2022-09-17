package diagonalDifference;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class DiagonalTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @Test
    void diagonalDiffPositiveTestCase() {
        Integer[][] array = new Integer[][] {{1,2,3},{4,5,6},{9,8,9}};
        List<List<Integer>> list=  Arrays.stream(array).map(Arrays::asList).collect(Collectors.toList());
        Diagonal diagonal= new Diagonal();
        Assertions.assertEquals(2,diagonal.diagonalDiff(list));

    }
    @Test
    void diagonalDiffNegativeTestCase() {
        //given
        Integer[][] array = new Integer[][] {{1,2,3},{4,5,6},{9,8,9}};
        List<List<Integer>> list=  Arrays.stream(array).map(Arrays::asList).collect(Collectors.toList());
      //when then
        Diagonal diagonal= new Diagonal();
        Assertions.assertNotEquals(2,diagonal.diagonalDiff(list));

    }
}