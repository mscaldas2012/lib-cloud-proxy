package gov.cdc.ncezid.cloud.storage.azure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fJ\b\u0010\u001e\u001a\u00020\u000fH\u0016J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\u0006\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0 H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020%H\u0016J>\u0010&\u001a\u00020\'2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u0010,\u001a\u00020\u000fH\u0016JF\u0010&\u001a\u00020\'2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u0010,\u001a\u00020\u000fH\u0016J>\u0010&\u001a\u00020\'2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u0010,\u001a\u00020\u000fH\u0016J6\u0010&\u001a\u00020\'2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u0010,\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lgov/cdc/ncezid/cloud/storage/azure/BlobProxy;", "Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "azureConfig", "Lgov/cdc/ncezid/cloud/AzureConfig;", "meterRegistry", "Lio/micrometer/core/instrument/MeterRegistry;", "(Lgov/cdc/ncezid/cloud/AzureConfig;Lio/micrometer/core/instrument/MeterRegistry;)V", "blobServiceClient", "Lcom/azure/storage/blob/BlobServiceClient;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "deleteFile", "", "fileName", "", "container", "getDefaultBucket", "getFile", "Lgov/cdc/ncezid/cloud/storage/CloudFile;", "getFileContent", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "", "urlDecode", "", "getProperties", "Lcom/azure/storage/blob/models/BlobProperties;", "key", "healthCheck", "list", "", "maxNumber", "prefix", "listFolders", "provider", "Lgov/cdc/ncezid/cloud/Providers;", "saveFile", "", "content", "size", "", "metadata", "contentType", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "azure.blob")
@javax.inject.Singleton()
public final class BlobProxy implements gov.cdc.ncezid.cloud.storage.CloudStorage {
    private final org.slf4j.Logger logger = null;
    private final com.azure.storage.blob.BlobServiceClient blobServiceClient = null;
    private final gov.cdc.ncezid.cloud.AzureConfig azureConfig = null;
    private final io.micrometer.core.instrument.MeterRegistry meterRegistry = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public gov.cdc.ncezid.cloud.Providers provider() {
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
    public java.lang.String getDefaultBucket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> list(@org.jetbrains.annotations.NotNull()
    java.lang.String container, int maxNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String prefix) {
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
    java.lang.String container) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> listFolders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFileContent(@org.jetbrains.annotations.NotNull()
    java.lang.String container, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
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
    public java.lang.String getFileContent(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String container, @org.jetbrains.annotations.NotNull()
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
    java.lang.String container, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, boolean urlDecode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, boolean urlDecode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String container, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String container, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        return null;
    }
    
    @java.lang.Override()
    public int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String container, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return 0;
    }
    
    @java.lang.Override()
    public int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.azure.storage.blob.models.BlobProperties getProperties(@org.jetbrains.annotations.NotNull()
    java.lang.String container, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public BlobProxy(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.AzureConfig azureConfig, @org.jetbrains.annotations.Nullable()
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