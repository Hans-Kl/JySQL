package com.hans.pojo.page;

import com.hans.constant.RecordTypeEnum;

/**
 * 普通的用户记录页
 * <p>2020/8/20 11:30</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class UserRecordPage extends Page{
    public UserRecordPage() {
        // KLH: 2020/8/20 普通的用户记录页中，记录头为0
        this.userRecords.forEach(record->record.recordHeader.record_type= RecordTypeEnum.USER_RECORD);
    }
}
