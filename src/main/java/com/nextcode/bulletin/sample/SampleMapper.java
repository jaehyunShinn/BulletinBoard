package com.nextcode.bulletin.sample;

import com.nextcode.bulletin.sample.domain.SampleDto;
import com.nextcode.bulletin.sample.domain.SampleForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {

    List<SampleDto> getSampleList(SampleForm form);

    void registerSample(SampleDto dto);

    void modifySample(SampleDto dto);

    void removeSample(SampleDto dto);

}