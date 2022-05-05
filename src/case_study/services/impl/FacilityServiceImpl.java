package case_study.services.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.interfacee.FacilityService;
import case_study.utils.FacilityRegex;
import java.util.LinkedHashMap;
import java.util.Map;

import static case_study.utils.IOData.*;

public class FacilityServiceImpl implements FacilityService {

    public static Map<Facility,Integer> facilityMap = new LinkedHashMap<>();
    public static FacilityRegex facilityRegex = new FacilityRegex();

    static {
        facilityMap.put(new Villa("SVVL-2345", "Vila", 65.6, 99.6, "10",
                                         "day", "vip", 45.0, "4"), 0);

        facilityMap.put(new House("SVHO-5334", "House", 76, 45, "16",
                                        "hour", "vip", "5"), 5);

        facilityMap.put(new Room("SVRO-5432", "Room", 54, 12, "15",
                                        "year", "service"), 0);

        facilityMap.put(new Villa("SVVL-7463", "Vila", 86.5, 85.6, "12",
                                         "hour", "standard", 65.5, "8"), 0);

        facilityMap.put(new Villa("SVVL-7346", "Hilla", 46.5, 99.4, "19",
                                         "day", "vip", 76.4, "1"), 0);
        writeMapToCSV(facilityMap,FACILITY_PATH);
    }

    @Override
    public void display() {
        Map<Facility,Integer> mapFacility = ReadCSVToMap(FACILITY_PATH);
        if (mapFacility.isEmpty()) {
            System.err.println("Empty list!");
        } else {
            for (Map.Entry<Facility, Integer> element : mapFacility.entrySet()) {
                System.out.println("Service " + element.getKey() + " times " + element.getValue());
            }
        }
    }

    @Override
    public void displayMaintain() {
        Map<Facility,Integer> mapFacility = ReadCSVToMap(FACILITY_PATH);
        for (Map.Entry<Facility, Integer> element : mapFacility.entrySet()) {
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

        facilityMap.put(new Villa(id,name,areaUse,price,rentalPeople,styleRental,roomStandard,poolArea,floor),0);
        writeMapToCSV(facilityMap,FACILITY_PATH);
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
        facilityMap.put(new House(id,name,areaUse,price,rentalPeopleMax,styleRental,roomStandard,floor),0);
        writeMapToCSV(facilityMap,FACILITY_PATH);
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
        facilityMap.put(new Room(id,name,areaUse,price,rentalPeopleMax,styleRental,freeService),0);
        writeMapToCSV(facilityMap,FACILITY_PATH);
        System.out.println("successfully added new");
    }

    @Override
    public Object isExisted(String id) {
        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            if (element.getKey().getId().equals(id)) {
                return element;
            }
        }
        return null;
    }
}
