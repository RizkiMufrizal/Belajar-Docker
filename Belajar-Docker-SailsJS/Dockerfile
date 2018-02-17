FROM node:alpine

RUN apk update && apk add ca-certificates wget openssl && update-ca-certificates
ENV DOCKERIZE_VERSION v0.6.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN npm cache clean --force
RUN npm install -g npm
RUN npm install -g sails
RUN mkdir /belajar-sailsjs-docker
WORKDIR /belajar-sailsjs-docker
ADD . /belajar-sailsjs-docker
RUN rm -rf node_modules
RUN npm install