package com.company;

public class Car implements AutoCloseable{

    public  void drive(){
        System.out.println("Машина едет");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается");
    }
}
