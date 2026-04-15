package com.andraionascu.homework;

// Folosim "extends" pentru a mosteni clasa User
public class AdminUser extends User {
    private String permissionLevel;

    public AdminUser(String username, int age, String permissionLevel) {
        // "super" apeleaza constructorul din clasa User (parintele)
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    // Suprascriem toString pentru a include si nivelul de permisiuni
    @Override
    public String toString() {
        return super.toString() + " | Permission: " + permissionLevel + " (Admin)";
    }
}
