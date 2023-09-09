package Sem1;

/*
Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
Согласно свойствам линейной сложности, количество итераций цикла будет линейно
изменяться относительно изменения размера N
*/

public class Task1 {
    public static int sum(int n) {
        // Решение 1
        // Sum(1, N) = ?
//        int sum = 0;
//        for (int i = 1; i <= n; i++) { // O(n)
//            sum += i;
//        }
//        return sum;
        // решение 2
        int sum = n * (n + 1) / 2; // O(1)
        return sum;
    }

    public static void main(String[] args) {
        int res = sum(5);
        System.out.println(res);
    }
}
