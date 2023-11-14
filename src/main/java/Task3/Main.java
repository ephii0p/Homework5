package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "Иванович", List.of(77, 60, 90)));
        students.add(new Student("Петр", "Петров", "Петрович", List.of(89, 57, 96)));
        students.add(new Student("Сидор", "Сидоров", "Сидорович", List.of(10, 45, 90)));

        printWinners(findWinners(students));
    }

    public static List<Student> findWinners(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.calculateAverageScore(), s1.calculateAverageScore()));
        return students.subList(0, Math.min(3, students.size()));
    }

    public static void printWinners(List<Student> winners) {
        String[] places = {"Первое", "Второе", "Третье"};
        for (int i = 0; i < winners.size(); i++) {
            System.out.println(places[i] + " место: " + winners.get(i).getSurname() + " " + winners.get(i).getName() + " " + winners.get(i).getPatronymic());
        }
    }
}