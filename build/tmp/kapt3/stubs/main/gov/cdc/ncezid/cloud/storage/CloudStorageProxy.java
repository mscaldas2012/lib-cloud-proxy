package gov.cdc.ncezid.cloud.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J,\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0006\u0010 \u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0001X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\""}, d2 = {"Lgov/cdc/ncezid/cloud/storage/CloudStorageProxy;", "Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "cloudEnv", "", "(Ljava/lang/String;)V", "getCloudEnv", "()Ljava/lang/String;", "storage", "getStorage", "()Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "setStorage", "(Lgov/cdc/ncezid/cloud/storage/CloudStorage;)V", "deleteFile", "", "key", "getFileContent", "objectKey", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "", "list", "", "folder", "listFolders", "registerHook", "", "event", "Lio/micronaut/discovery/event/ServiceReadyEvent;", "saveFile", "message", "metadata", "setupStorage", "Companion", "lib-cloud-proxy"})
@javax.inject.Singleton()
public class CloudStorageProxy implements gov.cdc.ncezid.cloud.storage.CloudStorage {
    public gov.cdc.ncezid.cloud.storage.CloudStorage storage;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cloudEnv = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final gov.cdc.ncezid.cloud.storage.CloudStorageProxy.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.ncezid.cloud.storage.CloudStorage getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.storage.CloudStorage p0) {
    }
    
    @io.micronaut.runtime.event.annotation.EventListener()
    @io.micronaut.scheduling.annotation.Async()
    public void registerHook(@org.jetbrains.annotations.NotNull()
    io.micronaut.discovery.event.ServiceReadyEvent event) {
    }
    
    public final void setupStorage() {
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
    public final java.lang.String getCloudEnv() {
        return null;
    }
    
    public CloudStorageProxy(@org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.Property(name = "cloud_environment")
    java.lang.String cloudEnv) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lgov/cdc/ncezid/cloud/storage/CloudStorageProxy$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "lib-cloud-proxy"})
    public static final class Companion {
        
        public final org.slf4j.Logger getLogger() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}