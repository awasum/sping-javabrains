package com.awasum;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {

  private Point center;

  public Point getCenter() {
    return center;
  }

  @Resource(name = "pointA")
  public void setCenter(Point center) {
    this.center = center;
  }

  @Override
  public void draw() {
    System.out.println("Circle Drawn");
    System.out.println("Circle Center Pont(" + center.getX() + "," + center.getY() + ")");

  }

  @PostConstruct
  public void initCircle() {
    System.out.println("Circle init");
  }

  @PreDestroy
  public void destroyCircle() {
    System.out.println("Circle destroy");
  }
}
