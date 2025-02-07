package com.csc205.project1;
/*
Chat GPT prompt: "Can you create the code using this UML diagram in java language
please?" and submitted the UML diagram we received to Chat GPT.
*/
public class Point {
    // Fields
    private double x;
    private double y;

    // Constructors
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Distance method
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // Shift methods
    public void shiftX(double dx) {
        this.x += dx;
    }

    public void shiftY(double dy) {
        this.y += dy;
    }

    // Rotate method (around origin)
    public void rotate(double angle) {
        double radians = Math.toRadians(angle);
        double newX = this.x * Math.cos(radians) - this.y * Math.sin(radians);
        double newY = this.x * Math.sin(radians) + this.y * Math.cos(radians);
        this.x = newX;
        this.y = newY;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
