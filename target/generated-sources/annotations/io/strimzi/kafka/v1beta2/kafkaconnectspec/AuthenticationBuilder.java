package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AuthenticationBuilder extends AuthenticationFluent<AuthenticationBuilder> implements VisitableBuilder<Authentication,AuthenticationBuilder>{
  public AuthenticationBuilder() {
    this(new Authentication());
  }
  
  public AuthenticationBuilder(AuthenticationFluent<?> fluent) {
    this(fluent, new Authentication());
  }
  
  public AuthenticationBuilder(AuthenticationFluent<?> fluent,Authentication instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AuthenticationBuilder(Authentication instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AuthenticationFluent<?> fluent;
  
  public Authentication build() {
    Authentication buildable = new Authentication();
    buildable.setAccessToken(fluent.buildAccessToken());
    buildable.setAccessTokenIsJwt(fluent.getAccessTokenIsJwt());
    buildable.setAudience(fluent.getAudience());
    buildable.setCertificateAndKey(fluent.buildCertificateAndKey());
    buildable.setClientId(fluent.getClientId());
    buildable.setClientSecret(fluent.buildClientSecret());
    buildable.setConnectTimeoutSeconds(fluent.getConnectTimeoutSeconds());
    buildable.setDisableTlsHostnameVerification(fluent.getDisableTlsHostnameVerification());
    buildable.setEnableMetrics(fluent.getEnableMetrics());
    buildable.setHttpRetries(fluent.getHttpRetries());
    buildable.setHttpRetryPauseMs(fluent.getHttpRetryPauseMs());
    buildable.setIncludeAcceptHeader(fluent.getIncludeAcceptHeader());
    buildable.setMaxTokenExpirySeconds(fluent.getMaxTokenExpirySeconds());
    buildable.setPasswordSecret(fluent.buildPasswordSecret());
    buildable.setReadTimeoutSeconds(fluent.getReadTimeoutSeconds());
    buildable.setRefreshToken(fluent.buildRefreshToken());
    buildable.setScope(fluent.getScope());
    buildable.setTlsTrustedCertificates(fluent.buildTlsTrustedCertificates());
    buildable.setTokenEndpointUri(fluent.getTokenEndpointUri());
    buildable.setType(fluent.getType());
    buildable.setUsername(fluent.getUsername());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}