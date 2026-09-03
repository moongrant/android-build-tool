package com.yalla.support.cloudfilemanager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/yalla/support/cloudfilemanager/UploadInfoLoader;", "T", "", "getUploadInfo", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "fileType", "sourceId", "", "(Ljava/lang/Object;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface UploadInfoLoader<T> {
    @Nullable
    Object getUploadInfo(T t, @Nullable Long l, @NotNull Continuation<? super CloudFileUploadInfo> continuation);
}
