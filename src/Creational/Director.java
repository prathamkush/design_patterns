package Creational;

public class Director {
    AircraftBuilder airCraftBuilder;

    public Director(AircraftBuilder airCraftBuilder){
        this.airCraftBuilder = airCraftBuilder;
    }

    public void construct(boolean iPassenger)
    {
        airCraftBuilder.buildEngine();
        airCraftBuilder.buildTyres();
        airCraftBuilder.buildWings();
    }

}
