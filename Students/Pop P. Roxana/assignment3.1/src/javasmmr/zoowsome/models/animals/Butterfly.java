package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Butterfly() {
		this(new Integer(16), "butterfly",true, false);
	}

}

