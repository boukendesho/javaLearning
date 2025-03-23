import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random random = new Random();

//		int number = random.nextInt(1, 6);
		int number = random.nextInt(5);
//		Boolean bool = random.nextBoolean();
		double decimal = random.nextDouble();

		boolean bool = random.nextBoolean();

		System.out.println(number);
		System.out.println(bool);
		System.out.printf("%.2f", decimal);
	}

}
