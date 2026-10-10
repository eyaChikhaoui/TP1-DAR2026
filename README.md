# 💻 TP1 — Développement d'applications réparties

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/TCP-Sockets-2563EB?style=for-the-badge" alt="TCP Sockets"/>
  <img src="https://img.shields.io/badge/Client--Serveur-Architecture-7C3AED?style=for-the-badge" alt="Client Server"/>
  <img src="https://img.shields.io/badge/Status-Completed-16A34A?style=for-the-badge" alt="Project status"/>
</p>

<p align="center">
  <strong>Travaux pratiques de communication réseau avec Java</strong>
  <br/>
  <em>Comprendre, implémenter et tester le modèle client–serveur à l'aide des sockets TCP.</em>
</p>

<p align="center">
  <a href="#-présentation">Présentation</a> •
  <a href="#-activités">Activités</a> •
  <a href="#-structure-du-projet">Structure</a> •
  <a href="#-exécution">Exécution</a> •
  <a href="#-rapports">Rapports</a>
</p>

---

## 📌 Présentation

Ce dépôt regroupe les trois activités du **TP1 de Développement d'applications réparties**, réalisées en Java dans le cadre de la formation en Licence 3 Sciences de l'Informatique à la Faculté des Sciences de Sfax.

L'objectif principal est de découvrir la communication entre applications à travers le protocole **TCP**, en mettant en œuvre une architecture client–serveur et des échanges de données via des sockets.

### 🎯 Objectifs pédagogiques

* Comprendre le fonctionnement des sockets TCP en Java.
* Établir une connexion entre un client et un serveur.
* Échanger des données à l'aide des flux d'entrée et de sortie.
* Implémenter des services de calcul côté serveur.
* Organiser et documenter un projet Java avec Git et GitHub.

---

## 🚀 Activités

<table>
  <thead>
    <tr>
      <th>Activité</th>
      <th>Description</th>
      <th>Code source</th>
      <th>Compte rendu</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>A1.1</strong></td>
      <td>Communication TCP de base entre un client et un serveur.</td>
      <td><a href="act1/">📂 Consulter</a></td>
      <td><a href="reports/DAR tp1 a1.1.pdf">📄 PDF</a></td>
    </tr>
    <tr>
      <td><strong>A1.2</strong></td>
      <td>Service de multiplication : le serveur calcule le produit d'un entier par 5.</td>
      <td><a href="act2/">📂 Consulter</a></td>
      <td><a href="reports/DAR tp1 a1.2.pdf">📄 PDF</a></td>
    </tr>
    <tr>
      <td><strong>A1.3</strong></td>
      <td>Calculatrice en réseau prenant en charge l'addition, la soustraction, la multiplication et la division.</td>
      <td><a href="act3/">📂 Consulter</a></td>
      <td><a href="reports/DAR tp1 a1.3.pdf">📄 PDF</a></td>
    </tr>
  </tbody>
</table>

### 🧩 Activité 1.1 — Communication TCP de base

Mise en place d'une première connexion entre un programme client et un programme serveur en Java.

**Notions abordées :**

* Création d'une `ServerSocket`.
* Acceptation d'une connexion avec `accept()`.
* Connexion du client à l'aide d'une `Socket`.
* Fermeture des connexions.

### 🧮 Activité 1.2 — Service de multiplication

Extension de l'application client–serveur afin de fournir un service de calcul.

**Principe :** le client transmet un entier au serveur, qui calcule sa multiplication par 5 puis renvoie le résultat.

**Notions abordées :**

* Échange de données entre client et serveur.
* Traitement d'une requête côté serveur.
* Transmission du résultat au client.

### 🌐 Activité 1.3 — Calculatrice en réseau

Réalisation d'une calculatrice dont les opérations sont exécutées côté serveur et les résultats retournés au client.

**Opérations disponibles :**

* ➕ Addition
* ➖ Soustraction
* ✖️ Multiplication
* ➗ Division

Cette activité aborde également la connexion à un serveur à partir de son adresse IP et la communication sur un port TCP.

---

## 🛠️ Technologies utilisées

| Technologie       | Utilisation                    |
| ----------------- | ------------------------------ |
| **Java**          | Langage de programmation       |
| **TCP Sockets**   | Communication réseau           |
| **IntelliJ IDEA** | Environnement de développement |
| **Git**           | Gestion des versions           |
| **GitHub**        | Hébergement du code source     |

---

## 📁 Structure du projet

```text
TP1-DAR2026/
│
├── act1/
│   └── src/
│       ├── clientPackage/
│       │   └── Client.java
│       └── serverPackage/
│           └── Server.java
│
├── act2/
│   └── src/
│       ├── ClientPackage/
│       │   └── Client.java
│       └── ServeurPackage/
│           └── Serveur.java
│
├── act3/
│   └── src/
│       └── socket/
│           ├── ClientCalculatrice.java
│           └── ServeurCalculatrice.java
│
├── reports/
│   ├── Compte-rendu-A1.1.pdf
│   ├── Compte-rendu-A1.2.pdf
│   └── Compte-rendu-A1.3.pdf
│
└── README.md
```

---

## ▶️ Exécution

Pour tester une activité :

1. Ouvrir le projet dans IntelliJ IDEA.
2. Vérifier la configuration du JDK.
3. Lancer le programme serveur.
4. Lancer ensuite le programme client.
5. Observer les messages échangés et les résultats affichés dans les consoles.

> **Remarque :** pour l'activité A1.3, vérifier que le client utilise l'adresse IP du serveur et le même port que celui sur lequel le serveur écoute. Pour une connexion entre deux machines, elles doivent pouvoir communiquer sur le réseau et le port doit être accessible.

---

## 📄 Rapports

Les comptes rendus détaillent les objectifs, la réalisation et les résultats des activités.

| Document          | Accès                                                |
| ----------------- | ---------------------------------------------------- |
| Compte rendu A1.1 | [📥 Consulter le PDF](reports/Compte-rendu-A1.1.pdf) |
| Compte rendu A1.2 | [📥 Consulter le PDF](reports/Compte-rendu-A1.2.pdf) |
| Compte rendu A1.3 | [📥 Consulter le PDF](reports/Compte-rendu-A1.3.pdf) |

---

## 👩‍💻 Auteur

**Eya Chikhaoui**
Licence 3 — Sciences de l'Informatique (LSI 3)
Faculté des Sciences de Sfax

---

<p align="center">
  <strong>TP1 — Développement d'applications réparties</strong>
  <br/>
  <sub>Java • TCP • Client–Serveur • GitHub</sub>
</p>
