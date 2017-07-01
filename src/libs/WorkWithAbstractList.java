package libs;

import java.util.List;

/**
 * Created by tatyanavolkorezova on 30.06.17.
 */
abstract public class WorkWithAbstractList {

    /**
     *Method will add new List<String> to List
     * @param ourList
     */
    abstract List<List<String>> addNewList(List<List<String>> ourList);

    /**
     * Method should add value to some List
     * @param numberOfList
     * @param value
     * @param ourList
     */
   abstract List<List<String>> addValueToListList(int numberOfList, String value , List<List<String>> ourList);

    /**
     * Method should print Every List on new line
     */
    abstract void printListList(List<List<String>> ourList);
}

