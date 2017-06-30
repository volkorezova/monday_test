package tasks;

/**
 * Created by tatyanavolkorezova on 23.06.17.
 */
public class Fish extends Animal implements Charackter {

    private int nach_deep = 0;
    public Fish(double length, String name, String color) {
        super(length, name, color);
    }


    @Override
    public String poletOpportunity() {
        return "Fish cannot fly";
    }

    @Override
    public int bulkToDeep(int deep) {

      int current_deep = deep;
       return current_deep;
    }
}
