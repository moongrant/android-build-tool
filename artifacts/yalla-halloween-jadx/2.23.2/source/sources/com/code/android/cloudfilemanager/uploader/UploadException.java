package com.code.android.cloudfilemanager.uploader;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/code/android/cloudfilemanager/uploader/UploadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "AndroidCloudFileManager_release"}, k = 1, mv = {1, 9, 0})
public final class UploadException extends Exception {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f13205OooO0Oo;

    public UploadException(@Nullable String str) {
        this.f13205OooO0Oo = str;
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        return this.f13205OooO0Oo;
    }
}
