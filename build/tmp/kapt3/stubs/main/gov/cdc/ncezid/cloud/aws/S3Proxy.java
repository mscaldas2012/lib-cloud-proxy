package gov.cdc.ncezid.cloud.aws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J4\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002J(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\f\u001a\u00020\bH\u0016JF\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00132\u0006\u0010\'\u001a\u00020\bH\u0016J>\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00132\u0006\u0010\'\u001a\u00020\bH\u0016J>\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020&2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J<\u0010+\u001a\u00020#2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020&2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0013H\u0002JJ\u0010-\u001a\u00020#2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020\b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006/"}, d2 = {"Lgov/cdc/ncezid/cloud/aws/S3Proxy;", "Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "awsconfig", "Lgov/cdc/ncezid/cloud/aws/AWSConfig;", "(Lgov/cdc/ncezid/cloud/aws/AWSConfig;)V", "getAwsconfig", "()Lgov/cdc/ncezid/cloud/aws/AWSConfig;", "completeMultiParts", "", "completedPartList", "", "Lsoftware/amazon/awssdk/services/s3/model/CompletedPart;", "bucket", "key", "uploadId", "s3Client", "Lsoftware/amazon/awssdk/services/s3/S3Client;", "createMultipartUpload", "metadata", "", "deleteFile", "", "fileName", "fetchS3Client", "getFileContent", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "getZipContent", "config", "list", "maxNumber", "prefix", "listFolders", "saveFile", "", "content", "size", "", "contentType", "uploadMultiParts", "file", "contentLength", "uploadMultipartFile", "filename", "uploadSinglePart", "Companion", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "cloud_environment", value = "AWS")
@javax.inject.Singleton()
public final class S3Proxy implements gov.cdc.ncezid.cloud.storage.CloudStorage {
    @org.jetbrains.annotations.NotNull()
    private final gov.cdc.ncezid.cloud.aws.AWSConfig awsconfig = null;
    private static final org.slf4j.Logger logger = null;
    private static final long FILE_5MB = 5242880L;
    @org.jetbrains.annotations.NotNull()
    public static final gov.cdc.ncezid.cloud.aws.S3Proxy.Companion Companion = null;
    
    private final software.amazon.awssdk.services.s3.S3Client fetchS3Client() {
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
    public java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> list(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, int maxNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String prefix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> listFolders(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket) {
        return null;
    }
    
    @java.lang.Override()
    public int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String bucket, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return 0;
    }
    
    private final void uploadSinglePart(java.lang.String bucket, java.lang.String fileName, java.io.InputStream content, long contentLength, java.lang.String contentType, java.util.Map<java.lang.String, java.lang.String> metadata) {
    }
    
    private final void uploadMultipartFile(java.lang.String bucket, java.io.InputStream file, java.lang.String filename, long contentLength, java.util.Map<java.lang.String, java.lang.String> metadata) {
    }
    
    private final java.lang.String createMultipartUpload(java.lang.String key, java.lang.String bucket, java.util.Map<java.lang.String, java.lang.String> metadata, software.amazon.awssdk.services.s3.S3Client s3Client) {
        return null;
    }
    
    private final java.util.List<software.amazon.awssdk.services.s3.model.CompletedPart> uploadMultiParts(java.io.InputStream file, long contentLength, java.lang.String bucket, java.lang.String key, java.lang.String uploadId, software.amazon.awssdk.services.s3.S3Client s3Client) {
        return null;
    }
    
    private final java.lang.String completeMultiParts(java.util.List<software.amazon.awssdk.services.s3.model.CompletedPart> completedPartList, java.lang.String bucket, java.lang.String key, java.lang.String uploadId, software.amazon.awssdk.services.s3.S3Client s3Client) {
        return null;
    }
    
    private final java.lang.String getZipContent(java.lang.String bucket, java.lang.String config) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.ncezid.cloud.aws.AWSConfig getAwsconfig() {
        return null;
    }
    
    public S3Proxy(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.aws.AWSConfig awsconfig) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lgov/cdc/ncezid/cloud/aws/S3Proxy$Companion;", "", "()V", "FILE_5MB", "", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "lib-cloud-proxy"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}