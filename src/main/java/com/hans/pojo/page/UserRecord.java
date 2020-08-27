package com.hans.pojo.page;

import com.hans.constant.RecordTypeEnum;

import java.util.List;
import java.util.Map;

/**
 * 一条记录的结构
 * <p>2020/8/19 11:25</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class UserRecord {
    public RecordHeader recordHeader;
    public List<Map<String, Object>> value;
    List<Long> varFieldSize;
    List<String> nullValueList;
    long trx_id;//聚簇索引独有，事务id
    String roll_pointer;//聚簇索引独有，指向undo log

    public static UserRecord findByNextRecord(short nextRecord) {
        return null;
    }

    /**
     * 记录头信息
     */
    public static class RecordHeader {
        public short next_record;//下一条记录的地址偏移量，当前地址+next_record=下一条记录地址,页中记录组成一个单链表
        public RecordTypeEnum record_type;//记录类型
        public short n_owned;//slot大小
        short delete_mask;//标记该记录是否删除
        short heap_no;//页中的序号，按主键从小到大排序
        short min_rec_mask;
    }


}
