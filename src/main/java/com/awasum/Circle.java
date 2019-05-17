package com.awasum;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

  private Point center;
  private ApplicationEventPublisher applicationEventPublisher;

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

    final DrawEvent drawEvent = new DrawEvent(this);
    this.applicationEventPublisher.publishEvent(drawEvent);

  }

  @PostConstruct
  public void initCircle() {
    System.out.println("Circle init");
  }

  @PreDestroy
  public void destroyCircle() {
    System.out.println("Circle destroy");
  }

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    this.applicationEventPublisher = applicationEventPublisher;
  }
}
