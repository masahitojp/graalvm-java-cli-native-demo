# What's this?

java cli native demo for using graalvm native-image

## How to build

```
$ gradle clean shadowJar
$ /opt/graalvm/bin/native-image  -jar build/libs/clitest.jar 
```

This creates an executable file that is less than 7.4 MB in size:

```
$ ./clitest -m "hello"
```

## How to create/run Docker image

```
$ docker build -t graalvm-test/run-test .
```
This creates an dockerfie that is less than 19MB in size:
```
$ docker run -it -t graalvm-test/run-test:latest /bin/sh -c "./clitest -m test"
```




## LICENSE

Apache v2
