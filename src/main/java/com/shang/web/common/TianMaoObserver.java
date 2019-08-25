package com.shang.web.common;

import java.util.Observable;
import java.util.Observer;

public class TianMaoObserver implements Observer {

    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String)product;
        System.err.println("发送新产品["+newProduct+"]同步到天猫商城");
    }
}
