public class Radio extends Component implements IConnect {


    public Radio(String make, String model){
    super(make, model);
    }

    public String tune(String station){
        return "Tuned to " + station;
    }

    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
