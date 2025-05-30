/*
Description

With the release of Java 8, Java has finally added support for "lambda functions", that is, variables that contain a 
function which can operate on data just as class methods can (well, not just as class methods can...)

Let's learn about lambdas.

Last time, we did something similar to this:
Function<MyObject, String> f = p -> p.toString();
String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString

But what if we need more than one line in our function for the calculations? The syntax to do so is to enclose the 
function's commands in curly brackets and include a return statement:
Function<MyObject, String> f = p -> {StringBuffer out = new StringBuffer();
                                     out.append(p.getName());
                                     out.append(MyObject.getStaticName());
                                     out.append("Constant message");
                                     return out.toString();
                               };
Given this POJO:
public class Triangle {
  public final int height;
  public final int base;
  private double area;
  public void setArea(double a) {
    area = a;
  }
  public double getArea() {
    return area;
  }
}

Write a function that sets the area of the given Triangle and returns the area as a double. Do not use the function 
type Function; there is a function type for converting an arbitrary class into a double, use that.

The formula for triangle area is: 1/2 * base * height

Assume valid input (base and height are both greater than 0).

A full listing of the default function types can be found at 
http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

(Aside: you may have noticed, the function type we should have used in Part 1 is Predicate, even though we used 
Function.)
*/

import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {

  public static ToDoubleFunction<Triangle> f = t -> {
    double area = 0.5 * t.base * t.height;
    t.setArea(area);
    return area;
  };
}
