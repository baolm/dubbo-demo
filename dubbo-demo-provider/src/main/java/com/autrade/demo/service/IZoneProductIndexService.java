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
     * ��ȡ��Ʒָ��
     * 
     * @param productType
     *            ��Ʒ����
     * @param day
     *            ָ������(yyyyMMdd)
     * @return
     */
    ZoneProductIndex getZoneProductIndex(String productType);

}
