package org.leon.dao;

import org.leon.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
	public SysUser findByUsername(String username);
}
