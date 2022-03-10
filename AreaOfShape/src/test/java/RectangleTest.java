import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rectangle.Rectangle;

public class AreaOfShapeTest {
    @Test
    void AreaOfRectangleWithLength4AndBreadth5is20() {
        Rectangle shape = new Rectangle(4, 5);

        Assertions.assertEquals(20, shape.Area());

    }


    @Test
    void AreaOfRectangleWithLength45AndBreadth20is900() {

        Rectangle shape = new Rectangle(3.5F, 2.5F);

        Assertions.assertEquals(8.75, shape.Area());

    }
}
