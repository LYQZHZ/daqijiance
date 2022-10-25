package com.fusheng.daqijiance.utils;

/**
 * @Description: 正则表达式检查密码是否符合要求
 * @return:
 * @Author: 李岩青
 * @Date:
 */
public class CheckPassword {
    //数字
    public static final String REG_NUMBER = ".*\\d+.*";
    //小写字母
    public static final String REG_UPPERCASE = ".*[A-Z]+.*";
    //大写字母
    public static final String REG_LOWERCASE = ".*[a-z]+.*";
    //特殊符号
    public static final String REG_SYMBOL = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";

    public static boolean isPswComplex(String password) {
        //密码为空或者长度小于8位则返回false
        if (password == "" || password.length() < 8) {
            return false;
        }
        int i = 0;
        if (password.matches(REG_NUMBER)) {
            i++;
        }
        if (password.matches(REG_LOWERCASE)) {
            i++;
        }
        if (password.matches(REG_UPPERCASE)) {
            i++;
        }
        if (i < 3) {
            return false;
        }
        return true;
    }
}
