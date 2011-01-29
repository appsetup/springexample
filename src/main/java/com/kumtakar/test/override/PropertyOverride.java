package com.kumtakar.test.override;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by IntelliJ IDEA.
 * User: naveen
 * Date: 29/1/11
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyOverride {

    private String algorithmRequired;



    public String getAlgorithmRequired() {
        return algorithmRequired;
    }

    public void setAlgorithmRequired(String algorithmRequired) {
        this.algorithmRequired = algorithmRequired;
    }

    public MessageDigest getMessageDigest() throws NoSuchAlgorithmException {

        return MessageDigest.getInstance(algorithmRequired);
    }

}
