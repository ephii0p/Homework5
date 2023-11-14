package Task3;

import java.util.ArrayList;
import java.util.List;

class Student {
    public String name;
    public String surname;
    public String patronymic;
    public List<Integer> score;

    public Student(String name, String surname, String patronymic, List<Integer> scores) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.score = scores;
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
        return score;
    }

    public void setScores(List<Integer> scores) {
        this.score = scores;
    }

    public double calculateAverageScore() {
        int sum = 0;
        for (int score : score) {
            sum += score;
        }
        return (double) sum / score.size();
    }
}

