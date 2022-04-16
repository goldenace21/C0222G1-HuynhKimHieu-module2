package _10_stack_queue.exercise.sort_list;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private boolean sex;

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getAge(), o.getAge());
//            if (this.getAge() > o.getAge()) {
//                return 1;
//            } else if (this.getAge() < o.getAge()) {
//                return -1;
//            } else {
//                return 0;
//            }
    }
}
