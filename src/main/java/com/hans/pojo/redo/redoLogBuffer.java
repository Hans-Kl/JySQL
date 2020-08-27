package com.hans.pojo.redo;

import com.hans.pojo.redo.redoLogBlock;

import java.util.List;

/**
 * redo log 写入磁盘前的缓冲区
 * <p>2020/8/20 14:50</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class redoLogBuffer {
    List<redoLogBlock> redoLogBlocks;
}
