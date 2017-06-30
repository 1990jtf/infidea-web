package cn.infidea.web.dao;

import cn.infidea.web.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
public interface ISecKillDao {

    /**
     * 减库存
     *
     * @param seckillId
     * @param killTime
     */
    int reduceNumber(Long seckillId, Date killTime);

    /**
     * 查询库存
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(Long seckillId);

    /**
     * 根据偏移量查询库存
     *
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
