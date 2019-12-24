package com.igorberezovchuck;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList first = new MyList();
        first.add(994);
        first.add(321);
        first.add(839);
        System.out.println("Добавили элементы в список: " + first);
        first.set(1, 998);
        System.out.println("Элемент списка: " + first.get(1));
        first.add(1, 115);
        System.out.println("Ещё добавили: " + first);
        first.remove(2);
        System.out.println("Убрали элемент по индексу: " + first);
        System.out.println("Лист пустой? " + first.isEmpty());
        first.removeByValue(115);
        System.out.println("Убрали по значению: " + first);
        first.sort();
        System.out.println("Отсортировали список: " + first);
        int[] second = first.toArray();
        System.out.println("Преобразовали в массив: " + Arrays.toString(second));
    }
}
