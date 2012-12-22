package com.ponder.tutorials.app01.Calculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 *
 * @author Administrator
 */
public class Activator implements BundleActivator{

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Calculator启动！");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Calculator停止！");
    }

}
