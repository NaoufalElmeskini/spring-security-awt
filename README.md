# cheer-up-intranet-back

##Deployer le serveur localement :
- s'assurer d'avoir une version de JRE java > 13 (la commande java --version permet de vérifier cela)
- executer la commande ./mvnw spring-boot:run

##precaution prealable :
Si les deux variable globales JAVA_HOME et PATH ne sont pas correctement initialisés, cela pourrait causer des erreurs lors de l'execution des goals Maven.
- $JAVA_HOME doit contenir le chemin vers la racine du JRE java préalablement installé
- $PATH doit inclure $JAVA_HOME/bin dans sa liste de chemin

#Swagger
Afin d'acceder à l'interface de Swagger, taper l'url :
    http://localhost:8080/swagger-ui/index.html

Si la page renvoyé n'est pas celle du controlleur, taper "/v3/api-docs" dans la barre d'expolaration.
