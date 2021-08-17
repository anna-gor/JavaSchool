package lab1;

import java.util.Arrays;

public class AnyaSuperIntegerList implements SuperIntegerList {
    int[] intArray;
    int size;

    public AnyaSuperIntegerList(int[] someIntegers) {
        this.intArray = someIntegers;
        this.size = intArray.length;
    }

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
            return;
        }
        if (index < 0) {
            throw new IllegalArgumentException();
        } else {
            for (j = 0; j < size; j++) {
                if (j == index) {
                    size--;
                    break;
                }
            }
            for (int k = j; k < size; k++) {
                intArray[k] = intArray[k + 1];
            }
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
        for (int k = j; k < size; k++) {
            intArray[k] = intArray[k + 1];
        }
    }

    @Override
    public int get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if (index >= size) {
            System.out.println("Error: Index greater than length of array");
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return intArray[index];
        }
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

}
