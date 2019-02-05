import java.util.Random;

public class Mod4Test {
public static void main(String[] args) {
	Cake[] cakes = new Cake[20];
	Random r = new Random();
	for(int i = 0; i < 20; i++) {
		cakes[i] = new orderCake("name",r.nextDouble(),r.nextInt(7));
	}
}
}
