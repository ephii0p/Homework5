package Task2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Collections;

public class House {
    public static void main(String[] args) {

        Map<String, Integer> residents = new HashMap<>();
        residents.put("Иванов Иван Иванович", 25);
        residents.put("Петров Петр Петрович", 17);
        residents.put("Владимиров Владимир Владимирович", 30);
        residents.put("Николаев Николай Николаевич", 21);
        residents.put("Сергеев Сергей Сергеевич", 16);

       List<String> adultResidents = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : residents.entrySet()) {
            if (entry.getValue() > 18) {
                adultResidents.add(entry.getKey());
            }
        }

        Collections.sort(adultResidents);
        System.out.println("Жильцы старше 18 лет:");
        for (String name : adultResidents) {
            System.out.println(name);
        }
    }
}