Hi Team,

#Today's Uploaded
#Capgemini #Interview #Questions #and #Answers #for #Java 3-8 #Year #Experience
#Experience #Java/J2ee #interview #Questions #asked #by #Capgemini.

1. Tell me about yourself ?

Ans : Give your brief introduction.

2. Explain about your current project?

Ans : It’s quite easy to describe your projects and your key role on this project. But, be careful and get ready about the functionality when you are describing your working module / part of the project. Show your confidence that you have done the major part and you can face challenges in future.

3. How many types of literals are there in JAVA ?

Ans : The literals means the value you are assigning to variable. You can specify the below types of literal in java.As per the primitive data types(int,short,long,float,double,boolean,char ,etc there is respective literal. Some literal needs to be ended with a specific character.Read More.

long var=20L; //specify L or l for long literal
int var=20; // If not mentioned any character then its can be short or int
char var=’A’;
float var=10.44f; //specify f or F for float literal
double var=10.44;
boolean var=true; //or false


4. What is meant by Garbage collection ?

Ans : Garbage collection is a automatic feature of java for cleaning the unused object from heap. It helps to developer for releasing the reserved memory without any extra effort by developer. It helps developer to save time and extra mental tension for handling object allocation in memory. When there is no reference to an object found, it will clean that object from memory . You can run the garbage collection explicitly by using System.gc() .

5. Diffference between string s= new string (); and string s = "Hi Dude"; ?

Ans : Both statements are different to each other. Always ‘new’ keyword is used to create object.

String s=new String(); // This statement creates new object in heap. S is the object here.
String s=”Hi Dude” ; // This statement do not create object, its creating reference and its storing in String Constant Pool.S is the reference here.

6. What is singleton class? where is it used ?

Ans : View Answer

7. What is the difference between JSP and Servlets ?

Ans : As simple JSP is pre-compiled but Servlets are not. JSP is specially use for displaying/populating the data on browser. If we take an example of MVC architecture JSP plays the role of View (V). But, Servlets are used to handle the request and process the business logic. In MVC architecture Servlets are knows as Controller (C) .

8. What is the difference in using request.getRequestDispatcher() and context.getRequestDispatcher()?

Ans : Both are taking String parameter, but request.getRequestDispatcher() will dispatch the request inside the application. Where as context.getRequestDispatcher() will dispatch the request outside the context also. If you are using absolute path for dispatching then both are similar.

9. How the JSP file will be executed on the Server side ?

Ans : First its converted to java file. Then its compiled by java compiler and creates the .class file.Now once you get the .class file you can execute it. Internally a JSP converts into respective servlet.

Conversion => Compilation => Execution

 10. What is ActionServlet ?

Ans : ActionServlet provides the controller in struts application with MVC (Model-View-Controller) Model 2.
ActionServlet is a sub class of javax.servlet.http.HttpServlet.It has few methods like
doGet(),doPost(),destroy(),etc.

11. What is Struts Validator Framework ?
Ans : Struts provides a convenient way to validate. Basically we are using two xml configuration file for configuring such as Validator.xml and validation-rule.xml . validation-rule.xml defines the rule of validation like number format validation,email validation. Apart from this ActionForm having validate() method which we can implement for validating the form data.

12. What is the difference between the Session and SessionFactory in hibernate ?

Ans : Session and SessionFactory are playing a prominent role in hibernate. SessionFactory is used to create Session and its created once during starting of the application. You can have only one SessionFactory per application. SessionFactory is also called 2ndlevel cache. But, Session could be many per application. Session is being created by using SessionFactory object.Session is called 1st level cache.

13. What is HQL ?

Ans : HQL stands for Hibernate Query Language. Its fully object oriented and quite similar with SQL.It supports association and joins for effective entity relationship.