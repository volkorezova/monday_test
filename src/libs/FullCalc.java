package libs;

/**
 * Created by tatyanavolkorezova on 19.06.17.
 */
public class FullCalc {

    public static int[] printArrayWithConditions(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 10) {
                System.out.println(intArray[i] + " - Less than 10");
            } else if (intArray[i] == 10) {
                System.out.println(intArray[i] + " == 10");
            } else if (intArray[i] > 10) {
                System.out.println(intArray[i] + " > 10");
            } else {
                System.out.println("This will never happands");
            }
        }
        return intArray;

    }

    public static int[] printArrayWithCondition(int[] intArray, int intCondition) {

        System.out.println("Compare with int value: "+ intCondition);
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < intCondition) {
                System.out.println(intArray[i] + " - Less than intCondition");
            } else if (intArray[i] == intCondition) {
                System.out.println(intArray[i] + " == intCondition");
            } else if (intArray[i] > 10) {
                System.out.println(intArray[i] + " > intCondition");
            } else {
                System.out.println("This will never happands");
            }

        }
        return intArray;

    }
}
