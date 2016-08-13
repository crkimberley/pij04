import static java.lang.Math.pow
import static java.lang.Math.sqrt

/**
 * @author crkimberley on 13/08/2016.
 */
class Point {
    double x, y

    double distanceTo(Point point) {
        return sqrt(pow(x - point.x, 2) + pow(y - point.y, 2))
    }

    double distanceToOrigin() {
        Point origin = new Point()
        origin.x = 0
        origin.y = 0
        return distanceTo(origin)
    }

    void moveTo(double x, double y) {
        this.x = x
        this.y = y
    }

    void moveTo(Point point) {
        x = point.x
        y = point.y
    }

    Point clone() {
        Point point = new Point()
        point.x = x
        point.y = y
        return point
    }

    Point opposite() {
        Point point = new Point()
        point.x = -x
        point.y = -y
        return point
    }

}

Point p1 = new Point()
p1.x = 3.0
p1.y = 4.0
Point p2 = new Point()
p2.x = 9.0
p2.y = 12.0
Point given = new Point()
given.x = 12.0
given.y = 16.0

System.out.println()
System.out.println("point p1: " + p1.x + ", " + p1.y)
System.out.println("point p2: " + p2.x + ", " + p2.y)
System.out.println()
System.out.println("Distance from p1 to p2...p1.distanceTo(p2) = " + p1.distanceTo(p2))
System.out.println()
System.out.println("Distance from p1 to origin (0,0)...p1.distanceToOrigin() = " + p1.distanceToOrigin())
System.out.println()
System.out.println("Move p1 to given parameters x, y...p1.moveTo(30, 40)")
p1.moveTo(30.0, 40.0)
System.out.println("After move - p1: " + p1.x + ", " + p1.y)
System.out.println()
System.out.println("Move p1 to where given Point is...p1.moveTo(given)")
System.out.println("Given point: " + given.x + ", " + given.y)
p1.moveTo(given)
System.out.println("After move - p1: " + p1.x + ", " + p1.y)
System.out.println()
System.out.println("Return clone of p1...clone1 = p1.clone()")
Point clone1 = p1.clone()
System.out.println("clone1: " + clone1.x + ", " + clone1.y)
System.out.println()
System.out.println("Return clone of p1 with opposite co-ordinates (x -1)...cloneMinus = clone1.opposite()")
Point cloneMinus = clone1.opposite()
System.out.println("cloneMinus: " + cloneMinus.x + ", " + cloneMinus.y)
System.out.println()