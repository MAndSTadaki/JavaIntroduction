package second;

import first.*;

public class SecondMain {

    /**
     * 整列
     *
     * @param <T> クラステンプレート (Comparableを実装)
     * @param array
     */
    public static <T extends Comparable<? super T>> void sort(T[] array) {
        int n = array.length;
        for (int end = n - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T s = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = s;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //対象となる学生の配列を定義
        StudentExt students[] = {
            new StudentExt("Bob", 90), new StudentExt("Tim", 80),
            new StudentExt("Kim", 95), new StudentExt("Mary", 60),
            new StudentExt("Joan", 70), new StudentExt("Jane", 80),
            new StudentExt("Sam", 85), new StudentExt("Tom", 75)};
        sort(students);//整列の実施
        for (int i = 0; i < students.length; i++) {//結果出力
            System.out.println(students[i]);
        }
    }

}
