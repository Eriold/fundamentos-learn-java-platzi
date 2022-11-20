package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("Hola desde mi implementación propia del bean dos");
    }
}
