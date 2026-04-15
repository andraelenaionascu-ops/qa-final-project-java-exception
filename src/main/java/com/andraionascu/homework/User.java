package com.andraionascu.homework;

public class User {
    // Proprietati private (Incapsulare)
    private String username;
    private int age;

    // Constructor pentru a initializa datele
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Metode Getter (necesare pentru a citi datele din Repository)
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    // Suprascriem toString pentru a afisa frumos utilizatorul în consola
    @Override
    public String toString() {
        return "User [username=" + username + ", age=" + age + "]";
    }
}
