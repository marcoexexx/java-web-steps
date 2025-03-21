run:
	mvn clean package
	cp ./target/my-jsp.war ${TOMCAT_HOME}/webapps/
	${TOMCAT_HOME}/bin/shutdown.sh
	${TOMCAT_HOME}/bin/startup.sh
	tail -f ${TOMCAT_HOME}/logs/catalina.out

clean:
	# TODO: clean project `war`
	# rm ${TOMCAT_HOME}/webapps/my-jsp*
