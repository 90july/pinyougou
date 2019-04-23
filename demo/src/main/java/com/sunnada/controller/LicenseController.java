package com.sunnada.controller;

import com.sunnada.mapper.LicenseMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LicenseController {
    @Resource
    private LicenseMapper licenseMapper;

    @RequestMapping("/license/{id}")
    public String selectById(@PathVariable int id, Model model){
        model.addAttribute("license",licenseMapper.selectById(id));
        return "redirect:/";
//        return "redirect:/index";
    }
}
