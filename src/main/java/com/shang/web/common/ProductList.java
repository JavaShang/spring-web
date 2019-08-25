package com.shang.web.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {

    private List<String> productLIst = null;

    private static ProductList instance;

    private ProductList(){}

    public static ProductList getInstance(){
        if (instance==null){
            instance = new ProductList();
            instance.productLIst = new ArrayList<>();
        }
        return instance;
    }

    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    public void addProduct(String newProduct){
        productLIst.add(newProduct);
        System.out.println("产品列表新增了产品："+newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);
    }

}
