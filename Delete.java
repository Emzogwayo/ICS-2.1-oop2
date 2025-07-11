public class Delete implements DataSource {

    @Override
    public void execute() {
        System.out.println("Data has been deleted.");
    }
}

//These class shows polymorphism: the same method name (execute) does different things depending on which object is passed.