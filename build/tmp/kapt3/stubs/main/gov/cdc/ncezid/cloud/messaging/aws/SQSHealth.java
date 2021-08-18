package gov.cdc.ncezid.cloud.messaging.aws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lgov/cdc/ncezid/cloud/messaging/aws/SQSHealth;", "Lio/micronaut/management/health/indicator/HealthIndicator;", "sqsProxy", "Lgov/cdc/ncezid/cloud/messaging/aws/SQSProxy;", "(Lgov/cdc/ncezid/cloud/messaging/aws/SQSProxy;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "queueUrl", "", "getResult", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/management/health/indicator/HealthResult;", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "aws.sqs.health.enabled", value = "true", defaultValue = "false")
@javax.inject.Singleton()
public final class SQSHealth implements io.micronaut.management.health.indicator.HealthIndicator {
    private final org.slf4j.Logger logger = null;
    private final java.lang.String queueUrl = null;
    private final gov.cdc.ncezid.cloud.messaging.aws.SQSProxy sqsProxy = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.reactivestreams.Publisher<io.micronaut.management.health.indicator.HealthResult> getResult() {
        return null;
    }
    
    public SQSHealth(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.messaging.aws.SQSProxy sqsProxy) {
        super();
    }
}