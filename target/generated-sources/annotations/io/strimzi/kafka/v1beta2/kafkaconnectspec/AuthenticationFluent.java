package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.CertificateAndKeyBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.RefreshTokenFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificatesBuilder;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.AccessTokenBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.PasswordSecretFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.RefreshToken;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.AccessToken;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.ClientSecretFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificatesFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.CertificateAndKeyFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.PasswordSecret;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.RefreshTokenBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.PasswordSecretBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificates;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.ClientSecret;
import java.lang.Long;
import java.util.Collection;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.AccessTokenFluent;
import java.lang.Object;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.CertificateAndKey;
import java.util.Map;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.ClientSecretBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class AuthenticationFluent<A extends AuthenticationFluent<A>> extends BaseFluent<A>{
  public AuthenticationFluent() {
  }
  
  public AuthenticationFluent(Authentication instance) {
    this.copyInstance(instance);
  }
  private AccessTokenBuilder accessToken;
  private Boolean accessTokenIsJwt;
  private String audience;
  private CertificateAndKeyBuilder certificateAndKey;
  private String clientId;
  private ClientSecretBuilder clientSecret;
  private Long connectTimeoutSeconds;
  private Boolean disableTlsHostnameVerification;
  private Boolean enableMetrics;
  private Long httpRetries;
  private Long httpRetryPauseMs;
  private Boolean includeAcceptHeader;
  private Long maxTokenExpirySeconds;
  private PasswordSecretBuilder passwordSecret;
  private Long readTimeoutSeconds;
  private RefreshTokenBuilder refreshToken;
  private String scope;
  private ArrayList<TlsTrustedCertificatesBuilder> tlsTrustedCertificates;
  private String tokenEndpointUri;
  private Authentication.Type type;
  private String username;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Authentication instance) {
    instance = (instance != null ? instance : new Authentication());
    if (instance != null) {
          this.withAccessToken(instance.getAccessToken());
          this.withAccessTokenIsJwt(instance.getAccessTokenIsJwt());
          this.withAudience(instance.getAudience());
          this.withCertificateAndKey(instance.getCertificateAndKey());
          this.withClientId(instance.getClientId());
          this.withClientSecret(instance.getClientSecret());
          this.withConnectTimeoutSeconds(instance.getConnectTimeoutSeconds());
          this.withDisableTlsHostnameVerification(instance.getDisableTlsHostnameVerification());
          this.withEnableMetrics(instance.getEnableMetrics());
          this.withHttpRetries(instance.getHttpRetries());
          this.withHttpRetryPauseMs(instance.getHttpRetryPauseMs());
          this.withIncludeAcceptHeader(instance.getIncludeAcceptHeader());
          this.withMaxTokenExpirySeconds(instance.getMaxTokenExpirySeconds());
          this.withPasswordSecret(instance.getPasswordSecret());
          this.withReadTimeoutSeconds(instance.getReadTimeoutSeconds());
          this.withRefreshToken(instance.getRefreshToken());
          this.withScope(instance.getScope());
          this.withTlsTrustedCertificates(instance.getTlsTrustedCertificates());
          this.withTokenEndpointUri(instance.getTokenEndpointUri());
          this.withType(instance.getType());
          this.withUsername(instance.getUsername());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public AccessToken buildAccessToken() {
    return this.accessToken != null ? this.accessToken.build() : null;
  }
  
  public A withAccessToken(AccessToken accessToken) {
    this._visitables.remove("accessToken");
    if (accessToken != null) {
        this.accessToken = new AccessTokenBuilder(accessToken);
        this._visitables.get("accessToken").add(this.accessToken);
    } else {
        this.accessToken = null;
        this._visitables.get("accessToken").remove(this.accessToken);
    }
    return (A) this;
  }
  
  public boolean hasAccessToken() {
    return this.accessToken != null;
  }
  
  public AccessTokenNested<A> withNewAccessToken() {
    return new AccessTokenNested(null);
  }
  
  public AccessTokenNested<A> withNewAccessTokenLike(AccessToken item) {
    return new AccessTokenNested(item);
  }
  
  public AccessTokenNested<A> editIoAccessToken() {
    return withNewAccessTokenLike(java.util.Optional.ofNullable(buildAccessToken()).orElse(null));
  }
  
  public AccessTokenNested<A> editOrNewAccessToken() {
    return withNewAccessTokenLike(java.util.Optional.ofNullable(buildAccessToken()).orElse(new AccessTokenBuilder().build()));
  }
  
  public AccessTokenNested<A> editOrNewAccessTokenLike(AccessToken item) {
    return withNewAccessTokenLike(java.util.Optional.ofNullable(buildAccessToken()).orElse(item));
  }
  
  public Boolean getAccessTokenIsJwt() {
    return this.accessTokenIsJwt;
  }
  
  public A withAccessTokenIsJwt(Boolean accessTokenIsJwt) {
    this.accessTokenIsJwt = accessTokenIsJwt;
    return (A) this;
  }
  
  public boolean hasAccessTokenIsJwt() {
    return this.accessTokenIsJwt != null;
  }
  
  public String getAudience() {
    return this.audience;
  }
  
  public A withAudience(String audience) {
    this.audience = audience;
    return (A) this;
  }
  
  public boolean hasAudience() {
    return this.audience != null;
  }
  
  public CertificateAndKey buildCertificateAndKey() {
    return this.certificateAndKey != null ? this.certificateAndKey.build() : null;
  }
  
  public A withCertificateAndKey(CertificateAndKey certificateAndKey) {
    this._visitables.remove("certificateAndKey");
    if (certificateAndKey != null) {
        this.certificateAndKey = new CertificateAndKeyBuilder(certificateAndKey);
        this._visitables.get("certificateAndKey").add(this.certificateAndKey);
    } else {
        this.certificateAndKey = null;
        this._visitables.get("certificateAndKey").remove(this.certificateAndKey);
    }
    return (A) this;
  }
  
  public boolean hasCertificateAndKey() {
    return this.certificateAndKey != null;
  }
  
  public CertificateAndKeyNested<A> withNewCertificateAndKey() {
    return new CertificateAndKeyNested(null);
  }
  
  public CertificateAndKeyNested<A> withNewCertificateAndKeyLike(CertificateAndKey item) {
    return new CertificateAndKeyNested(item);
  }
  
  public CertificateAndKeyNested<A> editIoCertificateAndKey() {
    return withNewCertificateAndKeyLike(java.util.Optional.ofNullable(buildCertificateAndKey()).orElse(null));
  }
  
  public CertificateAndKeyNested<A> editOrNewCertificateAndKey() {
    return withNewCertificateAndKeyLike(java.util.Optional.ofNullable(buildCertificateAndKey()).orElse(new CertificateAndKeyBuilder().build()));
  }
  
  public CertificateAndKeyNested<A> editOrNewCertificateAndKeyLike(CertificateAndKey item) {
    return withNewCertificateAndKeyLike(java.util.Optional.ofNullable(buildCertificateAndKey()).orElse(item));
  }
  
  public String getClientId() {
    return this.clientId;
  }
  
  public A withClientId(String clientId) {
    this.clientId = clientId;
    return (A) this;
  }
  
  public boolean hasClientId() {
    return this.clientId != null;
  }
  
  public ClientSecret buildClientSecret() {
    return this.clientSecret != null ? this.clientSecret.build() : null;
  }
  
  public A withClientSecret(ClientSecret clientSecret) {
    this._visitables.remove("clientSecret");
    if (clientSecret != null) {
        this.clientSecret = new ClientSecretBuilder(clientSecret);
        this._visitables.get("clientSecret").add(this.clientSecret);
    } else {
        this.clientSecret = null;
        this._visitables.get("clientSecret").remove(this.clientSecret);
    }
    return (A) this;
  }
  
  public boolean hasClientSecret() {
    return this.clientSecret != null;
  }
  
  public ClientSecretNested<A> withNewClientSecret() {
    return new ClientSecretNested(null);
  }
  
  public ClientSecretNested<A> withNewClientSecretLike(ClientSecret item) {
    return new ClientSecretNested(item);
  }
  
  public ClientSecretNested<A> editIoClientSecret() {
    return withNewClientSecretLike(java.util.Optional.ofNullable(buildClientSecret()).orElse(null));
  }
  
  public ClientSecretNested<A> editOrNewClientSecret() {
    return withNewClientSecretLike(java.util.Optional.ofNullable(buildClientSecret()).orElse(new ClientSecretBuilder().build()));
  }
  
  public ClientSecretNested<A> editOrNewClientSecretLike(ClientSecret item) {
    return withNewClientSecretLike(java.util.Optional.ofNullable(buildClientSecret()).orElse(item));
  }
  
  public Long getConnectTimeoutSeconds() {
    return this.connectTimeoutSeconds;
  }
  
  public A withConnectTimeoutSeconds(Long connectTimeoutSeconds) {
    this.connectTimeoutSeconds = connectTimeoutSeconds;
    return (A) this;
  }
  
  public boolean hasConnectTimeoutSeconds() {
    return this.connectTimeoutSeconds != null;
  }
  
  public Boolean getDisableTlsHostnameVerification() {
    return this.disableTlsHostnameVerification;
  }
  
  public A withDisableTlsHostnameVerification(Boolean disableTlsHostnameVerification) {
    this.disableTlsHostnameVerification = disableTlsHostnameVerification;
    return (A) this;
  }
  
  public boolean hasDisableTlsHostnameVerification() {
    return this.disableTlsHostnameVerification != null;
  }
  
  public Boolean getEnableMetrics() {
    return this.enableMetrics;
  }
  
  public A withEnableMetrics(Boolean enableMetrics) {
    this.enableMetrics = enableMetrics;
    return (A) this;
  }
  
  public boolean hasEnableMetrics() {
    return this.enableMetrics != null;
  }
  
  public Long getHttpRetries() {
    return this.httpRetries;
  }
  
  public A withHttpRetries(Long httpRetries) {
    this.httpRetries = httpRetries;
    return (A) this;
  }
  
  public boolean hasHttpRetries() {
    return this.httpRetries != null;
  }
  
  public Long getHttpRetryPauseMs() {
    return this.httpRetryPauseMs;
  }
  
  public A withHttpRetryPauseMs(Long httpRetryPauseMs) {
    this.httpRetryPauseMs = httpRetryPauseMs;
    return (A) this;
  }
  
  public boolean hasHttpRetryPauseMs() {
    return this.httpRetryPauseMs != null;
  }
  
  public Boolean getIncludeAcceptHeader() {
    return this.includeAcceptHeader;
  }
  
  public A withIncludeAcceptHeader(Boolean includeAcceptHeader) {
    this.includeAcceptHeader = includeAcceptHeader;
    return (A) this;
  }
  
  public boolean hasIncludeAcceptHeader() {
    return this.includeAcceptHeader != null;
  }
  
  public Long getMaxTokenExpirySeconds() {
    return this.maxTokenExpirySeconds;
  }
  
  public A withMaxTokenExpirySeconds(Long maxTokenExpirySeconds) {
    this.maxTokenExpirySeconds = maxTokenExpirySeconds;
    return (A) this;
  }
  
  public boolean hasMaxTokenExpirySeconds() {
    return this.maxTokenExpirySeconds != null;
  }
  
  public PasswordSecret buildPasswordSecret() {
    return this.passwordSecret != null ? this.passwordSecret.build() : null;
  }
  
  public A withPasswordSecret(PasswordSecret passwordSecret) {
    this._visitables.remove("passwordSecret");
    if (passwordSecret != null) {
        this.passwordSecret = new PasswordSecretBuilder(passwordSecret);
        this._visitables.get("passwordSecret").add(this.passwordSecret);
    } else {
        this.passwordSecret = null;
        this._visitables.get("passwordSecret").remove(this.passwordSecret);
    }
    return (A) this;
  }
  
  public boolean hasPasswordSecret() {
    return this.passwordSecret != null;
  }
  
  public PasswordSecretNested<A> withNewPasswordSecret() {
    return new PasswordSecretNested(null);
  }
  
  public PasswordSecretNested<A> withNewPasswordSecretLike(PasswordSecret item) {
    return new PasswordSecretNested(item);
  }
  
  public PasswordSecretNested<A> editIoPasswordSecret() {
    return withNewPasswordSecretLike(java.util.Optional.ofNullable(buildPasswordSecret()).orElse(null));
  }
  
  public PasswordSecretNested<A> editOrNewPasswordSecret() {
    return withNewPasswordSecretLike(java.util.Optional.ofNullable(buildPasswordSecret()).orElse(new PasswordSecretBuilder().build()));
  }
  
  public PasswordSecretNested<A> editOrNewPasswordSecretLike(PasswordSecret item) {
    return withNewPasswordSecretLike(java.util.Optional.ofNullable(buildPasswordSecret()).orElse(item));
  }
  
  public Long getReadTimeoutSeconds() {
    return this.readTimeoutSeconds;
  }
  
  public A withReadTimeoutSeconds(Long readTimeoutSeconds) {
    this.readTimeoutSeconds = readTimeoutSeconds;
    return (A) this;
  }
  
  public boolean hasReadTimeoutSeconds() {
    return this.readTimeoutSeconds != null;
  }
  
  public RefreshToken buildRefreshToken() {
    return this.refreshToken != null ? this.refreshToken.build() : null;
  }
  
  public A withRefreshToken(RefreshToken refreshToken) {
    this._visitables.remove("refreshToken");
    if (refreshToken != null) {
        this.refreshToken = new RefreshTokenBuilder(refreshToken);
        this._visitables.get("refreshToken").add(this.refreshToken);
    } else {
        this.refreshToken = null;
        this._visitables.get("refreshToken").remove(this.refreshToken);
    }
    return (A) this;
  }
  
  public boolean hasRefreshToken() {
    return this.refreshToken != null;
  }
  
  public RefreshTokenNested<A> withNewRefreshToken() {
    return new RefreshTokenNested(null);
  }
  
  public RefreshTokenNested<A> withNewRefreshTokenLike(RefreshToken item) {
    return new RefreshTokenNested(item);
  }
  
  public RefreshTokenNested<A> editIoRefreshToken() {
    return withNewRefreshTokenLike(java.util.Optional.ofNullable(buildRefreshToken()).orElse(null));
  }
  
  public RefreshTokenNested<A> editOrNewRefreshToken() {
    return withNewRefreshTokenLike(java.util.Optional.ofNullable(buildRefreshToken()).orElse(new RefreshTokenBuilder().build()));
  }
  
  public RefreshTokenNested<A> editOrNewRefreshTokenLike(RefreshToken item) {
    return withNewRefreshTokenLike(java.util.Optional.ofNullable(buildRefreshToken()).orElse(item));
  }
  
  public String getScope() {
    return this.scope;
  }
  
  public A withScope(String scope) {
    this.scope = scope;
    return (A) this;
  }
  
  public boolean hasScope() {
    return this.scope != null;
  }
  
  public A addToTlsTrustedCertificates(int index,TlsTrustedCertificates item) {
    if (this.tlsTrustedCertificates == null) {this.tlsTrustedCertificates = new ArrayList<TlsTrustedCertificatesBuilder>();}
    TlsTrustedCertificatesBuilder builder = new TlsTrustedCertificatesBuilder(item);
    if (index < 0 || index >= tlsTrustedCertificates.size()) { _visitables.get("tlsTrustedCertificates").add(builder); tlsTrustedCertificates.add(builder); } else { _visitables.get("tlsTrustedCertificates").add(index, builder); tlsTrustedCertificates.add(index, builder);}
    return (A)this;
  }
  
  public A setToTlsTrustedCertificates(int index,TlsTrustedCertificates item) {
    if (this.tlsTrustedCertificates == null) {this.tlsTrustedCertificates = new ArrayList<TlsTrustedCertificatesBuilder>();}
    TlsTrustedCertificatesBuilder builder = new TlsTrustedCertificatesBuilder(item);
    if (index < 0 || index >= tlsTrustedCertificates.size()) { _visitables.get("tlsTrustedCertificates").add(builder); tlsTrustedCertificates.add(builder); } else { _visitables.get("tlsTrustedCertificates").set(index, builder); tlsTrustedCertificates.set(index, builder);}
    return (A)this;
  }
  
  public A addToTlsTrustedCertificates(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificates... items) {
    if (this.tlsTrustedCertificates == null) {this.tlsTrustedCertificates = new ArrayList<TlsTrustedCertificatesBuilder>();}
    for (TlsTrustedCertificates item : items) {TlsTrustedCertificatesBuilder builder = new TlsTrustedCertificatesBuilder(item);_visitables.get("tlsTrustedCertificates").add(builder);this.tlsTrustedCertificates.add(builder);} return (A)this;
  }
  
  public A addAllToIoTlsTrustedCertificates(Collection<TlsTrustedCertificates> items) {
    if (this.tlsTrustedCertificates == null) {this.tlsTrustedCertificates = new ArrayList<TlsTrustedCertificatesBuilder>();}
    for (TlsTrustedCertificates item : items) {TlsTrustedCertificatesBuilder builder = new TlsTrustedCertificatesBuilder(item);_visitables.get("tlsTrustedCertificates").add(builder);this.tlsTrustedCertificates.add(builder);} return (A)this;
  }
  
  public A removeFromTlsTrustedCertificates(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificates... items) {
    if (this.tlsTrustedCertificates == null) return (A)this;
    for (TlsTrustedCertificates item : items) {TlsTrustedCertificatesBuilder builder = new TlsTrustedCertificatesBuilder(item);_visitables.get("tlsTrustedCertificates").remove(builder); this.tlsTrustedCertificates.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIoTlsTrustedCertificates(Collection<TlsTrustedCertificates> items) {
    if (this.tlsTrustedCertificates == null) return (A)this;
    for (TlsTrustedCertificates item : items) {TlsTrustedCertificatesBuilder builder = new TlsTrustedCertificatesBuilder(item);_visitables.get("tlsTrustedCertificates").remove(builder); this.tlsTrustedCertificates.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIoTlsTrustedCertificates(Predicate<TlsTrustedCertificatesBuilder> predicate) {
    if (tlsTrustedCertificates == null) return (A) this;
    final Iterator<TlsTrustedCertificatesBuilder> each = tlsTrustedCertificates.iterator();
    final List visitables = _visitables.get("tlsTrustedCertificates");
    while (each.hasNext()) {
      TlsTrustedCertificatesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<TlsTrustedCertificates> buildTlsTrustedCertificates() {
    return this.tlsTrustedCertificates != null ? build(tlsTrustedCertificates) : null;
  }
  
  public TlsTrustedCertificates buildTlsTrustedCertificate(int index) {
    return this.tlsTrustedCertificates.get(index).build();
  }
  
  public TlsTrustedCertificates buildFirstTlsTrustedCertificate() {
    return this.tlsTrustedCertificates.get(0).build();
  }
  
  public TlsTrustedCertificates buildLastTlsTrustedCertificate() {
    return this.tlsTrustedCertificates.get(tlsTrustedCertificates.size() - 1).build();
  }
  
  public TlsTrustedCertificates buildMatchingTlsTrustedCertificate(Predicate<TlsTrustedCertificatesBuilder> predicate) {
      for (TlsTrustedCertificatesBuilder item : tlsTrustedCertificates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTlsTrustedCertificate(Predicate<TlsTrustedCertificatesBuilder> predicate) {
      for (TlsTrustedCertificatesBuilder item : tlsTrustedCertificates) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTlsTrustedCertificates(List<TlsTrustedCertificates> tlsTrustedCertificates) {
    if (this.tlsTrustedCertificates != null) {
      this._visitables.get("tlsTrustedCertificates").clear();
    }
    if (tlsTrustedCertificates != null) {
        this.tlsTrustedCertificates = new ArrayList();
        for (TlsTrustedCertificates item : tlsTrustedCertificates) {
          this.addToTlsTrustedCertificates(item);
        }
    } else {
      this.tlsTrustedCertificates = null;
    }
    return (A) this;
  }
  
  public A withTlsTrustedCertificates(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificates... tlsTrustedCertificates) {
    if (this.tlsTrustedCertificates != null) {
        this.tlsTrustedCertificates.clear();
        _visitables.remove("tlsTrustedCertificates");
    }
    if (tlsTrustedCertificates != null) {
      for (TlsTrustedCertificates item : tlsTrustedCertificates) {
        this.addToTlsTrustedCertificates(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTlsTrustedCertificates() {
    return this.tlsTrustedCertificates != null && !this.tlsTrustedCertificates.isEmpty();
  }
  
  public TlsTrustedCertificatesNested<A> addNewTlsTrustedCertificate() {
    return new TlsTrustedCertificatesNested(-1, null);
  }
  
  public TlsTrustedCertificatesNested<A> addNewTlsTrustedCertificateLike(TlsTrustedCertificates item) {
    return new TlsTrustedCertificatesNested(-1, item);
  }
  
  public TlsTrustedCertificatesNested<A> setNewTlsTrustedCertificateLike(int index,TlsTrustedCertificates item) {
    return new TlsTrustedCertificatesNested(index, item);
  }
  
  public TlsTrustedCertificatesNested<A> editTlsTrustedCertificate(int index) {
    if (tlsTrustedCertificates.size() <= index) throw new RuntimeException("Can't edit tlsTrustedCertificates. Index exceeds size.");
    return setNewTlsTrustedCertificateLike(index, buildTlsTrustedCertificate(index));
  }
  
  public TlsTrustedCertificatesNested<A> editFirstTlsTrustedCertificate() {
    if (tlsTrustedCertificates.size() == 0) throw new RuntimeException("Can't edit first tlsTrustedCertificates. The list is empty.");
    return setNewTlsTrustedCertificateLike(0, buildTlsTrustedCertificate(0));
  }
  
  public TlsTrustedCertificatesNested<A> editLastTlsTrustedCertificate() {
    int index = tlsTrustedCertificates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tlsTrustedCertificates. The list is empty.");
    return setNewTlsTrustedCertificateLike(index, buildTlsTrustedCertificate(index));
  }
  
  public TlsTrustedCertificatesNested<A> editMatchingTlsTrustedCertificate(Predicate<TlsTrustedCertificatesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tlsTrustedCertificates.size();i++) { 
    if (predicate.test(tlsTrustedCertificates.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tlsTrustedCertificates. No match found.");
    return setNewTlsTrustedCertificateLike(index, buildTlsTrustedCertificate(index));
  }
  
  public String getTokenEndpointUri() {
    return this.tokenEndpointUri;
  }
  
  public A withTokenEndpointUri(String tokenEndpointUri) {
    this.tokenEndpointUri = tokenEndpointUri;
    return (A) this;
  }
  
  public boolean hasTokenEndpointUri() {
    return this.tokenEndpointUri != null;
  }
  
  public Authentication.Type getType() {
    return this.type;
  }
  
  public A withType(Authentication.Type type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public A withUsername(String username) {
    this.username = username;
    return (A) this;
  }
  
  public boolean hasUsername() {
    return this.username != null;
  }
  
  public A addToAdditionalProperties(String key,Object value) {
    if(this.additionalProperties == null && key != null && value != null) { this.additionalProperties = new LinkedHashMap(); }
    if(key != null && value != null) {this.additionalProperties.put(key, value);} return (A)this;
  }
  
  public A addToAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null && map != null) { this.additionalProperties = new LinkedHashMap(); }
    if(map != null) { this.additionalProperties.putAll(map);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(String key) {
    if(this.additionalProperties == null) { return (A) this; }
    if(key != null && this.additionalProperties != null) {this.additionalProperties.remove(key);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.additionalProperties != null){this.additionalProperties.remove(key);}}} return (A)this;
  }
  
  public Map<String,Object> getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public <K,V>A withAdditionalProperties(Map<String,Object> additionalProperties) {
    if (additionalProperties == null) {
      this.additionalProperties = null;
    } else {
      this.additionalProperties = new LinkedHashMap(additionalProperties);
    }
    return (A) this;
  }
  
  public boolean hasAdditionalProperties() {
    return this.additionalProperties != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    AuthenticationFluent that = (AuthenticationFluent) o;
    if (!java.util.Objects.equals(accessToken, that.accessToken)) return false;
    if (!java.util.Objects.equals(accessTokenIsJwt, that.accessTokenIsJwt)) return false;
    if (!java.util.Objects.equals(audience, that.audience)) return false;
    if (!java.util.Objects.equals(certificateAndKey, that.certificateAndKey)) return false;
    if (!java.util.Objects.equals(clientId, that.clientId)) return false;
    if (!java.util.Objects.equals(clientSecret, that.clientSecret)) return false;
    if (!java.util.Objects.equals(connectTimeoutSeconds, that.connectTimeoutSeconds)) return false;
    if (!java.util.Objects.equals(disableTlsHostnameVerification, that.disableTlsHostnameVerification)) return false;
    if (!java.util.Objects.equals(enableMetrics, that.enableMetrics)) return false;
    if (!java.util.Objects.equals(httpRetries, that.httpRetries)) return false;
    if (!java.util.Objects.equals(httpRetryPauseMs, that.httpRetryPauseMs)) return false;
    if (!java.util.Objects.equals(includeAcceptHeader, that.includeAcceptHeader)) return false;
    if (!java.util.Objects.equals(maxTokenExpirySeconds, that.maxTokenExpirySeconds)) return false;
    if (!java.util.Objects.equals(passwordSecret, that.passwordSecret)) return false;
    if (!java.util.Objects.equals(readTimeoutSeconds, that.readTimeoutSeconds)) return false;
    if (!java.util.Objects.equals(refreshToken, that.refreshToken)) return false;
    if (!java.util.Objects.equals(scope, that.scope)) return false;
    if (!java.util.Objects.equals(tlsTrustedCertificates, that.tlsTrustedCertificates)) return false;
    if (!java.util.Objects.equals(tokenEndpointUri, that.tokenEndpointUri)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(username, that.username)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(accessToken,  accessTokenIsJwt,  audience,  certificateAndKey,  clientId,  clientSecret,  connectTimeoutSeconds,  disableTlsHostnameVerification,  enableMetrics,  httpRetries,  httpRetryPauseMs,  includeAcceptHeader,  maxTokenExpirySeconds,  passwordSecret,  readTimeoutSeconds,  refreshToken,  scope,  tlsTrustedCertificates,  tokenEndpointUri,  type,  username,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (accessToken != null) { sb.append("accessToken:"); sb.append(accessToken + ","); }
    if (accessTokenIsJwt != null) { sb.append("accessTokenIsJwt:"); sb.append(accessTokenIsJwt + ","); }
    if (audience != null) { sb.append("audience:"); sb.append(audience + ","); }
    if (certificateAndKey != null) { sb.append("certificateAndKey:"); sb.append(certificateAndKey + ","); }
    if (clientId != null) { sb.append("clientId:"); sb.append(clientId + ","); }
    if (clientSecret != null) { sb.append("clientSecret:"); sb.append(clientSecret + ","); }
    if (connectTimeoutSeconds != null) { sb.append("connectTimeoutSeconds:"); sb.append(connectTimeoutSeconds + ","); }
    if (disableTlsHostnameVerification != null) { sb.append("disableTlsHostnameVerification:"); sb.append(disableTlsHostnameVerification + ","); }
    if (enableMetrics != null) { sb.append("enableMetrics:"); sb.append(enableMetrics + ","); }
    if (httpRetries != null) { sb.append("httpRetries:"); sb.append(httpRetries + ","); }
    if (httpRetryPauseMs != null) { sb.append("httpRetryPauseMs:"); sb.append(httpRetryPauseMs + ","); }
    if (includeAcceptHeader != null) { sb.append("includeAcceptHeader:"); sb.append(includeAcceptHeader + ","); }
    if (maxTokenExpirySeconds != null) { sb.append("maxTokenExpirySeconds:"); sb.append(maxTokenExpirySeconds + ","); }
    if (passwordSecret != null) { sb.append("passwordSecret:"); sb.append(passwordSecret + ","); }
    if (readTimeoutSeconds != null) { sb.append("readTimeoutSeconds:"); sb.append(readTimeoutSeconds + ","); }
    if (refreshToken != null) { sb.append("refreshToken:"); sb.append(refreshToken + ","); }
    if (scope != null) { sb.append("scope:"); sb.append(scope + ","); }
    if (tlsTrustedCertificates != null && !tlsTrustedCertificates.isEmpty()) { sb.append("tlsTrustedCertificates:"); sb.append(tlsTrustedCertificates + ","); }
    if (tokenEndpointUri != null) { sb.append("tokenEndpointUri:"); sb.append(tokenEndpointUri + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (username != null) { sb.append("username:"); sb.append(username + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAccessTokenIsJwt() {
    return withAccessTokenIsJwt(true);
  }
  
  public A withDisableTlsHostnameVerification() {
    return withDisableTlsHostnameVerification(true);
  }
  
  public A withEnableMetrics() {
    return withEnableMetrics(true);
  }
  
  public A withIncludeAcceptHeader() {
    return withIncludeAcceptHeader(true);
  }
  public class AccessTokenNested<N> extends AccessTokenFluent<AccessTokenNested<N>> implements Nested<N>{
    AccessTokenNested(AccessToken item) {
      this.builder = new AccessTokenBuilder(this, item);
    }
    AccessTokenBuilder builder;
    
    public N and() {
      return (N) AuthenticationFluent.this.withAccessToken(builder.build());
    }
    
    public N endIoAccessToken() {
      return and();
    }
    
  
  }
  public class CertificateAndKeyNested<N> extends CertificateAndKeyFluent<CertificateAndKeyNested<N>> implements Nested<N>{
    CertificateAndKeyNested(CertificateAndKey item) {
      this.builder = new CertificateAndKeyBuilder(this, item);
    }
    CertificateAndKeyBuilder builder;
    
    public N and() {
      return (N) AuthenticationFluent.this.withCertificateAndKey(builder.build());
    }
    
    public N endIoCertificateAndKey() {
      return and();
    }
    
  
  }
  public class ClientSecretNested<N> extends ClientSecretFluent<ClientSecretNested<N>> implements Nested<N>{
    ClientSecretNested(ClientSecret item) {
      this.builder = new ClientSecretBuilder(this, item);
    }
    ClientSecretBuilder builder;
    
    public N and() {
      return (N) AuthenticationFluent.this.withClientSecret(builder.build());
    }
    
    public N endIoClientSecret() {
      return and();
    }
    
  
  }
  public class PasswordSecretNested<N> extends PasswordSecretFluent<PasswordSecretNested<N>> implements Nested<N>{
    PasswordSecretNested(PasswordSecret item) {
      this.builder = new PasswordSecretBuilder(this, item);
    }
    PasswordSecretBuilder builder;
    
    public N and() {
      return (N) AuthenticationFluent.this.withPasswordSecret(builder.build());
    }
    
    public N endIoPasswordSecret() {
      return and();
    }
    
  
  }
  public class RefreshTokenNested<N> extends RefreshTokenFluent<RefreshTokenNested<N>> implements Nested<N>{
    RefreshTokenNested(RefreshToken item) {
      this.builder = new RefreshTokenBuilder(this, item);
    }
    RefreshTokenBuilder builder;
    
    public N and() {
      return (N) AuthenticationFluent.this.withRefreshToken(builder.build());
    }
    
    public N endIoRefreshToken() {
      return and();
    }
    
  
  }
  public class TlsTrustedCertificatesNested<N> extends TlsTrustedCertificatesFluent<TlsTrustedCertificatesNested<N>> implements Nested<N>{
    TlsTrustedCertificatesNested(int index,TlsTrustedCertificates item) {
      this.index = index;
      this.builder = new TlsTrustedCertificatesBuilder(this, item);
    }
    TlsTrustedCertificatesBuilder builder;
    int index;
    
    public N and() {
      return (N) AuthenticationFluent.this.setToTlsTrustedCertificates(index,builder.build());
    }
    
    public N endIoTlsTrustedCertificate() {
      return and();
    }
    
  
  }

}