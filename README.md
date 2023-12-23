## [REST API](http://localhost:8080/doc)

## Концепция:

- Spring Modulith
    - [Spring Modulith: достигли ли мы зрелости модульности](https://habr.com/ru/post/701984/)
    - [Introducing Spring Modulith](https://spring.io/blog/2022/10/21/introducing-spring-modulith)
    - [Spring Modulith - Reference documentation](https://docs.spring.io/spring-modulith/docs/current-SNAPSHOT/reference/html/)

```
  url: jdbc:postgresql://localhost:5432/jira
  username: jira
  password: JiraRush
```

- Есть 2 общие таблицы, на которых не fk
    - _Reference_ - справочник. Связь делаем по _code_ (по id нельзя, тк id привязано к окружению-конкретной базе)
    - _UserBelong_ - привязка юзеров с типом (owner, lead, ...) к объекту (таска, проект, спринт, ...). FK вручную будем
      проверять

## Аналоги

- https://java-source.net/open-source/issue-trackers

## Тестирование

- https://habr.com/ru/articles/259055/

Список выполненных задач: 
(na etoy machine net russkoy klaviaturu)
... zadacha 1 viplnena
Сбилдить приложение

## ЗАДАЧА 1. Разобраться со структурой проекта:




## ЗАДАЧА 2. Удалить социальные сети:




## ЗАДАЧА 3. Вынести чуствительную информацию.:

User: 
it is required when application starts to read parameters from environment path variables
ChatGPT:
If you want to read sensitive data from environment variables instead of storing them directly in property files, Spring Boot provides a convenient way to achieve this. Here's how you can modify your Spring Boot application to read sensitive data from environment variables:

Remove Sensitive Data from Property Files:
Remove the sensitive data from your application.properties or application.yml file.

Read from Environment Variables:
Update your Spring configuration classes to read the sensitive data from environment variables. You can use the @Value annotation to inject values from environment variables.

java
Copy code
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${server.port}")
    private int serverPort;

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${SENSITIVE_API_KEY}")
    private String apiKey;

    @Value("${SENSITIVE_DATABASE_PASSWORD}")
    private String databasePassword;

    // ... rest of your configuration
}
In the example above, ${SENSITIVE_API_KEY} and ${SENSITIVE_DATABASE_PASSWORD} are placeholders for environment variables.

Set Environment Variables:
Before starting your Spring Boot application, make sure to set the required environment variables. This can be done in various ways, depending on your operating system and deployment environment.

For example, you can set environment variables in a Unix-like system before running your application:

cmd
Copy code:
>
set SENSITIVE_API_KEY=your-api-key
set SENSITIVE_DATABASE_PASSWORD=your-password
>
> 
Secure Environment Variables:
Ensure that your environment variables are properly secured. Avoid exposing sensitive information in logs or unintentionally sharing them. Consider using tools or methods that are suitable for securing environment variables in your deployment environment.
By following these steps, your Spring Boot application will read sensitive data from environment variables at runtime. This approach is more secure than storing sensitive information directly in configuration files, especially when dealing with credentials or API keys.