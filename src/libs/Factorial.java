package libs;

/**
 * Created by tatyanavolkorezova on 23.06.17.
 */
public class Factorial {
    public static int factorial(int var){
        int result = 1;
        for (int i = 1; i <= var; i++)
            result *= i;
        System.out.println("Result of "+ var+"! = "+result);
        return result;
    }
}
