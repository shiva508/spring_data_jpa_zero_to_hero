package com.pool.dao;


import com.pool.model.entityinheritance.EmailNotification;
import com.pool.model.entityinheritance.SmsNotification;

public interface JoinedTableInheritance {
public void sendSme(SmsNotification smsNotification);
public void sendEmail(EmailNotification emailNotification);
}
