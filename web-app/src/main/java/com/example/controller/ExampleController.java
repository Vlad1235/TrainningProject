package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.json.model.ShippingAddress; // сам руками прописал путь. Иначе не работало

@RestController
public class ExampleController {

  @RequestMapping("/")
  public ShippingAddress getShipping() {
    return new ShippingAddress();
  }
}
