package case_study.services.Interface;

import case_study.models.person.Employee;

public interface Service {
    public void display();

    public void addNew();

    public void edit();

    public void delete();

    public Employee isExisted(String id);
}
