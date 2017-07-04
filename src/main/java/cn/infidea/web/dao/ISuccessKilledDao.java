package cn.infidea.web.dao;

import cn.infidea.web.entity.SuccessKilled;

/**
 *
 * Created by Administrator on 2017/6/30.
 */
public interface ISuccessKilledDao {

    /**
     * 插入秒杀记录，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKill(long seckillId,long userPhone);

    /**
     * 通过id查询购买明细并返回带seckill对象
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSecKill(long seckillId);
}
