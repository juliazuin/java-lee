# java-lee

run project?
sudo apt install maven

cd springjavalee
mvn spring-boot:run

Ubuntu docker problem to login 
>Got permission denied while trying to connect to the Docker daemon socket at unix:///var/run/docker.sock: Get http://%2Fvar%2Frun%2Fdocker.sock/v1.40/containers/json: dial unix /var/run/docker.sock: connect: permission denied
````sh
sudo chmod 666 /var/run/docker.sock
````
