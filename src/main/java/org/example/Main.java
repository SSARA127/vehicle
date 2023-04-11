package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

            List<Object> details = new ArrayList<>();

            List<Vehicle> vehicleDetails = new ArrayList<>();
            vehicleDetails.add(new Vehicle("Ford", "Mustang", "Coupe", 17, 5018600.00, 2, 1));
            vehicleDetails.add(new Vehicle("Hyundai", "Escort", "Sedan", 15, 7590000.00, 3, 4));
            vehicleDetails.add(new Vehicle("Rolls Royce", "Royce Ghost", "Roadster", 19, 69018600.00, 5, 2));
            vehicleDetails.add(new Vehicle("Mahindra", "Taurus", "Cuv", 16, 3077700.00, 1, 3));
            vehicleDetails.add(new Vehicle("Audi", "Mustang", "SuperCar", 18, 17000000.00, 4, 5));


            Map<Integer, Dealer> dealerDetails = new HashMap<>();
            dealerDetails.put(1, new Dealer(1, "Prabha", "Mahindra", "9458214673", 4));
            dealerDetails.put(2, new Dealer(2, "Santhosh", "Ford", "9856721489", 5));
            dealerDetails.put(3, new Dealer(3, "Praveen", "Hyundai", "9568130724", 9));
            dealerDetails.put(4, new Dealer(4, "Madhan", "Audi", "6734267945", 1));
            dealerDetails.put(5, new Dealer(5, "Nithin", "Rolls Royce", "8671259046", 2));

            Map<Integer, Showroom> showroomDetails = new HashMap<>();
            showroomDetails.put(1, new Showroom(1, "Spyker", "Delhi", "Own", 3));
            showroomDetails.put(2, new Showroom(2, "FlipDeal", "Chennai", "Rent", 7));
            showroomDetails.put(3, new Showroom(3, "Luxury Motors", "Bangalore", "Own", 8));
            showroomDetails.put(4, new Showroom(4, "Sato", "Gujarat", "Rent", 12));
            showroomDetails.put(5, new Showroom(5, "Zettes", "Mumbai", "Rent", 24));

            int dealerId = 2;
            details= vehicleDetails.stream().filter(index->index.getDealerId()==dealerId)
                .flatMap(index -> Stream.of(
                        index,
                        dealerDetails.get(dealerId),
                        showroomDetails.get(index.getShowroomId())
                ))
                .collect(Collectors.toList());
            List<Integer> showroomId=vehicleDetails.stream().

                    filter(index->index.getDealerId()==dealerId).
                    map(index->index.getShowroomId()).
                    collect(Collectors.toList());

        System.out.println(showroomId);
        System.out.println(details);
        }

}