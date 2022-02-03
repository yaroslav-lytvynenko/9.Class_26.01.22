package com.company;

import java.util.Scanner;

public class Box {
    private int height;
    private int width;
    private int depth;
    protected String name;
    protected Material material;

    Scanner scanner = new Scanner(System.in);

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(int height, int width, int depth, String name, Material material) {
        this(height, width, depth);
        this.name = name;
        this.material = material;
    }

    public Box(int height, int width, int depth, Material material) {
        this(height, width, depth);
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public int setHeight(int height) {
        this.height = validation(height);
        return this.height;
    }

    public int setWidth(int width) {
        this.width = validation(width);
        return this.width;
    }

    public int setDepth(int depth) {
        this.depth = validation(depth);
        return this.depth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int validation(int value) {
        int i = 0;
        boolean passValue = false;
        do {
            if (i > 0) {
                System.out.print("Input value: ");
                value = scanner.nextInt();
            }
            if (value <= 0) {
                System.out.println("Error! Incorrect value\n");
            } else {
                passValue = true;
            }
            i++;
        } while (!passValue);
        return value;
    }

    public int volume() {
        return height * width * depth;
    }
}
