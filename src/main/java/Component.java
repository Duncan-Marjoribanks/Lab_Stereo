public abstract class Component{

    private String make;
    private String model;

    public Component(){
        this.make = make;
        this.model = model;
    }

    public String hasMake(){
        return this.make;
    }

    public String hasModel(){
        return this.model;
    }
}
