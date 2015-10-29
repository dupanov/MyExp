/**
 * Exponent power x approximied by Fourie
 * Created by Вадик on 29.10.2015.
 */
public class MyExp {
    public static void main(String[] args) {
        for(int i=1;i<10;i++ ) {
            System.out.print(i + "\t" + myExp(i));
            System.out.println("");
        }
    }

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
}
