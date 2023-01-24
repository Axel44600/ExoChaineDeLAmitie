# exoUdemyJanvier2023

La chaîne de l’amitié.
Cette semaine nous vous proposons un Challenge dont l’énoncé est très simple, mais la réalisation peut-être plus ou moins avancée.
Elle va mettre en pratique une problématique courante dans le monde professionnel, la “deep recursion”. Il s’agit simplement d’une fonction/méthode qui s’appelle elle-même une ou plusieurs fois.
Nous allons créer une classe Personne , qui représente une personne comme vous pouvez l'imaginer.
Cette personne aura un nom , c'est un String .
La classe disposera également d'une méthode sePresenter sans paramètre et une méthode sePresenter qui va surcharger la précédente en prenant en paramètre une autre personne. Les 2 méthodes retourneront void .
La méthode sans paramètre doit afficher :
"Bonjour je m'appelle X ! Et toi comment t'appelles-tu/vous appelez-vous ?"
Où X est le nom de la personne qui se présente.
La méthode avec paramètre doit afficher :
"Bonjour Y ! Je m'appelle X. Et toi comment t'appelles-tu/vous appelez-vous ?"
Où Xest le nom de la personne qui se présente et Y le nom de la personne reçue en paramètre.
Image
Il va s’agir d’utiliser ces méthodes dans le cadre d’une session de networking professionnelle.
Si vous êtes débutant, considérez que chaque personne interagit avec seule autre personne.

Si vous êtes plus téméraires, considérez que chaque personne interagit avec un groupe de plusieurs personnes.

Dans le main de la classe exécutable, vous allez construire une chaîne de l'amitié en partant de la personne que vous appellerez René.

Le résultat devrait être quelque chose comme ça :

Pour les débutants
Bonjour je m'appelle René ! Et toi comment t'appelles-tu ?

Bonjour René ! Je m'appelle Julien. Et toi comment t'appelles-tu ?

Bonjour Julien ! Je m'appelle Lisa. Et toi comment t'appelles-tu ?

Bonjour Lisa ! Je m'appelle Lola. Et toi comment t'appelles-tu ?

Bonjour Lola ! Je m'appelle Cyrille.

Pour les autres
Bonjour je m'appelle René ! Et vous comment vous appelez-vous ?

Bonjour René ! Je m'appelle Julien. Et toi comment t'appelles-tu ?

Bonjour René! Je m'appelle Lisa. Et toi comment t'appelles-tu ?

Bonjour Julien! Je m'appelle Lola. Et toi comment t'appelles-tu ?

Bonjour Julien! Je m’appelle Rebecca. Et toi comment t’appelles-tu?

Bonjour Lisa! Je m'appelle Tom. Et toi comment t'appelles-tu ?

Bonjour Julien! Je m’appelle Rebecca. Et toi comment t’appelles-tu?

Bonjour Julien ! Je m'appelle Victor.

Bonjour Lola ! Je m'appelle Cyrille.

Bonjour Rebecca ! Je m'appelle Cyrille.


Note: Notez la possibilité pour Rebecca dans l’exemple d’avoir été interpellé via différentes chaîne et qu’il n’est pas nécessaire que tout le monde rencontre tout le monde.
