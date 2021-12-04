package test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tests {

    @Test()
    public void square()
    {
        Shape square = new Shape("Blue", 5);
        Assert.assertEquals("Blue", square.getColor());
        Assert.assertEquals(25, square.getDimensions());
    }

    @Test()
    public void rectangle()
    {
        Shape rectangle = new Shape("Blue", 5, 8);
        Assert.assertEquals("Blue", rectangle.getColor());
        Assert.assertEquals(40, rectangle.getDimensions());
    }

    @Test()
    public void circle()
    {
        Shape circle = new Shape("Blue", 5);
        Assert.assertEquals("Blue", circle.getColor());
        Assert.assertEquals(25, circle.getDimensions());
    }

    @Test()
    public void cube()
    {
        Shape circle = new Shape("Blue", 5, 5 , 5);
        Assert.assertEquals("Blue", circle.getColor());
        Assert.assertEquals(125, circle.getDimensions());
    }

    @Test()
    public void sphere()
    {
        Shape circle = new Shape("Blue", 5, 5 , 5);
        Assert.assertEquals("Blue", circle.getColor());
        Assert.assertEquals(125, circle.getDimensions());
    }
}
