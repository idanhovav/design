import java.awt.Color;
import java.util.*;

public class Turtle {
    public double x, y;     // turtle's coordinates.
    public double angle;    // facing this many degrees counterclockwise from the x-axis

    // start at (x0, y0), facing a0 degrees counterclockwise from the x-axis
    public Turtle(double x0, double y0, double a0) {
        x = x0;
        y = y0;
        angle = a0;
    }

    // rotate orientation delta degrees counterclockwise
    public void turnLeft(double delta) {
        angle += delta;
    }
    public void turnRight(double delta) {
        angle -= delta;
    }

    // move forward the given amount, with the pen down
    public void goForward(double step) {
        double oldx = x;
        double oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        StdDraw.line(oldx, oldy, x, y);
    }

    // pause t milliseconds
    public void pause(int t) {
        StdDraw.show(t);
    }


    public void setPenColor(Color color) {
        StdDraw.setPenColor(color);
    }

    public void setPenRadius(double radius) {
        StdDraw.setPenRadius(radius);
    }

    public void setCanvasSize(int width, int height) {
        StdDraw.setCanvasSize(width, height);
    }

    public void setXscale(double min, double max) {
        StdDraw.setXscale(min, max);
    }

    public void setYscale(double min, double max) {
        StdDraw.setYscale(min, max);
    }
    public void drawDesign(double length, int sides){
        for(int i = 0; i < sides; i++){
            this.goForward(length);
            this.turnLeft(360.0/((double)(sides)));
        }
    }
    public void drawDesignOpp(double length, int sides){
        for(int i = 0; i < sides; i++){
            this.goForward(length);
            this.turnRight(360.0/((double)(sides)));
        }
    }
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }
    public void locate(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void turn(double a){
        this.angle = a;
    }
    public double toAngle(double a){
        if(a < 80 && a > -80){
            return a;
        }
        else if (a <= 580 && a > 0){
            return 80.0 + (double) (a / 100);
        }
        else if (a >= -580 && a < 0){
            return -80 + (double) (a / 100);
        }
        else if (a < 0 && a >= -4580){
            return -85 + (double) (a / 1000);
        }
        else if (a > 0 && a <= 4580){
            return 85 + (double) (a / 1000);
        }
        else if (a > 0){
            return 90;
        }
        else{
            return -90;
        }
    }
}