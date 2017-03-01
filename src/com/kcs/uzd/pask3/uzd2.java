package com.kcs.uzd.pask3;

import com.kcs.uzd.pask3.vo.Car;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by User on 2017-03-01.
 */
public class uzd2 {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        readFile("auto", cars);
        printSet(cars);
    }
    private static void printSet(Set<Car> cars){
        for (Car car: cars){
            System.out.println(car);
        }
    }
    private static void readFile(String fileName, Set<Car> cars){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
            String line = null;
            while ((line = bf.readLine()) != null){
                addCar(line, cars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void addCar(String line, Set<Car> cars){
        String[] items = line.split("\t");
        if(items.length == 3){
            cars.add(new Car(items[0], items[1], Double.parseDouble(items[2])));
        }
    }
}
