package com.nextcode.bulletin.sample;

import com.nextcode.bulletin.sample.domain.SampleDto;
import com.nextcode.bulletin.sample.domain.SampleForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {
    @Autowired
    private SampleMapper sampleMapper;

    public List<SampleDto> getSampleList(SampleForm form) {
        return sampleMapper.getSampleList(form);
    }

    public void registerSample(SampleDto dto) {
        sampleMapper.registerSample(dto);
    }

    public void modifySample(SampleDto dto) {
        sampleMapper.modifySample(dto);
    }

    public void removeSample(SampleDto dto) {
        sampleMapper.removeSample(dto);
    }


}
