import java.util.Scanner;
public class JavaChatbot {
	
public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        String input;

	        System.out.println("🤖 Java ChatBot: Hello! Ask me about Java.");
	        System.out.println("Type 'exit' to stop.\n");

	        while (true) {

	            System.out.print("You: ");
	            input = sc.nextLine().toLowerCase();

	            if (input.equals("exit")) {
	                System.out.println("🤖 ChatBot: Goodbye!");
	                break;
	            }

	            // Java basics
	            if (input.contains("java")) {
	                System.out.println("ChatBot: Java is a programming language.");
	            }

	            else if (input.contains("who developed java")) {
	                System.out.println("ChatBot: Java was developed by James Gosling.");
	            }

	            else if (input.contains("features of java")) {
	                System.out.println("ChatBot: Java is object-oriented, platform independent, secure, and robust.");
	            }

	            else if (input.contains("oop")) {
	                System.out.println("ChatBot: OOP means Object-Oriented Programming.");
	            }

	            else if (input.contains("class")) {
	                System.out.println("ChatBot: A class is a blueprint for creating objects.");
	            }

	            else if (input.contains("object")) {
	                System.out.println("ChatBot: An object is an instance of a class.");
	            }

	            else if (input.contains("inheritance")) {
	                System.out.println("ChatBot: Inheritance allows one class to use properties of another.");
	            }

	            else if (input.contains("polymorphism")) {
	                System.out.println("ChatBot: Polymorphism means one method with different forms.");
	            }

	            else if (input.contains("encapsulation")) {
	                System.out.println("ChatBot: Encapsulation means binding data and methods together.");
	            }

	            else if (input.contains("abstraction")) {
	                System.out.println("ChatBot: Abstraction hides implementation details.");
	            }

	            else if (input.contains("jvm")) {
	                System.out.println("ChatBot: JVM stands for Java Virtual Machine.");
	            }

	            else if (input.contains("jre")) {
	                System.out.println("ChatBot: JRE stands for Java Runtime Environment.");
	            }

	            else if (input.contains("jdk")) {
	                System.out.println("ChatBot: JDK stands for Java Development Kit.");
	            }

	            else if (input.contains("array")) {
	                System.out.println("ChatBot: An array stores multiple values in one variable.");
	            }

	            else if (input.contains("string")) {
	                System.out.println("ChatBot: String is used to store text.");
	            }

	            else if (input.contains("loop")) {
	                System.out.println("ChatBot: Loops are used to repeat tasks (for, while, do-while).");
	            }

	            else if (input.contains("exception")) {
	                System.out.println("ChatBot: Exception is an error that occurs during program execution.");
	            }

	            else if (input.contains("thread")) {
	                System.out.println("ChatBot: Thread is used for multitasking in Java.");
	            }

	            else if (input.contains("interface")) {
	                System.out.println("ChatBot: Interface contains abstract methods.");
	            }

	            else if (input.contains("package")) {
	                System.out.println("ChatBot: Package is used to organize classes.");
	            }

	            else {
	                System.out.println("ChatBot: Sorry, I know only Java-related questions.");
	            }
	        }

	        sc.close();
	    }
	}


