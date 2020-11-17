package DependencyInversion;

public class BackendDeveloper implements Developer{
	public void writeJava() {
        System.out.println("C# is just Microsoft Java anyway.");
    }

	@Override
	public void develop() {
		writeJava();
		
	}
}
