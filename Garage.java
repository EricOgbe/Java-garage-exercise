package com.qa.garage;
import java.util.List;
import java.util.ArrayList;
public class Garage extends Scooter{
    public  static List<Vehicle> allVehicles = new ArrayList<>();
   
   
   
    public static void main(String[] args) {
    Car lambo = new Car();
    Motor suzuki = new Motor();
    Scooter step = new Scooter();
   
    allVehicles.add(lambo);
    allVehicles.add(suzuki);
    allVehicles.add(step);
   
    lambo.setWheels(4);
    suzuki.setWheels(2);
    step.setWheels(1);
   
    lambo.setName("lambo");
    suzuki.setName("suzuki");
    step.setName("step");
   
    bill();
    }
    public static void bill() {
    for (Vehicle a: allVehicles) {
    System.out.println("The bill for this "+ a.getName() + " is $"+ a.getWheels()+"0.000");
    }
    }
    public static void addVehicle(Vehicle vehicle) {
    allVehicles.add(vehicle);
    }
    public static void removeVehicle(Vehicle vehicleType) {
    allVehicles.remove(vehicleType);
    }
    public static void fixVehicle(Vehicle vehicle) {
    System.out.println("Your bill is $" + vehicle.getWheels()*100);
    }
    public static void emptyGarage() {
    for (Vehicle a: allVehicles) {
    allVehicles.remove(a);
    }
    }
    public static void removeVehicles(Vehicle vehicleType1,Vehicle vehicleType2) {
    allVehicles.remove(vehicleType1);
    allVehicles.remove(vehicleType2);
    }
   
    }
