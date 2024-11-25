import java.util.Scanner;

public class mainconstructor {
    public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Entre first name :");
			String name=sc.nextLine();

			System.out.println("Entre family name :");
			String fname=sc.nextLine();

			System.out.println("Entre your age :");
			int age=sc.nextInt();

			System.out.println("Entre your weight :");
			double weight=sc.nextDouble();
			sc.nextLine();
			System.out.println("Entre fav eat :");
			String eat=sc.nextLine();
			System.out.println("Entre fav drink :");
			String drink=sc.nextLine();


System.out.println("Entre car model :");
String model=sc.nextLine();
System.out.println("Entre car color :");
String color=sc.nextLine();
System.out.println("Entre car year :");
int year=sc.nextInt();

Human human1 = new Human(name,fname,age,weight);

human1.HumanInfo();
human1.favorite(eat, drink);
human1.drink();
human1.eat();


		Car car1=new Car(model,color,year);
		car1.DisplayCar();
}
}