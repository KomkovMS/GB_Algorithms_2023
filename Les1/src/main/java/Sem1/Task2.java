package Sem1;

// Поиск простых чисел

/*
Написать алгоритм поиска простых чисел (делятся только на себя и на 1)
в диапазоне от 1 до N. В алгоритме будет использоваться вложенный for,
что явно говорит о квадратичной сложности

● Простые числа - числа, которые делятся на 1 и на себя
● Каждое число в отрезке от 1 до N надо проверить на простоту.
● В решении будет два вложенных цикла, что даст сложность O(N2)
 */

import static java.lang.Math.sqrt;

public class Task2 {

    public static void simple (int n) {
        // Решение 1
//        for (int num = 2; num <= n; num++) { // O(n^2)
//            boolean ok = true;
//            for (int j = 2; j < num; j++) {
//                if (num % j == 0) {
//                    ok = false;
//                    break;
//                }
//            }
//            if (ok) {
//                System.out.printf("%d, ", num);
//            }
//        }
        // Решение 2
        for (int num = 2; num <= n; num++) { // O(n^2)  // O (n sqrt(n))
            boolean ok = true;
            for (int j = 2; j * j < num; j++) {
                if (num % j == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.printf("%d, ", num);
            }
        }
    }
    public static void main(String[] args) {
        simple(100);
    }
}
