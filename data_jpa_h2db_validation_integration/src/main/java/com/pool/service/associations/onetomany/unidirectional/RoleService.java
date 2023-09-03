package com.comrade.service.associations.onetomany.unidirectional;

import java.util.List;

import com.comrade.model.associations.onetomany.unidirectional.Role;

public interface RoleService {
	public Role saveRole(Role role);

	public List<Role> roles();
}
