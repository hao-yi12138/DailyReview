package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-04-22 21:08
 **/

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class 替换空格 {
    public String replaceSpace (String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c==' '?"%20":c);
        }
        return sb.toString();
    }
}
