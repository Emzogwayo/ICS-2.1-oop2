public abstract class Account {

    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute(); // Composition: Account "has-a" DataSource
    }
    /*Could be:
    public void performOperation(DataSource _myData){
    _myData.execute();
    } */
}
//Abstract class: You cannot create an object from this class directly. It’s meant to be a base or template for other classes (like Admin and User).

//protected: id and name can be accessed in subclasses (Admin, User).

//private: myData is only accessible within Account.

//performOperation(DataSource _myData) → It takes one argument called _myData that must follow the DataSource interface (meaning it must have an execute() method).

//myData = _myData;
//This line saves the task you passed in (like new Update() or new View()) into the class's private variable myData.
//That means the Account object now "remembers" what task it's doing.

//myData.execute();
//This runs the execute() method from the object you passed in.
//For example:
//If you passed in new Update(), it prints: "Data has been Updated Successfully!"
//If you passed in new View(), it prints: "Some data to be displayed."