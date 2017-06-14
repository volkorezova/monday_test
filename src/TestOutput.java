/**
 * Created by tatyanavolkorezova on 08.06.17.
 */
public class TestOutput {

    public static void main(String arg[]){

        System.out.println("Hello");

        int var1=15;

        int var2 = 20;
        String varString = "test";

        System.out.println(var1 + " "+varString+" "+ var2);

        Calc calc = new Calc();
        calc.sum(var1,var2);
        calc.sum("test", 11);

        Integer var3 = 33;
        System.out.println(var3);
        calc.sum(var1,var3);



        System.out.println("Result = "+ var1+ var2+var3);

        int rez_11 = var1+ var3;
        System.out.println("Rez_2 =  "+rez_11);

        calc.mult(2,5);
        calc.sum(calc.mult(2,5), 5);


    }

}
