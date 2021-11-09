package bll;

public class Application {
    protected String name;
    protected Application successor;

    public Application(String name, Application successor) {
        this.name = name;
        this.successor = successor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Application getSuccessor() {
        return successor;
    }

    public void setSuccessor(Application successor) {
        this.successor = successor;
    }

    public void handleRequest(Student stu) {
        int days= stu.getDays();
        if (this.successor != null) {
            this.successor.handleRequest(stu);
        }
    }
}
