package by.it.verishko.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static double getWeight(int weight) {
        double a = weight * 386 / 9.81;
        double b = (double) Math.round(a);
        double c = b / 100.00;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c = sc.nextInt();
        double b = getWeight(c);
        System.out.println(b);
    }
}
//    public static void main(String[] args) {
//        System.out.println(getWeight());
//    }
//
//    private static double getWeight() {
//        Scanner in = new Scanner(System.in);
//        double weight = in.nextInt();
//        double b = 3.86;
//        double c = 9.81;
//        return weight * b / c;
//    }
//}

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        double weight = in.nextInt();
////        int a = 75;
//        double b = 3.86;
//        double c = 9.81;
//        double d = weight * b / c;
//        System.out.println(d);
//    }
//}