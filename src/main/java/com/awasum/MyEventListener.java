package com.awasum;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {

  @Override
  public void onApplicationEvent(ApplicationEvent applicationEvent) {

    System.out.println("Event Received: " + applicationEvent.toString());
  }
}
