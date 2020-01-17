package com.zr.service.impl;

import com.zr.service.HiService;
import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {

    @Override
    public String sayHi() {

        return "hi,sayHi";
    }
}
