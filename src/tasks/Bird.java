package tasks;

/**
 * Created by tatyanavolkorezova on 23.06.17.
 */
public class Bird extends Animal implements Charackter {
    private int hvost_length;
    public Bird(double length, String name, String color) {
        super(length, name, color);
    }


    @Override
    public String poletOpportunity() {
        return "Polet is running";
    }

    @Override
    public int bulkToDeep(int deep) {
        return 0;
    }

}
