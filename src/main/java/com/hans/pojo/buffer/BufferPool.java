package com.hans.pojo.buffer;

import com.hans.pojo.page.Page;

import java.util.List;
import java.util.Map;

/**
 * 硬盘数据页在内存中的缓存，默认大小为128M，最小为5M
 * show variables like 'innodb_buffer_pool_size';查看bufferPool大小
 * <p>2020/8/20 12:46</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class BufferPool {
    List<ControlChunk> controlChunks;//控制块
    List<Page> cachePages;//缓存的对象是整页数据
    Map<ControlChunk,Page> pool;//控制块与缓存页是一一对应的，像一个map一样
    List<ControlChunk> freeList;//空闲链表，存储bufferPool中没有被使用的缓存页，初始状态为整个控制块链表。
    List<ControlChunk> flushList;//刷脏链表,记录更改过的缓存页，用于刷新到磁盘。
    Map<String,Page> hashPool;//用于定位一个页是否在缓存中。

    public static class ControlChunk {
        long tableNum;//表空间号
        long pageNum;//页号
//        long cachePage
    }

    private String hash(long tableNum, long pageNum) {
        return "";
    }

    public void selectPage() {
        //1.根据缓存页哈希表中，查看目标页是否已在缓存池中，在的话直接返回
        //2.不在的话，从磁盘读取，放到freeList中的空闲页中
        //3.freeList中没有空闲页，LRU缓存更新策略
    }
}
