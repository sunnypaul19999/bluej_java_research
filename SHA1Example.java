import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1Example {
    public static void main(String[] args) {
        String text = args[0];
        try {
            // Create a MessageDigest instance for SHA-1
            MessageDigest digest = MessageDigest.getInstance("SHA-1");

            // Update the digest with the input string
            digest.update(text.getBytes());

            // Compute the digest
            byte[] hash = digest.digest();

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                // Convert each byte to hexadecimal
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            // Output the hexadecimal string
            System.out.println("SHA-1 Hash: " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-1 algorithm not available.");
            e.printStackTrace();
        }
    }
}
