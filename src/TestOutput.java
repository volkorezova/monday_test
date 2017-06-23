import libs.*;


public class TestOutput {

    public static void main(String arg[]) {

        //   System.out.println("Hello");

//        mult(5,6);
//        mult (4,3);
//
//
//        int var1=15;
//
//        int var2 = 20;
//        String varString = "test";
//
//        System.out.println(var1 + " "+varString+" "+ var2);

        Calc calc = new Calc();
//        calc.sum(var1,var2);
//        calc.sum("test", 11);
//
//        Integer var3 = 33;
//        System.out.println(var3);
//        calc.sum(var1,var3);
//
//
//
//        System.out.println("Result = "+ var1+ var2+var3);
//
//        int rez_11 = var1+ var3;
//        System.out.println("Rez_2 =  "+rez_11);
//
//        mult(2,5);
//        calc.sum(mult(2,5), 5);
//
//
//        //("345"+6)*2 = int
//
//        mult(calc.sumIntAndString("345",6), 2);
//
//
//
//        calc.sumIntAndStringWithExeption("34fg", 4);4


//        calc.sum(2, "Kapec");
//        calc.subtraction(2,9);

        // calc.division(3,2);
        // calc.division(8,1);

        // calc.division(7.8,2);
//
//        calc.divisionWithByte(466, 0);
//        calc.divisionWithByte(900000001,2);
//        calc.divisionWithByte(20,2);

//        String student = "Taras";
//
// String[] studentArray = {"Taras", "Stas", "Den"};
//        System.out.println("Element of array" + studentArray[2]);


        // System.out.println("Size "+ intArray.length);


//        if (intArray[0]<10){
//
//            System.out.println(intArray[0] + " - Less than 10");
//
//        } else if (intArray[0] == 0){
//
//            System.out.println(intArray[0] + " ==10");
//
//        } else {
//
//            System.out.println(intArray[0] +"  > 10");


        int[] intArrayForCheck = {2, 4, 26, 28, 10, 20, 33};

        FullCalc fullCalc = new FullCalc();
        fullCalc.printArrayWithConditions(intArrayForCheck);
        fullCalc.printArrayWithCondition(intArrayForCheck, 10);


//            for (int i=0; i<intArray.length; i++){
//
//                if (intArray[i]<10){
//
//                    System.out.println(intArray[i]+ " - Less than 10");
//
//                } else if (intArray[i] == 10){
//
//                    System.out.println(intArray[i] + " ==10");
//
//                } else if(intArray[i]>10){
//
//                    System.out.println(intArray[i] +"  > 10");
//
//
//                } else {
//                    System.out.println("This will never happands");
//
//
//
//                }


//zapolnenie massiva bustro
        String[] stringArrayNew = new String[100];
        for (int i = 0; i < 100; i++) {
            stringArrayNew[i] = "test" + i;
            System.out.println(stringArrayNew[i]);
        }

        System.out.println();


        Dollar dollar = new Dollar(26.15, 1.1);
        dollar.getKursNBU();
        dollar.setKursNBU(27);
        dollar.getKursNBU();


        Euro euro = new Euro(30.0, 1.2);
        euro.getKursNBU();
        euro.setKursNBU(31.9);
        euro.getKursNBU();


        dollar.exchangeToUAH(1000);
        euro.exchangeToUAH(1000);

        System.out.println("Dolar -> " + dollar.freeExchange());
        System.out.println("Euro -> " + euro.freeExchange());




        Matrix matrix = new Matrix();
        System.out.println("Matrix with null");
        matrix.displayMatrix(5, matrix.matrixWithNull(5));
        System.out.println();

        matrix.fillWithOneByDiagonSpravaNalevo(5, matrix.matrixWithNull(5) );
        System.out.println();

        matrix.fillWithOneByDiagonSlevaNapravo(5,matrix.matrixWithNull(5));
        System.out.println();

        Factorial.factorial(3);



    }
}


















