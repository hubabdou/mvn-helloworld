package com.xavki;
public class HelloWorld {
  public static void main(String[] args) {
    HelloWorld myWorld = new HelloWorld();
    String said = myWorld.sayHelloTo("Abdou");
    System.out.println(said);
    }
  public String sayHelloTo(String to) {
    return "Hello "+to+"!";
    }
}
