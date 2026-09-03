package com.yalla.yalla.common.manager.cloud_file;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.cloudfilemanager.CloudFileManager;
import com.yalla.support.cloudfilemanager.interceptor.ImageCompressInterceptor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/common/manager/cloud_file/CloudFile;", "", "()V", "manager", "Lcom/yalla/support/cloudfilemanager/CloudFileManager;", "Lcom/yalla/yalla/common/manager/cloud_file/CloudFileType;", "getManager", "()Lcom/yalla/support/cloudfilemanager/CloudFileManager;", "manager$delegate", "Lkotlin/Lazy;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CloudFile {

    @NotNull
    public static final CloudFile INSTANCE = new CloudFile();

    /* JADX INFO: renamed from: manager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy manager = LazyKt.lazy(new Function0<CloudFileManager<CloudFileType>>() { // from class: com.yalla.yalla.common.manager.cloud_file.CloudFile$manager$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CloudFileManager<CloudFileType> invoke() {
            CloudFileManager<CloudFileType> cloudFileManager = new CloudFileManager<>(new YLUploadInfoLoader());
            cloudFileManager.addInterceptor(new ImageCompressInterceptor());
            return cloudFileManager;
        }
    });
    public static final int $stable = 8;

    private CloudFile() {
    }

    @NotNull
    public final CloudFileManager<CloudFileType> getManager() {
        return (CloudFileManager) manager.getValue();
    }
}
