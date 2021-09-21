package org.apache.commons.dbutils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFile2Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAge() {
        assertEquals(25, new TestFile2().getAge());
    }
}