
public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
			Circle circle= new Circle() ;
			circle. setRadius (10);
			Circular circular =new Circular ();
			System. out. println ("Reference to circle:"+circle);
			System. out. println ("Reference to the bottom of a cone:"+ circular. bottom);
			circular. setHeight(5);
			circular. setBottom(circle);
			System. out. println("Reference to circle:"+circle);
			System. out. println("Reference to the bottom of a cone:"+circular.bottom);
			System. out. println("The  volume  of a cone£º"+circular. getVolme ());
			System. out. println("Modify the radius of the circle,and the radius of the bottom also changes");
			circle. setRadius (20);
			System. out. println("The radius of the bottom:"+circular. getBottomRadius());
			System. out. println ("Recreating the circle will change the reference to the circle");
			circle = new Circle (); //Recreating a circle
			System. out. println("Reference to circle:"+circle);
			System. out. println ("But it does not affect the reference to the bottom of the circular");
			System. out. println ("Reference to the bottom of a cone:"+circular.bottom) ;
		
		
		
	
	}

}
