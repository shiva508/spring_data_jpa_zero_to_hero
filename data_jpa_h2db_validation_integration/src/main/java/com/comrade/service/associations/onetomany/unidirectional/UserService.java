package com.comrade.service.associations.onetomany.unidirectional;

import java.util.List;

import com.comrade.model.associations.onetomany.unidirectional.User;

public interface UserService {
	public User saveUser(User user);

	public List<User> users();
}
