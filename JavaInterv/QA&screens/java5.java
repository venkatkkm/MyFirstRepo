#Sapient #Interview #Questions and# Answers for #Java 2 - 6 Year #Experience
#Sapient #Interview #questions for #Java #experience #candidate - 2 -6 #years.....

Q1) Tell me about yourself!!!

Ans – Give your brief introduction with full confidence.

Q2) What are the types of class loaders in Java ?

Ans – View Answer.

Q3) How to read and write image from a file ?

Ans – By the use of ImageIO.read() and ImageIO.write() method of javax.imageio package.

Q4) What is difference between static and init block in Java ?

Ans – View Answer.

Q5) What is ConcurrentMap and how it works?

Ans – It’s a Map which providing thread safety and atomicity guarantees. For Memory consistency it works with other concurrent collections, actions in a thread prior to placing an object into a ConcurrentMap as a key or value happen-before actions subsequent to the access or removal of that object from the ConcurrentMap in another thread.

Q6) Can a static block throw exception?

Ans – Yes. We can throw checked exception.

Q7) What is difference between iterator access and index access?

Ans - Basically iterator access process the traverse operation through each element, where index access process access direct the element by using the index.

Q8) Why character array is better than string for storing password in Java?

Ans – Security !!! Because, character array stores data in encrypted format which is not readable by human. But, the string stores the data in human readable format which is not secure.

Q9) What is the difference between Serializable and Externalizable interfaces ?

Ans - Both interfaces are used for implement serialization. But, the basic
difference is Serializable interface does not have any method (it’s a
marker interface ) and Externalizable interface having 2 methods such as
readExternal() and writeExternal(). Serializable interface is the super
interface for Externalizable interface.

Q10) Which Interface is used to make duplicate of Objects ?

Ans – Cloneable interface.

Q11) What are some advantages and disadvantages of Java Sockets?

Ans – The main advantage is its flexible and very efficient during low network bandwidth. Also its helpful for debugging and some kind of testing. But, security is the most disadvantages. Its always recommended to be careful when authenticating.

Q12) When can an object reference be cast to an interface reference?

Ans –Yes its possible, when that interface is implemented by that class.

Example – MyInterface obj=new MyClass();
obj.callMethod();

Q13) How does Java allocate stack and heap Memory?

Ans – As we know stack memory is not dynamic and its follows LIFO order. Java provides similar implementation for memory allocation. Normally all local variables are created in Stack area (memory) and objects (reference types) are created in heap memory (heap area) .Even all primitive types allocated in stack memory. Heap area is dynamic and handled by JVM runtime. Heap memory is cleaned by garbage collector at runtime.

Q14) What is memory leak in Java?

Ans – Usually memory leak leads to waste of memory. In general memory leak defines the unavailability of referenced memory. It causes the Garbage collector to fail to collect that object.

Q15) Can we throw exception from finally block in Java?

Ans – Yes, but you need to mentioned “throws” on the method head.

Example –

public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
TestInterface2 interObj=new InterfaceObject();

try{
interObj.display();
}catch(Exception e){
System.out.println("Exception handled...");
}finally{
throw new Exception("This is exception");
}
}

Q16) How does Java handle integer overflows and underflows?

Ans – Yes, java handles overflows and underflows very intelligently. When it overflows it will go to MIN_VALUE (i.e. -231 ) and when it underflows to will go to MAX_VALUE (i.e. 231-1) .

Q18) What is casting?

Ans – Casting means conversion. Basically we need casting to type cast the type. There are two types of casting by java i.e. explicit casting and implicit casting.

Q19) What is new in JSP?

Ans – As per my knowledge JSP 2.1 has many new functionalities. It support resource injection via annotation. It has few extended support for java standard tag library. Also literal expression is supported by JSP 2.1 EL and many other additional features.

Q20) What do you mean by Java Reflection ?

Ans – It provides runtime access to JVM. Reflection is one of the most powerful API which help to work with classes, methods and variables dynamically at runtime. Basically it inspects the class attributes at runtime. Also we can say it provides a metadata about the class.

Q21) Why does the InputStreamReader class has a read() ?

Ans – Because, an InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset. The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted. It has two overloaded read() method . Each invocation of one of an InputStreamReader's read() methods may cause one or more bytes to be read from the underlying byte-input stream. To enable the efficient conversion of bytes to characters, more bytes may be read ahead from the underlying stream than are necessary to satisfy the current read operation.

Q22) Describe a problem you faced and how did you solve that?

Ans - You can describe any issue you faced during your project work in the organization. And what the solution you have implemented for that issue.