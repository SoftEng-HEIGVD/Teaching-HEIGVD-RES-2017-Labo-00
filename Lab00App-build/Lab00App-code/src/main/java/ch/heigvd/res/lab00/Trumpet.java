package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

	public String play() {
		return "pouet";
	}

	public int getSoundVolume() {
		return 200;
	}

	public String getColor() {
		return "golden";
	}
}