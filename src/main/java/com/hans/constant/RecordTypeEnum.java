package com.hans.constant;

/**
 * 记录头中的记录类型枚举
 * <p>2020/8/19 11:55</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public enum RecordTypeEnum {
    USER_RECORD(0),//普通的用户记录
    DIRECTORY(1),//目录项记录
    INFIMUM(2),//最小记录
    SUPREMUM(3);//最大记录

    RecordTypeEnum(int i) {
    }
}
