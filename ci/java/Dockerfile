FROM openjdk

RUN wget https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip -O /usr/lib/apache-maven-3.6.3-bin.zip \
    && apt-get update && apt-get install vim -y

RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 9DA31620334BD75D9DCB49F368818C72E52529D4 && \
	echo "deb http://repo.mongodb.org/apt/debian stretch/mongodb-org/4.0 main" | tee /etc/apt/sources.list.d/mongodb-org-4.0.list && \
	apt-get update && \
	mkdir -p /data/db
