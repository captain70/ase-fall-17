package Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class CalculatorTestPrototype {

        @Test
        public void testSum() {
            CalculatorPrototype calculator = new CalculatorPrototype();
            int sum = calculator.sum(3,3);
            assertEquals(6, sum);
        }

        @Test
        public void testDivisionEven() {
            CalculatorPrototype calculator = new CalculatorPrototype();
            int sum = calculator.divide(6,3);
            assertEquals(2, sum);
        }

        @Test
        public void testDivisionOdd() {
            CalculatorPrototype calculator = new CalculatorPrototype();
            int sum = calculator.divide(7,3);
            assertEquals(2, sum);
        }
        @Test
        public void testSubtraction(){
            CalculatorPrototype calculator= new CalculatorPrototype();
            int subtract = calculator.subtract(15,3);
            assertEquals(12,subtract);
        }
        @Test
        public void testSubtractionNegative(){
            CalculatorPrototype calculator= new CalculatorPrototype();
            int subtract = calculator.subtract(-15,-3);
            assertEquals(-12,subtract);
        }
        @Test
        public void testSubtractionByZero(){
            CalculatorPrototype calculator= new CalculatorPrototype();
            int subtract = calculator.subtract(3,0);
            assertEquals(3,subtract);
        }
        @Test
        public void testMultiplicationEven(){
            CalculatorPrototype calculator= new CalculatorPrototype();
            int multiply = calculator.multiply(10,4);
            assertEquals(40,multiply);
        }
        @Test
        public void testMultiplicationOdd(){
            CalculatorPrototype calculator= new CalculatorPrototype();
            int multiply = calculator.multiply(11,5);
            assertEquals(55,multiply);
        }
        @Test
        public void testMultiplicationNegative(){
            CalculatorPrototype calculator= new CalculatorPrototype();
            int multiply = calculator.multiply(-10,4);
            assertEquals(-40,multiply);
        }
        @Test
        public void testMultiplicationByZero(){
            CalculatorPrototype calculator= new CalculatorPrototype();
            int multiply = calculator.multiply(4,0);
            assertEquals(0,multiply);
        }





    }

