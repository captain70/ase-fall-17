package Calculator;

public class CalculatorPrototype implements CalculatorIf {


    @Override
    public int sum( int m,int n)
    {		int i = 0;
        while(i!=n) {
            i++;
            m++;

        }

        return m;
    }
    public int subtract(int m, int n) {
        int i = 0;
        while(i!=n) {
            i++;
            m--;
        }
        return m;

    }

   public int divide(int m, int n) {
        int count = 0;
        while(m>0) {
            m = m - n;
            count++;
        }

        if(m<0) {
            count = count -1;

        }
        return count;
    }


    public int multiply(int m,int n) {

        int results = 0;

        for(int i=0;i<n; i++) {
            results = results + m;

        }
        return results;
    }

}




