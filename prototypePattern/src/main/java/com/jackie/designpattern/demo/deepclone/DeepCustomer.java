package com.jackie.designpattern.demo.deepclone;

import java.io.*;

/**
 * 深克隆，深拷贝
 *
 * Created by heting on 2018/4/15.
 */
public class DeepCustomer implements Serializable {

    private DeepAddress deepAddress;

    private String name;

    public DeepAddress getDeepAddress() {
        return deepAddress;
    }

    public void setDeepAddress(DeepAddress deepAddress) {
        this.deepAddress = deepAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCustomer(DeepAddress deepAddress) {
        this.deepAddress = deepAddress;
    }

    public DeepCustomer deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //从流中读取对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        return (DeepCustomer) obj;
    }

}
