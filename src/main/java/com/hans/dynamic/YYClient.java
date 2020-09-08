package com.hans.dynamic;

/**
 * <p>2020/9/8 09:50</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class YYClient {
    public static void main(String[] args) {
        Room room = new JiuCaiYY(new JiuCai());
        room.rent("");
    }

}
