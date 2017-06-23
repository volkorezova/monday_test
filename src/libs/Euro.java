package libs;

/**
 * Created by tatyanavolkorezova on 21.06.17.
 */
public class Euro extends Currency implements FreeExchange{
    public Euro(double kursNBU, double marging) {
        super(kursNBU, marging);
    }

    @Override
    public String freeExchange() {
        return "Free";
    }

    @Override
    public int test() {
        return 9;
    }
}
