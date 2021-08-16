package lab1;

public class Main {
    public static void main(String[] args) {
        //AnyaSuperIntegerList array = new AnyaSuperIntegerList();
        AnyaSuperIntegerList array = new AnyaSuperIntegerList(new int[]{1, 2, 3, 4, 5});
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.printAll();
        System.out.println(array.get(0));
        array.removeByValue(1);
        array.printAll();
        System.out.println();
        array.removeByIndex(2);
        array.printAll();
        array.removeByIndex(10);
        array.printAll();

        AnyaSuperIntegerList emptyArray = new AnyaSuperIntegerList(new int[]{});
        emptyArray.add(1);
        emptyArray.add(2);
        emptyArray.add(3);
        emptyArray.add(4);
        emptyArray.printAll();
    }
}
