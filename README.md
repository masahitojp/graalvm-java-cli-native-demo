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

## LICENSE

Apache v2
