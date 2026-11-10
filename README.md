# PrésenceManager

Application Android de gestion des présences, réalisée dans le cadre des TP01 à TP03.

## Écrans

L'écran d'accueil contient le bouton **Commencer l'appel**, qui ouvre le tableau de bord. Celui-ci donne accès à quatre écrans : **Groupes**, **Faire l'appel**, **Historique** et **Statistiques**. Chaque écran de destination affiche le nom de la fonctionnalité et « Fonctionnalité en cours de développement », comme demandé dans ce TP. La gestion des données est prévue pour les prochains TP.

## Événements utilisateur (TP03)

Un événement utilisateur est une action faite sur un composant de l'interface. Un Event Listener associe cette action à une réponse programmée en Kotlin.

- **Clic simple (`onClick`)** : un appui bref sur une des quatre cartes ouvre son activité correspondante avec un Intent.
- **Appui long (`onLongClick`)** : maintenir le doigt sur **Groupes** ou **Faire l'appel** affiche un message Toast et ne navigue pas. Le listener retourne `true` pour consommer l'événement.
- **Double-clic (`onDoubleTap`)** : deux appuis rapides sur l'icône profil ouvrent le dialogue « À propos de PrésenceManager ». Ce geste est reconnu avec `GestureDetector` depuis un `OnTouchListener`.
- **Clic sur la version** : le pied de page de l'accueil et celui du tableau de bord ouvrent « Informations du développeur ». Le lien GitHub est cliquable et le dialogue possède un bouton OK.

Un clic simple, un appui long et un double-clic sont des événements distincts. Le listener reçoit l'événement sur le composant concerné et déclenche l'action associée.

## À compléter avant remise

Remplacer `NOM_PRENOM` et `VOTRE_IDENTIFIANT` dans `MainActivity.kt` et `DashboardActivity.kt` par les informations du développeur et le compte GitHub réel. Ajouter les quatre captures d'écran demandées après les tests sur émulateur : tableau de bord, page ouverte depuis une carte, dialogue du double-clic et dialogue développeur.

## Technologies

- Kotlin et Android Views avec layouts XML
- AndroidX AppCompat et CardView
# PresenceManager1
# PresenceManager1
# PresenceManager1
# PresenceManager1
