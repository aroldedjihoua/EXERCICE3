# Comptage de mots dans un fichier en Java

## Description
Ce programme en Java permet de lire un fichier texte et de compter le nombre total de mots qu’il contient.

Le fichier est lu ligne par ligne, puis chaque ligne est découpée en mots.

---

## Objectif de l’exercice
Apprendre à :
- Lire un fichier en Java
- Utiliser la classe File
- Gérer les exceptions (FileNotFoundException)
- Utiliser Scanner pour lire un fichier
- Manipuler des chaînes de caractères

---

## Fonctionnement du programme

1. Le programme ouvre un fichier texte nommé `testExercice3.txt`
2. Il lit le fichier ligne par ligne
3. Chaque ligne est nettoyée (suppression des espaces inutiles)
4. La ligne est découpée en mots
5. Le nombre de mots est ajouté au total
6. Le résultat final est affiché

---

## Structure du code

### Imports
- File : permet de représenter un fichier
- FileNotFoundException : gère les erreurs si le fichier n'existe pas
- Scanner : permet de lire le contenu du fichier

---

### Variables principales
- totalWords : stocke le nombre total de mots

---

### Lecture du fichier
Le programme utilise :
- Scanner pour lire le fichier
- while (hasNextLine) pour parcourir toutes les lignes

---

### Traitement des données
- trim() : supprime les espaces inutiles
- split(" ") : découpe une ligne en mots
- words.length : compte les mots de la ligne

---

### Gestion des erreurs
Si le fichier n’existe pas, le programme affiche :
