package exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String name;
    private LocalDate birthDate;
    private float height;
    private int age;

    public Pessoa(String name, LocalDate birthDate, float height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
        this.age = this.getAge();
    }

    public Pessoa(String name, int age, float height) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void personInfo() {
        System.out.println("Name: " + this.name
                + "\nBirthday: " + this.birthDate
                + "\nAge: " + this.age
                + "\nHeight: " + this.height + "m\n");
    }

    public int getAge() {
        if (this.birthDate != null) {
            this.age = Period.between(this.getBirthDate(), LocalDate.now()).getYears();
            return age;
        } else {
            return this.age;
        }
    }
}
