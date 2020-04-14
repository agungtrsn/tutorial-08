package com.apap.tu08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tu08.model.UserRoleModel;

/**
 * UserRoleDb
 * @author agungtresna
 *
 */
@Repository
public interface UserRoleDb extends JpaRepository<UserRoleModel, Long> {
	UserRoleModel findByUsername(String username);
}
