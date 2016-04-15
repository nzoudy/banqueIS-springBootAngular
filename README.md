# banqueIS-springBootAngular
Projet systèmes distribués

On souhaite créer une application qui permet de gérer des comptes bancaire.
chaque compte est défini par un numero, un solde et une date de création.
un compte courant est un compte qui possède en plus un découvert.
un compte d'épargne est un compte qui possède en plus un taux d'intérêt.
chaque compte appartient à un client et est créé par un employé.
chaque client est defini par son code et son nom.
chaque employé est défini par son code et son nom
chaque employé possède un supérieur hiérachique.
chaque employé peut appartenir à plusieurs groupes.
chaque groupe definir par un code et un nom peut contenir plusieurs employés.
chaque compte peut subir plusieurs opérations.
il existe deux types d'opérations: Versement et Retrait
chaque opération est effectuée par un employé.
une opération est définie par un numero, une date et un montant.



SPECIFICATIONS FONCTIONNELLES
L'application doit permettre:
* Ajouter des groupes
* Ajouter des employés
* Affecter les employés aux groupes
* Ajouter des clients
* Ajouter des comptes
* Effectuer des versements dans un compte
* Effectuer des retraits dans un compte
* Effectuer des virements d'un compte vers un autre.
* Consulter un compte
* consulter les comptes d'un client
* consulter une page d'opérations concernant un compte
* 




APPLICATION 
L'application se compose des couches suivants:
la couche DAO basée sur Spring Data(JPA,, Hibernate)
La couche métier
la couche web basé sur MVC coté client: Service Restful coté serveur et HTML, AngularJS, BootStrap coté client.
une couche RMI
une couche Service SOAP
L'inversion de contrôle est basée sur SpringBoot



TRAVAIL DEMANDE
*Etablir une architecture technique du projet
*Etablir un diagramme de classe qui montre les entités, la couche DAO et la couche métier
*Créer un projet springboot qui contient les éléments suivants:
  les entités 
  la couche dao (interface spring data)
  la couche web
    un service restful
    l'application web qui permet de:
      consulter un compte(solde, date de création, client, employé, opérations paginées)
      effectuer un retrait
      effectuer un versement
      effectuer un virement
    couche service basée sur jaxWS(SOAP)
    couche RMI
*Créer un client RMI
*Créer un client Soap JAVA
*Créer un client Soap PHP
*Créer un client Soap DOt Net
*Créer un client Android







