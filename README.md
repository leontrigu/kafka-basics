# kafka-basics
How it works. Basic example with Spring Boot
You must have kafka up and running locally.

Windows Commands:
bin/windows/zookeeper-server-start.bat config/zookeeper.properties --start zookeeper server
bin/windows/kafka-server-start.bat config/server.properties -- start kafka

bin/windows/kafka-console-consumer.bat --topic leontrigu --from-beginning --bootstrap-server localhost:9092 --read events

