
Documentação completa aqui!


[doc sicredi.pdf](https://github.com/enisonoliveira/sicrediteste/files/5765724/doc.sicredi.pdf)

<h6 style="font-size:8px">
Api Pauta de votação

Tecnologias usada Srpging-boot, mogoDB, Gradlew, RabbitMQ,Tomcat



Configuração do projeto

1.Versão java 11
.
2.Gerenciador de dependência Gradlew

3.Banco nosql mongodb

4.spring boot

5.Mensageria RabbitMQ


=======================================file propertie.properties===================================================
Confs  mongodb

Arquivo .properties
#mongodb
spring.data.mongodb.host=
spring.data.mongodb.port=
spring.data.mongodb.database=
spring.data.mongodb.username=
spring.data.mongodb.password=


Confs Mensageria RabbitMQ
#rabbit
spring.rabbitmq.host=
spring.rabbitmq.port=
spring.rabbitmq.username=
spring.rabbitmq.password=

Confs Tomcat

server.port=8080
server.servlet.context-path=/ruling
Swegger

http://localhost:8080/v1/ruling/swagger-ui.html

![Captura de tela de 2021-01-05 00-04-19](https://user-images.githubusercontent.com/24898873/103602028-ce466b00-4ee9-11eb-8d32-3cf4c434788f.png)


Inicializando o projeto
GitHub
https://github.com/enisonoliveira/sicrediteste

git clone  https://github.com/enisonoliveira/sicrediteste.git

open ssh

cd sicrediteste
 ./gradlew bootRun


url contexto

http://localhost:8080/ruling/



Diagrama básico modelagem de dados figura  1 uml
![image](https://user-images.githubusercontent.com/24898873/103557463-05892d80-4e92-11eb-9bf5-a1a4c6136ab1.png)

Requisição  de cadastro de novo usuário
URL de requisição  salvar usuario  POST: /ruling/user/save/
Paramentro : /{CPF}
Exemplo Requisição: http://localhost:8080/ruling/user/save/38506905812


![image](https://user-images.githubusercontent.com/24898873/103557581-294c7380-4e92-11eb-9769-da4fe3005c9d.png)

Consultar  status CPF
URL de requisição  GET: /ruling/user/cpf/status
Parâmetro : /{CPF}

http://localhost:8080/ruling/user/cpf/status/38406905800
![image](https://user-images.githubusercontent.com/24898873/103557619-39fce980-4e92-11eb-9d92-79e37014a2b3.png)


Requisição para cadastro de uma nova ruling/sessão
URL de requisição POST:localhost:8080/ruling/session/save/
parametro:/{nomepauta} 
localhost:8080/ruling/session/save/ nome ruling para votação em questão test

Importante o _id retornado principal sera usado em todo o fluxo de votação

![image](https://user-images.githubusercontent.com/24898873/103557666-4b45f600-4e92-11eb-9536-1ad7bcfb607e.png)



Diagrama de requisição para iniciar sessão de votação
Metodo Async com delay de 60 segundo para cada requisição
GET : /ruling/session/start
parametro:/{session_id}

http://localhost:8080/ruling/session/start/5ff31b2b3d33ed2cd5e42da8
![image](https://user-images.githubusercontent.com/24898873/103557698-59941200-4e92-11eb-86c5-8bf56ef92c02.png)


Diagrama de requisição para votação

exemplo
http://localhost:8080/ruling/voting/save?CPF=38406905834&session_id=5ff31d82d0246e77040fbc7c&voting=sim


![image](https://user-images.githubusercontent.com/24898873/103557748-6d3f7880-4e92-11eb-9c40-88b4b133eab7.png)

Todas as rotas da API

POST:
http://localhost:8080/ruling/user/save/38406905800

GET:
http://localhost:8080/ruling/user/cpf/status/38406905800

POST:
http://localhost:8080/ruling/session/save/ nome ruling para votação em questão test

GET:
http://localhost:8080/ruling/session/start/5ff31d82d0246e77040fbc7c

POST:
http://localhost:8080/ruling/voting/save?CPF=38406905834&session_id=5ff31d82d0246e77040fbc7c&voting=sim
</h6>
