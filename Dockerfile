FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=AleksFirstBot
ENV BOT_TOKEN=6012320485:AAFlaMCV3MgkAniiRQRtv_cTyDt1I2BN_A0
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "app.jar"]


#FROM adoptopenjdk/openjdk11:ubi
#ARG JAR_FILE=target/*.jar
#ENV BOT_NAME=AleksFirstBot
#ENV BOT_TOKEN=
#ENV BOT_DB_USERNAME=postgres
#ENV BOT_DB_PASSWORD=postgres
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-Dspring.datasource.password=${BOT_DB_PASSWORD}", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-Dspring.datasource.username=${BOT_DB_USERNAME}", "-jar", "app.jar"]