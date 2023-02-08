// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;
// import java.util.*;
public class Lab {

    public static void main(String[] args) {
        // переменные
        int i = 0;
        int z = 0;
        int k = 0;
        int j = 0;
        int count = 0;
        int n = 10;

        // лабиринт
        int labirint[][] = {
                { 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 },
                { 11, 22, 22, 22, 22, 22, 22, 22, 22, 22 },
                { 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 },
                { 22, 99, 22, 22, 99, 22, 22, 22, 22, 22 },
                { 22, 99, 22, 22, 22, 22, 22, 22, 22, 22 },
                { 22, 22, 22, 22, 99, 00, 22, 22, 22, 22 },
                { 22, 22, 22, 99, 22, 22, 22, 22, 22, 22 },
                { 22, 22, 22, 99, 99, 22, 22, 22, 22, 22 },
                { 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 },
                { 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 },
                { 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 } };

        // Начало пути
        int way[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                way[i][j] = -1;
            }
        }

        // Прохождение лабиринта
        flug: for (int l = 0; l < 99; l++) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (labirint[i][j] == count && i > 0 && i < n && j > 0 && j < n - 1) {

                        if (labirint[i][j + 1] == 22) {
                            labirint[i][j + 1] = count + 1;
                        }
                        if (labirint[i][j + 1] == 11) {
                            z = i;
                            k = j + 1;
                            break flug;
                        }

                        if (labirint[i + 1][j] == 22) {
                            labirint[i + 1][j] = count + 1;
                        }
                        if (labirint[i + 1][j] == 11) {
                            z = i + 1;
                            k = j;
                            break flug;

                        }

                        if (labirint[i][j - 1] == 22) {
                            labirint[i][j - 1] = count + 1;
                        }
                        if (labirint[i][j - 1] == 11) {
                            z = i;
                            k = j - 1;
                            break flug;

                        }

                        if (labirint[i - 1][j] == 22) {
                            labirint[i - 1][j] = count + 1;
                        }
                        if (labirint[i - 1][j] == 11) {
                            z = i - 1;
                            k = j;
                            break flug;

                        }

                    }

                }
            }
            count++;
        }
        labirint[z][k] = count + 1;
        count++;

        // Кратчайший путь
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (labirint[z][k] >= labirint[z + 1][k]) {
                    way[z][k] = count;
                    z = z + 1;
                    count--;
                }

                if (labirint[z][k] >= labirint[z - 1][k]) {
                    way[z][k] = count;
                    z = z - 1;
                    count--;
                }

                if (labirint[z][k] >= labirint[z][k + 1]) {
                    way[z][k] = count;
                    k = k + 1;
                    count--;
                }

                if (labirint[z][k] >= labirint[z][k - 1]) {
                    way[z][k] = count;
                    k = k - 1;
                    count--;
                }
                way[z][k] = count;
            }
        }
        // Вывод крайчайшего пути
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("%4d", way[i][j]);
            }
            System.out.println();
            
        }
    }
}