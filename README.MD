# Coop Goods Townhall

## Description


## Installation

### Install Prerequisites

* Java 11

### Build Instructions

```shell script
./gradlew assemble
```

## Usage

```shell script
java -jar java -jar build/libs/coop-goods-townhall.jar
```

OR

```shell script
./gradlew bootRun
```

## Code Style

We use Google's Java coding conventions for the project. To reformat code, run: 

```shell script 
./gradlew spotlessApply
```

Code style is checked automatically during a build.

## API

### Open API v3

Go to http://localhost:8080 to see the API definition in a web browser.

API docs specification are available at http://localhost:8080/v3/api-docs

## Docker

### Build image

#### Using plain docker file
```shell script
docker build -t $IMAGE_NAME .
```

#### Using gradle task
```shell script
./gradlew bootBuildImage --imageName=$IMAGE_NAME
```

### Run container

```shell script
docker run -p 8080:8080 -t $IMAGE_NAME
```

### Use existing image

```shell script
docker run -p 8080:8080 abdelhamidbakhtaconsensys/coopgoods-townhall:latest
```