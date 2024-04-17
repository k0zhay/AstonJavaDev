
package org.example;

// Примера ради импортируем только статический метод из класса ClassWithStatic
import static org.example.ClassWithStatic.rememberIt;
import static org.example.ClassWithStatic.sayHi;

public class Main {
    public static void main(String[] args) {

        // использование импортированного(!) метода
        sayHi();

        // использование статической переменной (сначала надо написать класс)
        System.out.println(ClassWithStatic.staticString);

        // Создание объектов класса ClassWithGetAndSet
        ClassWithGetAndSet obj1 = new ClassWithGetAndSet();
        ClassWithGetAndSet obj2 = new ClassWithGetAndSet();

        // Проверка геттеров класса ClassWithGetAndSet
        obj1.getName();
        obj1.getNum();
        obj1.getNumArray();

        // Проверка сеттеров класса ClassWithGetAndSet и метода rememberIt()
        obj2.setName(rememberIt());
        obj2.setNum(777);
        obj2.setNumArray(new int[]{0, 0, 0});

        // Вывод названия загрузчика класса и названия класса
        System.out.println(ClassWithGetAndSet.class.getClassLoader());
        System.out.println(ClassWithGetAndSet.class.getSimpleName());
    }
}
