package com.hans.pojo.redo;

/**
 * 简单的物理日志，常用于udpate操作
 * <p>2020/8/20 14:14</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class RawRedoLog extends redoLog {
    Long offset;//页中的偏移量
    String value;//字段更新后的具体数据
}
