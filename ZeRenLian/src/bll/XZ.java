package bll;

public class XZ extends Application{
    public XZ(String name, Application successor) {
        super(name, successor);
    }

    @Override
    public void handleRequest(Student stu) {
        System.out.println(String.format("%s审批了%s的请假：%s天。", this.name, stu.getName(), stu.getDays()));
    }
}
