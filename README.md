# spring-boot-scheduled-jobs-demo

1. Add @EnableScheduling to Spring Boot Application class
2. Create a class which should have scheduled job, add @Component annotation to this class.
3. Create a function that should run as scheduled job. Add @Scheduled annotation

@Scheduled(initialDelay = 1000, fixedRate = 10000)
This task should run at every 10 seconds rate.

4. Create a static member variable of the class in Spring boot application class. Add @Autowired annotation to the member variable
5. Run the application. An instance of the scheduled class will be created and after 10 seconds a message shall be printed in console.
6. After every 10 seconds message will be printed in scheduled job
