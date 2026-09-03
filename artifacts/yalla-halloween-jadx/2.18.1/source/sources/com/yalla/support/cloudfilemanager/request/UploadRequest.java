package com.yalla.support.cloudfilemanager.request;

import android.net.Uri;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.yalla.support.cloudfilemanager.CloudFileUploadInfo;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yalla/support/cloudfilemanager/request/UploadRequest;", "", "()V", "cloudFileUploadInfo", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "getCloudFileUploadInfo", "()Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "setCloudFileUploadInfo", "(Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;)V", "count", "", "getCount", "()I", "setCount", "(I)V", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "imageType", "", "getImageType", "()Ljava/lang/String;", "setImageType", "(Ljava/lang/String;)V", "index", "getIndex", "setIndex", "isTempFile", "", "()Z", "setTempFile", "(Z)V", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UploadRequest {

    @Nullable
    private CloudFileUploadInfo cloudFileUploadInfo;

    @Nullable
    private File file;
    private boolean isTempFile;

    @Nullable
    private Uri uri;

    @NotNull
    private String imageType = "";

    @NotNull
    private String index = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private int count = 1;

    @Nullable
    public final CloudFileUploadInfo getCloudFileUploadInfo() {
        return this.cloudFileUploadInfo;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getImageType() {
        return this.imageType;
    }

    @NotNull
    public final String getIndex() {
        return this.index;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: isTempFile, reason: from getter */
    public final boolean getIsTempFile() {
        return this.isTempFile;
    }

    public final void setCloudFileUploadInfo(@Nullable CloudFileUploadInfo cloudFileUploadInfo) {
        this.cloudFileUploadInfo = cloudFileUploadInfo;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setFile(@Nullable File file) {
        this.file = file;
    }

    public final void setImageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageType = str;
    }

    public final void setIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.index = str;
    }

    public final void setTempFile(boolean z) {
        this.isTempFile = z;
    }

    public final void setUri(@Nullable Uri uri) {
        this.uri = uri;
    }
}
