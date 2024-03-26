package com.mycompany.cgp;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CGP {

    public static void main(String[] args) {
        login obj = new login();
        obj.setVisible(true);
    }
}
