/*
Description

With the release of Java 8, Java has finally added support for "lambda functions", that is, variables that contain a 
function which can operate on data just as class methods can (well, not just as class methods can...)

Coming from most scripting languages (e.g., Javascript, Python, Ruby), the concept of functions that can be passed as 
variables should not be anything new. The syntax in Java should even look familiar:
Function<MyObject, String> f = p -> p.toString();
String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString
The above is a simple mapper function: given an input of type MyObject, return a specific result of type String, in 
this case the toString of the object. They can, of course, become much more complicated.

A full listing of the default function types can be found at 
http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

Given this POJO:
public class Student {
  private final String firstName;
  private final String lastName;
  public final String studentNumber;
  public String getFullName() {
    return firstName + " " + lastName;
  }
  public String getCommaName() {
    return lastName + ", " + firstName;
  }
}

Write a Function (with the appropriate types) that returns true if a given student is "John Smith" with a student 
number of "js123" (otherwise return false).
*/

import java.util.function.Function;

public class FunctionalProgramming {

  public static Function<Student, Boolean> f = student -> {
    return (
      student.getFullName().equals("John Smith") &&
      student.studentNumber.equals("js123")
    );
  };
}
