package com.hans.pojo.page;

/**
 * 页的属性，文件头部
 * <p>2020/8/19 16:53</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class FileHeader {
    long fil_page_offset;//指向当前页面
    long fil_page_prev;//指向上一个页面
    long fil_page_next;//指向下一个页面
}
