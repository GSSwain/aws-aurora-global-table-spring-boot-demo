package com.gsswain.auroraglobaltabledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SomeService {

    @Autowired
    SomeRepository someRepository;

    @Transactional
    public SomeModel save(SomeModel someModel){
        return this.someRepository.save(someModel);
    }

    @Transactional(readOnly = true)
    public SomeModel findById(String id){
        return this.someRepository.findById(id).orElse(new SomeModel());
    }
}
