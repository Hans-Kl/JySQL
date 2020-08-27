package com.hans.pojo.redo;

/**
 * redo log每改动一个页面就会记录至少一条日志，改动多个页面就会记录多个日志
 * <p>2020/8/20 12:34</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class redoLog {
    String type;//redo日志类型，共有53种类型
    Long spaceID;//表空间id
    Long pageNumber;//页号
}
