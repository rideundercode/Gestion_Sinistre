# Gestion_Sinistre
Création clone pour gestion des sinistres AXA

Premiere étape: Documentation

https://www.axa.fr/services-assistance/declarer-sinistre.html

https://www.axapartners.fr/fr/page/declaration-de-sinistres-assures

[CFD09_Décès.pdf](https://github.com/user-attachments/files/17232593/CFD09_Deces.pdf)

[Formulaire de déclaration PTIA.pdf](https://github.com/user-attachments/files/17232592/Formulaire.de.declaration.PTIA.pdf)

[Autres_CFD05_ITT_SMS.pdf](https://github.com/user-attachments/files/17232591/Autres_CFD05_ITT_SMS.pdf)

[Autres_CFD08_Hospitalisation_SMS.pdf](https://github.com/user-attachments/files/17232590/Autres_CFD08_Hospitalisation_SMS.pdf)

[Autres_CFD06_Perte d'Emploi_SMS.pdf](https://github.com/user-attachments/files/17232589/Autres_CFD06_Perte.d.Emploi_SMS.pdf)

[Autres_CFD07_Perte Fi_SMS.pdf](https://github.com/user-attachments/files/17232588/Autres_CFD07_Perte.Fi_SMS.pdf)

[20160601_Kit_Bris_de_Machines.pdf](https://github.com/user-attachments/files/17232586/20160601_Kit_Bris_de_Machines.pdf)



Deuxieme étape: Etlablir les classes

Formulaire de sinistre:

les éléments communs a tout les formulaires de sinistres (classe mère)
1. Informations personnelles de l'assuré :
Nom et prénom de l’assuré.
Date de naissance.
Adresse postale.
Numéro de téléphone (fixe et portable).
Adresse email.
2. Informations sur le sinistre :
Date de l’événement (sinistre).
Nature du sinistre (exemple : perte d'emploi, bris de machines, hospitalisation, etc.).
Lieu où le sinistre a eu lieu.
Description détaillée des circonstances et causes présumées du sinistre.
Documents justificatifs à fournir selon le type de sinistre (copie de carte d’identité, rapport médical, facture d’achat, acte de décès, etc.).
3. Coordonnées de l'assureur :
Adresse du service sinistres à laquelle envoyer les documents (ex. 51 rue des 3 Fontanot, CS 80135, 92024 Nanterre Cedex).
Adresse email du service sinistres (ex. clp.fr.sinistres@partners.axa).
4. Déclaration et consentement :
Déclaration de véracité : L’assuré atteste que toutes les informations fournies sont correctes et complètes.
Consentement au traitement des données personnelles : L’assuré autorise AXA à traiter ses données personnelles dans le cadre de la gestion de son sinistre.
Signature et date du formulaire.
5. Pièces justificatives :
Carte d’identité (recto-verso) ou passeport en cours de validité.
Documents spécifiques au type de sinistre, comme des certificats médicaux, rapports de police, ou rapports d'expertise.


les classes filles:
1. Classe Fille : SinistreBrisDeMachines
Modèle de la machine (cf. [17†source]).
Numéro de série de la machine.
Type de dommage (ex. vol, casse, incendie).
Devis des réparations ou lettre de la société de maintenance (si applicable).
Récépissé de dépôt de plainte (en cas de vol).
2. Classe Fille : SinistrePerteFinancière
Numéro d'immatriculation du véhicule (cf. [18†source]).
Facture d'achat du véhicule.
Rapport d'expertise ou bilan technique en cas de vol.
Lettre de remboursement de l'assureur principal.
Montant de la franchise appliquée (si applicable).
3. Classe Fille : SinistrePerteEmploi
Date du licenciement (cf. [19†source]).
Raison de la perte d'emploi (licenciement économique, etc.).
Copie du contrat ou certificat de travail.
Lettre de licenciement.
Notification de Pôle Emploi (avec la date de début des prestations).
Décompte des prestations de Pôle Emploi.
4. Classe Fille : SinistreHospitalisation
Date d'entrée à l'hôpital (cf. [20†source]).
Date de sortie de l'hôpital.
Bulletins de situation délivrés par l’hôpital (avec dates et heures).
Compte-rendu d'hospitalisation ou déclaration médicale (à remplir par le médecin).
Motif de l'hospitalisation (maladie, accident, etc.).
5. Classe Fille : SinistreArrêtDeTravail (ITT - Incapacité Temporaire Totale)
Date de l'arrêt de travail (cf. [21†source]).
Certificats d'arrêt de travail et de prolongation.
Décompte des prestations d'indemnités journalières (de la Caisse Primaire d'Assurance Maladie ou d'un autre organisme).
Déclaration médicale (remplie par le médecin).
6. Classe Fille : SinistrePTIA (Perte Totale et Irréversible d'Autonomie)
Date de mise en invalidité (cf. [22†source]).
Motif de l'invalidité.
Notification de mise en invalidité de 3ème catégorie (si applicable).
Déclaration médicale (à remplir par le médecin).
7. Classe Fille : SinistreDécès
Date du décès (cf. [23†source]).
Cause du décès (naturelle, accidentelle, etc.).
Acte de décès.
Déclaration médicale (remplie par le médecin).
Procès-verbal de police ou de gendarmerie (en cas de décès accidentel).
