package com.omoto.choco;


import com.omoto.choco.service.impl.TestClassServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class, loader = SpringApplicationContextLoader.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebAppConfiguration
public class TestClassServiceImplTest {

    public enum status {
        CANCELLED, COMPLETED
    }

    public enum cancelledReason {
        ENDUSER, OTHERS
    }

    @Autowired
    private TestClassServiceImpl testClassServiceImpl;

    @Test
    public void B_addNewData() {
        log.info("Create new Data() \n");
    }


    @Test
    public void C_findAll() {
        log.info(" \n");

    }


}