package App.Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils {
    // Method to compute SHA-256 hash
    public static String hashSHA256(String originalString) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("md5");
        byte[] hash = digest.digest(originalString.getBytes());

        // Convert byte array to a hexadecimal format
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    // Method to verify SHA-256 hash
    public static boolean verifySHA256(String originalString, String expectedHash) {
        try {
            // Compute hash of the original string
            String computedHash = hashSHA256(originalString);

            // Compare computed hash with the expected hash
            return computedHash.equals(expectedHash);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }
}
