package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	
	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float hairPerc, double maintenanceCost, double dangerPerc){
		
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(hairPerc);
	}
	
	public Monkey (){
	    this(new Integer(2),"monkey",37,0.75f,5,0.15);	
	}
	
    public double getPredisposition(){
		
		DateAndTime time = new DateAndTime();

		if (time.getMonth()==6&&time.getHour()>=12&&time.getHour()<14){//july from 12-14
			                                                           //say it gets vrazy due to the heat
			return 0.05;
		}
		else{
			return 0;
		}
	}	

}
