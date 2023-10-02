package code;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.util.Base64;

/**
 * @author yyy
 * @tg t.me/ychen5325
 */
public class Me {

	public static void main(String[] args) throws Exception {
		// 我的秘钥、它符合[a-zA-Z]{16}
		String pwd = "";
		// 我的所有的数字身份的通行证
		String msg = "1W+yaVYuOEXY9lbUbjYDp4lHOU9AN2qgIgO5nsCErL0DE2l7IEsAGtEWe0PiJkmGCkqfNMFahoDU9p6Im2G/N9Sz2cwxBYQ9FncxWtaCXWpQzZ6sDZgMGnCEan554zDe6xOvtMSsabKB3vEBmUBOc6A9VxyMR2lHmVSPUO7279amgh3iKgXv6Ny5KaLOjXAJoRWftZRO/YsYb3tXxR29kcFbq6OE15VL9NhjBQM/xY9MnALGy5of/osdzrN6dlmXa/u+QZqpw8/Ot4R1lQr6xXiLvwrRklS2tPEV4xbDv8/+H4BdZJJevF4rqw8KQRT9OH2JE3CWYPzZiwTSOcSH72ZDAuRBXveiwI1zN5pBVmtI4FCpuZuGGKvgGnY7cJH3H/lhWHro5Kb2SQ+nKDxtm5TRe5oAsrxZmoHKAVolft+2yv0xhqTXk1njutKIO2BRC0w5Y4Q8oQ9HZIbBeAEY9EWKedM1CTcIWD2LhaRMnfSanaDWJALgfe2619XS2SW3e9LDhhs2TPIg+o1N9jorFCY1CuNmDzGBYO5JV9uaO9c9PZGn3NdlfN9Q9Ci05+Qu6RhpybCJYJSzJ0RY3QvwF825/J5Skik+zGy6ZpGUW3ERypVy02wkeEDPaUfIsgjynuOQn2EMpmOQR2eRJwj1EPEdzuN7dgX8/rNlPMZCuw/36p4hbV6kYBIkOI9GXBwyIT/n0Xi7tkJM9kCVq4FDplOfuWR2+2RQsET8UU09Pgczqq3T70/v0HKtiejX8BbQV9XvPJEs0SiFu3v6TdKGs6SKnx9XD1iCVNCPYZq+oJlo+Fjy79wFFtkxEAUx3HRVniHZevSc7PcdAvJ5g2x7oSvRuP3Hc1F4UrZZ3uEKUVwwQU0gYBmKYEPZAuzJMbZQ+NqXyqPF2NiVzNCpReiYv5SSGZkY/fqmGlb7KcdDqsSLu8yEAmj2z2nsUaoyZfnXcTMrDMvQ/PvbcEPWlyOvlYzVzRJF27ZH26oY5SP3uiylds6vtzTGmZcf0qPNM/wtU5+5ZHb7ZFCwRPxRTT0+B/3sWx3PnS77qsb4Qbdl5lVX1e88kSzRKIW7e/pN0oazpIqfH1cPWIJU0I9hmr6gmeCHxR/CDLjt6NLWGWX5cbXbHPcIrWlNWu/9g71kv1YJ7dYIGw1cqmaMiulzoiiQKBDrTivL2LtCtW9pVhrDYEZ6xorKZabURtQdtJg3QDpZ0VrvUZ83HIAV1fhVphprlrNSExeAXKpo4UQybm0zW/JZhG8ZO4sAHbTo4x8yQvqdHfJGJLVaCC1dRm5jM6L4idoy5fOHjcsjVR/c9EjkEpCNMZY/uTw+YfMXG4JMGWCR";
		String decryptedMsg = decrypt(Base64.getDecoder().decode(msg), pwd);
		System.out.println("decryptedMsg:\n " + decryptedMsg);
	}

	public static byte[] encrypt(String msg, String pwd) throws Exception {
		SecretKeySpec secretKeySpec = new SecretKeySpec(pwd.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		return cipher.doFinal(msg.getBytes());
	}
	public static String decrypt(byte[] encryptedMsg, String pwd) throws Exception {
		SecretKeySpec secretKeySpec = new SecretKeySpec(pwd.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
		byte[] decryptedBytes = cipher.doFinal(encryptedMsg);
		return new String(decryptedBytes);
	}
}
