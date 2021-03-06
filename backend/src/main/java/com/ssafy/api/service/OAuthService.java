package com.ssafy.api.service;

import org.springframework.http.ResponseEntity;

import com.ssafy.api.request.UserRegisterPostReq;
import com.ssafy.common.model.response.BaseResponseBody;
import com.ssafy.db.entity.KakaoProfile;
import com.ssafy.db.entity.OAuthToken;

public interface OAuthService {
	String getKakaoUrl();
	ResponseEntity<String> getKakao();
	ResponseEntity<String> getKakaoToken(String code);
	ResponseEntity<String> getKakaoUserData(OAuthToken oauthToken);
	ResponseEntity<? extends BaseResponseBody> createUser(UserRegisterPostReq userRegisterInfo);
	ResponseEntity<? extends BaseResponseBody> registerAndLogin(KakaoProfile kakaoProfile);
}
