# LLD_CarRentalSystem

## Function Requirements

1. Riders should be able to request a ride by providing pickup and drop locations.

2. Drivers should be allocated based on different strategies (e.g., nearest, least busy, highest-rated).

3. Riders and drivers should be able to start and end trips.

4. The system should calculate pricing dynamically.

5. Vehicle management (assigning vehicles to drivers).

## SOLID Principle

Intuituion behind UML Diagram

 S -> Single responsibility principle -. manager class with their own responsibility
 
 O -> Open Closed Principle -> allow extensibility without modifying the core logic .
 
 L -> Liskov Substitution Principle -> follow a common interface so that system can switch between them 
 
 I -> Interface Segregation Principle -> seperate interface ensuring that class only implement relevant methods. 
 
 D -> Dependency Inversion Principle -> High level module do not depend on low level implementation but rather on abstraction

 ![image](https://github.com/user-attachments/assets/b3a1a247-83ce-4ead-94d7-a933fee92ef6)

