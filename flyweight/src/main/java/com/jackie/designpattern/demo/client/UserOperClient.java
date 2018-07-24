package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.extrinsic.ExtrinsicType;
import com.jackie.designpattern.demo.factory.DocumentEditorFactory;
import com.jackie.designpattern.demo.flyweight.CartoonEditor;
import com.jackie.designpattern.demo.flyweight.DocumentEditor;
import com.jackie.designpattern.demo.flyweight.ImageEditor;
import com.jackie.designpattern.demo.flyweight.VideoEditor;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/24 - 17:05
 * @history 2018/7/24 - 17:05 ting.he4@pactera.com  create.
 */
public class UserOperClient {

    public static void main(String[] args) {
        DocumentEditor imgFirstTarget,imgSecondTarget,ctn,video;
        ExtrinsicType imgType,ctnType,videoType;

        imgType = new ExtrinsicType("101", "yellow");
        ctnType = new ExtrinsicType("102", "blue");
        videoType = new ExtrinsicType("103", "red");

        imgFirstTarget = (ImageEditor)DocumentEditorFactory.getDocumentEditor("img");
        imgSecondTarget = (ImageEditor)DocumentEditorFactory.getDocumentEditor("img");
        ctn = (CartoonEditor)DocumentEditorFactory.getDocumentEditor("ctn");
        video = (VideoEditor)DocumentEditorFactory.getDocumentEditor("video");

        System.out.println("判断是否是同一个对象：" + (imgFirstTarget == imgSecondTarget));

        imgFirstTarget.display(imgType);
        ctn.display(ctnType);
        video.display(videoType);

    }

}
