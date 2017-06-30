package libs;

import org.apache.log4j.Logger;

/**
 * Created by tatyanavolkorezova on 19.06.17.
 */
public class FullCalc {
    public static Logger logger = Logger.getLogger(FullCalc.class);

    public static int[] printArrayWithConditions(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 10) {
                logger.info(intArray[i] + " - Less than 10");
            } else if (intArray[i] == 10) {
                logger.info(intArray[i] + " == 10");
            } else if (intArray[i] > 10) {
                logger.info(intArray[i] + " > 10");
            } else {
                logger.error("This will never happands");
            }
        }
        return intArray;

    }

    public static int[] printArrayWithCondition(int[] intArray, int intCondition) {

        System.out.println("Compare with int value: "+ intCondition);
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < intCondition) {
                logger.info(intArray[i] + " - Less than intCondition");
            } else if (intArray[i] == intCondition) {
                logger.info(intArray[i] + " == intCondition");
            } else if (intArray[i] > 10) {
                logger.info(intArray[i] + " > intCondition");
            } else {
                logger.info("This will never happands");
            }

        }
        return intArray;

    }
}
