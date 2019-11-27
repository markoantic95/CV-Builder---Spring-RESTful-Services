/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.controller.rest;

import com.example.CVBuilder.dto.TemplateSectionParamDTO;
import com.example.CVBuilder.service.TemplateSectionParamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marko
 */
@RestController
public class TemplateSectionParamRestController {

    @Autowired
    TemplateSectionParamService service;

    @GetMapping("/templateSectionsParams")
    public @ResponseBody
    List<TemplateSectionParamDTO> returnAllTemplateCvSections() {
        return service.findAll();
    }
}
