# QA Automation - User Management & Exception Handling

Acest proiect extinde functionalitatile de gestiune a utilizatorilor, punand accent pe ierarhii de clase (Mostenire) si validarea datelor prin exceptii personalizate.

## Concepte Implementate
* **Custom Exception**: `InvalidUserDataException` (Checked Exception) pentru validarea regulilor de business.
* **Inheritance**: Clasa `AdminUser` extinde clasa `User`, utilizand `super()` pentru initializarea campurilor.
* **Encapsulation**: Accesarea proprietatilor private prin metode de tip Getter.
* **Error Handling**: Utilizarea blocurilor `try-catch` multiple pentru a asigura continuitatea programului in cazul datelor invalide.

## Structura Fisiere
* `User.java` / `AdminUser.java` - Modelele de date.
* `InvalidUserDataException.java` - Exceptia proprie.
* `UserRepository.java` - Logica de validare si stocare.
* `Main.java` - Scenariile de testare.

## Rulare
Executa clasa `Main` pentru a vizualiza logica de filtrare a utilizatorilor si mesajele de eroare generate pentru datele invalide.

---
**Autor:** Andra Elena Ionascu