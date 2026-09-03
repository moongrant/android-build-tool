package com.yalla.support.cloudfilemanager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yalla/support/cloudfilemanager/CloudFileConfig;", "", "()V", "HTTP", "", "getHTTP", "()Ljava/lang/String;", "fileHost", "getFileHost", "setFileHost", "(Ljava/lang/String;)V", "imgCommand", "getImgCommand$CloudFileManager_release", "imgMogrCommand", "getImgMogrCommand$CloudFileManager_release", "imgWaterMarkCommand", "getImgWaterMarkCommand$CloudFileManager_release", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CloudFileConfig {

    @NotNull
    public static final CloudFileConfig INSTANCE = new CloudFileConfig();

    @NotNull
    private static String fileHost = "";

    @NotNull
    private static final String HTTP = "http";

    @NotNull
    private static final String imgCommand = "?imageView2";

    @NotNull
    private static final String imgWaterMarkCommand = "?watermark/2";

    @NotNull
    private static final String imgMogrCommand = "?imageMogr2";

    private CloudFileConfig() {
    }

    @NotNull
    public final String getFileHost() {
        return fileHost;
    }

    @NotNull
    public final String getHTTP() {
        return HTTP;
    }

    @NotNull
    public final String getImgCommand$CloudFileManager_release() {
        return imgCommand;
    }

    @NotNull
    public final String getImgMogrCommand$CloudFileManager_release() {
        return imgMogrCommand;
    }

    @NotNull
    public final String getImgWaterMarkCommand$CloudFileManager_release() {
        return imgWaterMarkCommand;
    }

    public final void setFileHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fileHost = str;
    }
}
