package com.aironman.sample.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aironman.sample.mongo.documents.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
}
