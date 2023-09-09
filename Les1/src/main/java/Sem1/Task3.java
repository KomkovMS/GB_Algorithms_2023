package Sem1;

// Игральные кубики

/*
Необходимо написать алгоритм поиска всех доступных комбинаций для
количества кубиков K с количеством граней N.
● Вариант 1: количество кубиков может быть строго ограничено (4
кубика, например)
● Вариант 2: либо их количество будет динамическим (N задает
пользователь)
● Определить сложность полученного варианта решения
 */

public class Task3 {

    public static int[] nums = new int[100]; // 1 2 3 4

    public static void cobes(int d, int K, int N){ // O(N^K)
        if(d == 0){
            for(int i=1; i<=K; i++){
                System.out.printf("%d ", nums[i]);
            }
            System.out.println();
            return ;
        }

        for(int i=1; i<=N; i++){
            nums[d] = i;
            cobes(d-1, K, N);
        }
    }

    public static void main(String[] args) {
        cobes(4, 4, 6);
    }
}
