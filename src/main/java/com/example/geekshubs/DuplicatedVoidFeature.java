package com.example.geekshubs;

public class DuplicatedVoidFeature {

  public void nothingToDo() {
    System.out.println("Where is the wifi??");
    System.out.println("Where is the wifi??");
    System.out.println("Where is the wifi??");
    System.out.println("Where is the wifi??");
    System.out.println("Where is the wifi??");
    System.out.println("Where is the wifi??");
    System.out.println("Where is the wifi??");
  }


  public void infinteLoop() {
    
    boolean alwaysTrue = true;

    if (alwaysTrue) {
      System.out.println("This method is always exectued");
    } else {
      System.out.println("Not reachable");
    }

  }

}
