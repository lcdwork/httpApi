package com.crplingxi.httpapi.tools;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class DESUtils {
    private static final String DES = "DES";
    private static final String ENCODE = "UTF-8";

    public DESUtils() {
    }

    public static byte[] encrypt(byte[] data, byte[] key) {
        try {
            SecureRandom sr = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(key);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, secretKey, sr);
            return cipher.doFinal(data);
        } catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public static byte[] decrypt(byte[] data, byte[] key) {
        try {
            SecureRandom sr = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(key);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, secretKey, sr);
            return cipher.doFinal(data);
        } catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public static String encrypt(String data, String key) {
        String string = null;

        try {
            byte[] bt = encrypt(data.getBytes("UTF-8"), key.getBytes("UTF-8"));
            string = (new BASE64Encoder()).encode(bt);
        } catch (UnsupportedEncodingException var4) {
            var4.printStackTrace();
        }

        return string;
    }

    public static String decrypt(String data, String key) {
        if (data == null) {
            return null;
        } else {
            String result = null;

            try {
                BASE64Decoder decoder = new BASE64Decoder();
                byte[] bs = decoder.decodeBuffer(data);
                byte[] decrypt = decrypt(bs, key.getBytes("UTF-8"));
                result = new String(decrypt, "UTF-8");
            } catch (IOException var6) {
                var6.printStackTrace();
            }

            return result;
        }
    }
}
