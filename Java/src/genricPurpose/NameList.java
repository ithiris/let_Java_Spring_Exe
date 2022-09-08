package genricPurpose;

import java.util.ArrayList;
import java.util.List;

public class NameList<e> {

    List<e> nameList = new ArrayList<>();

    public e getFistName() {
        return nameList.get(0);
    }

    public e getLastName() {
        return nameList.get(nameList.size() - 1);
    }

    public e getMiddle() {
        return nameList.get(nameList.size() / 2);
    }

    public void add(e item) {
        nameList.add(item);

    }

    public List<e> printNameList() {
        return nameList;
    }


}
