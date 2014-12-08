JAVA
====
Class abstraite Animal
Attributs :
- état de l'animal {en forme, malade, enragé, mort} #4
- Etat des mutations {faible, moyenne, godzilla}
- nbs yeux {0, 1, 2, ..}
- couleur {rouge, jaune, etc}
- pattes {int}
- nbs portée {int}
- taux de mignoncite
- taux de monstruausite
- ArrayList<Mutation>
-> Reproduction
-> toString() : "Je suis un chat malade avec trois tentacule et je suis iriadié :)"
-> Tous les setter et getter de nos attributs.

    => Class Mammifere
        => Chat
        -> Miauler : peut peut-etre soigner le chat.

    => Class Insecte
        Attributs :
        - Ailes
        => Abeille

    => Class Batracien
        => Grenouille
        => Crapaud

Class abstraite Pollution
Attributs :
- Niveau de danger : Un des facteurs qui fait varier les états de santé de l'animal
- ArrayList<Mutation>

    =>  Class Radiation
    Attributs :
    - Niveau de mutation : influt proba d'avoir mutation
        -> alpha : Un type de mutation possible
        -> beta
        -> gamma
        -> special

    =>  Class Contamination
    Attributs :
    - Niveau de mutation : influt proba d'avoir mutation
        -> Virale
        -> Bactériologique
        -> Parasitaire
    =>  Class Empoisonnement
        -> Pesticide
        -> Mort au rat

Class Mutation

Exemples :
Class Reproduction(a1, a2)
new Reproduction(new Chat(), new Chat())
OU
a = new Chat()
a.reproduction(new Chat())

r = new Radiation();
r(new chat()).ondealpha();
