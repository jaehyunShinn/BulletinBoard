package com.nextcode.bulletin.sample;

import com.nextcode.bulletin.sample.domain.SampleDto;
import com.nextcode.bulletin.sample.domain.SampleForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/sample")
public class SampleController {
    @Autowired
    private SampleService sampleService;


    @RequestMapping("/sampleList")
    public void sampleList(SampleForm form, HttpServletRequest request, Model model){

        List<SampleDto> sampleList = sampleService.getSampleList(form);

        model.addAttribute("list", sampleList);


    }
}
