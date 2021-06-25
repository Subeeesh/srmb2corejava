package com.demo;


abstract class telephone{
    abstract void lift();
    abstract void disconnected();
}
class smarttelephone extends telephone{

    @Override
    void lift() {
        System.out.println("lift method has been overridden");
    }

    @Override
    void disconnected() {

        System.out.println("discoonected method has been overridden");
    }

}
public class Phone1 {
    public static void main(String[] args) {

        smarttelephone ref=new smarttelephone();
        ref.lift();
        ref.disconnected();
    }

}