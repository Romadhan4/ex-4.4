import java.util.Scanner;
public class Watermelon extends Fruit  {
	private String color;
	private double weight,price ;
	Scanner scan = new Scanner (System.in);
	public Watermelon(String name, String color, String string) {
		  super(name, color, string);
		  this.color = color ;
		  this.weight = weight;
	    System.out.println("Watermelon constructor is invoked");
	    
	    buying ();
	}
	    //method
	    public void buying () {
	    	System.out.println ("-----------Buying-------------");
	    		System.out.println ("Enter weight you want to buy");
	    		weight = scan.nextDouble ();
	    		
	    		if (weight > 0) {
	    			
					String priceCal;
					if (weight <5) {
						
	    				price = 3.5;
	    				priceCal ();
	    				System.out.println ("Price "+ priceCal);
	    			}
	    			else if  (weight > 5) {
	    				price = 3.0 ;
	    				double weight = this.weight;
	    				priceCal ();
	    				System.out.println ("Price"+ priceCal);
	    			
	    		}
	    		
	    		public String toString (){
	    			return ("Fruit : " getName() + "Color :"+ color);
	    		}
	    public double priceCal () {
	    	return this.price * this.weight;
	    	
	    }
	    public double getWeight () {
	    	return this.weight;
	    
	    
	  }
}
