## ЗАДАЧА 1. Разобраться со структурой проекта:




## ЗАДАЧА 2. Удалить социальные сети:

Html tags are have been removed

C:\JavaRush\Module5\project-final-master-spring-ilya\resources\view\login.html


## ЗАДАЧА 3. Вынести чуствительную информацию.:

Ilya Kirbizhekov: 
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
MAC

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${SENSITIVE_API_KEY}")
    private String apiKey;

    @Value("${SENSITIVE_DATABASE_PASSWORD}")
    private String databasePassword;

>
> 
> >
 MY WINDOWS

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${SENSITIVE_API_KEY}")
    private String apiKey;

    @Value("${SENSITIVE_DATABASE_PASSWORD}")
    private String databasePassword;

>
> 
Secure Environment Variables:
Ensure that your environment variables are properly secured. Avoid exposing sensitive information in logs or unintentionally sharing them. Consider using tools or methods that are suitable for securing environment variables in your deployment environment.
By following these steps, your Spring Boot application will read sensitive data from environment variables at runtime. This approach is more secure than storing sensitive information directly in configuration files, especially when dealing with credentials or API keys.

## ЗАДАЧА 5. Написать тесты для всех публичных методов контроллера ProfileRestController. Хоть методов только 2, но тестовых методов должно быть больше, т.к. нужно проверить success and unsuccess path.:



## ЗАДАЧА 6. Сделать рефакторинг метода com.javarush.jira.bugtracking.attachment.FileUtil#upload чтоб он использовал современный подход для работы с файловой системмой. Easy task:



## ЗАДАЧА 7. Добавить новый функционал: добавления тегов к задаче (REST API + реализация на сервисе). Фронт делать необязательно. Таблица task_tag уже создана: