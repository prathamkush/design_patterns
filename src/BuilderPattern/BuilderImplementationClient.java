package BuilderPattern;

class Aircraft{
    // Required Parameters
    // 1. Engine
    // 2. Wheels

    private String engine;
    private int wheel;

    // Optional Parameters
    // 3. FoodService
    private boolean food;


    public Aircraft(AircraftBuilder aircraftBuilder){
        this.engine = aircraftBuilder.engine;
        this.wheel = aircraftBuilder.wheel;
        this.food = aircraftBuilder.food;
    }


    public String getEngine(){
        return engine;
    }

    public int getWheel(){
        return wheel;
    }

    public boolean isFood(){
        return food;
    }

    public String toString(){
        return "Engine: "+this.getEngine()+","+
                " Wheels: "+this.getWheel()+","+
                (this.isFood() ? " Food Available": " Food NOT Available");
    }

    public static class AircraftBuilder {

        private String engine;
        private int wheel;
        private boolean food;

        public AircraftBuilder(String engine, int wheel){
            this.engine = engine;
            this.wheel = wheel;
        }

        public AircraftBuilder setFood(boolean food){
            this.food = food;
            return this;
        }

        public Aircraft build(){
            return new Aircraft(this);
        }

    }

}

public class BuilderImplementationClient{
    public static void main(String[] args) {
        Aircraft boeing = new Aircraft.AircraftBuilder("Twin Engine", 8).setFood(true).build();
        System.out.println(boeing);

        Aircraft F16 = new Aircraft.AircraftBuilder("Single Engine",4).build();
        System.out.println(F16);

        Aircraft AirbusA380 = new Aircraft.AircraftBuilder("Quad Engine", 12).setFood(true).build();
        System.out.println(AirbusA380);

    }
}
