package com.cbfacademy.cars;

public class App {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        for (Car car : showroom.getCars()) {
            System.out.println(car);
        }
    }
}
