package com.company;

public class ColorBox extends Box {
    private Color color;

    ColorBox(int height, int width, int depth, Color color) {
        super(height, width, depth);
        this.color = color;
    }

    ColorBox(int height, int width, int depth, Material material, Color color) {
        super(height, width, depth);
        super.material = material;
        this.color = color;
    }

    ColorBox(int height, int width, int depth, String name, Color color) {
        super(height, width, depth);
        super.name = name;
        this.color = color;
    }

    ColorBox(int height, int width, int depth, String name, Material material, Color color) {
        super(height, width, depth, name, material);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "Name - " + getName() +
                ", height = " + super.height +
                ", width = " + super.width +
                ", depth = " + super.depth +
                ", material - " + material +
                ", color - " + color +
                '}';
    }

}
