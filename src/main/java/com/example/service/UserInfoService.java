package com.example.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.example.input.UserInfoInput;
import com.example.output.UserInfoOutput;

@WebService
public interface UserInfoService {
	@WebResult(name="paramOutput")
	public UserInfoOutput getUserInfo(@WebParam(name="paramInput")UserInfoInput input);
}
