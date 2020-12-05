# 02-StudentApp
Demosntarting @value annotation and Setter Injection in Spring Boot
Note:Comment out @value Annotation in student class and see how the property values are different for student object.
Reason:Application.Properties values has higher priority so when setter injected for Student class through @Bean will be overidden by @value which is reading from application.properties file.
