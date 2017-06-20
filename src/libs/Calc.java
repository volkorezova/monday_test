package libs;

/**
 * Created by tatyanavolkorezova on 12.06.17.
 */
public class Calc {

    public void sum(int operand1, int operand2) {
        /**
         *@param operan1
         *@param operan2
         *
         *
         */
        int tempResult = operand1 + operand2;
        System.out.println("Result " + operand1 + "+" + operand2 + " = " + tempResult);

    }

    public void sum(String operand1, int operand2) {

        String tempResult = operand1 + operand2;
        System.out.println("Result " + operand1 + "+" + operand2 + " = " + tempResult);


    }

    //DZ 3 part-1
    public void sum(int operand1, String operand2) {

        String tempResult = operand1 + operand2;
        System.out.println("Result: " + operand1 + "+" + operand2 + "=" + tempResult);

    }


    // DZ 3 - part 1

    public void subtraction(int operand2, int operand3) {

        int tempResult = operand2 - operand3;
        System.out.println("Result: " + operand2 + "-" + operand3 + "=" + tempResult);


    }

    public static int mult(int operand1, int operand2) {
        int tempResult = operand1 * operand2;
        System.out.println("Result:" + tempResult);
        return tempResult;
    }


    public static int sumIntAndString(String operand1, int operand2) {

        return Integer.parseInt(operand1) + operand2;

    }

    public int sumIntAndStringWithExeption(String operand1, int operand2) {

        try {

            return Integer.parseInt(operand1) + operand2;
        } catch (NumberFormatException e) {
            System.out.println("LONG FORMAT" + operand1);
            return 888888;

        } catch (Exception e) {

            System.out.println("ERROR" + e);
            return 99999;
        }
    }

//-----------------------------------------
//divide by zero 5/2=int
    //7.8/0 = infinitive
    //int/int = byte - ghtj,hfpjfgnm htpekmnfn bи обрабока еслине сможег привести к байту

    // int/int

    public static int division(int a, int b) {
        int c;

        try {
            c = a / b;
            System.out.println("Result  int/int:" + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception - we can't divide on zero: " + e);
            return 888;
        }
        return c;
    }


    public static double division(double a, int b) {

        double c;
        c = a / b;
        System.out.println("Result div double/int: " + c);
        return c;
    }


    public static byte divisionWithByte(int a, int b) {
        int c;
        try {
            c = (a / b);
            if ((c < -128) || (c > 127)) {
                System.out.println("Result is over the area: " + (byte) c);
            } else {
                System.out.println("Result int/int in bytes: " + (byte) c);
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception - we can't divide on zero: " + e);
            return 88;
        } catch (Exception e) {
            System.out.println("ERROR" + e);
            return 99;
        }
        return (byte) c;
    }


//    public byte divisionIntToInt(int operand1, int operand2) {
//
//        try {
//
//            byte result = Byte.parseByte(String.valueOf(operand1 / operand2));
//            return result;
//
//        } catch (NumberFormatException e) {
//
//            System.out.println("OUT of range");
//            return 99;
//        } catch (ArithmeticException e) {
//
//
//            System.out.println("Нельзя делить на ноль");
//            return 77;
//
//        } catch (Exception e) {
//
//            System.out.println("ERROR " + e);
//            return 77;
//
//        }
//





}





