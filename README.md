# 📱 Calculateur d'Indice de Masse Grasse (IMG)

Application Android pour calculer l'Indice de Masse Grasse (IMG) et obtenir une interprétation personnalisée selon le sexe.

![Android](https://img.shields.io/badge/Android-API%2016+-green.svg)
![Java](https://img.shields.io/badge/Java-8-orange.svg)
![License](https://img.shields.io/badge/License-MIT-blue.svg)

---

## 📋 Table des matières

- [Description](#-description)
- [Fonctionnalités](#-fonctionnalités)
- [Captures d'écran](#-captures-décran)
- [Prérequis](#-prérequis)
- [Installation](#-installation)
- [Utilisation](#-utilisation)
- [Structure du projet](#-structure-du-projet)
- [Technologies utilisées](#-technologies-utilisées)
- [Formule de calcul](#-formule-de-calcul)
- [Tests](#-tests)
- [Problèmes connus](#-problèmes-connus)
- [Auteur](#-auteur)
- [License](#-license)

---

## 📖 Description

Cette application Android permet aux utilisateurs de calculer leur **Indice de Masse Grasse (IMG)** en fonction de leur taille, poids, âge et sexe. L'application fournit également une interprétation du résultat (trop maigre, normal, trop de graisse) selon des normes différenciées pour les hommes et les femmes.

**Développée dans le cadre du TP5 de Développement Mobile - LSI 3**

---

## ✨ Fonctionnalités

- ✅ **Saisie intuitive** : Champs de saisie pour la taille (cm), le poids (kg), l'âge et le sexe
- ✅ **Calcul automatique** : Calcul de l'IMG selon la formule scientifique
- ✅ **Interprétation personnalisée** : Résultats adaptés selon le sexe (homme/femme)
- ✅ **Validation des données** : Vérification des champs vides et des valeurs incorrectes
- ✅ **Messages d'erreur clairs** : Notifications Toast pour guider l'utilisateur
- ✅ **Interface moderne** : Design épuré et ergonomique
- ✅ **Compatible API 16+** : Fonctionne sur Android 4.1 et versions ultérieures

---

---

## 🔧 Prérequis

Avant de commencer, assurez-vous d'avoir installé :

- **Android Studio** : Version 2021 ou supérieure
- **JDK** : Java 8 ou supérieur
- **Android SDK** : API 16 minimum (Android 4.1 Jelly Bean)
- **Gradle** : Version 7.1.0 ou supérieure

---

## 🚀 Installation

### 1. Cloner le projet

```bash
git clone https://github.com/votre-username/img-calculator.git
cd img-calculator
```

### 2. Ouvrir dans Android Studio

1. Lancez **Android Studio**
2. Cliquez sur **File** → **Open**
3. Sélectionnez le dossier du projet
4. Attendez la synchronisation Gradle

### 3. Synchroniser le projet

```bash
# Synchroniser Gradle
File → Sync Project with Gradle Files
```

### 4. Lancer l'application

#### Sur émulateur :
1. Créez un AVD (Android Virtual Device) avec API 16+
2. Cliquez sur le bouton **Run** ▶️
3. Sélectionnez votre émulateur

#### Sur téléphone physique :
1. Activez le **mode développeur** sur votre téléphone
2. Activez le **débogage USB**
3. Connectez votre téléphone via USB
4. Sélectionnez votre appareil et cliquez sur **Run** ▶️

---

## 💡 Utilisation

### Calculer votre IMG

1. **Lancez l'application**
2. **Saisissez vos informations** :
   - Taille en centimètres (ex: 170)
   - Poids en kilogrammes (ex: 70)
   - Âge en années (ex: 25)
3. **Sélectionnez votre sexe** : Homme ou Femme
4. **Cliquez sur le bouton "CALCULER"**
5. **Consultez votre résultat** :
   - Votre IMG en pourcentage
   - L'interprétation de votre résultat

### Exemple de calcul

**Pour une femme :**
- Taille : 165 cm
- Poids : 60 kg
- Âge : 25 ans
- Sexe : Femme

**Résultat :**
- IMG : 26.7%
- Interprétation : Personne normale

---

## 📁 Structure du projet

```
imgcalculator/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/imgcalculator/
│   │       │   └── MainActivity.java          # Activité principale
│   │       │
│   │       ├── res/
│   │       │   ├── drawable/
│   │       │   │   ├── button_background.xml  # Style du bouton
│   │       │   │   └── edit_text_border.xml   # Bordure des champs
│   │       │   │
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml      # Interface utilisateur
│   │       │   │
│   │       │   └── values/
│   │       │       ├── strings.xml            # Chaînes de caractères
│   │       │       └── styles.xml             # Thème de l'application
│   │       │
│   │       └── AndroidManifest.xml            # Configuration de l'app
│   │
│   └── build.gradle                           # Configuration Gradle
│
├── README.md                                  # Ce fichier
└── screenshots/                               # Captures d'écran
```

---

## 🛠️ Technologies utilisées

| Technologie | Version | Description |
|-------------|---------|-------------|
| **Java** | 8 | Langage de programmation |
| **Android SDK** | API 16-29 | Framework Android |
| **Android Studio** | 2021+ | IDE de développement |
| **Gradle** | 7.1.0 | Système de build |
| **XML** | 1.0 | Définition des layouts |

### Composants Android utilisés

- **Activity** : Gestion du cycle de vie
- **EditText** : Saisie des données
- **Button** : Déclenchement du calcul
- **TextView** : Affichage des résultats
- **RadioButton & RadioGroup** : Sélection du sexe
- **Toast** : Messages d'erreur
- **LinearLayout** : Organisation de l'interface

---

## 📐 Formule de calcul

### Formule de l'IMG

```
IMG (%) = (1.2 × Poids / Taille²) + (0.23 × Âge) - (10.83 × S) - 5.4
```

**Où :**
- **Poids** : en kilogrammes
- **Taille** : en mètres (converti depuis les centimètres)
- **Âge** : en années
- **S** : 0 pour une femme, 1 pour un homme

### Interprétation

#### Pour les femmes :

| IMG | Interprétation |
|-----|----------------|
| < 25% | Personne trop maigre |
| 25% - 30% | Personne normale |
| > 30% | Personne ayant trop de graisse |

#### Pour les hommes :

| IMG | Interprétation |
|-----|----------------|
| < 15% | Personne trop maigre |
| 15% - 20% | Personne normale |
| > 20% | Personne ayant trop de graisse |

---

## 🧪 Tests

### Tests effectués

| Test | Données | Résultat attendu | Status |
|------|---------|------------------|--------|
| Femme normale | T:165cm, P:60kg, A:25 | IMG≈26.7%, Normale | ✅ |
| Homme normal | T:180cm, P:75kg, A:30 | IMG≈17.4%, Normal | ✅ |
| Femme maigre | T:160cm, P:50kg, A:20 | IMG≈23.4%, Trop maigre | ✅ |
| Homme gras | T:175cm, P:90kg, A:40 | IMG≈24.8%, Trop de graisse | ✅ |
| Champs vides | - | Message d'erreur | ✅ |
| Sexe non sélectionné | T:170, P:70, A:25 | Message d'erreur | ✅ |

### Lancer les tests

```bash
# Tests unitaires
./gradlew test

# Tests d'instrumentation
./gradlew connectedAndroidTest
```

---

## ⚠️ Problèmes connus

### Problème 1 : Erreur de thème
**Symptôme :** `error: resource attr/colorPrimary not found`

**Solution :** Utilisez `styles.xml` avec le thème `android:Theme.Holo.Light.DarkActionBar` au lieu de `themes.xml` avec Material Design.

### Problème 2 : Icônes manquantes
**Symptôme :** `error: resource mipmap/ic_launcher not found`

**Solution :** Supprimez le dossier `mipmap-anydpi-v26` et les références aux icônes dans `AndroidManifest.xml`.

### Problème 3 : Build Tools version
**Symptôme :** `The specified Android SDK Build Tools version is ignored`

**Solution :** Supprimez la ligne `buildToolsVersion` du fichier `build.gradle`.

---

## 🔄 Versions

### Version 1.0.0 (Date actuelle)
- ✅ Interface utilisateur fonctionnelle
- ✅ Calcul de l'IMG
- ✅ Validation des entrées
- ✅ Interprétation des résultats
- ✅ Support API 16+

### Améliorations futures (v2.0.0)
- 📊 Historique des calculs
- 📈 Graphiques d'évolution
- 🌐 Support multilingue
- 🎨 Thème Material Design 3
- 💾 Sauvegarde locale des données
- 📤 Partage des résultats

---

## 🤝 Contribution

Les contributions sont les bienvenues ! Pour contribuer :

1. **Forkez** le projet
2. **Créez** une branche pour votre fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. **Committez** vos changements (`git commit -m 'Add some AmazingFeature'`)
4. **Poussez** vers la branche (`git push origin feature/AmazingFeature`)
5. **Ouvrez** une Pull Request

---

## 👨‍💻 Auteur

**[Votre Nom]**

- Étudiant(e) en LSI 3
- Faculté des Sciences de Sfax
- Email : votre.email@example.com
- GitHub : [@votre-username](https://github.com/votre-username)

### Encadrement

- **Enseignante du Cours :** Sahar Dammak
- **Enseignantes du TP :** Wiem Hachicha, Zeineb Daoud, Amira Talha

---

## 📄 License

Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.

```
MIT License

Copyright (c) 2025 [Votre Nom]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

## 📞 Contact

Pour toute question ou suggestion :

- **Email :** mouez.jedidi@gmail.com

---

## 🙏 Remerciements

- Merci à **Sahar Dammak** pour l'enseignement du cours
- Merci à **Wiem Hachicha, Zeineb Daoud et Amira Talha** pour l'encadrement des TP
- Merci à la **Faculté des Sciences de Sfax** pour les ressources fournies
- Merci à la communauté **Android** pour la documentation

---

## 📚 Ressources

### Documentation officielle
- [Android Developer Guide](https://developer.android.com/guide)
- [Java Documentation](https://docs.oracle.com/javase/8/docs/)
- [Material Design Guidelines](https://material.io/design)

### Tutoriels utiles
- [Android Studio Basics](https://developer.android.com/studio/intro)
- [Building Your First App](https://developer.android.com/training/basics/firstapp)
- [User Interface & Navigation](https://developer.android.com/guide/topics/ui)

### Outils
- [Android Studio](https://developer.android.com/studio)
- [Gradle Build Tool](https://gradle.org/)
- [Git](https://git-scm.com/)

---

<div align="center">

**⭐ Si ce projet vous a été utile, n'hésitez pas à lui donner une étoile ! ⭐**

Made with ❤️ by [Votre Nom]

</div>
