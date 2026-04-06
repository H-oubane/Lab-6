# Lab 6 Android – Pizza Recipes

Application Android de recettes de pizza réalisée avec Android Studio en Java.

## Objectif
Créer une application qui affiche une liste de pizzas et leurs détails complets.

## Fonctionnalités
- **Splash Screen** → écran de démarrage animé
- **Liste des pizzas** → image, nom, durée et prix
- **Détail d'une pizza** → image, description, ingrédients et étapes
- **Bouton partage** → partager une recette

## Capture video
<!-- Uploading "WhatsApp Video 2026-04-06 at 22.57.46.mp4"... -->




### 1. écran de démarrage
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/91a0f207-4fd2-4b46-9a8c-56a47e3c3cec" />


### 2. Liste des pizzas
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/da9ef195-e101-4985-bc8a-0816a1efac26" />


### 3. Détail Spinach Pizza
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/137bc9fb-d01c-497a-96e1-bb74fe794b51" />


### 4. Détail Margherita Pizza
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/f294ab8e-2cd1-49e2-8d02-7dbb784d7bef" />


### 5. test de bouton partage 
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/313d6950-1cf3-4841-93aa-0aabcee55b11" />



## Architecture du projet
PizzaRecipes/

└── app/src/main/

    ├── java/com/example/pizzarecipes/
    │   │
    │   ├── classes/
    │   │   └── Produit.java                 → La classe qui représente une pizza
    │   │
    │   ├── dao/
    │   │   └── IDao.java                    → L'interface qui définit les opérations CRUD
    │   │
    │   ├── service/
    │   │   └── ProduitService.java          → La classe qui gère la liste des pizzas
    │   │
    │   ├── adapter/
    │   │   └── PizzaAdapter.java            → L'adaptateur qui relie les données à la liste
    │   │
    │   └── ui/
    │       ├── SplashActivity.java          → L'écran de démarrage avec animation
    │       ├── ListPizzaActivity.java       → L'écran qui affiche toutes les pizzas
    │       └── PizzaDetailActivity.java     → L'écran qui montre les détails d'une pizza
    │
    ├── res/
    │   │
    │   ├── drawable/
    │   │   ├── pizza1.jpg à pizza10.jpg     → Les photos des pizzas
    │   │   ├── icon.png                     → Le logo de l'application
    │   │   ├── back.png                     → L'icône pour revenir en arrière
    │   │   └── share.png                    → L'icône pour partager une recette
    │   │
    │   ├── layout/
    │   │   ├── activity_splash.xml          → L'écran de bienvenue
    │   │   ├── activity_list_pizza.xml      → L'écran avec la liste des pizzas
    │   │   ├── activity_pizza_detail.xml    → L'écran de détail d'une pizza
    │   │   └── row_pizza.xml                → La mise en page d'une ligne dans la liste
    │   │
    │   └── mipmap/
    │       ├── ic_launcher.png              → Icône de l'application (généré)
    │       └── ic_launcher_round.png        → Icône ronde (généré)
    │
    └── AndroidManifest.xml                  → Le fichier qui déclare toutes les activités

## Technologies utilisées
- Android Studio
- Java
- XML (interface)
- Architecture DAO / Service / Adapter / UI
- API minimum : 24 (Android 7.0)

## Auteur
**H-oubane**
