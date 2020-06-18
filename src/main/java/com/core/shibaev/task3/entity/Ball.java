package com.core.shibaev.task3.entity;

public class Ball {
    private double weight;
    private BallColor color;
    private double radius;

    public Ball() {
    }

    public Ball(double weight, BallColor color, double radius) {
        this.weight = weight;
        this.color = color;
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public BallColor getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateSize() {
        return 8 * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ball{");
        sb.append("weight=").append(weight);
        sb.append(", color=").append(color);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        return color == ball.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
