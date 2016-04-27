package ProcessAPIBING;


import org.apache.commons.codec.binary.Base64;

public class AccountKey {

	public static String getAccountKeyAfterEncode(){
		String accountKey = "UZ0fmwq/JeVOt22yrb/zHWp2BmasGEAfNQbaI4/LuS8";
		// encode your account key by using Base64 encoding
		byte[] accountKeyBytes = Base64.encodeBase64((accountKey + ":" + accountKey).getBytes());
		String accountKeyEnc = new String(accountKeyBytes);
		return accountKeyEnc;
	}
}
