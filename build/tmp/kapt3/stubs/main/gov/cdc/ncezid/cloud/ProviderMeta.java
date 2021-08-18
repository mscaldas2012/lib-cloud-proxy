package gov.cdc.ncezid.cloud;

import java.lang.System;

/**
 * Intended to provide access to any provider details (which provider, region, account, etc.)
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lgov/cdc/ncezid/cloud/ProviderMeta;", "", "provider", "Lgov/cdc/ncezid/cloud/Providers;", "lib-cloud-proxy"})
public abstract interface ProviderMeta {
    
    @org.jetbrains.annotations.NotNull()
    public abstract gov.cdc.ncezid.cloud.Providers provider();
}