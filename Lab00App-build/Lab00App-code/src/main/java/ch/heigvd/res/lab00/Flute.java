package ch.heigvd.res.lab00;

/**
 *
 * @author jeanayoub
 */
public class Flute implements IInstrument {
    
    public String play() {
        return "trilili";
    }
    
    public int getSoundVolume() {
        return 2;
    }
    
    public String getColor() {
        return "silver";
    }
}
