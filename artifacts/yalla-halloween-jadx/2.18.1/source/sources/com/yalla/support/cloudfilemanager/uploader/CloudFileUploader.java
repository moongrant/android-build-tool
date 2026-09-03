package com.yalla.support.cloudfilemanager.uploader;

import com.yalla.support.cloudfilemanager.request.UploadRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/yalla/support/cloudfilemanager/uploader/CloudFileUploader;", "", "uploadFile", "", "uploadRequest", "Lcom/yalla/support/cloudfilemanager/request/UploadRequest;", "(Lcom/yalla/support/cloudfilemanager/request/UploadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CloudFileUploader {
    @Nullable
    Object uploadFile(@NotNull UploadRequest uploadRequest, @NotNull Continuation<? super String> continuation);
}
