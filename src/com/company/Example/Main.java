package com.company.Example;


import java.io.*;

public class Main {


    public static void main(String...args){

        File f = new File("data.dat");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f))) {

            Car car = new Car("Audi",1);

            objectOutputStream.writeObject(car);

            Car secondCar = (Car)objectInputStream.readObject();

            System.out.println(secondCar.getFirm());

        } catch (IOException | ClassNotFoundException e) {

            throw new RuntimeException(e);

        }
    }
}
