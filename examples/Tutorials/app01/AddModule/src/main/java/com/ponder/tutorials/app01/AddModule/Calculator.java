package com.ponder.tutorials.app01.AddModule;

import com.ponder.tutorials.app01.Calculator.Export.ICalculator;

/**
 *
 * @author Administrator
 */
public class Calculator implements ICalculator{

    @Override
    public int calc(int i, int j) {
       return i+j;
    }

    @Override
    public String result(int i, int j) {
        return "" +i+" + "+j+" = "+(i+j);
    }

}
