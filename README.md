

Update Server
~# sudo apt-get update && apt-get upgrade



Install JRE
~#sudo apt-get install default-jre



Install JDK
~#sudo apt-get install default-jdk



Cek Versi Java
#java -version# javac -version



install postgres
$ sudo apt-get update $ sudo apt-get install postgresql postgresql-contrib $ sudo -i -u postgres



postgres=# GRANT ALL ON SCHEMA test TO xxx; postgres=# GRANT ALL ON ALL TABLES IN SCHEMA test TO xxx; postgres=# \q



postgres@server:-$ createdb user $ sudo -u postgres createdb user postgres=# \password Enter new password: Enter it again: postgres=#




untuk build jar
mvn clean package
atau
mvn clean install

untuk liat server berjalan
sudo netstat -tlnp
untuk stop
sudo kill -9 <id dari PID>
