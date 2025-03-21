run:
	# javac -cp ../apache-tomcat-9.0.102/lib/servlet-api.jar -d ./src/main/webapp/WEB-INF/classes ./src/main/resources/com/example/**/*.java
	../apache-tomcat-9.0.102/bin/shutdown.sh
	../apache-tomcat-9.0.102/bin/startup.sh
	tail -f ../apache-tomcat-9.0.102/logs/catalina.out

shutdown:
	../apache-tomcat-9.0.102/bin/shutdown.sh
