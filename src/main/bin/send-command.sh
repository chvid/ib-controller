#!/bin/sh
java -cp lib/jts4launch-972.jar:lib/twslaunch-install4j-972.jar:lib/ibcontroller-3.4.3-SNAPSHOT.jar:lib/log4j-api-2.5.jar:lib/total-2018-972.jar:lib/locales-972.jar:lib/twslaunch-972.jar:lib/log4j-core-2.5.jar ibcontroller.SendCommand localhost 7462 $1
