package com.andraionascu.homework;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    // Lista privata pentru a stoca utilizatorii (Encapsulation)
    private List<User> users = new ArrayList<>();

    // Metoda de adaugare cu validare
    // "throws" avertizeaza că aceasta metoda poate genera o eroare
    public void addUser(User user) throws InvalidUserDataException {

        // 1. Validare null
        if (user == null) {
            throw new InvalidUserDataException("Utilizatorul nu poate fi null!");
        }

        // 2. Validare username (null sau < 3 caractere)
        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new InvalidUserDataException("Username invalid: " +
                    (user.getUsername() == null ? "null" : user.getUsername()));
        }

        // 3. Validare varsta (nu poate fi negativa)
        if (user.getAge() < 0) {
            throw new InvalidUserDataException("Varsta nu poate fi negativa: " + user.getAge());
        }

        // Dacă a trecut de toate validările, îl adăugăm în listă
        users.add(user);
    }

    // Metoda pentru a returna lista (ca sa o putem printa în Main)
    public List<User> getUsers() {
        return users;
    }
}
