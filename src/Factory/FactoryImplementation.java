package Factory;

abstract class Aircraft {

    public abstract int getEngine();

    public String toString(){
        return "Engine:"+this.getEngine();
    }

}


class F16 extends Aircraft{
    int engine;

    F16(int engine){
        this.engine = engine;
    }

    @Override
    public int getEngine() {
        return engine;
    }
}

class BoeingNew extends Aircraft{
    int engine;

    BoeingNew(int engine){
        this.engine = engine;
    }

    @Override
    public int getEngine() {
        return engine;
    }
}

class Cesna extends Aircraft{
    int engine;

    Cesna(int engine){
        this.engine = engine;
    }

    @Override
    public int getEngine() {
        return engine;
    }
}

class AircraftFactory{
    public static Aircraft getInstance(String type, int engine){
        if(type=="Boeing"){
            return new BoeingNew(engine);  //change made here for Boeing Class
        } else if (type=="F16") {
            return new F16(engine);
        } else if (type=="Cesna") {
            return new Cesna(engine);
        }
        return null;
    }
}


public class FactoryImplementation{
    public static void main(String[] args) {
        // here boeing remains same
        Aircraft boeing = AircraftFactory.getInstance("Boeing",2);
        System.out.println(boeing);

        Aircraft cesna = AircraftFactory.getInstance("Cesna",1);
        System.out.println(cesna);

        Aircraft f16 = AircraftFactory.getInstance("F16",3);
        System.out.println(f16);
    }
}


// Class
// Blue yonder

// Subclass
// 1. CommerceNew
// 2. Logistics
// 3. Warehouse

// So between this create a Factory Class (Luminate Platform eg)
// Factor Class BlueYonderFactory
// Change from Commerce -> CommerceNew

// Implementations -> Client classes
// OMS {commerce, logistics, warehouse}
// OFS {commerce, losgistics}
// TMS {warehouse, logistics}

// Changes made in subclasses will not affect the client classes
// since we have to make change in only Factory class
















