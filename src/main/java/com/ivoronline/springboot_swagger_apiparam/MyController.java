package com.ivoronline.springboot_swagger_apiparam;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {

  //=========================================================================
  // HELLO
  //=========================================================================
  @GetMapping("Hello")
    String hello(
      @ApiParam(
        name     = "name",
        type     = "String",
        value    = "Name of the user",
        example  = "John",
        required = true
      )
      @RequestParam String name
  ) {
    return "Hello " + name;
  }

}
