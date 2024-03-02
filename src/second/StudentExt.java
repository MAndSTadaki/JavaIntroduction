package second;

import first.*;

/**
 * 学生のクラスの拡張
 */
public class StudentExt extends Student implements Comparable<StudentExt> {

    public StudentExt(String name) {  super(name);  }

    public StudentExt(String name, int score) {  super(name, score); }

    /**
     * 比較する
     * @param target
     * @return
     */
    @Override
    public int compareTo(StudentExt target) {
        return this.score - target.score;  
    }

}
