package com.comrade.App;

import java.util.List;

import com.comrade.config.AppConfig;
import com.comrade.entity.User;
import com.comrade.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	UserService userService=context.getBean(UserService.class);
    	System.out.println("");
    	System.out.println("Hibernate ");
    	System.out.println("");
    	userService.add(new User(1,"Rajeswari","Dasari","dasarraji@gmail.com"));
    	userService.add(new User(2,"Mounika","Dasari","dasarimounika@gmail.com"));
    	userService.add(new User(2,"Kavya","Dasari","dasarikavya@gmail.com"));
    	
    	List<User> getUsers=userService.getAllUsers();
    	for(User u:getUsers)
    	{
    		System.out.println("Id: "+u.getId());
    		System.out.println("First Name: "+u.getFirstName());
    		System.out.println("Last name: "+u.getLastName() );
    		System.out.println("Email: "+u.getEmail());
    	}
    	
    	context.close();
    }
    
}
