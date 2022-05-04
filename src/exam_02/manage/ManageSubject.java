package exam_02.manage;

public interface ManageSubject {
    void descending();

    void addNew();

    void display();

    void edit(String code);

    void delete(String code);

    Object isExisted(String code);
}
