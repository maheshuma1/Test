public class Bakery {

	public static void main(String[] args) {
	Baking baking=new Cookie();
	Baking flourCookie=new Flour(baking);
	System.out.println(flourCookie.getDescription()+"$"+flourCookie.cost());
	}

}