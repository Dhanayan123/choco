package com.omoto.choco.service.impl;


import java.util.List;
import java.util.UUID;
import com.omoto.choco.models.TestClass;
import com.omoto.choco.repository.TestClassRepository;
import com.omoto.choco.service.TestClassService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/docs/test")
public class TestClassServiceImpl implements TestClassService {


    @Autowired
    private TestClassRepository testClassRepository;

    @Override
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST", value = "Create a Data")
    public String addNewData(@RequestBody TestClass testClass) {
        UUID tenantId = UUID.randomUUID();
        Assert.notNull(testClass, "ticket is a required parameter");
        testClass.setTenantId(tenantId);
        testClassRepository.save(testClass);
        return "TestData succesfully created!";
    }

   /* @Override
    @RequestMapping(method = RequestMethod.DELETE)
    @ApiOperation(httpMethod = "DELETE", value = "Delete a Data")
    public void removeTicket(long id) {
        Assert.notNull(id, "id is a required parameter");
        testClassRepository.delete(id);
    }*/

    @Override
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET", value = "Get all Data")
    public List<TestClass> findAll() {
        return testClassRepository.findAll();
    }



}
