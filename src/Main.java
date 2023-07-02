// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Inheritance.Car;
import exception.invalidCarDoorsException;
import exception.invalidCarTypeException;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //   for (int i = 1; i <= 5; i++) {

        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        //  System.out.println("i = " + i);

        //Here are objects of class "Car" from the first task.
        // as the class was copied from previous homeworks, I've copied objects and everything else too.
        Car car = new Car("Orange", "sedan", "USA", "SomeBrand", 4);
        Car car1 = new Car("White", "minivan", "Europe", "SomeOtherBrand", 5);
        Car car2 = new Car("AppleGreen", "coupe", "USA", "SomeBrand", 2);
        Car car3 = new Car("Orange", "minivan", "USA", "ThirdBrand", 6);

        // Here are objects for the exceptions:

        Car car4 = new Car("O", null, "US", "ThirdBrand", 10);
        Car car5 = new Car("fretertertertertertertdfb345366u6huyureturtyeby4543564456",
                "SomeType", "1", "", 20);


        car4.setCarBrand("54645645ytuytutyyutyueyeryeye");
        car5.setCarDoors(0);
        car5.setCarOrigin(null);

        // I suppose this is how work with exceptions for the task 2 should look like:

        Car car23 = new Car(null, "minivan", "US", null, 100);
        Car car726 = new Car("someNewCoolColor",
                "sedan", "Germany", "SomeGermanBrand", 1);

        try {
            car23.setCarType = null;
        } catch (invalidCarTypeException ignored) {
            System.out.println("Here we ignored an exception");
        }
        try {
            car726.setCarType = "1";

        } catch (invalidCarDoorsException e) {
            System.out.println("Here we didn't  ignored an exception");
        }
//Here are actions for objects with exceptions:
        System.out.println(car4.getCarColor());
        System.out.println(car5.getCarBrand());
        System.out.println(car23.getCarColor());
        System.out.println(car23.getCarDoors());
//Here are actions for objects with exceptions:
        System.out.println(car4.equals(car23));
        System.out.println(car726.equals(car23));


    }
}








    //Here are some methods from previous homework, which I've left in a comment for the case.
      /*  System.out.println(car.getCarColor());
        System.out.println(car1.getCarColor());

        System.out.println(car == car1);
        System.out.println(car.equals(car1));
        System.out.println(car.equals(car2));
        System.out.println(car.equals(car3));
        */

        //Here are actions for objects with exceptions:
     // System.out.println(car.equals(car4));
     //   System.out.println(car.equals(car5));

       // System.out.println(car);
      //  System.out.println(car1);
      //  System.out.println(car2);
      //  System.out.println(car3);
//}



