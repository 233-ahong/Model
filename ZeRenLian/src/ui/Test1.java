package ui;

import bll.*;

public class Test1 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("user1");
        student.setDays(30);
        Teacher teacher=new Teacher("teacher1",new JiaoWuChu("jiaowuchu",new Xzbgs("xzbgs",new XZ("xz",null))));
        teacher.handleRequest(student);

    }
}
