package com.hans.pojo.redo;

import java.util.List;

/**
 * redo log 在硬盘上的数据结构
 * <p>2020/8/26 09:29</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class redoLogFile {
    //省略不重要的
    private long start_lsn;
    private List<redoLogBlock> redoLogBlocks;
}
