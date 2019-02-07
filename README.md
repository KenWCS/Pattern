# Patterns

## **Modèle de création:**
On se trouve en programmation objet souvent confronté au problème d'évolution des classes. Une classe hérite d'une autre classe pour en spécialiser certains éléments. On aimerait donc qu'un objet puisse appartenir à telle ou telle classe (dans une même famille par héritage) sans avoir à chercher la classe de gestion de ces objets et la ligne de code qui effectue l'instanciation. Si on imagine un cas de création d'un objet pour une classe C donnée, réparti dans différents endroits du code, si on décide de faire évoluer la nature de C en passant par une classe descendante (une classe C' héritant de C), il faut donc reprendre l'intégralité du code de création, avec une classe chargée de la création, plus besoin et seule cette dernière est à reprendre.

### **Factory et AbstractFactory**
Une fabrique de création (ou factory) est une classe qui n'a pour rôle que de construire des objets. Cette classe utilise des interfaces ou des classes abstraites pour masquer l'origine des objets.

On distingue deux formes de fabrique :
* Factory : Les fabriques concrètes masquant toutes les méthodes nécéssaires à la création et à l'initialisation de l'objet.
* AbstractFactory: Les fabriques abstraites reposant sur l'exploitation de classes génériques.

### **Builder**
Le Builder ou Monteur est une classe offrant des moyens de construction d'un objet. Par exemple, pour construire un dessin il faut ajouter des points, des lignes, des cercles.... Il ne doit pas être confondu avec la Fabrique.

Le problème d'une Fabrique de création, c'est qu'elle ne permet pas de définir comment un objet va être construit, certes, il est toujours possible de passer x paramètres dans la méthode de création d'une fabrique mais cela s'avère souvent très réducteurs voire délicat pour la maintenance.

### **NestedBuilder**
Le NestedBuilder est une classe offrant la possibilité de définir comment un objet va être construit. Ce pattern évite la définition multiple de constructeur.

### **Singleton**
Un singleton sert à contrôler le nombre d'instances d'une classe présent à un moment donné. C'est souvent très pratique pour les classes sans état et effectuant toujours les mêmes traitements.

Un singleton est construit grâce à des méthodes de classes. Ces méthodes appartiennent à une classe et peuvent être accedées indépendemment de l'objet.

## **Modèle de comportement:**
### **Observateur (Observer) ou Listener**
Ce pattern est utilisé pour envoyer un signal à des modules qui jouent le rôle d'observateurs. En cas de notification, les observateurs effectuent alors l'action adéquate en fonction des informations qui parviennent depuis les modules qu'ils observent (les observables).

Les notions d'observateur et d'observable permet de limiter le couplage entre les modules aux seuls phénomènes à observer. Il permet aussi une gestion simplifiée d'observateur multiples sur un même objet observable.

Il est recommandé dès qu'il est nécessaire de gérer des évènements, quand une classe déclenche l'exécution d'une ou plusieurs autres.

## **Modèle de structure:**
### TODO
