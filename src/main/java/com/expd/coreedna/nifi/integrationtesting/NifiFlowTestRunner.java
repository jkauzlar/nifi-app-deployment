package com.expd.coreedna.nifi.integrationtesting;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

public class NifiFlowTestRunner extends Runner {

    private Class<?> testClass;

    public NifiFlowTestRunner(Class<?> testClass) {
        this.testClass = testClass;
    }

    @Override
    public Description getDescription() {
        return null;
    }

    @Override
    public void run(RunNotifier runNotifier) {

    }
}
