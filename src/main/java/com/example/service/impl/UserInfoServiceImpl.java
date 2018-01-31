package com.example.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.example.input.UserInfoInput;
import com.example.output.UserInfoOutput;
import com.example.service.UserInfoService;

@WebService(targetNamespace = "http://service.example.com/")
@Component
public class UserInfoServiceImpl implements UserInfoService {

	@Override
	public UserInfoOutput getUserInfo(UserInfoInput input) {
		UserInfoOutput output = new UserInfoOutput();
		if (null != input) {
			if (input.getCard_id().equals("123456") && input.getUser_name().equals("lc")) {
				output.setUser_age("18");
				output.setUser_address("地球");
			}

		}
		return output;
	}

}
