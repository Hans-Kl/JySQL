package com.hans.pojo;

import com.hans.pojo.page.UserRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据页结构
 * <p>2020/8/19 10:40</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class Page {
    Object fileHeader;
    Object pageHeader;
    UserRecord infimum;//最小记录，下界
    List<UserRecord> userRecords;//数据记录
    UserRecord supremum;//最大记录，上界
    Object freeSpace;
    ArrayList<Slot> pageDirectory;//数组
    Object fileTrailer;//页尾

    /**
     * 根据主键或索引在页内查询数据
     *
     * @param index
     * @return
     */
    public UserRecord selectByIndex(Long index) {
        Slot slot = binarySearchInPageDirectory(index);
        UserRecord maxRecordInSlot = UserRecord.findByNextRecord(slot.next_record);
        UserRecord beforeRecord = userRecords.get(pageDirectory.indexOf(maxRecordInSlot) - 1);


        // KLH: 2020/8/19 柑橘n_owned槽内记录条数，遍历槽内单链表
        for (int i = 0; i < maxRecordInSlot.recordHeader.n_owned; i++) {
            UserRecord record = UserRecord.findByNextRecord(beforeRecord.recordHeader.next_record);
            if (record.value.get(0).equals(index)) {
                return record;
            }
            //else 
        }
        return null;
    }

    /**
     * 通过《二分法》在pageDirectory中查找某个槽
     *
     * @param index
     * @return
     */
    public Slot binarySearchInPageDirectory(Long index) {
        return null;
    }

    /**
     * 页目录的槽对象
     */
    public class Slot {
        short next_record;
    }
}
