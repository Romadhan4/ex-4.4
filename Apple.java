import java.util.Scanner ;
public class Apple extends Fruit {
		
		// TODO Auto-generated constructor stub
	Scanner scan = new Scanner (System.in);
		protected String taste;
	    protected double price = 5.00 ;
	    protected String skin ;
	    private double weight ;
	    private double amount ;
	    
	    //parameter
	    public Apple(String name, String taste, String weight) {
	    super(name, taste, weight);
	    this.taste = taste ;
	    this.weight = weight;
	    System.out.println ("Apple constructor is invoked");
}
	    //method
	    public void buying (double price) {
	    	System.out.println ("Enter amount");
	    	amount = scan.nextDouble();
	    	
	    }
	    public String toString () {
	    	return ("Fruit :"+ getName ()+ "taste"+ taste +"weight"+weight);
	    }
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}
		public double priceCal () {
			return this.price * this.amount;
		}
	    }