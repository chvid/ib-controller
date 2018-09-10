# Fork of IB Controller that builds with Maven

This is a fork of the IB Controller project that builds with Maven and creates a distributable in the form of a zip-file using the assembly plugin.
The various Windows utilities found in the original have been removed. Original documentation is inside the documentation folder.

To add Interactive Brokers TWS application into the local repository (./repository) run the following commands:

```
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 972/jars/total-2018.jar -DgroupId=com.interactivebrokers.tws -DartifactId=total-2018 -Dversion=972 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 972/jars/twslaunch-972.jar -DgroupId=com.interactivebrokers.tws -DartifactId=twslaunch -Dversion=972 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 972/jars/jts4launch-972.jar -DgroupId=com.interactivebrokers.tws -DartifactId=jts4launch -Dversion=972 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 972/jars/locales.jar -DgroupId=com.interactivebrokers.tws -DartifactId=locales -Dversion=972 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 972/jars/twslaunch-install4j-1.8.jar -DgroupId=com.interactivebrokers.tws -DartifactId=twslaunch-install4j -Dversion=972 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
```

Assuming the version of TWS is 972 and chvid needs to be your username.

Build with:

```
mvn clean install assembly:single
```

And unpack the distributable in:

```
target/ibcontroller-3.4.3-SNAPSHOT-distribution.zip
```

At a suitable location. Alter IBController.ini as you wish and set JAVA_HOME to JDK8 if necessary.

Use the encrypt password utility to encrypt your password:

```
sh encrypt-password.sh bananas
```

Start the TWS with:

```
sh start-ib-controller.sh
```

Stop it again with:

```
sh send-command.sh stop
```

Or send the other commands IB Controller supports (enableapi, reconnectdata, reconnectaccount).
