





public class Human {

	String name;
	String fname;
	int age;
	double weight;
eatDrink faveeatdrink;
	

	Human(String name,String fname,int age,double weight){
		
		this.name = name;
		this.fname=fname;
		this.age = age;
		this.weight = weight;
	}
void HumanInfo(){
System.out.println("Your first name is : "+this.name);
System.out.println("Your family name is : "+this.fname);
System.out.println("Your age is : "+this.age);
System.out.println("Your weight is : "+this.weight);

}

void favorite(String favEat,String favDrink){
this.faveeatdrink=new eatDrink(favEat, favDrink);
}
void eat() {
	System.out.println(this.name+" "+this.fname+"  loves eating "+this.faveeatdrink.favEat);
}
void drink() {
	System.out.println(this.name+" "+this.fname+"  loves drinking "+this.faveeatdrink.favDrink);
}
 class eatDrink{
	String favEat;
	String favDrink;


        public eatDrink(String favEat, String favDrink) {
            this.favEat = favEat;
            this.favDrink = favDrink;
        }

	
    }
	
	
		
}
class  Car {
String model;
String color;
int year;

Car(String model,String color,int year){

this.model=model;
this.color=color;
this.year=year;

}
void DisplayCar(){
System.out.println("Car Model is :"+this.model);
System.out.println("Car color is :"+this.color);
System.out.println("Car year is :"+this.year);

}
	}
    




