package libs;

/**
 * Created by tatyanavolkorezova on 19.06.17.
 */
public class FullCalc {

    public static int[] printArrayWithConditions(int[] intArray){

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
}
