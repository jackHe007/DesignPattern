package com.jackie.designpattern.demo.factory;

import com.jackie.designpattern.demo.flyweight.CartoonEditor;
import com.jackie.designpattern.demo.flyweight.DocumentEditor;
import com.jackie.designpattern.demo.flyweight.ImageEditor;
import com.jackie.designpattern.demo.flyweight.VideoEditor;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/24 - 16:33
 * @history 2018/7/24 - 16:33 ting.he4@pactera.com  create.
 */
public class DocumentEditorFactory {

    private static final DocumentEditorFactory instance = new DocumentEditorFactory();
    private static Map<String, DocumentEditor> docs;
    private DocumentEditor img,ctn,video;

    private DocumentEditorFactory() {
        docs = new Hashtable<String, DocumentEditor>();
        img = new ImageEditor();
        ctn = new CartoonEditor();
        video = new VideoEditor();
        docs.put("img", img);
        docs.put("ctn", ctn);
        docs.put("video", video);
    }

    public static DocumentEditorFactory getInstance() {
        return instance;
    }

    public static DocumentEditor getDocumentEditor(String key) {
        if (docs.containsKey(key)) {
            return (DocumentEditor)docs.get(key);
        } else {
            ImageEditor img = new ImageEditor();
            docs.put("img", img);
            return img;
        }
    }


}
