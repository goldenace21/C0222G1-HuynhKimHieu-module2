package exam_02.manage;

import exam_02.models.Subject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static exam_02.controllers.CodegymController.scanner;

public class ManageSubjectImpl implements ManageSubject {
    static List<Subject> subjectList = new ArrayList<>();
    static {
        subjectList.add(new Subject("BC-134","python","12","easy",5));
        subjectList.add(new Subject("BC-135","java","8","difficult",3));
        subjectList.add(new Subject("BC-184","javaScript","11","medium",7));
    }
    @Override
    public void descending() {
        subjectList.sort(Comparator.comparing(Subject::getTime).reversed());
    }

    public void ascending() {
        subjectList.sort(Comparator.comparing(Subject::getTime));
    }

    @Override
    public void display() {
        if (!subjectList.isEmpty())
            for (Subject item : subjectList)
                System.out.println(item.toString());
        else System.err.println("Emty list");
    }

    @Override
    public void addNew() {
        System.out.println("Enter code: ");
        String code = scanner.nextLine();
        if (isExisted(code) != null) {
            System.out.println("Code already exists");
            return;
        }
        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Enter vesion: ");
        String vesion = scanner.nextLine();
        System.out.println("Enter level: ");
        String level = scanner.nextLine();
        System.out.println("Enter time: ");
        int time = Integer.parseInt(scanner.nextLine());
        subjectList.add(new Subject(code,name,vesion,level,time));
    }

    @Override
    public void edit(String code) {

    }

    @Override
    public void delete(String code) {

    }

    @Override
    public Object isExisted(String code) {
        for (Subject item : subjectList) {
            if (item.getCode().equals(code))
                return item;
        }
        return null;
    }
}
