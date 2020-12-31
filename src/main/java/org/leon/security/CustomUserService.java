package org.leon.security;

import org.leon.dao.SysUserRepository;
import org.leon.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserService implements UserDetailsService {
	@Autowired
	SysUserRepository sr;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		SysUser user=sr.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		return user;
	}

}
