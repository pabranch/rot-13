# ROT-13 super encryption system

Language: Java

## How to build & test

Build, run the tests, and create the `.jar` file.

```
mvn clean verify
```

## How to run the program via the command line

```
java -cp target/*.jar com.example.App foo bar baz
```

## How to set the rotation delta by setting the `ROT` environment variable.

```
ROT=3 java -cp target/*.jar com.example.App foo bar baz
```

or

```
export ROT=33
java -cp target/*.jar com.example.App foo bar baz
```
