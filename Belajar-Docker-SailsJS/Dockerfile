FROM node:6.3.1

RUN apt-get update && apt-get install -y wget
ENV DOCKERIZE_VERSION v0.2.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN npm install -g sails
RUN mkdir /belajar-sailsjs-docker
WORKDIR /belajar-sailsjs-docker
ADD . /belajar-sailsjs-docker
RUN rm -rf node_modules
RUN npm install
