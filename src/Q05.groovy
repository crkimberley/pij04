import static java.lang.Math.pow
import static java.lang.Math.sqrt

/**
 * @author crkimberley on 13/08/2016.
 */
class Point {
    double x, y
}

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