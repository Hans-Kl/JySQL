package com.hans.pojo.redo;

/**
 * 混合物理与逻辑的redolog，常用语插入操作
 * <p>2020/8/20 14:17</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class MixRedoLog extends redoLog{
    Object msg;//恢复数据所用的全部信息，恢复的时候会以这些信息为参数调用插入一条记录的内置函数，完成插入操作
}
