package gov.cdc.ncezid.cloud.storage.aws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002J,\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0016J$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0016J,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0002J\b\u0010%\u001a\u00020\rH\u0016J \u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\rH\u0016J(\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020+H\u0016J>\u0010,\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u0002002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u0006\u00101\u001a\u00020\rH\u0016JF\u0010,\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u0002002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u0006\u00101\u001a\u00020\rH\u0016J>\u0010,\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u0006\u00101\u001a\u00020\rH\u0016J6\u0010,\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u0006\u00101\u001a\u00020\rH\u0016J6\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002J<\u00105\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u00103\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\r2\u0006\u00104\u001a\u0002002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0016H\u0002JJ\u00107\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u001f2\u0006\u00104\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\r2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lgov/cdc/ncezid/cloud/storage/aws/S3Proxy;", "Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "awsConfig", "Lgov/cdc/ncezid/cloud/AWSConfig;", "meterRegistry", "Lio/micrometer/core/instrument/MeterRegistry;", "(Lgov/cdc/ncezid/cloud/AWSConfig;Lio/micrometer/core/instrument/MeterRegistry;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "s3Client", "Lsoftware/amazon/awssdk/services/s3/S3Client;", "completeMultiParts", "", "completedPartList", "", "Lsoftware/amazon/awssdk/services/s3/model/CompletedPart;", "bucket", "key", "uploadId", "createMultipartUpload", "metadata", "", "deleteFile", "", "fileName", "getDefaultBucket", "getFile", "Lgov/cdc/ncezid/cloud/storage/CloudFile;", "getFileContent", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "urlDecode", "", "getZipContent", "config", "healthCheck", "list", "maxNumber", "prefix", "listFolders", "provider", "Lgov/cdc/ncezid/cloud/Providers;", "saveFile", "", "content", "size", "", "contentType", "uploadMultiParts", "file", "contentLength", "uploadMultipartFile", "filename", "uploadSinglePart", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "aws.s3")
@javax.inject.Singleton()
public final class S3Proxy implements gov.cdc.ncezid.cloud.storage.CloudStorage {
    private final org.slf4j.Logger logger = null;
    private final software.amazon.awssdk.services.s3.S3Client s3Client = null;
    private final gov.cdc.ncezid.cloud.AWSConfig awsConfig = null;
    private final io.micrometer.core.instrument.MeterRegistry meterRegistry = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public gov.cdc.ncezid.cloud.Providers provider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public gov.cdc.ncezid.cloud.storage.CloudFile getFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDefaultBucket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFileContent(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFileContent(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, boolean urlDecode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, boolean urlDecode) {
        return null;
    }
    
    @java.lang.Override()
    public void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
    }
    
    @java.lang.Override()
    public void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
    }
    
    @java.lang.Override()
    public void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
    }
    
    @java.lang.Override()
    public void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> list(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, int maxNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String prefix) {
        return null;
    }
    
    /**
     * This was introduced to be able to provide a 'silent' call to the aws s3 api
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String healthCheck() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> list(int maxNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String prefix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> listFolders(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> listFolders() {
        return null;
    }
    
    @java.lang.Override()
    public int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return 0;
    }
    
    @java.lang.Override()
    public int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return 0;
    }
    
    private final void uploadSinglePart(java.lang.String bucket, java.lang.String fileName, java.io.InputStream content, long contentLength, java.lang.String contentType, java.util.Map<java.lang.String, java.lang.String> metadata) {
    }
    
    private final void uploadMultipartFile(java.lang.String bucket, java.io.InputStream file, java.lang.String filename, long contentLength, java.util.Map<java.lang.String, java.lang.String> metadata) {
    }
    
    private final java.lang.String createMultipartUpload(java.lang.String key, java.lang.String bucket, java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    private final java.util.List<software.amazon.awssdk.services.s3.model.CompletedPart> uploadMultiParts(java.io.InputStream file, long contentLength, java.lang.String bucket, java.lang.String key, java.lang.String uploadId) {
        return null;
    }
    
    private final java.lang.String completeMultiParts(java.util.List<software.amazon.awssdk.services.s3.model.CompletedPart> completedPartList, java.lang.String bucket, java.lang.String key, java.lang.String uploadId) {
        return null;
    }
    
    private final java.lang.String getZipContent(java.lang.String bucket, java.lang.String config) {
        return null;
    }
    
    public S3Proxy(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.AWSConfig awsConfig, @org.jetbrains.annotations.Nullable()
    io.micrometer.core.instrument.MeterRegistry meterRegistry) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public gov.cdc.ncezid.cloud.storage.CloudFile getFile(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
}