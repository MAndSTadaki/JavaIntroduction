package first;

/**
 *
 * @author tadaki
 */
public class UnderstandReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 90);
        Student student2 = student1;
        student2.setScore(80);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

}
