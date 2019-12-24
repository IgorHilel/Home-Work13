package com.igorberezovchuck;

import java.util.Arrays;

public class MyList {

    int[] arr = new int[0];

    public int get(int index) {
        if (index >= arr.length || index < 0) {
            System.out.println("Ошибка в методе Get, индекс выходит за пределы листа.");
            return 0;
        }
        return arr[index];
    }

    public void set(int index, int value) {
        if (index >= arr.length || index < 0) {
            System.out.println("Ошибка в методе Set, индекс выходит за пределы листа.");
        } else {
            arr[index] = value;
        }
    }

    public void add(int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length - 1] = value;
        arr = tmp;
    }

    public void clear() {
        arr = new int[0];
    }

    public int size() {
        return arr.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(int position, int value) {
        if (position >= arr.length || position < 0) {
            System.out.println("Ошибка в методе Add, индекс выходит за пределы листа.");
        } else {
            int[] tmp = new int[arr.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                if (i < position) {
                    tmp[i] = arr[i];
                } else if (i == position) {
                    tmp[i] = value;
                } else {
                    tmp[i] = arr[i - 1];
                }
            }
            arr = tmp;
        }
    }

    public void remove(int index) {
        if (index >= arr.length || index < 0) {
            System.out.println("Ошибка в методе remove, индекс выходит за пределы листа.");
        } else {
            int[] tmp = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (i < index) {
                    tmp[i] = arr[i];
                } else if (i == index) {
                    continue;
                } else {
                    tmp[i - 1] = arr[i];
                }
            }
            arr = tmp;
        }
    }

    public void removeByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                remove(i);
            }
        }
    }

    public int[] toArray() {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public void sort() {
        Arrays.sort(arr);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
