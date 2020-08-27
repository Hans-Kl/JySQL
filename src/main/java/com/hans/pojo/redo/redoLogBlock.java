package com.hans.pojo.redo;

import java.util.List;

/**
 * redo log在磁盘上的数据结构
 * <p>2020/8/20 17:35</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class redoLogBlock {
    Object log_block_header;
    List<redoLog> redoLogs;
    Object lob_block_trailer;
}
