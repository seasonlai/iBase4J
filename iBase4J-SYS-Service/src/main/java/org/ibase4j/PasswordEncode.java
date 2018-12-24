package org.ibase4j;

import top.ibase4j.core.Constants;
import top.ibase4j.core.util.SecurityUtil;

/**
 * Created by Administrator on 2018/12/24.
 */
public class PasswordEncode {

    public static void main(String... args) {
        String password = (args != null && args.length > 0) ?  args[0]:"buzhidao";
        String encrypt = SecurityUtil.encryptDes(password, Constants.DB_KEY.getBytes());
        System.out.println(encrypt);
        System.out.println(SecurityUtil.decryptDes(encrypt, Constants.DB_KEY.getBytes()));
    }
}
