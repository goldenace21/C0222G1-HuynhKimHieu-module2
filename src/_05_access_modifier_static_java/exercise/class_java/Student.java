package _05_access_modifier_static_java.exercise.class_java;

public class Student {
    private String name = "john";
    private String clas = "c02";

    Student() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}
