package Singleton;

public class AircraftLazy {

    // 1.   So that instance created at load time
    // 2.   private member -> No outside class can access it to create instance
    // 3.   static -> Inside AircraftEager class you don't want any kind of
    //                new instance be loaded


    // for load time execution
    // private static AircraftEager instance = new AircraftEager();

    // execute this at run time
    private static AircraftLazy instance;

    private AircraftLazy(){}

    // LAZY INSTANTIATION - at time of object calling
    public static AircraftLazy getInstance(){
        if(instance == null){
            instance = new AircraftLazy();
        }
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft");
    }
}

class client1{
    public static void main(String[] args) {
        AircraftEager obj1 = AircraftEager.getInstance();
        obj1.fly();
        AircraftEager obj2 = AircraftEager.getInstance();
        obj2.fly();
    }


}


// Gmail Sessions() -> Example of Singleton Creational Design pattern
// From login, if we havent logged out:
// that instance is saved in cache:
// Gamil aliceUser = new Gmail(); <- this instance doesnt close
// untill session is expired or after logout (session time is saved in memory)
// and whenever I try a new instance would be created, it tries
// to access the old instance

// Gmail bobUser = new Gmail()
// Cache -> Stores Username, debit card details


