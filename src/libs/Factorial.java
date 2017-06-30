package libs;

import org.apache.log4j.Logger;

/**
 * Created by tatyanavolkorezova on 23.06.17.
 */
public class Factorial {
    public static Logger logger = Logger.getLogger(Factorial.class);
    public static int factorial(int var){
        int result = 1;
        for (int i = 1; i <= var; i++)
            result *= i;
        logger.info("Result of "+ var+"! = "+result);
        return result;
    }
}
