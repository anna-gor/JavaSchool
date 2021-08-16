package lab1;

import java.util.Arrays;

public class AnyaSuperIntegerList implements SuperIntegerList {
    //int[] intArray = new int[]{1, 2, 3, 4, 5};
    int[] intArray = new int[0];
    int size = intArray.length;


    @Override
    public void add(int number) {
        intArray = Arrays.copyOf(intArray, size + 1);
        size++;
        intArray[size - 1] = number;
    }

    @Override
    public void removeByIndex(int index) {
        int j;
        if (index >= size) {
            System.out.println("Error: Index greater than length of array");
        } else {
            for (j = 0; j < size; j++) {
                if (j == index) {
                    size--;
                    break;
                }
            }
            for (int k = j; k < size; k++)
                intArray[k] = intArray[k + 1];
        }
    }

    @Override
    public void removeByValue(int value) {
        int j;
        for (j = 0; j < size; j++) {
            if (intArray[j] == value) {
                size--;
                break;
            }
        }
        for (int k = j; k < size; k++)
            intArray[k] = intArray[k + 1];
    }

    @Override
    public int get(int index) {
        return intArray[index];
    }

    @Override
    public void printAll() {
        for (int j = 0; j < size; j++) {
            int i = intArray[j];
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AnyaSuperIntegerList array = new AnyaSuperIntegerList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.printAll();
        System.out.println("Element: " + array.get(0));
        array.removeByValue(1);
        array.printAll();
        System.out.println();
        array.removeByIndex(2);
        array.printAll();
        array.removeByIndex(10);
        array.printAll();
    }
}
