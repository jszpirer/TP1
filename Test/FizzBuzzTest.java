import com.company.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizz(){
        int nFizz = 5;
        int nBuzz = 3;
        int test = 10;
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.fizzBuzz(nFizz,nBuzz,test));
    }
    @Test
    public void testBuzz(){
        int nFizz = 5;
        int nBuzz = 3;
        int test = 9;
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.fizzBuzz(nFizz,nBuzz,test));
    }
    @Test
    public void testFizzBuzz(){
        int nFizz = 5;
        int nBuzz = 3;
        int test = 15;
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.fizzBuzz(nFizz,nBuzz,test));
    }
    @Test
    public void testOtherCases(){
        int nFizz = 5;
        int nBuzz = 3;
        int test = 17;
        FizzBuzz fb = new FizzBuzz();
        assertEquals("17", fb.fizzBuzz(nFizz,nBuzz,test));
    }


}
