
Hi folks,
#Infosys #java #developer #interview #questions #answers #experience 3+ 2019
Q1. Difference between == and .equals() ?
Ans. "equals" is the method of object class which is supposed to be overridden to check object equality, whereas "==" operator evaluate to see if the object handlers on the left and right are pointing to the same object in memory.
x.equals(y) means the references x and y are holding objects that are equal. x==y means that the references x and y have same object.

Sample code:

String x = new String("str");
String y = new String("str");

System.out.println(x == y); // prints false
System.out.println(x.equals(y)); // prints true

Q2. Why is String immutable in Java ?
Ans. 1. String Pool - When a string is created and if it exists in the pool, the reference of the existing string will be returned instead of creating a new object. If string is not immutable, changing the string with one reference will lead to the wrong value for the other references.

Example -

String str1 = "String1";
String str2 = "String1"; // It doesn't create a new String and rather reuses the string literal from pool

// Now both str1 and str2 pointing to same string object in pool, changing str1 will change it for str2 too

2. To Cache its Hashcode - If string is not immutable, One can change its hashcode and hence it's not fit to be cached.

3. Security - String is widely used as parameter for many java classes, e.g. network connection, opening files, etc. Making it mutable might possess threats due to interception by the other code segment.

Q3. Explain the scenerios to choose between String , StringBuilder and StringBuffer ?

or

What is the difference between String , StringBuilder and StringBuffer ?
Ans. If the Object value will not change, use String Class because a String object is immutable.

If the Object value can change and will only be modified from a single thread, use StringBuilder because StringBuilder is unsynchronized(means faster).

If the Object value may change, and can be modified by multiple threads, use a StringBuffer because StringBuffer is thread safe(synchronized).

Q4. What are the difference between composition and inheritance in Java?
Ans. Composition - has-a relationship between objects.
Inheritance - is-a relationship between classes.

Composition - Composing object holds a reference to composed objects and hence relationship is loosely bound.
Inheritance - Derived object carries the base class definition in itself and hence its tightly bound.

Composition - Used in Dependency Injection
Inheritance - Used in Runtime Polymorphism

Composition - Single class objects can be composed within multiple classes.
Inheritance - Single class can only inherit 1 Class.

Composition - Its the relationship between objects.

Inheritance - Its the relationship between classes.

Q5. Which are the different segments of memory ?
Ans. 1. Stack Segment - Contains primitives, Class / Interface names and references.

2. Heap Segment - Contains all created objects in runtime, objects only plus their object attributes (instance variables), Static variables are also stored in heap.

3. Code Segment - The segment where the actual compiled Java bytecodes resides when loaded
Q6. What are different ways to create String Object? Explain.

Ans. When we create a String using double quotes, JVM looks in the String pool to find if any other String is stored with same value. If found, it just returns the reference to that String object else it creates a new String object with given value and stores it in the String pool.

When we use new operator, JVM creates the String object but dont store it into the String Pool. We can use intern() method to store the String object into String pool or return the reference if there is already a String with equal value present in the pool.

Q7. Why do we need Inner classes ? Cant we just work with outer classes wherever we implement Inner classes ?
Ans. Yes, we can substitute outer classes wherever we need to have inner classes but Inner classes have advantage in certain cases and hence preferred -

Ease - Why to implement a class outside if its objects are only intended to be part of an outer object. Its easy to define the class within another class if the use is only local.

Protection - Making a call an outer exposes a threat of it being used by any of the class. Why should it be made an outer class if its object should only occur as part of other objects.

For example - You may like to have an class address whose object should have a reference to city and by design thats the only use of city you have in your application. Making Address and City as outer class exposes City to any of the Class. Making it an inner class of Address will make sure that its accessed using object of Address.

Q8. Does garbage collection guarantee that a program will not run out of memory?
Ans. Garbage collection does not guarantee that a program will not run out of memory. It is possible for programs to use up memory resources faster than they are garbage collected. It is also possible for programs to create objects that are not subject to garbage collection

Q9. What do you mean by "Java is a statically typed language" ?
Ans. It means that the type of variables are checked at compile time in Java.The main advantage here is that all kinds of checking can be done by the compiler and hence will reduce bugs.

Q10. Why Char array is preferred over String for storing password?
Ans. String is immutable in java and stored in String pool. Once it's created it stays in the pool until unless garbage collected, so even though we are done with password it's available in memory for longer duration and there is no way to avoid it. It's a security risk because anyone having access to memory dump can find the password as clear text.

Q11. What is the difference between Encapsulation and Abstraction?

Ans. 1.Abstraction solves the problem at design level while encapsulation solves the problem at implementation level

2.Abstraction is used for hiding the unwanted data and giving relevant data. while Encapsulation means hiding the code and data into a single unit to protect the data from outside world.

3. Abstraction lets you focus on what the object does instead of how it does it while Encapsulation means hiding the internal details or mechanics of how an object does something.

4.For example: Outer Look of a Television, like it has a display screen and channel buttons to change channel it explains Abstraction but Inner Implementation detail of a Television how CRT and Display Screen are connect with each other using different circuits , it explains Encapsulation.
Q12. What are different ways of object creation in Java ?
Ans. Using new operator - new xyzClass()

Using factory methods - xyzFactory.getInstance( )

Using newInstance( ) method - (Class.forName(xyzClass))emp.newInstance( )

By cloning an already available object - (xyzClass)obj1.clone( )

Q13. What are points to consider in terms of access modifier when we are overriding any method?

Ans. 1. Overriding method can not be more restrictive than the overridden method.

reason : in case of polymorphism , at object creation jvm look for actual runtime object. jvm does not look for reference type and while calling methods it look for overridden method.

If by means subclass were allowed to change the access modifier on the overriding method, then suddenly at runtime when the JVM invokes the true objects version of the method rather than the reference types version then it will be problematic

2. In case of subclass and superclass define in different package, we can override only those method which have public or protected access.

3. We can not override any private method because private methods can not be inherited and if method can not be inherited then method can not be overridden.

Q14. What is a Lambda Expression ? What's its use ?
Ans. Its an anonymous method without any declaration.

Lambda Expression are useful to write shorthand Code and hence saves the effort of writing lengthy Code.

It promotes Developer productivity, Better Readable and Reliable code.

Q15. What is the difference between declaration, instantiation and initialization ?
Ans. Declaration is intimation to the compiler about the nature of Data a reference is going to hold.

For example - List myList;

Instantiation is reservation of memory.

For example

myList = new ArrayList();

Initialization or construction is setting the default values for member elements.

For example

myList = new ArrayList(mySet);

** Example 2nd is both for instantiation as well as initialization. The only difference is that 2nd will initialized the member elements to their default values whereas 3rd will initialized it with the elements from set.
Q16. What are the common uses of "this" keyword in java ?
Ans. "this" keyword is a reference to the current object and can be used for following -

1. Passing itself to another method.

2. Referring to the instance variable when local variable has the same name.

3. Calling another constructor in constructor chaining

Q17. What is the difference between final, finally and finalize() ?
Ans. final - constant variable, objects cannot be de-referenced, restricting method overriding, restricting class sub classing.

finally - handles exception. The finally block is optional and provides a mechanism to clean up regardless of what happens within the try block. Use the finally block to close files or to release other system resources like database connections, statements etc.

finalize() - method helps in garbage collection. A method that is invoked before an object is discarded by the garbage collector, allowing it to clean up its state.

Q18. What are different types of classes ?

Ans. There are different verticals in which Java Classes can be classified.

1. Access - Public , Private , default or Protected.

2. Packaging - System, library or User Defined

3. Structure - Outer or Inner

4. Object Derivation - Abstract Class or Concrete Class.

5. Object Creation - Normal, Singleton , Doubleton , Immutable or Enum.

6. Functionality - String , Util , Stream etc.

Q19. What are the benefits of JSON over XML ?

Ans. Lighter and faster than XML as on-the-wire data format

Object Representation - Information is presented in object notations and hence better understandable.

Easy to parse and conversion to objects for information consumption.

Support multiple data types - JSON supports string, number, array, boolean whereas XML data are all string.
Ans. Lighter and faster than XML as on-the-wire data format

Object Representation - Information is presented in object notations and hence better understandable.

Easy to parse and conversion to objects for information consumption.

Support multiple data types - JSON supports string, number, array, boolean whereas XML data are all string.

Q20. If you are given a choice to use either ArrayList and LinkedList, Which one would you use and Why ?

Ans. ArrayList are implemented in memory as arrays and hence allows fast retrieval through indices but are costly if new elements are to be inserted in between other elements. LinkedList allows for constant-time insertions or removals using iterators, but only sequential access of elements

1. Retrieval - If Elements are to be retrieved sequentially only, Linked List is preferred.

2. Insertion - If new Elements are to be inserted in between other elements , Linked List is preferred.

3. Search - Binary Search and other optimized way of searching is not possible on Linked List.

4. Sorting - Initial sorting could be pain but lateral addition of elements in a sorted list is good with linked list.

5. Adding Elements - If sufficiently large elements needs to be added very frequently ,Linked List is preferable as elements don't need consecutive memory location.

Q21. What is Lazy Initialization in Hibernate ?
Ans. It's a feature to lazily initialize dependencies , relationship and associations from the Database. Any related references marked as @OneToMany or @ManyToMany are loaded lazily i.e when they are accessed and not when the parent is loaded.

Q22. Which of the following combination of keywords is illegal in Java ?

a. static and transient
b. transient and final
c. static and synchronized
d. abstract and final

Ans. abstract and final

Q23. Explain OOPs

or

Explain OOPs Principles

or

Explain OOPs Concepts

or

Explain OOPs features

or

Tell me something about OOPs
Ans. OOPs or Object Oriented Programming is a Programming model which is organized around Objects instead of processes. Instead of a process calling series of processes, this model stresses on communication between objects. Objects that all self sustained, provide security by encapsulating it's members and providing abstracted interfaces over the functions it performs. OOP's facilitate the following features

1. Inheritance for Code Reuse
2. Abstraction for modularity, maintenance and agility
3. Encapsulation for security and protection
4. Polymorphism for flexibility and interfacing
Q24. How can we run a java program without making any object?
Ans. By putting code within static method. With Java 6 and earlier versions, even static block can be used.
Q25. Can we use both "this()" and "super()" in a constructor ?
Ans. No, because both this and super should be the first statement.

Q26. Explain Flow of Spring MVC ?
Ans. The DispatcherServlet configured in web.xml file receives the request.

The DispatcherServlet finds the appropriate Controller with the help of HandlerMapping and then invokes associated Controller.

Then the Controller executes the logic business logic and then returns ModeAndView object to the DispatcherServlet.

The DispatcherServlet determines the view from the ModelAndView object.

Then the DispatcherServlet passes the model object to the View.

The View is rendered and the Dispatcher Servlet sends the output to the Servlet container.

Finally Servlet Container sends the result back to the user.

Q27. What is the difference between ArrayList and LinkedList ?
Ans. Underlying data structure for ArrayList is Array whereas LinkedList is the linked list and hence have following differences -

1. ArrayList needs continuous memory locations and hence need to be moved to a bigger space if new elements are to be added to a filled array which is not required for LinkedList.

2. Removal and Insertion at specific place in ArrayList requires moving all elements and hence leads to O(n) insertions and removal whereas its constant O(1) for LinkedList.

3. Random access using index in ArrayList is faster than LinkedList which requires traversing the complete list through references.

4. Though Linear Search takes Similar Time for both, Binary Search using LinkedList requires creating new Model called Binary Search Tree which is slower but offers constant time insertion and deletion.

5. For a set of integers you want to sort using quicksort, it's probably faster to use an array; for a set of large structures you want to sort using selection sort, a linked list will be faster.

Q28. What are the ways to avoid LazyInitializationException ?
Ans. 1. Set lazy=false in the hibernate config file.

2. Set @Basic(fetch=FetchType.EAGER) at the mapping.

3. Make sure that we are accessing the dependent objects before closing the session.

4. Force initialization using Hibernate.initialize

5. Using Fetch Join in HQL.

Q29. What is Polymorphism in Java ?

Ans. Polymorphism means the condition of occurring in several different forms.

Polymorphism in Java is achieved in two manners

1. Static polymorphism is the polymorphic resolution identified at compile time and is achieved through function overloading whereas

2. Dynamic polymorphism is the polymorphic resolution identified at runtime and is achieved through method overriding.

Q30. What are Inner , Outer , Left and Right Joins in SQL ?

Ans. Inner join is the intersection of two tables on the condition defined by the where clause i.e will get records from both tables matched by a column.

Outer join is the union of two tables i.e will get all records from both tables and will put null in the columns where related records are not present.

Left Outer join is the left union of two tables i.e all records from the table on the left and values from the right table for related records else null for the columns from right table.

Right Outer join is the right union of two tables i.e all records from the table on the right and values from the left table for related records else null for the columns from left table.

Q31. What is a String Pool ?
Ans. String pool (String intern pool) is a special storage area in Java heap. When a string is created and if the string already exists in the pool, the reference of the existing string will be returned, instead of creating a new object and returning its reference.

Q32. Difference between first level and second level cache in hibernate ?
Ans. 1. First level cache is enabled by default whereas Second level cache needs to be enabled explicitly.

2. First level Cache came with Hibernate 1.0 whereas Second level cache came with Hibernate 3.0.

3. First level Cache is Session specific whereas Second level cache is shared by sessions that is why First level cache is considered local and second level cache is considered global.
Q33. Why every object constructor automatically call super() in Object before its own constructors?

Ans. Derived object carries the body of its class as well as the body of the parent class. Its body ( member elements ) is initialized using its own class constructor whereas the body ( member elements ) carried from the parent class are initialized using super class constructor. So In order to initialize the elements of the parent class before its own elements are even initialized, super is called.
Q34. How does making string as immutable helps with securing information ? How does String Pool pose a security threat ?
Ans. String is widely used as parameter for many java classes, e.g. network connection, opening files, etc. Making it mutable might possess threats due to interception by the other code segment or hacker over internet.

Once a String constant is created in Java , it stays in string constant pool until garbage collected and hence stays there much longer than what's needed. Any unauthorized access to string Pool pose a threat of exposing these values.
Q35. Difference between TreeMap and HashMap ?
Ans. They are different the way their elements are stored in memory. TreeMap stores the Keys in order whereas HashMap stores the key value pairs randomly.
Q36. Difference between HashMap and Hashtable?
Ans. Hashtable is synchronized whereas HashMap is not.HashMap allows null values whereas Hashtable doesnt allow null values.

Q37. What is the use of hashcode in Java ?
Ans. Hashcode is used for bucketing in Hash implementations like HashMap, HashTable, HashSet etc. The value received from hashcode() is used as bucket number for storing elements. This bucket number is the address of the element inside the set/map. when you do contains() then it will take the hashcode of the element, then look for the bucket where hashcode points to and if more than 1 element is found in the same bucket (multiple objects can have the same hashcode) then it uses the equals() method to evaluate if object are equal, and then decide if contain() is true or false, or decide if element could be added in the set or not.
Q38. Describe what happens when an object is created in Java ?
Ans. 1. Memory is allocated from heap to hold all instance variables and implementation-specific data of the object and its superclasses. Implemenation-specific data includes pointers to class and method data.
2. The instance variables of the objects are initialized to their default values.
3. The constructor for the most derived class is invoked. The first thing a constructor does is call the constructor for its superclasses. This process continues until the constructor for java.lang.Object is called,as java.lang.Object is the base class for all objects in java.
4. Before the body of the constructor is executed, all instance variable initializers and initialization blocks are executed. Then the body of the constructor is executed. Thus, the constructor for the base class completes first and constructor for the most derived class completes last.