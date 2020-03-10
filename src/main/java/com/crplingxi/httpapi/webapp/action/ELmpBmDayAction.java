package com.crplingxi.httpapi.webapp.action;

import com.crplingxi.httpapi.webapp.domain.ELmpBmDay;
import com.crplingxi.httpapi.webapp.service.ELmpBmDayService;
import com.crplingxi.httpapi.webapp.service.ELmpEngyDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: LCD
 * @date Create in: 14:42 2020/3/10
 * @description：
 * @modify:
 * @see: com.crplingxi.httpapi.webapp.action
 */
@ControllerAdvice
@RequestMapping("/elmp")
public class ELmpBmDayAction {

    @Autowired
    @Qualifier("ELmpBmDayServiceImpl")
    private ELmpBmDayService eLmpBmDayService;

    @ResponseBody
    @RequestMapping("/send")
    public String putTest() {
        List<ELmpBmDay> list = eLmpBmDayService.findByWhere(null);
        System.out.println(list.size());
        return null;
    }
}
