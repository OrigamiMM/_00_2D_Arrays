 public abstract class Cake { 
            protected String name; 
            protected double rate; 
            public Cake (String n, double r) { 
                name = n; 
                rate = r; 
            } 
            
            public abstract double calcPrice(); 
            
            public abstract boolean isReady();
            
            public String toString() {
                return name; 
                //+ "\t" + rate;
            } 
        }
 
 class orderCake extends Cake {
	private double weight;
	public orderCake(String n, double r, int weight) {
		super(n,r);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	public boolean isReady() {
		return false;
	}
	
	public double calcPrice() {
	return rate * weight;
	}
	
 }
 
 class readyMadeCake extends Cake {
	private double quanitiy;
	public readyMadeCake(String n, double r, int quanit) {
		super(n, r);
		this.quanitiy = quanit;
		// TODO Auto-generated constructor stub
	}
	
	public boolean isReady() {
		return true;
	}
	
	 public double calcPrice() {
		 return rate * quanitiy; 
	 }
 }