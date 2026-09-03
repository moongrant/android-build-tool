package com.yalla.yalla.model;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p136o00OOOo0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/UploadFileResult;", "", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Lo00OOOo0/OooO0OO;", "cloudFileInfo", "Lo00OOOo0/OooO0OO;", "getCloudFileInfo", "()Lo00OOOo0/OooO0OO;", "<init>", "(Landroid/net/Uri;Lo00OOOo0/OooO0OO;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UploadFileResult {
    public static final int $stable = 8;

    @NotNull
    private final OooO0OO cloudFileInfo;

    @NotNull
    private final Uri uri;

    public UploadFileResult(@NotNull Uri uri, @NotNull OooO0OO cloudFileInfo) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cloudFileInfo, "cloudFileInfo");
        this.uri = uri;
        this.cloudFileInfo = cloudFileInfo;
    }

    @NotNull
    public final OooO0OO getCloudFileInfo() {
        return this.cloudFileInfo;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }
}
