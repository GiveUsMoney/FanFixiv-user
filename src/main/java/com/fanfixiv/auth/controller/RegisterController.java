package com.fanfixiv.auth.controller;

import com.fanfixiv.auth.dto.register.CertEmailResultDto;
import com.fanfixiv.auth.dto.register.DoubleCheckDto;
import com.fanfixiv.auth.dto.register.RegisterDto;
import com.fanfixiv.auth.dto.register.RegisterResultDto;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class RegisterController {
  @PostMapping("/register")
  public RegisterResultDto register(@RequestBody @Valid RegisterDto registerDto) {
    return new RegisterResultDto();
  }

  @GetMapping("/dc-nick")
  public DoubleCheckDto isNickDouble(@RequestParam String nickname) {
    return new DoubleCheckDto();
  }

  @GetMapping("/cert-email")
  public CertEmailResultDto certEmail(@RequestParam String nickname) {
    return new CertEmailResultDto();
  }
}