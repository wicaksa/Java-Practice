# The Scanner Class

Just like System, the Scanner class is predefined and built into Java for your use. It’s used to read user input in a Java program. When we declare a scanner we need to tell it what type of input we are going to be scanning, this gets passed into the constructor we initialize it.

For this exercise, we will build a program that walks us through writing code that uses the Scanner class together with the input from the console, which we get from System.in. The Scanner class comes with Java in the package java.util, therefore before we can use the Scanner class in our own code we must import it from that package, which you can do using the following:

```java
import java.util.Scanner;
```

Now that we have access to the Scanner class, let’s begin by declaring the Scanner class as an instance variable that we will call input: 

```java
Scanner input = new Scanner(System.in);
```

Notice how we have placed System.in within the brackets in our declaration. This is what will allow our program to read user input from the console. Similar to how the out property of System was a PrintStream, the in property is an instance of an InputStream.