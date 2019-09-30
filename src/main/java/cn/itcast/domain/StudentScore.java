package cn.itcast.domain;

import java.io.Serializable;

public class StudentScore implements Serializable{
    private String Id;//序号
    private String Xh;//学号
    private int Score;//成绩

    public StudentScore() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getXh() {
        return Xh;
    }

    public void setXh(String xh) {
        Xh = xh;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public StudentScore(String id, String xh, int score) {
        Id = id;
        Xh = xh;
        Score = score;
    }

    @Override
    public String toString() {
        return "StudentScore{" +
                "Id='" + Id + '\'' +
                ", Xh='" + Xh + '\'' +
                ", Score=" + Score +
                '}';
    }
}
