
public class GreenApple extends Apple {
	private String color,taste ;
	private double weight,price ;
	public GreenApple (String name, String color,double weight,String taste) {
		 super (name,color,taste);
		 this.weight = weight ;
		 this.color=color ;
		 
		 System.out.println("Green Apple is involved");
		 
		 super.buying(5);
	 }
	public String toString () {
		return ("Fruit:"+getName()+"Taste"+taste+"color"+color);
	}

		 
}
