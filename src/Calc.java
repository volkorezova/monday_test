/**
 * Created by tatyanavolkorezova on 12.06.17.
 */
public class Calc {

public void sum(int operand1, int operand2){
 /**
  *@param operan1
  *@param operan2
  *
  *
  */
    int tempResult = operand1+operand2;
    System.out.println("Result "+operand1+"+"+operand2+" = "+ tempResult);

}

public void sum(String operand1, int operand2){

    String tempResult = operand1+operand2;
    System.out.println("Result "+operand1+"+"+operand2+" = "+ tempResult);


}

//DZ 3 part-1
public void sum (int operand2, String operand1){

    String tempResult = operand1+operand2;
    System.out.println("Result: " +operand1 + "+" + operand2+ "=" + tempResult);

    }



    // DZ 3 - part 1

    public void subtraction(int operand2, int operand3){

        int tempResult = operand2-operand3;
        System.out.println("Result: "+ operand2+"-"+operand3+ "="+ tempResult);


    }


    public static int mult(int operand1, int operand2){

        int tempResult = operand1*operand2;
        System.out.println("Result:" + tempResult);
        return tempResult;


    }

}
