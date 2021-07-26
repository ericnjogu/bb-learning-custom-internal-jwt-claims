# Custom Internal Tokens
Created with
```shell
mvn archetype:generate -B \
-DarchetypeGroupId=org.apache.maven.archetypes \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.4 \
-DgroupId=com.backbase.identity.tokenconverter.bas \
-DartifactId=custom-internal-jwt-claims
```

## Running
```shell
mvn spring-boot:run \
-Dspring-boot.run.jvmArguments="-Dcommunication.transferwise.api-key=key"
```