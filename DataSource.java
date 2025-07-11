public interface DataSource {
    void execute();
}

//An interface is like a contract: Any class that implements DataSource must define the execute() method.

//Used to implement polymorphism — different classes can do different things with the same method name.