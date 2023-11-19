# Interview_practice

## OOPS Concept:


### Abstraction:
	- Abstraction involves simplifying complex systems by modeling classes based on the essential characteristics of objects and hiding the unnecessary details. 
		In Java, abstraction is primarily achieved through abstract classes and interfaces.
	- Abstract methods are declared without a body and must be implemented by the concrete subclasses that extend the abstract class.
	- Abstract classes can also have concrete methods (methods with a body) that are inherited by their subclasses

### Encapsulation:
	- The internal details of how an object achieves its functionality are hidden from the outside world, and access to the internal data is controlled through methods.
	- Pojo class(Getter Setter Methods) is an example of Encapsulation
	- Getter methods retrieve the value of a private field, and setter methods set the value of a private field.
	
### Inheritance:
	-  Inheritance allows a class to inherit properties and behaviors (fields and methods) from another class. 
		The class that is inherited from is called the superclass or parent class, and the class that inherits is called the subclass or child class. 
		In Java, inheritance is implemented using the extends keyword.
	CONSTRUCTOR INHERITANCE:
		- Constructors are not inherited, but the subclass can call the constructor of the superclass using super().

### Polymorphism:
	- Polymorphism allows objects of different types to be treated as objects of a common type. 
		There are two types of polymorphism in Java: 
		1. compile-time (or static) polymorphism
			- Compile-time polymorphism is achieved through method overloading. 
			In method overloading, multiple methods with the same name are defined in the same class, but with different parameter lists (number, type, or order of parameters).
		2. runtime (or dynamic) polymorphism.
			- Runtime polymorphism is achieved through method overriding. 
			In method overriding, a subclass provides a specific implementation for a method that is already defined in its superclass. 
			This allows a subclass object to be treated as an object of its superclass.
	
### Interface:
	- An interface in Java is a collection of abstract methods. It provides a way to achieve complete abstraction.
	- Classes implement interfaces, and they must provide concrete implementations for all the methods declared in the interface.
	- In Java, a class can implement multiple interfaces, allowing for a form of multiple inheritance.
