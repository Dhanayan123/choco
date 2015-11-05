package com.omoto.choco.repository;

import java.util.List;
import javax.transaction.Transactional;

import com.omoto.choco.models.TestClass;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface TestClassRepository extends CrudRepository<TestClass, Long> {

    @Query("select u from TestClass u")
    List<TestClass> findAll();



}
