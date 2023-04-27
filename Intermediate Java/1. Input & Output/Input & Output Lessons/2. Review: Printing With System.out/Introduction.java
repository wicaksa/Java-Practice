public class Introduction {
    public static void main(String[] args) {
  
        // // Format Specifiers
        // String world = "World";
        // int day = 1;
        // System.out.printf("Hello %s! Today is Day: %d of your Intermediate Java course!", world, day);

        // // New Line
        // System.out.print("\nName: Will\nAge: 35\nBirthplace: Cincinati");
        
        /*
        * 1. Before we can print our variables, we need variables to print! In the code editor declare the following variables:
            - a String name that’s set to your name
            - a String hobbies that contains a list of your hobbies
            - an int age that contains your age
        */
        String name = "Wicaksa";
        String hobbies = "Coding, Reading, Eating";
        int age = 30;

        // 2. Use System.out.println() to print your name in the following format: "My name is ___".
        System.out.println("My name is " + name);

        // 3. Use System.out.printf() to print your age in the following format: "I am __ years old".
        System.out.printf("I am %d years old\n", age);

        // 4. Use System.out.print() to print your hobbies using the following format: "My hobbies are ______".
        System.out.print("My hobbies are " + hobbies);
        
        /* 
        5.  Hmm… Notice anything strange about the output? 
            It looks like we need to add a new line character in order to get our text to format properly for the user.

            Go back to your .printf() statement and add \n to the end of the string.
        */
    }
  }
  