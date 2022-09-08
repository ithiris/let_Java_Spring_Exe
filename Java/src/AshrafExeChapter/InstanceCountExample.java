package AshrafExeChapter;

public class InstanceCountExample {
    String name;
    int age;
    String degree;

    int instanceCount =0;
    static  int count =0;
    public InstanceCountExample() {
        instanceCount++;
        count++;
    }

   public boolean equals(Object other) {
        if (other instanceof InstanceCountExample) {
            if (this.name == ((InstanceCountExample) other).name) {
                return true;
            }

        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    void printMyAddressHandle() {
        System.out.println(this);
        System.out.println(age);
    }


}
