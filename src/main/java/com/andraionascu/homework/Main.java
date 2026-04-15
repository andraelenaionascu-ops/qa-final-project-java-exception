package com.andraionascu.homework;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        System.out.println("--- Incepere procesare utilizatori ---\n");

        // 1. Incercam un User valid
        try {
            repo.addUser(new User("andra_elena", 28));
            System.out.println("S-a adaugat: andra_elena");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare neasteptata: " + e.getMessage());
        }

        // 2. Incercam un AdminUser valid
        try {
            repo.addUser(new AdminUser("admin", 30, "FULL_ACCESS"));
            System.out.println("S-a adaugat: admin (Admin)");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare neasteptata: " + e.getMessage());
        }

        // 3. Incercam un User cu username prea scurt
        try {
            repo.addUser(new User("ab", 22));
        } catch (InvalidUserDataException e) {
            System.out.println("S-a identificat o eroare: " + e.getMessage());
        }

        // 4. Incercam un User cu varsta negativa
        try {
            repo.addUser(new User("tester", -5));
        } catch (InvalidUserDataException e) {
            System.out.println("S-a identificat o eroare: " + e.getMessage());
        }

        // 5. Incercam un utilizator null
        try {
            repo.addUser(null);
        } catch (InvalidUserDataException e) {
            System.out.println("S-a identificat o eroare: " + e.getMessage());
        }

        // Afisam rezultatul final
        System.out.println("\n--- Utilizatori stocati cu succes în Repository ---");
        for (User u : repo.getUsers()) {
            System.out.println(u.toString());
        }
    }
}