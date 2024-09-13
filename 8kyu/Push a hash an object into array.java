/*
Description

You are trying to put a hash in ruby or an object in javascript or java into an array, but it always returns error, 
solve it and keep it as simple as possible!
*/

import java.util.ArrayList;
import java.util.List;

public class PushAnObjectIntoArray {

  public static List<String> push() {
    List<String> items = new ArrayList<>();
    items.add("an object");
    return items;
  }
}
