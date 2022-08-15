package first;

public class FirstMain {

    /**
     * 整列
     * @param students Studentクラスのインスタンスからなる配列
     */
    public static void sort(Student students[]) {
        int n = students.length;
        for (int end = n - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (students[i].getScore() > students[i + 1].getScore()) {
                    Student s = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = s;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //対象となる学生の配列を定義
        Student students[] = {
            new Student("Bob", 90), new Student("Tim", 80),
            new Student("Kim", 95), new Student("Mary", 60),
            new Student("Joan", 70), new Student("Jane", 80),
            new Student("Sam", 85), new Student("Tom", 75)};
        sort(students);//整列の実施
        for (Student student : students) { //結果出力
            System.out.println(student);
        }
    }

}
