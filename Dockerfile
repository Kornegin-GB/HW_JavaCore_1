FROM bellsoft/liberica-openjdk-alpine:17.0.7
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/geekbrains/Main.java
CMD java -classpath ./out ru.geekbrains.Main