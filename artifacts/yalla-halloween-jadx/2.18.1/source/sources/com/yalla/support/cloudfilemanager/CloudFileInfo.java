package com.yalla.support.cloudfilemanager;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "url", "", "uploadInfo", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "(Ljava/io/File;Ljava/lang/String;Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;)V", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "imgHight", "", "getImgHight", "()I", "setImgHight", "(I)V", "imgWidth", "getImgWidth", "setImgWidth", "getUploadInfo", "()Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "setUploadInfo", "(Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CloudFileInfo {

    @Nullable
    private File file;
    private int imgHight;
    private int imgWidth;

    @NotNull
    private CloudFileUploadInfo uploadInfo;

    @NotNull
    private String url;

    public CloudFileInfo(@Nullable File file, @NotNull String url, @NotNull CloudFileUploadInfo uploadInfo) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uploadInfo, "uploadInfo");
        this.file = file;
        this.url = url;
        this.uploadInfo = uploadInfo;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    public final int getImgHight() {
        return this.imgHight;
    }

    public final int getImgWidth() {
        return this.imgWidth;
    }

    @NotNull
    public final CloudFileUploadInfo getUploadInfo() {
        return this.uploadInfo;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setFile(@Nullable File file) {
        this.file = file;
    }

    public final void setImgHight(int i) {
        this.imgHight = i;
    }

    public final void setImgWidth(int i) {
        this.imgWidth = i;
    }

    public final void setUploadInfo(@NotNull CloudFileUploadInfo cloudFileUploadInfo) {
        Intrinsics.checkNotNullParameter(cloudFileUploadInfo, "<set-?>");
        this.uploadInfo = cloudFileUploadInfo;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public /* synthetic */ CloudFileInfo(File file, String str, CloudFileUploadInfo cloudFileUploadInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? "" : str, cloudFileUploadInfo);
    }
}
