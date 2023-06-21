#Scelta dell'immagine openjdk-11 e Maven
FROM maven:3.8.4-openjdk-11

# Copia il codice sorgente del tuo progetto nella directory /usr/src/app all'interno dell'immagine
COPY . /usr/src/app

# Imposta la directory di lavoro
WORKDIR /usr/src/app

# Esegui il comando Maven per compilare e confezionare il tuo progetto
RUN mvn clean package
