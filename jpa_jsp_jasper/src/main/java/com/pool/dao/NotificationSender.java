package com.comrade.dao;


public interface NotificationSender<T> {
public  Class<T>  appliesTo();
public  void send(T t);
}
