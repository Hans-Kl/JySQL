package com.hans.dynamic;

/**
 * <p>2020/9/8 09:48</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class JiuCaiYY implements Room {
    private Room room;

    public JiuCaiYY(Room room) {
        this.room = room;
    }

    @Override
    public void rent(String str) {
        System.out.println("爷爷rent");
        room.rent(str);
    }

    @Override
    public void sell(String str) {
        System.out.println("爷爷sell");
        room.rent(str);
    }
}
