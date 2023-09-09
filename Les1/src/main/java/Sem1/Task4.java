package Sem1;

// Числа Фибоначчи

/*
Пишем алгоритм поиска нужного числа последовательности
        Фибоначчи.
        Считаем, что 1 и 2 значения последовательности равны 1. Искать будем
        по формуле F(n) = F(n-1) + F(n-2), что предполагает использование
        рекурсивного
        алгоритма.
        ● F(n) = F(n-1) + F(n-2)
        ● Используем рекурсию для решения
        ● Рекурсия заканчивается на значениях 1 и 2
*/

import java.util.Date;

public class Task4 {
    public static int fib1(int n){ //  // O(2^n)
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib1(n-1) + fib1(n-2);
    }

    // Вариант 2
    public static int fib2(int n){ // O(n)
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for(int i=2; i<=n; i++){
            F[i] = F[i-1] + F[i-2];
        }
        return F[n];
    }

    // Тест
    public static void test(){
        for(int i = 20; i<=50; i++) {
            Date start = new Date();
            fib1(i);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();

            start = new Date();
            fib2(i);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.printf("i: %d, time1: %d, time2: %d%n", i, time1, time2);

        }
    }

    public static void main(String[] args) {
        System.out.println(fib1(10));
        System.out.println(fib2(10));
        test();
    }

}
