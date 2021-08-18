package gov.cdc.ncezid.cloud.storage.aws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lgov/cdc/ncezid/cloud/storage/aws/S3Health;", "Lio/micronaut/management/health/indicator/HealthIndicator;", "s3Proxy", "Lgov/cdc/ncezid/cloud/storage/aws/S3Proxy;", "awsConfig", "Lgov/cdc/ncezid/cloud/AWSConfig;", "(Lgov/cdc/ncezid/cloud/storage/aws/S3Proxy;Lgov/cdc/ncezid/cloud/AWSConfig;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getResult", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/management/health/indicator/HealthResult;", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "aws.s3.health.enabled", value = "true", defaultValue = "false")
@javax.inject.Singleton()
public final class S3Health implements io.micronaut.management.health.indicator.HealthIndicator {
    private final org.slf4j.Logger logger = null;
    private final gov.cdc.ncezid.cloud.storage.aws.S3Proxy s3Proxy = null;
    private final gov.cdc.ncezid.cloud.AWSConfig awsConfig = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.reactivestreams.Publisher<io.micronaut.management.health.indicator.HealthResult> getResult() {
        return null;
    }
    
    public S3Health(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.storage.aws.S3Proxy s3Proxy, @org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.AWSConfig awsConfig) {
        super();
    }
}