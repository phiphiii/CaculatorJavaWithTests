import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MainTest {
    @Test
    public void TwoPlusOneShouldReturnThree(){
        Main main = new Main(2,1);
        assertEquals(3,main.add());
    }
    @Test
    public void ZeroPlusOneShouldReturnOne(){
        Main main = new Main(0,1);
        assertEquals(1,main.add());
    }
    @Test
    public void MinusOnePlusOneShouldReturnZero(){
        Main main = new Main(-1,1);
        assertEquals(0,main.add());
    }
    @Test
    public void MinusOnePlusMinusOneShouldReturnMinusTwo(){
        Main main = new Main(-1,-1);
        assertEquals(-2,main.add());
    }
    @Test
    public void FourPlusMinusFiveShouldReturnMinusOne(){
        Main main = new Main(4,-5);
        assertEquals(-1,main.add());
    }
    @Test
    public void FourPointTwoPlusThreeShouldReturnSevenPointTwo(){
        Main main = new Main(4.2,3);
        assertEquals(7.2,main.add());
    }
    @Test
    public void ZeroPlusZeroShouldReturnZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.add());
    }


    @Test
    public void TwoMinusOneShouldReturnOne(){
        Main main = new Main(2,1);
        assertEquals(1,main.subtract());
    }
    @Test
    public void ZeroMinusOneShouldReturnMinusOne(){
        Main main = new Main(0,1);
        assertEquals(-1,main.subtract());
    }
    @Test
    public void MinusOneMinusOneShouldReturnMinusTwo(){
        Main main = new Main(-1,1);
        assertEquals(-2,main.subtract());
    }
    @Test
    public void MinusOneMinusMinusOneShouldReturnZero(){
        Main main = new Main(-1,-1);
        assertEquals(0,main.subtract());
    }
    @Test
    public void FourMinusMinusFiveShouldReturnMinusOne(){
        Main main = new Main(4,-5);
        assertEquals(9,main.subtract());
    }
    @Test
    public void FourPointTwoMinusThreeShouldReturnOnePointTwo(){
        Main main = new Main(4.5,3.0);
        assertEquals(1.5,main.subtract());
    }
    @Test
    public void ZeroMinusZeroShouldReturnZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.subtract());
    }


    @Test
    public void FourTwentyTimesMinusOneShouldReturnMinusFourTwenty(){
        Main main = new Main(420,-1);
        assertEquals(-420,main.multiply());
    }
    @Test
    public void MinusOneTimesMinusOneShouldReturnOne(){
        Main main = new Main(-1,-1);
        assertEquals(1,main.multiply());
    }
    @Test
    public void FiveTimesMinusTwoShouldReturnMinusTen(){
        Main main = new Main(5,-2);
        assertEquals(-10,main.multiply());
    }
    @Test
    public void TwoTimesZeroShouldReturnZero(){
        Main main = new Main(2,0);
        assertEquals(0,main.multiply());
    }
    @Test
    public void HundredTimesZeroPointFiveShouldReturnFifty(){
        Main main = new Main(100,0.5);
        assertEquals(50,main.multiply());
    }
    @Test
    public void MinusHundredTimesZeroPointFiveShouldReturnMinusFifty(){
        Main main = new Main(-100,0.5);
        assertEquals(-50,main.multiply());
    }
    @Test
    public void ZeroTimesZeroShouldReturnZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.multiply());
    }


    @Test
    public void FourTwentyDividedByTenShouldReturnMinusFortyTwo(){
        Main main = new Main(420,10);
        assertEquals(42.0,main.divide());
    }
    @Test
    public void MinusTwoDividedByMinusOneShouldReturnMinusTwo(){
        Main main = new Main(2,-1);
        assertEquals(-2.0,main.divide());
    }
    @Test
    public void FiveDividedByTwoShouldReturnMinusTwoAndAHalf(){
        Main main = new Main(5,2);
        assertEquals(2.5,main.divide());
    }
    @Test
    public void TenDividedByZeroPointFiveShouldReturnTwenty(){
        Main main = new Main(10,0.5);
        assertEquals(20.0,main.divide());
    }
    @Test
    public void MinusFortyDividedByFourShouldReturnMinusTen(){
        Main main = new Main(-40,4);
        assertEquals(-10.0,main.divide());
    }
    @Test
    public void ForDividedByZeroShouldReturnNull(){
        Main main = new Main(4,0);
        assertNull(main.divide());
    }
    @Test
    public void ZeroDividedByFourShouldReturnZero(){
        Main main = new Main(0,4);
        assertEquals(0.0,main.divide());
    }


    @Test
    public void FiveSquaredShouldReturnTwentyFive(){
        Main main = new Main(5,2);
        assertEquals(25,main.power());
    }
    @Test
    public void MinusFiveToPowerOfThreeShouldReturnMinusHundredTwentyFive(){
        Main main = new Main(-5,3);
        assertEquals(-125,main.power());
    }

    @Test
    public void FourTwentyToPowerOfZeroShouldReturnOne(){
        Main main = new Main(420,0);
        assertEquals(1,main.power());
    }


    @Test
    public void SquareRootOfFourShouldReturnTwo(){
        Main main = new Main(4);
        assertEquals(2,main.sqroot());
    }

    @Test
    public void SquareRootOfZeroShouldReturnZero(){
        Main main = new Main(0);
        assertEquals(0,main.sqroot());
    }

}