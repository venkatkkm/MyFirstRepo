#IBM Java Interview Questions for 3-8 Year Experience.
#Experienced Java Interview Questions Asked By IBM - 3-8 Year

Q. What is Difference between interface and abstract class?
Ans : Interface and Abstract class both are looks similar from declaration point of view. The major difference is for implementing multiple inheritance you need interface, because java does not support multiple inheritance. All methods and variables of interface are public. Interface can contain only abstract method (without method body) , but abstract class can contains abstract and non-abstract methods. Abstract class must be inherited by sub class. These are few major points you can answer for interview. For more in interface read here.

Q. Can you write final method in interface?
Ans : No , because interface methods do not have body . It need to be implement in implemented class.

Q. Is this possible to write final method in abstract class?
Ans : Yes, you can do this by using non abstract methods.
 Q. What is Difference between Iterator and ListIterator?
Ans : Both are used to retrieve the data from collection. Iterator only traverse in forward direction, but ListIterator can traverse in both forward and backward direction. ListIterator has hasPrevious() and previous() method which is not available in Iterator.
Q. Difference between synchronized block and synchronized method ?
Ans : Synchronized Method defines a self contained block and its easy to handle in multi-threaded environment. Both act as similar; there is no major advantage over each other. The difference is that a synchronized block can choose which object it synchronizes on. A synchronized method can only use 'this' (or the corresponding Class instance for a synchronized class method).

Q. Difference between String and StringBuffer class ?
Ans : String is immutable, but StringBuffer is not. StringBuffer used to represent characters that can be modified. StringBuffer is faster when performing concatenations. This is because when you concatenate aString, you are creating a new object (internally) every time sinceString is immutable.

Q. How to get the session object in jsp?
Ans : By using implicit object “session”. You can usesession.getAttributes() methods.
 Q. How to get the session factory object in hibernate?
Ans : By the use of buildSessionFactory() method .Syntax as below.

SessionFactory factory= new Configuration().configure().buildSessionFactory();
Q. How to handle the runtime exception in jsp?
Ans : In jsp page directive you can use isErrorPage=true.

Q. Difference between method overloading and overriding?
Ans : Both are concept of polymorphism. Method overloading is a form of static binding. Method overriding is a form dynamic binding. Overloading is applied in single class, but overriding is applicable for inherited class. Method overloading is always specific to method signature. It defines number of parameter, type of parameter and sequence of parameter.

Q. Difference between java.util.date and java.sql.date ?
Ans : As we know every database support most three form of entry i.e. date, time and timestamp. In java JDBC having all those supports using java.sql.Date, java.sql.Time, java.sql.TimeStamp. Internally all these JDBC classes extends java.util.Date.

 Q. I have 1 to 100 elements in array unordered, one element missed find that one?
Ans : There is existing old formula. Calculate the sum of all numbers stored in the array of size 11 means it hold 12 data. Then, subtract the sum from (12 * 13)/2
Basic Formula: n * (n + 1) / 2.
Q. Difference between equals() and hashcode()?
Ans : Both methods are from Object class. Equals() method is used to compare the contents of object or reference. But, hashcode() method is used to get the unique hash code for any object. Hashcode is used for hash implementations like HashMap, HashTable, HashSet etc.

Q. What is Comparator?
Ans : It’s an interface. It has 2 important methods. But, the frequently used method is compareTo() . It compares 2 different objects.

Q. We have equals() to compare two methods then why comparator again ?
Ans : Because , equals() method will only compare the content . It cannot compare two different objects. Comparator interface hascompareTo() method which compare 2 different object.
 Q. What is autowiring in spring ?
Ans : Autowiring is a mechanism for injecting objects in Spring. By using the annotation @Autowired , you can achieve that.

Its available inside org.springframework.beans.factory.annotationpackage.

Q. We can get the container object through Bean factory and Application context what is the difference in both?
Ans : A BeanFactoryis used to just instantiates and configures beans. An ApplicationContextalso does that, andit provides the supporting infrastructure to enable lots of enterprise-specific features such as transactions and AOP. Read more on Spring Specification.

Q. What is the Difference between get() and load() in hibernate ?
Ans : These two methods are most useful method in Hibernate. Both method s are used to get/fetch the records from database. The get() method will return null , if the data not found. The load() method always returns proxy.

Q. Difference between page and page context in jsp ?
Ans : As we know both are implicit object of JSP. Page is a type java.lang.Object and it’s an instance of generated servlet from “this” JSP, but PageContext is a type of javax.servlet.jsp.PageContext. PageContext is used for storing and retrieving page-related information and sharing objects within the same translation unit and same request.

Q. What is application in jsp ?
Ans : It’s a scope. It defines the visibility for data over Application.