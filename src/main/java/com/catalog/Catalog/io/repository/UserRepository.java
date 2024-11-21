package com.catalog.Catalog.io.repository;

import com.catalog.Catalog.io.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
