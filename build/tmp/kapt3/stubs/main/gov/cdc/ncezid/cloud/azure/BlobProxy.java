package gov.cdc.ncezid.cloud.azure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\f\u001a\u00020\nH\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0013\u001a\u00020\u0006H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J,\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lgov/cdc/ncezid/cloud/azure/BlobProxy;", "Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "azureConfig", "Lgov/cdc/ncezid/cloud/azure/AzureConfig;", "(Lgov/cdc/ncezid/cloud/azure/AzureConfig;)V", "blobContainerClient", "Lcom/azure/storage/blob/BlobContainerClient;", "deleteFile", "", "key", "", "getFileContent", "objectKey", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "", "getProperties", "Lcom/azure/storage/blob/models/BlobProperties;", "initClient", "list", "", "folder", "listFolders", "saveFile", "", "message", "metadata", "Companion", "lib-cloud-proxy"})
@io.micronaut.context.annotation.Requires(property = "cloud_environment", value = "AZURE")
@javax.inject.Singleton()
public final class BlobProxy implements gov.cdc.ncezid.cloud.storage.CloudStorage {
    private com.azure.storage.blob.BlobContainerClient blobContainerClient;
    private final gov.cdc.ncezid.cloud.azure.AzureConfig azureConfig = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final gov.cdc.ncezid.cloud.azure.BlobProxy.Companion Companion = null;
    
    private final com.azure.storage.blob.BlobContainerClient initClient() {
        return null;
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
    
    @java.lang.Override()
    public int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.azure.storage.blob.models.BlobProperties getProperties(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public BlobProxy(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.azure.AzureConfig azureConfig) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lgov/cdc/ncezid/cloud/azure/BlobProxy$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "lib-cloud-proxy"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}