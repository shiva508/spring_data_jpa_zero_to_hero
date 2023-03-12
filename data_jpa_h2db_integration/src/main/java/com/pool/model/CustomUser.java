package com.pool.model;/*package com.example.demo.model;

import java.util.Collection;

import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
public class CustomUser extends User implements UserDetails{



	public CustomUser(User user) {
	super(user);
}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return getRoles().stream()
						 .map(role->new SimpleGrantedAuthority("ROLE_"+role.getRole()))
						 .collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
	
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
	
		return true;
	}

}
*/