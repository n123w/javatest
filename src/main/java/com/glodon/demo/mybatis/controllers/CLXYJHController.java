package com.glodon.demo.mybatis.controllers;

import com.glodon.demo.mybatis.mappers.*;
import com.glodon.demo.mybatis.models.*;
import com.glodon.demo.mybatis.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/clxyjh")
public class CLXYJHController {
    @Autowired
    private CLXYJHMapper clxyjhMapper;
    @Autowired
    private CLXYJHCLMXMapper clxyjhclmxMapper;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @Transactional
    public CLXYJH createUser(CLXYJHProps props) {
        CLXYJH clxyjh = new CLXYJH();
        clxyjhMapper.insert(clxyjh);
        return clxyjh;
    }

    @Transactional
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CLXYJHProps queryUserByIds(@PathVariable long id) {
        CLXYJH clxyjh = clxyjhMapper.selectByPrimaryKey(id);
        if (clxyjh == null) {
            return null;
        }
        CLXYJHProps reuslt = new CLXYJHProps();
        BeanUtils.copyProperties(clxyjh, reuslt);
        CLXYJHCLMXExample example = new CLXYJHCLMXExample();
        CLXYJHCLMXExample.Criteria criteria = example.createCriteria();
        criteria.andClxyjhidEqualTo(id);
        List<CLXYJHCLMX> clmxs = clxyjhclmxMapper.selectByExample(example);
        if (clmxs != null) {
            List<CLXYJHCLMXProps> list=new ArrayList<CLXYJHCLMXProps>(clmxs.size());
            reuslt.setClmxs(list);
            for (CLXYJHCLMX item : clmxs) {
                CLXYJHCLMXProps prop=new CLXYJHCLMXProps();
                BeanUtils.copyProperties(item, prop);
                list.add(prop);
            }
        }
        return reuslt;
    }
}
