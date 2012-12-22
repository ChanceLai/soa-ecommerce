
package com.ponder.tutorials.app01.Calculator;

import com.ponder.tutorials.app01.Calculator.Export.ICalculator;
import com.ponder.tutorials.app01.Calculator.Export.ICommand;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class Command implements ICommand{
    private static HashMap<String,ICalculator> workers=new HashMap<String,ICalculator>();


    public void bindICalculator(ICalculator service, Map prop) {
        if (service != null && prop != null) {
            String method = (String) prop.get("method");
            if (method != null) {
                workers.put(method, service);
                System.out.println("服务[" + method + "]注入成功！");
            } else {
                System.out.println("服务没有设置method属性");
            }
        }
    }

    public void unbindICalculator(ICalculator service, Map prop) {
        if (service != null && prop != null) {
            String method = (String) prop.get("method");
            if (method != null) {
                workers.remove(method);
                System.out.println("移除服务[" + method + "]成功！");
            } else {
                System.out.println("服务没有设置method属性,无法移除！");
            }
        }
    }

    @Override
    public void add(int i, int j) {
        ICalculator worker=workers.get("add");
        if(worker==null){
            System.out.println("AddMoudle未注入，无法计算。");
        }else{
            System.out.println(worker.result(i, j));
        }
    }

    @Override
    public void sub(int i, int j) {
        ICalculator worker=workers.get("sub");
        if(worker==null){
            System.out.println("SubMoudle未注入，无法计算。");
        }else{
            System.out.println(worker.result(i, j));
        }
    }

}
