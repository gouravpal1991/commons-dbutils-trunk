package org.apache.commons.dbutils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFileTest {
    TestFile testFile;

    @Before
    public void setUp() throws Exception {
        testFile = new TestFile();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertEquals("Nidhi",testFile.getName());
    }
}