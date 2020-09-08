package com.hans.dynamic;

/**
 * <p>2020/8/31 15:23</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class JiuCaiSon extends JiuCai{
    private Room room;

    public JiuCaiSon(Room room) {
        this.room = room;
    }

    @Override
    public void rent(String str) {
        System.out.println("韭菜儿子rent");
        room.rent(str);
    }

    @Override
    public void sell(String str) {
        System.out.println("韭菜儿子sell");
        room.sell(str);
    }
}
