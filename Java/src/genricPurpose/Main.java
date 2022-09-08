package genricPurpose;

public class Main {
    public static void main(String[] args) {

        NameList <String> nameStr = new NameList <> ();
        nameStr.add("apple");
        nameStr.add("banana");
        nameStr.add("lemon");
        nameStr.add("mango");
        System.out.println(nameStr.getFistName());
        System.out.println(nameStr.getLastName());
        System.out.println(nameStr.getMiddle());
        System.out.println(nameStr.printNameList());
        NameList<Integer> integerList = new NameList <> ();
        integerList.add(2);
        integerList.add(26);
        integerList.add(35);
        integerList.add(49);
        integerList.add(88);
        System.out.println(integerList.printNameList());


    }
}
