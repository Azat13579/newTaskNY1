Тестовое задание:
Необходимо реализовать 2 web-приложения на Spring-boot и web форму на JavaScript:
Web форма имеет кнопку и текстовое поле для ввода строки. При нажатии на кнопку идет обращение через REST-сервис к 
web-приложению, развернутому на Jetty или TomCat. Web-приложение формирует JMS сообщение с полученными данными и 
отправляет в очередь (RabbitMQ, Kafka или любая другая альтернатива).
Второе web-приложение слушает очередь, в которую отправляет сообщение первое приложение, при наличии в очереди 
сообщения, с помощью JPA сохраняет данные из полученного сообщения в БД (H2 in memory).


Инструкция по запуску броккера сообщений Apache Kafka на ОС WINDOWS:
1) Скачайте (https://www.apache.org/dyn/closer.cgi?path=/kafka/2.4.0/kafka_2.13-2.4.0.tgz) и расспакуйте  Apache Kafka;
2) Используя командную строку пройдите в расспакованную папку и запустите(Start a ZooKeeper):
   .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
3) Используя командную строку пройдите в расспакованную папку и запустите(Start the Apache Kafka server):
   .\bin\windows\kafka-server-start.bat .\config\server.properties
   
Инструкция по запуску приложений:
4) После запуска Apache Kafka запустить ProducerKafkaApplication в проекте transmitter; 
5) После запуска ProducerKafkaApplication в проекте transmitter запустить KafkaConsumerApplication
 в проекте receiver; 

Работа с приложениями:
6) http://localhost:8085/produc отображается форма для отправки сообщений.  
7) Веб интерфейс БД по пути http://localhost:8080/h2-console/ с параметрами по умолчанию.
