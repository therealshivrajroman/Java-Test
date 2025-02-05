//Q2. Shape rendering system using OOPs

class Shape {
    void draw() {
        System.out.println("Drawing the shape");
    }

    void erase() {
        System.out.println("Erasing the shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing the Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing the Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing the Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing the Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing the Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing the Square");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Triangle();
        Shape s3 = new Square();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
