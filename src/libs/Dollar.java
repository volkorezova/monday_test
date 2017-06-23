package libs;

/**
 * Created by tatyanavolkorezova on 21.06.17.
 */
public class Dollar extends Currency implements FreeExchange{
    public Dollar(double kursNBU, double marging) {
        super(kursNBU, marging);//это переменная родитель
    }

    @Override
    public String freeExchange() {
        return "Free";
    }

    @Override
    public int test() {
        return 0;
    }


}
