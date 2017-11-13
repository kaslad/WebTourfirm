package helpers;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Hash {
    public static String getMd5Apache(String password) {

        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {

            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(password.getBytes());
            digest = messageDigest.digest();

        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();

        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while( md5Hex.length() < 32 ){

            md5Hex = "0" + md5Hex;

        }

        return md5Hex;

    }
}