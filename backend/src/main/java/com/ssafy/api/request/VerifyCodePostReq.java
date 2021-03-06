package com.ssafy.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("VerifyCodePostRequest")
public class VerifyCodePostReq {
	@ApiModelProperty(name="회원가입 시 email", example="ssafy@ssafy.com")
	String email;
	@ApiModelProperty(name="회원가입 시 nickname", example="ssafy")
	String nickname;
	@ApiModelProperty(name="회원가입 시 password", example="your_password")
	String password;
}
