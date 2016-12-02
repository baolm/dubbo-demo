/**
 * 
 */
package com.autrade.demo.service;

import com.autrade.demo.domain.ZoneProductIndex;

/**
 * @author baolm
 *
 */
public interface IZoneProductIndexService {

    /**
     * 获取商品指数
     * 
     * @param productType
     *            商品类型
     * @param day
     *            指数日期(yyyyMMdd)
     * @return
     */
    ZoneProductIndex getZoneProductIndex(String productType);

}
