package io.strimzi.kafka.v1beta2.kafkaconnectspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"accessToken","accessTokenIsJwt","audience","certificateAndKey","clientId","clientSecret","connectTimeoutSeconds","disableTlsHostnameVerification","enableMetrics","httpRetries","httpRetryPauseMs","includeAcceptHeader","maxTokenExpirySeconds","passwordSecret","readTimeoutSeconds","refreshToken","scope","tlsTrustedCertificates","tokenEndpointUri","type","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Authentication implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Link to Kubernetes Secret containing the access token which was obtained from the authorization server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Link to Kubernetes Secret containing the access token which was obtained from the authorization server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.AccessToken accessToken;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.AccessToken getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Configure whether access token should be treated as JWT. This should be set to `false` if the authorization server returns opaque tokens. Defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenIsJwt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configure whether access token should be treated as JWT. This should be set to `false` if the authorization server returns opaque tokens. Defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean accessTokenIsJwt;

    public Boolean getAccessTokenIsJwt() {
        return accessTokenIsJwt;
    }

    public void setAccessTokenIsJwt(Boolean accessTokenIsJwt) {
        this.accessTokenIsJwt = accessTokenIsJwt;
    }

    /**
     * OAuth audience to use when authenticating against the authorization server. Some authorization servers require the audience to be explicitly set. The possible values depend on how the authorization server is configured. By default, `audience` is not specified when performing the token endpoint request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OAuth audience to use when authenticating against the authorization server. Some authorization servers require the audience to be explicitly set. The possible values depend on how the authorization server is configured. By default, `audience` is not specified when performing the token endpoint request.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String audience;

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * Reference to the `Secret` which holds the certificate and private key pair.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAndKey")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the `Secret` which holds the certificate and private key pair.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.CertificateAndKey certificateAndKey;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.CertificateAndKey getCertificateAndKey() {
        return certificateAndKey;
    }

    public void setCertificateAndKey(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.CertificateAndKey certificateAndKey) {
        this.certificateAndKey = certificateAndKey;
    }

    /**
     * OAuth Client ID which the Kafka client can use to authenticate against the OAuth server and use the token endpoint URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OAuth Client ID which the Kafka client can use to authenticate against the OAuth server and use the token endpoint URI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clientId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Link to Kubernetes Secret containing the OAuth client secret which the Kafka client can use to authenticate against the OAuth server and use the token endpoint URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Link to Kubernetes Secret containing the OAuth client secret which the Kafka client can use to authenticate against the OAuth server and use the token endpoint URI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.ClientSecret clientSecret;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.ClientSecret getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.ClientSecret clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * The connect timeout in seconds when connecting to authorization server. If not set, the effective connect timeout is 60 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The connect timeout in seconds when connecting to authorization server. If not set, the effective connect timeout is 60 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long connectTimeoutSeconds;

    public Long getConnectTimeoutSeconds() {
        return connectTimeoutSeconds;
    }

    public void setConnectTimeoutSeconds(Long connectTimeoutSeconds) {
        this.connectTimeoutSeconds = connectTimeoutSeconds;
    }

    /**
     * Enable or disable TLS hostname verification. Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableTlsHostnameVerification")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable TLS hostname verification. Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableTlsHostnameVerification;

    public Boolean getDisableTlsHostnameVerification() {
        return disableTlsHostnameVerification;
    }

    public void setDisableTlsHostnameVerification(Boolean disableTlsHostnameVerification) {
        this.disableTlsHostnameVerification = disableTlsHostnameVerification;
    }

    /**
     * Enable or disable OAuth metrics. Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableMetrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable OAuth metrics. Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableMetrics;

    public Boolean getEnableMetrics() {
        return enableMetrics;
    }

    public void setEnableMetrics(Boolean enableMetrics) {
        this.enableMetrics = enableMetrics;
    }

    /**
     * The maximum number of retries to attempt if an initial HTTP request fails. If not set, the default is to not attempt any retries.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpRetries")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of retries to attempt if an initial HTTP request fails. If not set, the default is to not attempt any retries.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long httpRetries;

    public Long getHttpRetries() {
        return httpRetries;
    }

    public void setHttpRetries(Long httpRetries) {
        this.httpRetries = httpRetries;
    }

    /**
     * The pause to take before retrying a failed HTTP request. If not set, the default is to not pause at all but to immediately repeat a request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpRetryPauseMs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pause to take before retrying a failed HTTP request. If not set, the default is to not pause at all but to immediately repeat a request.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long httpRetryPauseMs;

    public Long getHttpRetryPauseMs() {
        return httpRetryPauseMs;
    }

    public void setHttpRetryPauseMs(Long httpRetryPauseMs) {
        this.httpRetryPauseMs = httpRetryPauseMs;
    }

    /**
     * Whether the Accept header should be set in requests to the authorization servers. The default value is `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeAcceptHeader")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether the Accept header should be set in requests to the authorization servers. The default value is `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean includeAcceptHeader;

    public Boolean getIncludeAcceptHeader() {
        return includeAcceptHeader;
    }

    public void setIncludeAcceptHeader(Boolean includeAcceptHeader) {
        this.includeAcceptHeader = includeAcceptHeader;
    }

    /**
     * Set or limit time-to-live of the access tokens to the specified number of seconds. This should be set if the authorization server returns opaque tokens.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokenExpirySeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set or limit time-to-live of the access tokens to the specified number of seconds. This should be set if the authorization server returns opaque tokens.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxTokenExpirySeconds;

    public Long getMaxTokenExpirySeconds() {
        return maxTokenExpirySeconds;
    }

    public void setMaxTokenExpirySeconds(Long maxTokenExpirySeconds) {
        this.maxTokenExpirySeconds = maxTokenExpirySeconds;
    }

    /**
     * Reference to the `Secret` which holds the password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the `Secret` which holds the password.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.PasswordSecret passwordSecret;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.PasswordSecret getPasswordSecret() {
        return passwordSecret;
    }

    public void setPasswordSecret(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.PasswordSecret passwordSecret) {
        this.passwordSecret = passwordSecret;
    }

    /**
     * The read timeout in seconds when connecting to authorization server. If not set, the effective read timeout is 60 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The read timeout in seconds when connecting to authorization server. If not set, the effective read timeout is 60 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long readTimeoutSeconds;

    public Long getReadTimeoutSeconds() {
        return readTimeoutSeconds;
    }

    public void setReadTimeoutSeconds(Long readTimeoutSeconds) {
        this.readTimeoutSeconds = readTimeoutSeconds;
    }

    /**
     * Link to Kubernetes Secret containing the refresh token which can be used to obtain access token from the authorization server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshToken")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Link to Kubernetes Secret containing the refresh token which can be used to obtain access token from the authorization server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.RefreshToken refreshToken;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.RefreshToken getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.RefreshToken refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * OAuth scope to use when authenticating against the authorization server. Some authorization servers require this to be set. The possible values depend on how authorization server is configured. By default `scope` is not specified when doing the token endpoint request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OAuth scope to use when authenticating against the authorization server. Some authorization servers require this to be set. The possible values depend on how authorization server is configured. By default `scope` is not specified when doing the token endpoint request.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scope;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Trusted certificates for TLS connection to the OAuth server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsTrustedCertificates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Trusted certificates for TLS connection to the OAuth server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificates> tlsTrustedCertificates;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificates> getTlsTrustedCertificates() {
        return tlsTrustedCertificates;
    }

    public void setTlsTrustedCertificates(java.util.List<io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication.TlsTrustedCertificates> tlsTrustedCertificates) {
        this.tlsTrustedCertificates = tlsTrustedCertificates;
    }

    /**
     * Authorization server token endpoint URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenEndpointUri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authorization server token endpoint URI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tokenEndpointUri;

    public String getTokenEndpointUri() {
        return tokenEndpointUri;
    }

    public void setTokenEndpointUri(String tokenEndpointUri) {
        this.tokenEndpointUri = tokenEndpointUri;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("tls")
        TLS("tls"), @com.fasterxml.jackson.annotation.JsonProperty("scram-sha-256")
        SCRAMSHA256("scram-sha-256"), @com.fasterxml.jackson.annotation.JsonProperty("scram-sha-512")
        SCRAMSHA512("scram-sha-512"), @com.fasterxml.jackson.annotation.JsonProperty("plain")
        PLAIN("plain"), @com.fasterxml.jackson.annotation.JsonProperty("oauth")
        OAUTH("oauth");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Authentication type. Currently the supported types are `tls`, `scram-sha-256`, `scram-sha-512`, `plain`, and 'oauth'. `scram-sha-256` and `scram-sha-512` types use SASL SCRAM-SHA-256 and SASL SCRAM-SHA-512 Authentication, respectively. `plain` type uses SASL PLAIN Authentication. `oauth` type uses SASL OAUTHBEARER Authentication. The `tls` type uses TLS Client Authentication. The `tls` type is supported only over TLS connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication type. Currently the supported types are `tls`, `scram-sha-256`, `scram-sha-512`, `plain`, and 'oauth'. `scram-sha-256` and `scram-sha-512` types use SASL SCRAM-SHA-256 and SASL SCRAM-SHA-512 Authentication, respectively. `plain` type uses SASL PLAIN Authentication. `oauth` type uses SASL OAUTHBEARER Authentication. The `tls` type uses TLS Client Authentication. The `tls` type is supported only over TLS connections.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Username used for the authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Username used for the authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    public java.util.Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
        this.additionalProperties.put(key, value);
    }
}

