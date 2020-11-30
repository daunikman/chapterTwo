import java.util.Scanner;
public class AirConditionerTest{

    public static void main(String... args){

    System.out.println("Enter the name of AC: ");
    Scanner scanner = new Scanner(System.in);

    AirConditioner ac = new AirConditioner(scanner.nextLine());

    System.out.println("AcOn is: "+ ac.isOn());


    ac.toggleIsOn();

    System.out.println("AcOn is: "+ ac.isOn());


    ac.toggleIsOn();

    System.out.println("AcOn is: "+ ac.isOn());


    ac.increaseTemperature();

    System.out.println("Ac temperature is: "+ ac.getTemperature());


ac.toggleIsOn();

System.out.println("Ac temperature is: "+ ac.getTemperature());

ac.decreaseTemperature();
ac.decreaseTemperature();


System.out.println("Ac temperature is: "+ ac.getTemperature());

ac.setTemperature(35);
ac.setTemperature(13);


System.out.println("Ac temperature is: "+ ac.getTemperature());

ac.setTemperature(28);


System.out.println("Ac temperature is: "+ ac.getTemperature());

ac.increaseTemperature();
ac.increaseTemperature();
ac.increaseTemperature();

System.out.println("Ac temperature is: "+ ac.getTemperature());


  ac.toggleIsOn();

    System.out.println("AcOn is: "+ ac.isOn());













    


    }








}
