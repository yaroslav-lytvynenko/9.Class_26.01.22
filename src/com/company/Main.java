package com.company;

public class Main {

    public static void main(String[] args) {

        Box one = new Box(3, 4, 3);
        Box two = new Box(7, 5, 2);
        Box three = new Box(2, 6, 8);
        Box four = new Box(10, 3, 2);
        Box five = new Box(6, 2, 6);

        one.setName("First");
        two.setName("Second");
        three.setName("Third");
        four.setName("Fourth");
        five.setName("Fifth");

        one.setMaterial("Wood");
        two.setMaterial("Plastic");
        three.setMaterial("Metal");
        four.setMaterial("Glass");
        five.setMaterial("Carton");

        System.out.println("vol of " + one.getName() + ":  " + one.volume()
                        + "\nvol of " + two.getName() + ": " + two.volume()
                        + "\nvol of " + three.getName() + ":  " + three.volume()
                        + "\nvol of " + four.getName() + ": " + four.volume()
                        + "\nvol of " + five.getName() + ":  " + five.volume());
    }

}
