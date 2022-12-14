package com.fanfixiv.auth.controller;

import com.fanfixiv.auth.dto.TempEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Profile({ "!prod" })
@RestController
@RequiredArgsConstructor
@Api(tags = { "임시 API (후일 테스트와 함께 삭제해주세요)" })
public class TempController {

  private static int ID = 0;

  @GetMapping("/")
  @ApiOperation(value = "임시 API")
  public TempEntity temporary(@RequestParam(defaultValue = "Hello World!!!") String content) {
    return new TempEntity(ID++, content);
  }
}
