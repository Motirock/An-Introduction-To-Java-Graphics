/*
Use this class to store methods used for checking collisions.
I currently have only one method used for checking collisions of Rectangles.
*/

package main;

public class CollisionChecker {
    public static boolean doesCollideTopLeftRects(Rectangle a, Rectangle b) {
        return a.intersectsTopLeftRects(b);
    }

    public static boolean doesCollideCenteredRects(Rectangle a, Rectangle b) {
        return a.intersectsCenteredRects(b);
    }
}
