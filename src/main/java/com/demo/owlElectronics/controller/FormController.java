package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.data.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/playground")
public class FormController {
    @Autowired
    private FormRepository playgroundRepository;
}
