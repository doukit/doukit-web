#!/usr/bin/env bash

# compile first
mvn compile

# package war
mvn package -Dmaven.test.skip=ture

# remove old file
rm -rf ${CATALINA_HOME}/webapps/doukit-web

# use new war files
cp -r target/doukit-web ${CATALINA_HOME}/webapps/

# stop tomcat and start it
${CATALINA_HOME}/bin/catalina.sh stop
#kill -9 `ps -ef |grep tomcat|grep -v grep|awk '{print $2}'`
${CATALINA_HOME}/bin/catalina.sh start


