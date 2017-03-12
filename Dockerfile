FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/web-app-two.jar /web-app-two/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/web-app-two/app.jar"]
