package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentorship extends Content {

    private LocalDate date;

    public Mentorship(){}

    @Override
    public double calculateXP() {
        return XP_STANDARD + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
