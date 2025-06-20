public class immutable {

    public static void main(String[] args) {
        // Demonstrating immutability
        String str1 = "Hello";
        System.out.println("Original String: " + str1);

        // Attempting to modify str1
        String str2 = str1.concat(" World");
        System.out.println("After concat, Original String: " + str1); // Remains unchanged
        System.out.println("New String after concat: " + str2); // A new object is created

        // Demonstrating string interning
        String s1 = "Java"; // Created in the String Pool
        String s2 = "Java"; // Points to the same object in the String Pool
        String s3 = new String("Java"); // Creates a new object in the heap

        // Comparing string references
        System.out.println("\ns1 == s2: " + (s1 == s2)); // True, both refer to the same object
        System.out.println("s1 == s3: " + (s1 == s3)); // False, s3 is a new object in the heap

        // Interning s3 explicitly
        String s4 = s3.intern();
        System.out.println("s1 == s4: " + (s1 == s4)); // True, s4 now points to the String Pool
    }
}
/*Immutability:

Once a String object is created, its value cannot be changed.
Any modification to a string creates a new object rather than modifying the original string.
String Interning:

String literals in Java are automatically interned.
The JVM maintains a String Pool to optimize memory usage.
Strings with the same value (created as literals) point to the same object in the String Pool.


Here’s a Java program to explain immutability and string interning in strings:

Code Explanation
Immutability:

Once a String object is created, its value cannot be changed.
Any modification to a string creates a new object rather than modifying the original string.
String Interning:

String literals in Java are automatically interned.
The JVM maintains a String Pool to optimize memory usage.
Strings with the same value (created as literals) point to the same object in the String Pool.
Java Code:
java
Copy code
public class StringImmutabilityInterning {

    public static void main(String[] args) {
        // Demonstrating immutability
        String str1 = "Hello";
        System.out.println("Original String: " + str1);

        // Attempting to modify str1
        String str2 = str1.concat(" World");
        System.out.println("After concat, Original String: " + str1); // Remains unchanged
        System.out.println("New String after concat: " + str2); // A new object is created

        // Demonstrating string interning
        String s1 = "Java"; // Created in the String Pool
        String s2 = "Java"; // Points to the same object in the String Pool
        String s3 = new String("Java"); // Creates a new object in the heap

        // Comparing string references
        System.out.println("\ns1 == s2: " + (s1 == s2)); // True, both refer to the same object
        System.out.println("s1 == s3: " + (s1 == s3)); // False, s3 is a new object in the heap

        // Interning s3 explicitly
        String s4 = s3.intern();
        System.out.println("s1 == s4: " + (s1 == s4)); // True, s4 now points to the String Pool
    }
}
Output
Explanation of the output:
Immutability:

When str1.concat(" World") is called, a new string (str2) is created. The original string str1 remains unchanged.

String Interning:

s1 and s2 refer to the same object in the String Pool, so s1 == s2 is true.
s3 is created with new String(), so it refers to a different object in the heap.
When s3.intern() is called, s4 points to the interned version of the string in the String Pool, making s1 == s4 true.

Immutability:
Strings are immutable, ensuring thread safety and consistent behavior.
String Pool and Interning:
String literals are automatically interned.
Explicit interning with .intern() allows heap strings to use the pool for memory optimization. 
*/