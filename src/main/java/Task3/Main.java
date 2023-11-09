package Task3;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> scores;

    public Student(String name, String surname, String patronymic, List<Integer> scores) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public double calculateAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "Иванович", List.of(80, 70, 90)));
        students.add(new Student("Петр", "Петров", "Петрович", List.of(85, 75, 95)));
        students.add(new Student("Сидор", "Сидоров", "Сидорович", List.of(90, 85, 100)));

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
