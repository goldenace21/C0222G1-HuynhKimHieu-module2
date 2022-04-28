package case_study.services.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.Interface.FacilityService;
import case_study.utils.FacilityRegex;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements FacilityService {

    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static FacilityRegex facilityRegex = new FacilityRegex();

    static {
        facilityIntegerMap.put(new Villa("SVVL-2345","Vila",65.6,99.6,"10",
                                         "day","vip",45.0,"4"),0);

        facilityIntegerMap.put(new House("SVHO-5334","House",76,45,"16",
                                         "hour","vip","5"),5);

        facilityIntegerMap.put(new Room("SVRO-5432","Room",54,12,"15",
                                        "year","service"),0);
    }

    @Override
    public void display() {
        if (facilityIntegerMap.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                System.out.println("Service " + element.getKey() + " times " + element.getValue());
            }
        }
    }

    @Override
    public void displayMaintain() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getValue() >= 5)
            System.out.println("Service maintain " + element.getKey() + " times " + element.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        String id,name,styleRental,rentalPeople,roomStandard,floor;
        double areaUse,price,poolArea;

        id = facilityRegex.enterIdVila();
        if (isExisted(id) != null) {
            System.err.println("The villa already existed!");
            return;
        }

        name = facilityRegex.enterName();
        areaUse = facilityRegex.enterArea();
        price = facilityRegex.enterPrice();
        rentalPeople = facilityRegex.enterRentalPeople();
        styleRental = facilityRegex.enterStyleRental();
        roomStandard = facilityRegex.enterRoomStandard();
        poolArea = facilityRegex.enterArea();
        floor = facilityRegex.enterFloor();

        facilityIntegerMap.put(new Villa(id,name,areaUse,price,rentalPeople,styleRental,roomStandard,poolArea,floor),0);
        System.out.println("successfully added new");
    }


    @Override
    public void addNewHouse() {
        String id,name,styleRental,rentalPeopleMax,roomStandard,floor;
        double areaUse,price;

        id = facilityRegex.enterIdHouse();
        if (isExisted(id) != null) {
            System.err.println("The villa already existed!");
            return;
        }

        name = facilityRegex.enterName();
        areaUse = facilityRegex.enterArea();
        price = facilityRegex.enterPrice();
        rentalPeopleMax = facilityRegex.enterRentalPeople();
        styleRental = facilityRegex.enterStyleRental();
        roomStandard = facilityRegex.enterRoomStandard();
        floor = facilityRegex.enterFloor();
        facilityIntegerMap.put(new House(id,name,areaUse,price,rentalPeopleMax,styleRental,roomStandard,floor),0);
        System.out.println("successfully added new");
    }


    @Override
    public void addNewRoom() {
        String id,name,styleRental,rentalPeopleMax,freeService;
        double areaUse,price;

        id = facilityRegex.enterIdRoom();
        if (isExisted(id) != null) {
            System.err.println("The villa already existed!");
            return;
        }

        name = facilityRegex.enterName();
        areaUse = facilityRegex.enterArea();
        price = facilityRegex.enterPrice();
        rentalPeopleMax = facilityRegex.enterRentalPeople();
        styleRental = facilityRegex.enterStyleRental();
        freeService = facilityRegex.enterFreeService();
        facilityIntegerMap.put(new Room(id,name,areaUse,price,rentalPeopleMax,styleRental,freeService),0);
        System.out.println("successfully added new");
    }

    @Override
    public Object isExisted(String id) {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getKey().getId().equals(id)) {
                return element;
            }
        }
        return null;
    }
}
