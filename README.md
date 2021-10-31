# cheer-up-intranet-back

## Deploiement :
### Avec Docker
A partir de la racine du projet :

    $ docker build -t intranet-back .
    $ docker run -p 8080:8080 intranet-back
### Sans docker
- S'assurer d'avoir une **version de JRE java > 11** (la commande `java --version` permet de vérifier cela)
- A partir de la racine du projet, executer la commande `./mvnw spring-boot:run`

#### /!\ Précautions prealables /!\
Si les deux variables globales JAVA_HOME et PATH ne sont pas correctement initialisés, cela pourrait causer des erreurs lors de l'execution des goals Maven.
- `$JAVA_HOME` doit contenir le chemin vers la racine du JRE java préalablement installé
- `$PATH` doit inclure `$JAVA_HOME/bin` dans sa liste de chemins

  (Rappel : la commande `echo` permet de verifier la valeur d'une variable. Exemple : `echo $PATH` dans le terminal)

#Swagger
Afin d'acceder à l'interface de Swagger, taper l'url :
    http://localhost:8080/swagger-ui.html
Ensuite, dans la barre d'exploration chercher : `/v3/api-docs`

Cela doit vous ramener à l'api du controller.
