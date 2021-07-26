package com.backbase.identity.tokenconverter.bas;

import com.backbase.identity.tokenconverter.enhancer.InternalTokenEnhancer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomTokenEnhancer implements InternalTokenEnhancer {
  @Value("communication.transferwise.api-key")
  private String transferwiseApiKey;
  @Override
  public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
    accessToken.getAdditionalInformation().putAll(getCustomClaims());
    return accessToken;
  }

  private Map<String,?> getCustomClaims() {
    Map<String, Object> claims = new HashMap<>();
    claims.put("tw-api-key", transferwiseApiKey);
    return claims;
  }
}
