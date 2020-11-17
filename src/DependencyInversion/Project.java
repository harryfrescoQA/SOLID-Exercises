package DependencyInversion;

public class Project {
	private BackendDeveloper back = new BackendDeveloper();
    private FrontendDeveloper front = new FrontendDeveloper();

    public void implement() {
        back.develop();
        front.develop();
    }
}
