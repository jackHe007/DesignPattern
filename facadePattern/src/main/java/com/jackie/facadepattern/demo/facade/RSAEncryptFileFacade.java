package com.jackie.facadepattern.demo.facade;

/**
 * Created by heting on 2018/5/6.
 */
public class RSAEncryptFileFacade implements CommonFileFacade {

    private FileReader fileReader;
    private FileEncrypt fileEncrypt;
    private FileWriter fileWriter;

    public RSAEncryptFileFacade() {
        this.fileReader = new FileReader();
        this.fileEncrypt = new FileEncrypt();
        this.fileWriter = new FileWriter();
    }

    public void saveFile(String resourceFilename, String targetFilename) {
        fileReader.readerFile(resourceFilename);
        fileEncrypt.encryptFile();
        fileWriter.saveFile();
    }

}
