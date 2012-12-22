package com.ponder.tutorials.app01.SubModule;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 *
 * @author Administrator
 */
public class Activator implements BundleActivator{

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("SubModule启动！");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("SubModule停止！");
    }

}
