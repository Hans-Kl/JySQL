package com.hans.pojo.page;

import com.hans.constant.RecordTypeEnum;

import java.util.Collections;

/**
 * 目录项纪录页
 * <p>2020/8/20 11:31</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class DirectoryPage extends Page{
    public DirectoryPage() {
        this.userRecords.forEach(record->{
            // KLH: 2020/8/20 目录项记录页中，记录头为1
            record.recordHeader.record_type= RecordTypeEnum.DIRECTORY;
            // KLH: 2020/8/20 目录项记录页中，记录只有两项:索引列的值和页号的值
            record.value.add(Collections.singletonMap("index", 1));
            record.value.add(Collections.singletonMap("pageNo", 10));
        });
    }
}
