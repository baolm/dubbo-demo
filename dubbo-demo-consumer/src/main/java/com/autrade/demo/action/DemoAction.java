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
package com.autrade.demo.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.autrade.demo.remote.DemoService;

@Service
public class DemoAction implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(DemoAction.class);
    
    @Reference(version = "1.0.0")
    private DemoService demoService;

    public void setDemoService(DemoService demoService) {

        this.demoService = demoService;
    }

    public void start() throws Exception {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                String hello = demoService.sayHello("world" + i);
                
                logger.info("sayHello: {}", hello);
                
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
    }

    public void afterPropertiesSet() throws Exception {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                String hello = demoService.sayHello("world" + i);
                logger.info("sayHello2: {}", hello);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
    }

}