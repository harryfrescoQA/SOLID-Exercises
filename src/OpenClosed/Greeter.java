package OpenClosed;

public class Greeter {
	// Contains a greeting
	 private Greeting greeting;
	 
	 // Construct a greeter with a greeting
	 public Greeter(Greeting greeting) {
	        this.greeting = greeting;
	 }
	 
	 // Method greet() returns the greeting
	 public String greet() {
	        return this.greeting.greet();
	 }

	 
	// Getter and Setter
	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	 
	 
	
	 
}
