Java Multiple Interface Implementation Example
This project contains a Java program that demonstrates how a class can implement multiple interfaces. Each interface declares a method, and the implementing class provides the specific behavior.

Code Explanation
Three interfaces are defined:

readable with method read()

writeable with method write()

storeable with method store()

The file class implements all three interfaces and provides concrete implementations for each method with simple print statements.

The main class day8 creates an instance of the file class and calls the three interface methods to demonstrate how multiple behaviors can be combined into a single class.

How to Run
Save the complete code in a file named day8.java.

Compile the code using the Java compiler:

bash
javac day8.java
Run the program:

bash
java day8
Expected Output
text
you can read the data
you can write the data
you can store the data
Why Use Multiple Interfaces?
Allows a class to inherit behavior contracts from multiple sources.

Supports multiple inheritance-like features safely (Java does not allow extending multiple classes).

Helps in organizing code by segregating related functionalities into multiple interfaces.

Promotes flexibility and modular design.

How to Add this README to Your GitHub Repository
Open your repository on GitHub.

Click Add file > Create new file.

Name the file README.md.

Paste this content into the editor.

Commit the new file with a descriptive commit message.
