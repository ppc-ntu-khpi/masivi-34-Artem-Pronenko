package domain;

/**
 * Main class
 * @author Artem Pronenko
 */

public class Main {
    /**
     * метод для подсчета сумы елементов массива
     * @param array матрица
     * @return sum
     */
      public static int SumElements (int[][] array) {
         int sum=0;
          for (int i=0; i<array.length; i++) {
              for (int j = 0; j < array[i].length; j++) {
                  sum += array[i][j];
              }
          }
        return sum;
        }
    }
