package by.it.malaschenok.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        String a = "arra";
        String b = "rrd";
        String c = "fddf";
        String d = "eeee";
        String e = "rere";
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
     int n = list.size();
        System.out.println(n);
        for (int i = 0; i<= n; i++) {
            int j = n - i - 1;
            System.out.println( list.get(j));
        }


    }
}
