

public class Greeter //public means this class is visible to all other classes.
{
    void greet() //this is a method (also called a function in other languages)
    { 
        System.out.println("Hi there");
    }
    public static void main(String[] args) 
    {
        (new Greeter()).greet(); /* also could be:  Greeter g = new Greeter(); // Create object
                                                    g.greet();// Call method */
    }

}

/*a class is like a blueprint — it defines behavior or properties but doesn't run on its own 
until an object is created from it.*/

/*belongs to the class, not an object (so Java can run it without first creating an object). */