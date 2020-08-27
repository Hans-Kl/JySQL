package com.hans.pojo.undo;

import com.hans.pojo.page.Page;

import java.util.List;

/**
 * undo log 的数据结构
 * <p>2020/8/26 14:15</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class undoLogFile extends Page {
    Object undoPageHeader;
    List<undoLog> undoLogs;
}
