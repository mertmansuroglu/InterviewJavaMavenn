package fibonacciSeries;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciTest() {
        int[] a={0,1,1,2,3};
        Assertions.assertEquals(7,new Fibonacci().fibonacciSum(5));
//        0,1,2,3,5
    }
    @Test
    void fibonacciTestAltern() {
        ;

        int b=new Fibonacci().fibonacciRecursive(4);
        System.out.println(b);
//        Assertions.assertArrayEquals(a,new Fibonacci().fibonacci(5));
//        0,1,2,3,5
    }
}