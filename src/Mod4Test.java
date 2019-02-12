import java.util.Random;

public class Mod4Test {
public static void main(String[] args) {
	double totalPrice = 0;
	double highestPrice = 0;
	int highestArray = 0;
	int totalReady = 0;
	String in = "enter some words";
	String out = "";
	double totalReadyPrice = 0;
	Cake[] cakes = new Cake[20];
	Random r = new Random();
	
	
	
	for(int i = 0; i < 20; i++) {
		int type = r.nextInt(2);
		if(type == 1) {
		cakes[i] = new orderCake("Cake " + i,r.nextDouble(),r.nextInt(8));
		}else {
		cakes[i] = new readyMadeCake("Cake " + i,r.nextDouble(),r.nextInt(4));
		}
	}
	
	for (int i = 0; i < cakes.length; i++) {
		totalPrice += cakes[i].calcPrice();
		if(cakes[i].isReady() == true) {
			totalReady ++;
			totalReadyPrice += cakes[i].calcPrice();
		}
		if(cakes[i].calcPrice() > highestPrice) {
			highestPrice = cakes[i].calcPrice();
			highestArray = i;
		}
	}
	
	System.out.println("The total price is: $" + totalPrice);
	System.out.println("There were a total of "+ totalReady + " ready made cakes that cost a total of $" + totalReadyPrice);
	System.out.println(cakes[highestArray] + " is the most expensive with a total cost of $" + cakes[highestArray].calcPrice());

	System.out.println("A comment looks like this:\n\\*comment here*\\");
	
	
}
}
