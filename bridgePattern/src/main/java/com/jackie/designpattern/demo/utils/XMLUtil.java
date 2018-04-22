package com.jackie.designpattern.demo.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/12 - 17:53
 * @history 2018/4/12 - 17:53 ting.he4@pactera.com  create.
 */
public class XMLUtil {

    public static Object getBean(String path, String nodeName) throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;
        Document doc;
        documentBuilder = builderFactory.newDocumentBuilder();
        doc = documentBuilder.parse(new File(path));

        NodeList nodeList = doc.getElementsByTagName(nodeName);
        Node firstChild = nodeList.item(0).getFirstChild();
        String nodeValue = firstChild.getNodeValue();

        Class clazz = Class.forName(nodeValue);
        Object newInstance = clazz.newInstance();
        return newInstance;
    }

}
