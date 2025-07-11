public class View implements DataSource {

    @Override
    public void execute() {
        System.out.println("Some data to be displayed.");
    }
}

//This class shows polymorphism: the same method name (execute) does different things depending on which object is passed.