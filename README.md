# AlgoDomain
Created for AlgoDomain TechTask

This repository is created for AlgoDomain Tech Assessment, please have a look at the below points/scenarion for better understanding of projects and its configuration.

Please have a look at the below points for better understanding of the project

As per the given scenario, I have created one main product table (It is better if i use different table for Product->Category->CategoryType) where I configured 
its attributes as per doc provided.

Overview of Projects

entity -> performing persistence layer activities (Directly linked with our databases)
controller -> I have created seperate controller for 'seller' and 'user' as per their role
repository -> interface which extends JPA for accessing default query given by JPA interface

I haven't created seperate service and bean package, as I uses entity package in place of bean (Wrong practise)

I also configured JUnit, where I added two junit method, which is successfully validated (haven't added method for every scenario)

Swagger api support is added but I haven't used much

I have used the latest annotation and dependencies while building this backend application, all the functionalities which I have developed are in running condition.





