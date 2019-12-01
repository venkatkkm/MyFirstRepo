#List down all the annotation in spring.
#List out all annotation of rest used in your projects?
#Use of cascade and inverse attributes in Hibernate?
#Difference between Level 1 and level 2 cache in Hibernate?
#Difference between ArrayList and LinkedList ?
#Internal flow of HashMap ?
#Difference between hashMap and hashTable ?
#Difference between Array and ArrayList ?
#Difference between ArrayList and vector ?
#in your project where you used ConcurrentHashMap?
#Difference between Callable and Future interface?
Runnable has been around since Java 1.0, but Callable was only introduced in Java 1.5 ... to handle use-cases that Runnable does not support. In theory, the Java team could have changed the signature of the Runnable.run() method, but this would have broken binary compatiblity with pre-1.5 code, requiring recoding when migrating old Java code to newer JVMs. That is a BIG NO-NO. Java strives to be backwards compatible ... and that's been one of Java's biggest selling points for business computing.

And, obviously, there are use-cases where a task doesn't need to return a result or throw a checked exception. For those use-cases, using Runnable is more concise than using Callable<Void> and returning a dummy (null) value from the call() method.
#Class loaders
Java ClassLoader is a part of Java Runtime Environment that dynamically loads Java classes in JVM(Java Virtual Machine). The Java Runtime System does not need to know about files and files system because of classloaders.
#How can we take list into map?
for (Student stu : lt) { 
            map.put(stu.getId(), stu.getName()); 
        } 
#How can we take Map into List?
#When you will get ClassNotFoundException and NoClassDefFoundError ?
ClassNotFoundException is a checked exception which occurs when an application tries to load a class through its fully-qualified name and can not find its definition on the classpath.
NoClassDefFoundError is a fatal error. It occurs when JVM can not find the definition of the class while trying to:

    Instantiate a class by using the new keyword
    Load a class with a method call

#how you implement exception handling in your project?
#Where you implement multi-threading in your project?
#What are all the design patterns you observed in spring?
#Which design patters you used in your project?
#What are all the critical situations you come across in your project?
#Why wait () placed in object class? Why not it is placed in Thread class?
#What is use of intern () in string?
#what is diff b/w String str1="xyz"; and String str2= new String ("xyz");
#Explain about JVM architecture?
#Difference between SOAP and Rest? 
How to create web-services project and spring project using maven?
#What is diff b/w throw and throws?
#I have a company table in remote database. By using rest I need to get the table data and print into a file?
#Can you tell me java8 features?
#How to read book pages on online library by using bookid or author id(by using restful services)?
#I have a table in remote database, how to update the data in that table using rest?
#What are all the contents in WSDL?
#Can I add elements to list, if it is defined as final?
    But what is effect making it's final?

This means that you cannot rebind the variable to point to a different collection instance:

final List<Integer> list = new ArrayList<Integer>();
list = new ArrayList<Integer>(); // Since `list' is final, this won't compile

As a matter of style, I declare most references that I don't intend to change as final.

    I still can add to ArrayList new elements, remove elements and update it.

If you wish, you can prevent insertion, removal etc by using Collections.unmodifiableList():
#if you pass duplicate key to map what will happen?
#Difference between Abstract class and interface?
#Diff b/w comparator and comparable?
#How to set timeout for the browser? (Clue: restful client API)?
#In written test they are asking sorting programs (bubble sort, quicksort
#What is time complexity? If you are going to implement sorting by your own which sorting you prefer? And why?
#Use of volatile and synchronized keyword?
#What is serialization? Have you implement serialization in your project?
#Why we are using @qualifier?
# Difference between Bean Factory and Application Context?
#Explain about IOC container?
#How you are implemented polymorphism in your project?
#Diff b/w Iterator and List Iterator and Enumerator?
#What are all the collections are supporting ListIterator?
#How you iterate map having key and list<values>?
#How to make non-synchronized map and list as synchronized (by using collection method)?
#what is diff b/w collection and collections?
#Write the junit test case for the below scenario? Read array of elements into list<String>.
#What is diff b/w spring-jdbc and hibernate?
#What are all the drawbacks of jdbc over hibernate?
#What are all the problems with inheritance
#What is the use of Hibernate session?
#Why we are using @transient in hibernate?
Java's transient keyword is used to denote that a field is not to be serialized, whereas JPA's @Transient annotation is used to indicate that a field is not to be persisted in the database, i.e. their semantics are different.

#what is all the inputs we are giving to SessionFactory?
#What we are writing in hibernate-mapping file?
#What we are writing in hibernate-configuration file
#What is use of @ComponentScan?
#What is use of Dispatcher servlet?
#How to validate valid username and password in spring? For validating can I directly interact with DAO without service? 