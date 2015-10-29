/**

 * Created by Вадик on 29.10.2015.
 */
public class MyExp {
    public static void main(String[] args) {
        for(int i=1;i<10;i++ ) {
            System.out.print(i + "\t" + myExp(i) + "\t" +gauss(i));
            System.out.println("");
        }
    }

    /* * Exponent power x approximied by Fourie series
    * */
    public static double myExp (double x) {
        double exp = 1;
        double sum = 1;
        int i=1;
        while (exp>0.0000001){
            exp = exp*x/i;
            sum = sum + exp;
            i++;
        }
        return sum;
    }

    /*
    Gauss decomposition of exp(-x^2).
    Behaves unpredictable with odd and even numer of itterations
     */
    public static double gauss (double x) {
        double exp = 1;
        double sum = 0;
        int i=1;
        while (i<100)
                //Math.abs(exp)>0.000000000000001)
                {
            sum = sum + exp;
            exp = -1*exp*(x*x)/i;
            i++;
        }
        return sum;
    }
}
