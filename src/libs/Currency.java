package libs;

import org.apache.log4j.Logger;

/**
 * Created by tatyanavolkorezova on 21.06.17.
 */
abstract public class Currency {//может иметь как абстракные так и обвчные - что ну жно не забыть написать в наследниках
    //kostuktor vsegda public , nichego ne vozvrashe i takoy kak klass
    //nastroyka vnutrennix svoyst klassa

    private double kursNBU;//свойство нашего класса
    private double marging;

    public static Logger logger = Logger.getLogger(Currency.class);

    public Currency(double kursNBU, double marging){
        this.kursNBU = kursNBU;// в конструкторе научили обьяек задавать свойство
        this.marging = marging;
    }

    public double getKursNBU(){

        logger.info("KursNBU =  "+kursNBU);
        return kursNBU;
    }

    public void setKursNBU(double newKursNBU){
        kursNBU = newKursNBU;
        logger.info("New kursNBU "+ newKursNBU+ " was set");

    }


    public void setMarging(double marging) {
        this.marging = marging;
    }

    public double getMarging() {
        return marging;
    }

    public double exchangeToUAH(double amount){
        double result = (kursNBU*marging)*amount;
        logger.info("You can got "+ result +" for your "+ amount);
        return result;
    }




}
