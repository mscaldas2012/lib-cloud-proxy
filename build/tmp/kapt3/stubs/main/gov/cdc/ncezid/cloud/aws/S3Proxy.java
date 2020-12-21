package gov.cdc.ncezid.cloud.aws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0016J,\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u001c\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lgov/cdc/ncezid/cloud/aws/S3Proxy;", "Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "awsconfig", "Lgov/cdc/ncezid/cloud/aws/AWSConfig;", "(Lgov/cdc/ncezid/cloud/aws/AWSConfig;)V", "getAwsconfig", "()Lgov/cdc/ncezid/cloud/aws/AWSConfig;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "deleteFile", "", "key", "", "fetchS3Client", "Lsoftware/amazon/awssdk/services/s3/S3Client;", "getFileContent", "objectKey", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "", "list", "", "folder", "listFolders", "saveFile", "", "message", "metadata", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "cloud_environment", value = "AWS")
@javax.inject.Singleton()
public final class S3Proxy implements gov.cdc.ncezid.cloud.storage.CloudStorage {
    private final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private final gov.cdc.ncezid.cloud.aws.AWSConfig awsconfig = null;
    
    private final software.amazon.awssdk.services.s3.S3Client fetchS3Client() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFileContent(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey) {
        return null;
    }
    
    @java.lang.Override()
    public void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> list(@org.jetbrains.annotations.NotNull()
    java.lang.String folder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> listFolders() {
        return null;
    }
    
    @java.lang.Override()
    public int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.ncezid.cloud.aws.AWSConfig getAwsconfig() {
        return null;
    }
    
    public S3Proxy(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.aws.AWSConfig awsconfig) {
        super();
    }
}