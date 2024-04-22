# Utiliser une image Java de base
FROM openjdk:11-jre-slim

# Copie du fichier JAR de l'application dans l'image
COPY target/AsteroidTracker-1.0-SNAPSHOT.jar /app/AsteroidTracker.jar

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# exécuter l'application lorsque le conteneur démarre
CMD ["java", "-jar", "AsteroidTracker-1.0-SNAPSHOT.jar"] 
