package cn.itcast.utils;


import cn.itcast.domain.Student;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JdbcTest {
    @Test
    public void add() {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            // 获取连接
            conn = JDBCUtils.getConnection();

            // 编写sql
            String sql = "SELECT * FROM `student` LEFT JOIN student_score on student.Xh=student_score.Xh ORDER BY score desc";

            // 创建语句执行者
            st= conn.prepareStatement(sql);

            ResultSet resultSet = st.executeQuery();

            int max = 0, min = -1;
            int count=0;
            List<Student> maxlist = new ArrayList<>();
            List<Student> minlist = new ArrayList<>();

            while (resultSet.next()){
                count++;
                int id = resultSet.getInt(1);
                String name =resultSet.getString("Xm");
                int score = resultSet.getInt("score");
                String number = resultSet.getString("Xh");

                if (max==0){
                    max=score;
                    Student stu = new Student();
                    stu.setXh(number);
                    stu.setXm(name);

                    maxlist.add(stu);
                }else if(score>=max){
                    Student stu = new Student();
                    stu.setXh(number);
                    stu.setXm(name);
                    maxlist.add(stu);
                }


            }
            System.out.println(maxlist);

            while (resultSet.previous()){
                int id = resultSet.getInt(1);
                String name =resultSet.getString("Xm");
                int score = resultSet.getInt("score");
                String number = resultSet.getString("Xh");

                if (min==-1){
                    min=score;

                    Student stu = new Student();
                    stu.setXh(number);
                    stu.setXm(name);
                    minlist.add(stu);
                }else if(score<=min){
                    System.out.println(score);
                    Student stu = new Student();
                    stu.setXh(number);
                    stu.setXm(name);
                    minlist.add(stu);
                }
            }
            System.out.println(minlist);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.colseResource(conn, st, rs);
        }

    }
}
