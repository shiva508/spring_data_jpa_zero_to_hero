package com.comrade.dao;


import com.comrade.model.entityinheritance.EmailNotification;
import com.comrade.model.entityinheritance.SmsNotification;

public interface JoinedTableInheritance {
public void sendSme(SmsNotification smsNotification);
public void sendEmail(EmailNotification emailNotification);
}
