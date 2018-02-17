dockerize -wait tcp://db:3306
npm cache clean --force
npm install -g npm
npm install
sails lift