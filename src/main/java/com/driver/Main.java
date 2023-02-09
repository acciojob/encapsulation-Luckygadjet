package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        r.setName("Naveen");
        r.getName();
        // name has private access in com.driver.RWOnly

    }



}