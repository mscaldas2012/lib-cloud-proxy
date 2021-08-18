package gov.cdc.ncezid.cloud.messaging.aws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0017\"\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lgov/cdc/ncezid/cloud/messaging/aws/SQSProxy;", "Lgov/cdc/ncezid/cloud/messaging/CloudMessaging;", "awsConfig", "Lgov/cdc/ncezid/cloud/AWSConfig;", "meterRegistry", "Lio/micrometer/core/instrument/MeterRegistry;", "(Lgov/cdc/ncezid/cloud/AWSConfig;Lio/micrometer/core/instrument/MeterRegistry;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "queueUrl", "", "sqsClient", "Lsoftware/amazon/awssdk/services/sqs/SqsClient;", "deleteMessage", "message", "Lgov/cdc/ncezid/cloud/messaging/CloudMessage;", "getQueueUrl", "queueName", "healthCheck", "listQueues", "", "prefixes", "", "([Ljava/lang/String;)Ljava/util/List;", "provider", "Lgov/cdc/ncezid/cloud/Providers;", "receiveMessage", "queueNameOrUrl", "timeoutMessage", "timeout", "", "toString", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "aws.sqs")
@javax.inject.Singleton()
public final class SQSProxy implements gov.cdc.ncezid.cloud.messaging.CloudMessaging {
    private final org.slf4j.Logger logger = null;
    private final software.amazon.awssdk.services.sqs.SqsClient sqsClient = null;
    private final java.lang.String queueUrl = null;
    private final gov.cdc.ncezid.cloud.AWSConfig awsConfig = null;
    private final io.micrometer.core.instrument.MeterRegistry meterRegistry = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public gov.cdc.ncezid.cloud.Providers provider() {
        return null;
    }
    
    /**
     * This was introduced to be able to provide a 'silent' call to the aws sqs api
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String healthCheck() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> listQueues(@org.jetbrains.annotations.NotNull()
    java.lang.String... prefixes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getQueueUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getQueueUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String queueName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<gov.cdc.ncezid.cloud.messaging.CloudMessage> receiveMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<gov.cdc.ncezid.cloud.messaging.CloudMessage> receiveMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String queueNameOrUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String deleteMessage(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.messaging.CloudMessage message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String timeoutMessage(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.messaging.CloudMessage message, int timeout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SQSProxy(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.AWSConfig awsConfig, @org.jetbrains.annotations.Nullable()
    io.micrometer.core.instrument.MeterRegistry meterRegistry) {
        super();
    }
}