package com.company;

public class Main {

    public static void main(String[] args) {

        Box one = new Box(3, 4, 3);
        Box two = new Box(7, 5, 2);
        Box three = new Box(2, 6, 8);

        one.setName("First");
        two.setName("Second");
        three.setName("Third");

        ColorBox colorBoxOne = new ColorBox(1,2,3, Color.BROWN);
        ColorBox colorBoxTwo = new ColorBox(3,2,3, Material.METAL, Color.BLACK);
        ColorBox colorBoxThree = new ColorBox(2,2,8, "ColorBoxThird", Material.PLASTIC, Color.WHITE);

        colorBoxOne.setName("ColorBoxFirst");
        colorBoxOne.setMaterial(Material.WOOD);
        colorBoxTwo.setName("ColorBoxSecond");

        System.out.println("\nvolume of " + one.getName() + ":  " + one.volume()
                        + "\nvolume of " + two.getName() + ": " + two.volume()
                        + "\nvolume of " + three.getName() + ":  " + three.volume());

        System.out.println("\nvolume of " + colorBoxOne.getName() + " that is " + colorBoxOne.getColor() +
                ", made of " +colorBoxOne.getMaterial() + ":    " + colorBoxOne.volume()
                + "\nvolume of " + colorBoxTwo.getName() + " that is " + colorBoxTwo.getColor() +
                ", made of " +colorBoxTwo.getMaterial() + ":  " + colorBoxTwo.volume()
                + "\nvolume of " + colorBoxThree.getName() + " that is " + colorBoxThree.getColor() +
                ", made of " +colorBoxThree.getMaterial() + ": " + colorBoxThree.volume());
    }
}
