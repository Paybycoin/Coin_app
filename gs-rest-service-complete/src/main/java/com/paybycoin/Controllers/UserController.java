package com.paybycoin.Controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.paybycoin.domain.Customer;

public class UserController {
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Boolean Authenticate(@RequestBody Customer user) {
      return true; 
    }
}
