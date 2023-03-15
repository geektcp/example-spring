package com.geektcp.app.controller;

import com.geektcp.common.core.generator.IdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * site: https://github.com/geektcp
 * @author geektcp@163.com on 2023/3/15 10:00.
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class ApiController {

    @GetMapping(path = "/id")
    public String getId() {
        String id = IdGenerator.getId("id_");
        log.info("generator id: {}", id);
        return id;
    }

}
