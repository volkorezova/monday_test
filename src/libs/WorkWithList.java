package libs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tatyanavolkorezova on 30.06.17.
 */
public class WorkWithList extends WorkWithAbstractList {


    @Override
    public List<List<String>> addNewList(List<List<String>> ourList) {
        List<String> node = new ArrayList<>();
        ourList.add(node);
        this.printListList(ourList);
        return ourList;
    }

    @Override
    public List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        ourList.get(numberOfList).add(value);
        this.printListList(ourList);
        return ourList;
    }

    @Override
    public void printListList(List<List<String>> ourList) {
        System.out.println("---------");
        for (int i=0; i< ourList.size(); i++ ) {
            System.out.println(ourList.get(i));
        }
    }


}
