package com.zhanglei.class7.class7_3;

public class SpaceShip extends SpaceShipControls {
    private String name;
    public SpaceShip(String name){this.name = name;}
    public String toString(){return name;}

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NASE");
        protector.forward(100);
    }
}
