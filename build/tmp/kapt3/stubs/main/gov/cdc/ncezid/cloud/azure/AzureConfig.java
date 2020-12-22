package gov.cdc.ncezid.cloud.azure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lgov/cdc/ncezid/cloud/azure/AzureConfig;", "", "()V", "blob_connectStr", "", "getBlob_connectStr", "()Ljava/lang/String;", "setBlob_connectStr", "(Ljava/lang/String;)V", "lib-cloud-proxy"})
@io.micronaut.context.annotation.ConfigurationProperties(value = "azure")
public final class AzureConfig {
    public java.lang.String blob_connectStr;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlob_connectStr() {
        return null;
    }
    
    public final void setBlob_connectStr(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public AzureConfig() {
        super();
    }
}