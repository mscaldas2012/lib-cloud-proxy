package gov.cdc.ncezid.cloud.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lgov/cdc/ncezid/cloud/storage/CloudStorageProxyTest;", "", "()V", "cloudStorage", "Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "getCloudStorage", "()Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "setCloudStorage", "(Lgov/cdc/ncezid/cloud/storage/CloudStorage;)V", "s3Proxy", "Lgov/cdc/ncezid/cloud/storage/aws/S3Proxy;", "getS3Proxy", "()Lgov/cdc/ncezid/cloud/storage/aws/S3Proxy;", "setS3Proxy", "(Lgov/cdc/ncezid/cloud/storage/aws/S3Proxy;)V", "listFolders", "", "lib-cloud-proxy"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class CloudStorageProxyTest {
    @javax.inject.Inject()
    public gov.cdc.ncezid.cloud.storage.aws.S3Proxy s3Proxy;
    @javax.inject.Inject()
    public gov.cdc.ncezid.cloud.storage.CloudStorage cloudStorage;
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.ncezid.cloud.storage.aws.S3Proxy getS3Proxy() {
        return null;
    }
    
    public final void setS3Proxy(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.storage.aws.S3Proxy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.ncezid.cloud.storage.CloudStorage getCloudStorage() {
        return null;
    }
    
    public final void setCloudStorage(@org.jetbrains.annotations.NotNull()
    gov.cdc.ncezid.cloud.storage.CloudStorage p0) {
    }
    
    @org.junit.jupiter.api.Test()
    public final void listFolders() {
    }
    
    public CloudStorageProxyTest() {
        super();
    }
}