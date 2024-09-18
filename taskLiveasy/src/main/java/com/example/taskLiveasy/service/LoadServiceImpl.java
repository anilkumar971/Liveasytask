package com.example.taskLiveasy.service;


import com.example.taskLiveasy.Entity.Load;
import com.example.taskLiveasy.repo.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {


    @Autowired
    private LoadRepository loadRepository;

    @Override
    public Load createLoad(Load load) {
        return loadRepository.save(load);
    }



    @Override
    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }



    @Override
    public Load getLoadById(Long loadId) {
        return loadRepository.findById(loadId).orElse(null);
    }



    @Override
    public Load updateLoad(Long loadId, Load load) {
        load.setId(loadId);
        return loadRepository.save(load);
    }



    @Override
    public void deleteLoad(Long loadId) {
        loadRepository.deleteById(loadId);
    }
}
