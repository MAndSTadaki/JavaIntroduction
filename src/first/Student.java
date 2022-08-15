package first;

/**
 * 学生のクラス
 */
public class Student {

    private final String name;//名前
    protected int score;//点数

    /**
     * 名前を指定したコンストラクタ
     * @param name
     */
    public Student(String name) {  this.name = name; }

    /**
     * 名前と点数を指定したコンストラクタ
     * @param name
     * @param score
     */
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 点数を再設定
     * @param score
     */
    public void setScore(int score) {  this.score = score;  }

    /**
     * 点数を取得
     * @return 
     */
    public int getScore() {  return score;  }
    
    /**
     * インスタンスを文字列化
     * @return
     */
    @Override
    public String toString() {  return name + ":" + String.valueOf(score);  }
}
