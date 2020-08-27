package com.hans.pojo.undo;

/**
 * undo log的数据结构，undo log是针对记录的，每个记录的改动会记录一条或两条日志
 * <p>2020/8/26 14:54</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class undoLog {
    String undo_type = "insert";//undo log 的类型，共有三种：insert，delete，update
    long undo_no;//在一个事务中，从0开始每个undo log递增1
    long table_id;//表id，每个数据表唯一
    String primary_value;//主键值
}
