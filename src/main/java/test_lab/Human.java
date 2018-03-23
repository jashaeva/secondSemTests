package test_lab;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String lastname;
    private int birthYear;

    public Human(String name, String surname, String lastname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getBirthYear() == human.getBirthYear() &&
                getName().equals(human.getName()) &&
                getSurname().equals(human.getSurname()) &&
                getLastname().equals(human.getLastname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getLastname(), getBirthYear());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthYear=" + birthYear +
                '}';
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
