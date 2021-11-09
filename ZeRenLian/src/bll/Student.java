package bll;

public class Student {
    private String name;
    private int days;
    private String why;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    @Override
    public String toString() {
        return "bll.Student{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", why='" + why + '\'' +
                '}';
    }
}
