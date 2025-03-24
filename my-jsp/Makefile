PROJECT_NAME=my-jsp

run:
	mvn clean package
	cp ./target/${PROJECT_NAME}.war ${TOMCAT_HOME}/webapps/
	${TOMCAT_HOME}/bin/shutdown.sh
	${TOMCAT_HOME}/bin/startup.sh
	tail -f ${TOMCAT_HOME}/logs/catalina.out

clean:
	rm -rf ${TOMCAT_HOME}/webapps/${PROJECT_NAME}*
