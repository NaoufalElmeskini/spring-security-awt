# SPRING-SECURITY-JWT
Projet contenant le socle d'une authentification à base de JWT ([JSON Web Token](https://fr.wikipedia.org/wiki/JSON_Web_Token)) et le framework [Spring Security](https://spring.io/projects/spring-security).

Le projet contient aussi un controller (AuthenticationController) exposé grâce à une interface Swagger afin de proposer un scénario de test facile à utiliser.
## Deploiement :
### Sur Docker
A partir de la racine du projet :

    $ ./mvnw package 
    $ docker build -t spring-security-jwt .
    $ docker run -p 8080:8080 spring-security-jwt
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
