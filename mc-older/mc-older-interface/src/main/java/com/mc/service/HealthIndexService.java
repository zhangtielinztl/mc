package com.mc.service;

import com.mc.common.pojo.McResult;
import com.mc.pojo.TbHealthIndex;

import java.util.List;

public interface HealthIndexService {

    List<TbHealthIndex> findTbHealthIndexAll();
    void addTbHealthIndex(TbHealthIndex healthIndex);
}
