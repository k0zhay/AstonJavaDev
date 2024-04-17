
package org.example;

import java.util.Arrays;

public class ClassWithGetAndSet {
    private String name;
    private int num;
    private int[] numArray;

    public ClassWithGetAndSet() {
        this.name = "Patrick";
        this.num = 42;
        this.numArray = new int[]{6, 6, 6};
    }

    public ClassWithGetAndSet(String name, int num, int[] numArray) {
        this.name = name;
        this.num = num;
        this.numArray = numArray;
    }

    public String getName() {
        System.out.println("имя: " + this.name);
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
        System.out.println("Новое имя: " + this.name);
    }

    public int getNum() {
        System.out.println("Номер: " + this.num);
        return this.num;
    }

    public void setNum(int newNum) {
        this.num = newNum;
        System.out.println("Новый номер: " + this.num);
    }

    public int[] getNumArray() {
        System.out.println("Массив: " + Arrays.toString(this.numArray));
        return this.numArray;
    }

    public void setNumArray(int[] newArray) {
        this.numArray = newArray;
        System.out.println("Новый массив: " + Arrays.toString(this.numArray));
    }
}
