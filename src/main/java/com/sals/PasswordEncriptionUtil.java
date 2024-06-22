package com.sals;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncriptionUtil {
	public static String encryptPassword(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}
	
	public static boolean checkPassword(String password, String hashedPassword) {
		return BCrypt.checkpw(password, hashedPassword);
	}
}
