public class Intro {

    // Increasing the number of variables
    // increases the number of constructors

    private String fname;
    private String age;

    public Intro(String fname) {
        this.fname = fname;
    }

    public Intro(String fname, String age){
        this.fname = fname;
        this.age = age;
    }

}

//  Suggestions
//  1. Parts of code are separated based on the code that may vary and the code remains same.
//  2. Always try to have interface implementations rather than a concrete implementation.


//  Types of Patterns
//  1.  Creational  ->  Encapsulation of object creation eg : [Builder, Prototype, Singleton, Abstract Factory]
//  2.  Structureal ->  Composition of Classes eg : [Adaptive, Bridge, Composite, Decorator, Facade, etc...]
//  3.  Behaviour  ->