package com.pool.dao;


public interface NotificationSender<T> {
public  Class<T>  appliesTo();
public  void send(T t);
}
