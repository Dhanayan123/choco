package com.omoto.choco.service;

import com.omoto.choco.models.TestClass;

import java.util.List;

public interface TestClassService {

    public String addNewData(TestClass testClass);

//    public void removeTicket(long id);

    public List<TestClass> findAll();



}
