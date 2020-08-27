package com.hans.pojo.undo;

import java.util.List;

/**
 * 修改操作的undo
 * <p>2020/8/26 15:06</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class undoLogUpdate extends undoLogDelete{
    private List<String> oldUpdatedValue;//被更新的列的更新前旧值
}
