package com.hans.pojo.undo;

/**
 * 删除操作的undo log数据结构
 * <p>2020/8/26 15:02</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class undoLogDelete extends undoLog {
    String undo_type = "delete";
    long old_trx_id;
    long old_roll_pointer;
}
