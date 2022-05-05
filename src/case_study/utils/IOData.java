package case_study.utils;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.models.person.Customer;
import case_study.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IOData {
    public static final String CUSTOMER_PATH = "src/case_study/Data/DataCustomer.csv";
    public static final String EMPLOYEE_PATH = "src/case_study/Data/DataEmployee.csv";
    public static final String FACILITY_PATH = "src/case_study/Data/DataFacility.csv";
    public static final String BOOKING_PATH = "src/case_study/Data/DataBooking.csv";
    public static final String CONTRACT_PATH = "src/case_study/Data/DataContract.csv";

    public static <O> void writeToCSV(List<O> list, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path,false));
            for (O item : list) {
                bw.write(item.toString());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <O> void writeMapToCSV(Map<O,Integer> map, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path,false));
            for (Map.Entry<O, Integer> element : map.entrySet()) {
                bw.write(element.getKey().toString()+","+element.getValue());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> readFilePerson(String path) {
        List<String[]> listSrting = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            while((line = br.readLine()) != null && !line.equals("")) {
                String[] arrayString = line.split(",");
                listSrting.add(arrayString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listSrting;
    }

    public static <O> Map<O,Integer> ReadCSVToMap(String path) {
        Map<O,Integer> mapFacility = new LinkedHashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                if (array[0].contains("SVHO")) {
                    mapFacility.put((O) new House(array[0],array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]),array[4],array[5],array[6],array[7]),Integer.parseInt(array[8]));
                } else if (array[0].contains("SVRO")) {
                    mapFacility.put((O) new Room(array[0],array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]),array[4],array[5],array[6]),Integer.parseInt(array[7]));
                } else if (array[0].contains("SVVL")) {
                    mapFacility.put((O) new Villa(array[0],array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]),array[4],array[5],array[6],Double.parseDouble(array[7]),array[8]),Integer.parseInt(array[9]));
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapFacility;
    }
}
