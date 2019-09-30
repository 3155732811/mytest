package cn.itcast.domain;

import java.io.Serializable;

public class Student implements Serializable{
    private String Xh;//学号
    private String Xm;//姓名

    public Student() {
    }

    public Student(String xh, String xm) {
        Xh = xh;
        Xm = xm;
    }

    public String getXh() {
        return Xh;
    }

    public void setXh(String xh) {
        Xh = xh;
    }

    public String getXm() {
        return Xm;
    }

    public void setXm(String xm) {
        Xm = xm;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Xh='" + Xh + '\'' +
                ", Xm='" + Xm + '\'' +
                '}';
    }
}
