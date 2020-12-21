package gov.cdc.ncezid.cloud.storage;

import java.lang.System;

/**
 * @Created - 9/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u0005H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0012\u001a\u00020\u0005H&\u00a8\u0006\u0014"}, d2 = {"Lgov/cdc/ncezid/cloud/storage/CloudStorage;", "", "deleteFile", "", "key", "", "getFileContent", "objectKey", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "", "list", "", "folder", "listFolders", "saveFile", "", "message", "metadata", "lib-cloud-proxy"})
public abstract interface CloudStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> list(@org.jetbrains.annotations.NotNull()
    java.lang.String folder);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> listFolders();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFileContent(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey);
    
    public abstract void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void saveFile(@org.jetbrains.annotations.NotNull()
    java.lang.String objectKey, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract int deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
}