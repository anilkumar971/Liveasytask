package com.example.taskLiveasy.service;


import com.example.taskLiveasy.Entity.Load;

import java.util.List;

public interface LoadService {


    Load createLoad(Load load);


    List<Load> getLoadsByShipperId(String shipperId);


    Load getLoadById(Long loadId);


    Load updateLoad(Long loadId, Load load);

    void deleteLoad(Long loadId);
}
