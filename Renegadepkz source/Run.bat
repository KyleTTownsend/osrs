@echo off
title Running Server
java -Xmx1200m -cp .;./jython.jar;./MySql/mysql-connector-java-3.0.08-ga-bin.jar server
