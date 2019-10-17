package Array;

import java.util.Arrays;

public class WorkWithArray {

    public static void main(String[] args) {


        int[] ArrayTest = new int[10];

        int max = ArrayTest[0];
        int min = 101;
        double avg;
        double summa = 0;

        //Заполнение массива
        System.out.println(ArrayTest.length);
        for (int i = 0; i < ArrayTest.length; i++) {
            ArrayTest[i] = (int) (Math.random() * 100);
            System.out.println(i + " элемент: " + ArrayTest[i]);
            summa = summa + ArrayTest[i];
        }

        // поиск максимального и минимального значений
        for (int i = 0; i < ArrayTest.length; i++) {
            if (ArrayTest[i] > max) {
                max = ArrayTest[i];
            }

            if (ArrayTest[i] < min) {
                min = ArrayTest[i];
            }
        }

        // расчет среднего арифметического
        avg = summa / (ArrayTest.length);

        // вывод данных
        System.out.println("Максимальное число:" + max);
        System.out.println("Минимальное число:" + min);
        System.out.println("Сумма:" + summa);
        System.out.println("Среднее арифметичское:" + avg);

        //Сортировка массива пузырьком
        boolean finish = false;
        int a;

        while (!finish) {
            finish = true;

            for (int i = 0; i < ArrayTest.length - 1; i++) {
                if (ArrayTest[i] < ArrayTest[i + 1]) {
                    a = ArrayTest[i];
                    ArrayTest[i] = ArrayTest[i + 1];
                    ArrayTest[i + 1] = a;
                    finish = false;
                }
            }
        }
        System.out.println("Отсортированный массив:" + Arrays.toString(ArrayTest));

    }
}
