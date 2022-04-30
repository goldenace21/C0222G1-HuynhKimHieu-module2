package case_study.services.interfacee;

public interface FacilityService {
    void display();

    void displayMaintain();

    void addNewVilla();

    void addNewHouse();

    void addNewRoom();

    Object isExisted(String id);
}
