# Create MongoDB container with following commands.
## Commands for Windows
docker build -t mongoserver .
docker run --detach --name=mongoserver --publish 37017:27017 mongoserver

## Commands for architecture linux
docker build -t mongoserver --platform=linux/arm64 .
docker run --detach --name=mongoserver --publish 37017:27017 mongoserver