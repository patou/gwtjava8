package com.gwt.test.java8.client;

public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  @DefaultMessage("Enter your name")
  String nameField();

  @DefaultMessage("Send")
  String sendButton();
}
