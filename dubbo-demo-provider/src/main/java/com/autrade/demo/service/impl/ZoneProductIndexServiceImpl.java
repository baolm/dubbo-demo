/**
 * 
 */
package com.autrade.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autrade.demo.domain.ZoneProductIndex;
import com.autrade.demo.mapper.ZoneProductIndexMapper;
import com.autrade.demo.service.IZoneProductIndexService;

/**
 * @author baolm
 *
 */
@Service
public class ZoneProductIndexServiceImpl implements IZoneProductIndexService {

    @Autowired
    private ZoneProductIndexMapper zoneProductIndexMapper;

    public ZoneProductIndex getZoneProductIndex(String productType) {

        return zoneProductIndexMapper.getZoneProductIndexByProductType(productType);
    }

}
