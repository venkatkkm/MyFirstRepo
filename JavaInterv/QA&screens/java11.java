Why StringBuffer Class not overriding equals and hashCode methods?

YES StringBuffer and StringBuilder classes not overriding equals()method and haschcode() method.
Before discussing about why these classes are not overriding equas() and hashcde() methods lets see the usage of overriding equals and hashcode() methods.

String class is overriding these equals() and hashcode() methods.
When we want to compare two strings we use equals method.
basically equals() method is defined in Object class and it will compares the references of two objects if those two objects reference is same then its returns true.
And if equals() methods returns true on comparing two objects then their hashcode() must be same this is the contract between equals() and hashcode().
Lets see a java program which compares two strings.

class StringEqualsDemo{

public static void main(String [] args){

String str1= new String("javatechnology");
String str2= new String("javatechnology");

System.out.println(str1.equals(str2));
System.out.println(str1==str2);

System.out.println(str1.hashCode());
System.out.println(str2.hashCode());
}
}

In the above program we compared two string using equals() method and it returns true.and comparing using == operator returns false.
Basically equal() will also return false on comparing those two strings because default functionality of equal() method is to compare references and two strings are created using new operator so both references are different.
But String class overriding equals() method and in that equals method it comparing content of the strings and returning true if both are having same content false if not.
Lets see what happen if we compare two stringBuffer objects using equals() method.

class StringBufferEqualsDemo{

public static void main(String [] args){

StringBuffer str1= new StringBuffer ("javatechnology");
StringBuffer str2= new StringBuffer ("javatechnology");

System.out.println(str1.equals(str2));
System.out.println(str1==str2);

System.out.println(str1.hashCode());
System.out.println(str2.hashCode());

}

}

If you observe above java program when we are comparing two stringBuffer objects equal() method returning false even content is same. Because StringBuffer class not overriding equals() and hashcode() methods.
StringBuilder is also not overriding equals() method? lets see a program and clarify.

class StringBuilderEqualsDemo{

public static void main(String [] args){

StringBuilder str1= new StringBuilder("Javatechnology");
StringBuilder str2= new StringBuilder("Javatechnology");

System.out.println(str1.equals(str2));
System.out.println(str1==str2);

System.out.println(str1.hashCode());
System.out.println(str2.hashCode());
}
}

So now its cleared that StringBuffer and StringBuilder classes not overriding equals() and hashCode() methods.
But Why?
Why StringBuffer and StringBuilder classes not overriding equals() method and hashcode() method where as String class is overriding these two methods.
Basically Strings are Immutable means Whenever we try to change the value of string result will be new string. So string content wont change.
StringBuffer main use is mutable means when we append a string to it it will add to existing object.
When the content changes the hashcode will changes.
Lets see a program on adding elements to hashmap.

In the above java program we tried to add two strings objects as keys to the hashtable.
Hashtable put method internally calles equals() method and if its true it wont add.

import java.util.*;

class StringDemoWithHashTable{

public static void main(String [] args){

String str1= new String("javatechnology");
String str2= new String("javatechnology");

Hashtable ht=new Hashtable();

ht.put(str1, "govind");
ht.put(str2, "java");

System.out.println(ht);
}
}

import java.util.*;

class StringBufferDemoWithHashTable{

public static void main(String [] args){

StringBuffer str1= new StringBuffer ("javatechnology");
StringBuffer str2= new StringBuffer ("javatechnology");

Hashtable ht=new Hashtable();

ht.put(str1, "govind");
ht.put(str2, "java");

System.out.println(ht);
}
}

import java.util.*;

class StringBuilderDemoWithHashTable{

public static void main(String [] args){

StringBuilder str1= new StringBuilder("javatechnology");
StringBuilder str2= new StringBuilder("javatechnology");

Hashtable ht=new Hashtable();

ht.put(str1, "govind");
ht.put(str2, "java");

System.out.println(ht);
}
}