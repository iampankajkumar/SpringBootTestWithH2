package com.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pankaj.entity.TestEntity;
@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {

}