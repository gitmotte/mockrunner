package com.mockrunner.test.util;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllUtilTests
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Test for com.mockrunner.test.util");
        //$JUnit-BEGIN$
		suite.addTest(new TestSuite(XmlUtilTest.class));
		suite.addTest(new TestSuite(StreamUtilTest.class));
		suite.addTest(new TestSuite(ArrayUtilTest.class));
		suite.addTest(new TestSuite(SearchUtilTest.class));
		suite.addTest(new TestSuite(CollectionUtilTest.class));
		suite.addTest(new TestSuite(StringUtilTest.class));
		suite.addTest(new TestSuite(ParameterUtilTest.class));
		suite.addTest(new TestSuite(FileUtilTest.class));
		suite.addTest(new TestSuite(ClassUtilTest.class));
        //$JUnit-END$
        return suite;
    }
}