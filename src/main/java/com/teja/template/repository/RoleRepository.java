package com.teja.template.repository;

import com.teja.template.model.Role;
import com.teja.template.model.Roles;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {
    Optional<Role> findByName(Roles name);
}
