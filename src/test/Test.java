package test;
import java.util.Arrays;
import static domain.Main.SumElements;

/**
 * Test class
 * @author Artem Pronenko
 */
public class Test {
        public static void main(String[] args) {
        int m=5, n=3, sum=0;
        int [][] array=new int[n][m];
        for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
            array[i][j]=1;
            }}
        sum=SumElements(array);
        System.out.println("Matrix:\n");
        for(int[] row:array)
            System.out.println(Arrays.toString(row));
        System.out.println("Сумма элементов матрицы: "+sum);
    }
}
