public class Update implements DataSource {

    @Override
    public void execute() {
        System.out.println("Data has been Updated Successfully!");
    }
}

//This class shows polymorphism: the same method name (execute) does different things depending on which object is passed.