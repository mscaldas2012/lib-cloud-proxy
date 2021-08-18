package gov.cdc.ncezid.cloud;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00060\u0004R\u00020\u00008\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lgov/cdc/ncezid/cloud/AzureConfig;", "", "()V", "blob", "Lgov/cdc/ncezid/cloud/AzureConfig$BlobConfig;", "getBlob", "()Lgov/cdc/ncezid/cloud/AzureConfig$BlobConfig;", "blobHealth", "Lgov/cdc/ncezid/cloud/AzureConfig$HealthConfig;", "getBlobHealth", "()Lgov/cdc/ncezid/cloud/AzureConfig$HealthConfig;", "toString", "", "BlobConfig", "HealthConfig", "lib-cloud-proxy"})
@io.micronaut.context.annotation.ConfigurationProperties(value = "azure")
public final class AzureConfig {
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "blob")
    private final gov.cdc.ncezid.cloud.AzureConfig.BlobConfig blob = null;
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "blob.health")
    private final gov.cdc.ncezid.cloud.AzureConfig.HealthConfig blobHealth = null;
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.ncezid.cloud.AzureConfig.BlobConfig getBlob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.ncezid.cloud.AzureConfig.HealthConfig getBlobHealth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AzureConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\r"}, d2 = {"Lgov/cdc/ncezid/cloud/AzureConfig$BlobConfig;", "", "(Lgov/cdc/ncezid/cloud/AzureConfig;)V", "connectStr", "", "getConnectStr", "()Ljava/lang/String;", "setConnectStr", "(Ljava/lang/String;)V", "container", "getContainer", "setContainer", "toString", "lib-cloud-proxy"})
    public final class BlobConfig {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String container;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String connectStr;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContainer() {
            return null;
        }
        
        public final void setContainer(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getConnectStr() {
            return null;
        }
        
        public final void setConnectStr(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public BlobConfig() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lgov/cdc/ncezid/cloud/AzureConfig$HealthConfig;", "", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "lib-cloud-proxy"})
    public static final class HealthConfig {
        private boolean enabled = false;
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final void setEnabled(boolean p0) {
        }
        
        public HealthConfig() {
            super();
        }
    }
}