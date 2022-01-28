public class Flour extends BakingDecoretor{
	
public Flour(Baking baking) {
this.baking=baking;
}

public String getDescription(){
return baking.getDescription()+"Flour";
}

public double cost() {
	return baking.cost();
}

}