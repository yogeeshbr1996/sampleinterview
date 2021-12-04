package test;

public class Shape {

    String color;
    int dimensions;

    public Shape(String color, int d1, int d2, int d3)
    {
        this.color = color;
        this.dimensions = d1*d2*d3;
    }
    public Shape(String color, int d1, int d2)
    {
        this.color = color;
        this.dimensions = d1*d2;
    }

    public Shape(String color, int d1)
    {
        this.color = color;
        this.dimensions = d1*d1;
    }

    public String getColor()
    {
        return this.color;
    }

    public int getDimensions()
    {
        return this.dimensions;
    }
}


