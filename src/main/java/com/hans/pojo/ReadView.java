package com.hans.pojo;

import java.util.List;

/**
 * 生成ReadView时机:
 * RC:每次读取数据前生成一个ReadView
 * RR:
 * <p>2020/8/26 16:21</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class ReadView {
    List<Long> active_trx_ids;//生成本ReadView时活跃的事务的ids;
    long min_trx_id;//生成本ReadView时活跃的事务ids中最小的id;
    long next_trx_id;//生成本ReadView时mysql应该分配个下一个事务的id;
    long creator_trx_id;//生成本ReadView的事务的id;

    /**
     * 判断某个事务改动的数据能否被当前事务访问，前提是：每个改动的数据版本（undo log）都记录了修改他的事务id
     *
     * @param recordTrxId
     * @return
     */
    public boolean access(long recordTrxId) {
        return true;
    }
}
