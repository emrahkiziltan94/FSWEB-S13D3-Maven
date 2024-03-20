package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public  void  setWidth(double width){
        this.width = width<0 ? 0 : width;
    }

    public double getArea(){
        return width*height;
    }
}
