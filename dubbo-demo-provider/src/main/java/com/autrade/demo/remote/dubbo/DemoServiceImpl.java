/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.autrade.demo.remote.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.autrade.demo.domain.ZoneProductIndex;
import com.autrade.demo.remote.DemoService;
import com.autrade.demo.service.IZoneProductIndexService;

@Service(version = "1.0.0", retries = 2, timeout = 5000)
public class DemoServiceImpl implements DemoService {

    private static final Logger      logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private IZoneProductIndexService zoneProductIndexService;

    public String sayHello(String name) {

        logger.info("Hello {}, request from consumer: {}", name, RpcContext.getContext().getRemoteAddress());

        ZoneProductIndex z = zoneProductIndexService.getZoneProductIndex("HG_CL_YE");
        if (z != null)
            logger.info("get one index number: {}", z.getIndexNumber());

        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}