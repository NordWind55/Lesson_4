import org.example.TriangleException;

public class AreaOfTriangle {

    public static void main(String[] args) throws TriangleException {
        Triangle triangle =new Triangle(3, 4, 4);
        triangle.area();
    }
}
