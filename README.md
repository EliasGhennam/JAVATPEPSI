🏪 PetStore API

📌 Description
Projet de gestion d'une animalerie utilisant **Spring Boot**, **JPA**, et **Hibernate**. Ce projet suit les bonnes pratiques **multi-couches** et respecte les consignes du TP de modélisation JPA.

📁 Architecture
- **Model** : Définition des entités (`PetStore`, `Animal`, `Product`, `Address`, etc.)
- **Repository** : Gestion des accès à la base de données avec **Spring Data JPA**.
- **Service** : Logique métier pour chaque entité.
- **Controller** : Exposition des endpoints **REST API**.

🛠 Technologies utilisées
- **Java 17**  
- **Spring Boot 3.4.3**  
- **JPA / Hibernate**  
- **MariaDB**  
- **Postman** pour tester les requêtes  

💾 Configurer sa BDD 
- ** Bien penser à changer le fichier "application.properties" pour correspondre à l'adresse de votre BDD

Les adresses avec lesquelles faire ses requêtes GET/POST sur POSTMAN :


- ** http://localhost:8080/api/petstores
- ** http://localhost:8080/api/animals
- ** http://localhost:8080/api/petstores/{id}/animals

## ⚙️ Installation
1. **Cloner le projet** :
   ```bash
   git clone https://https://github.com/ProutUx/JAVATPEPSI
