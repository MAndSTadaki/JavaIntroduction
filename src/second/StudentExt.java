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
     * @param o
     * @return
     */
    @Override
    public int compareTo(StudentExt o) {  return this.score - o.score;  }

}
