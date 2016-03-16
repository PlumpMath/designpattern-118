package com.medusar.learn.designpattern.creational.factorymethod;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathFactory;

/**
 * Created by wanglianbin on 2016/3/16.
 */
public class ProductBFactory implements FactoryMethod {
    @Override
    public Product create() {
        DocumentBuilderFactory.newInstance();
        TransformerFactory.newInstance();
        XPathFactory.newInstance();
        return new ProductB();
    }
}
