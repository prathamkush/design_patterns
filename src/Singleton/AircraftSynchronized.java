package Singleton;

public class AircraftSynchronized {

    // execute this at run time
    private static AircraftSynchronized instance;

    private AircraftSynchronized(){}

//    // LAZY INSTANTIATION - at time of object calling
//    public static synchronized AircraftSynchronized getInstance(){
//        if(instance == null){
//            instance = new AircraftSynchronized();
//        }
//        return instance;
//    }

    // Run synchronized only for the first time
    // the instance will be kept in-sync for the rest
    // of the session
    public static  AircraftSynchronized getInstance(){
        if(instance == null){
            synchronized (AircraftSynchronized.class){
                instance = new AircraftSynchronized();
            }
        }
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft");
    }
}

class client3{

    public static void main(String[] args) {
        AircraftSynchronized obj1 = AircraftSynchronized.getInstance();
        obj1.fly();
        AircraftSynchronized obj2 = AircraftSynchronized.getInstance();
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


