package bll;

public class Xzbgs extends Application{

    public Xzbgs(String name, Application successor) {
        super(name, successor);
    }

    @Override
    public void handleRequest(Student stu) {
        if (stu.getDays() <= 90) {
            System.out.println(String.format("%s审批了%s的请假：%s天。", this.name, stu.getName(), stu.getDays()));
        } else {
            super.handleRequest(stu);
        }
    }

}
