package GetOffer;

/**
 * Created by liyaoshi on 2017/7/4.
 *问题描述：把字符串中的空格换成其他的字符输出
 */
public class ReplacSpace {
    public static void main(String[] args) {
        String s = "We are family,we want to live happy";
        System.out.println(replace(s));
    }

    public static String replace(String s) {
        if (null == s)
            return null;
        StringBuffer outputStringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (' '==(s.charAt(i))) {
                outputStringBuffer.append("你好哇李银河");
            } else
                outputStringBuffer.append(String.valueOf(s.charAt(i)));
        }
        return outputStringBuffer.toString();
    }
}
