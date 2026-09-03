package com.yalla.yalla.model;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/UploadFileResult;", "", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "cloudFileInfo", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "(Landroid/net/Uri;Lcom/yalla/support/cloudfilemanager/CloudFileInfo;)V", "getCloudFileInfo", "()Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "getUri", "()Landroid/net/Uri;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UploadFileResult {
    public static final int $stable = 8;

    @NotNull
    private final CloudFileInfo cloudFileInfo;

    @NotNull
    private final Uri uri;

    public UploadFileResult(@NotNull Uri uri, @NotNull CloudFileInfo cloudFileInfo) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cloudFileInfo, "cloudFileInfo");
        this.uri = uri;
        this.cloudFileInfo = cloudFileInfo;
    }

    @NotNull
    public final CloudFileInfo getCloudFileInfo() {
        return this.cloudFileInfo;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }
}
