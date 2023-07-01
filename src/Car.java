package Inheritance;
//Here is a class "Car" from the first task.
// as the class was copied from previous homeworks, I've copied objects and everything else too.

import exception.invalidCarColorException;
import exception.invalidCarTypeException;
import exception.invalidCarOriginException;
import exception.invalidCarBrandException;
import exception.invalidCarDoorsException;

public class Car {
    //Here is a class "Car"
    private String carColor;
    private String carType;
    private String carOrigin;
    private String carBrand;
    private int carDoors;

    public Car (String carColor, String carType, String carOrigin, String carBrand, int carDoors) {
        this.carColor = carColor;
        this.carType = carType;
        this.carOrigin = carOrigin;
        this.carBrand = carBrand;
        this.carDoors = carDoors;

        //  Car.someSound();
    }
    public String getCarColor (){
        return carColor;
    }
    public String getCarType (){
        return carType;
    }
    public String getCarOrigin (){
        return carOrigin;
    }
    public String getCarBrand (){
        return carBrand;
    }

    public int getCarDoors (){
        return carDoors;
    }

    public void setCarColor(String carColor) {
        if (carColor == null){
            throw new invalidCarColorException("Car's color should be defined");
        }else if (carColor.length() >50 ) {
            throw new invalidCarBrandException("Input should be less than 50 symbols.");
        }else if (carColor.length() <3 ) {
            throw new invalidCarBrandException("Input should be more than 3 symbols.");
        }
              this.carColor = carColor;
    }
    public void setCarType (String carType)  {
        if (carType == null){
            throw new invalidCarTypeException("Car's type should be defined");
    }else if (carType.length() >50 ) {
            throw new invalidCarBrandException("Input should be less than 50 symbols.");
        }else if (carType.length() <3 ) {
            throw new invalidCarBrandException("Input should be more than 3 symbols.");
        }
            this.carType = carType;
    }

    public void setCarOrigin (String carOrigin)  {
        if (carOrigin == null){
            throw new invalidCarOriginException("Car's origin should be defined");
        }else if (carOrigin.length() >50 ) {
            throw new invalidCarBrandException("Input should be less than 50 symbols.");
        }else if (carOrigin.length() <3 ) {
            throw new invalidCarBrandException("Input should be more than 3 symbols.");
        }

        this.carOrigin = carOrigin;
    }
    public void setCarBrand (String carBrand){
        if (carBrand == null){
            throw new invalidCarBrandException ("Car's brand should be defined");
        }else if (carBrand.length() >50 ) {
            throw new invalidCarBrandException("Input should be less than 50 symbols.");
        }else if (carBrand.length() <3 ) {
            throw new invalidCarBrandException("Input should be more than 3 symbols.");
        }
        this.carBrand = carBrand;
    }

    public void setCarDoors (int carDoors) {
        if (carDoors <= 0 ){
            throw new invalidCarDoorsException ("Please type quantity of car's doors.");
            } else if (carDoors >10 ){
            throw new invalidCarDoorsException("A quantity of doors should be less than 10.");

        }
        this.carDoors = carDoors;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return carColor == car.carColor;
    }


    public String toString(){
        return "A Car has these properties: " + '\n' +
                "Color of this car is: " + carColor + ", "+ '\n' +
                "Type of this Car is: " + carType + ", "+ '\n' +
                "It is from " + carOrigin + " " + '\n' +
                "It's brand is " + carBrand + " " + '\n' +
                "and this car has " + carDoors + " doors.";
    }

}