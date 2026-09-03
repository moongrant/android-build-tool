package com.common.support.imagepicker.dataprovider.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/utils/StorageUtil;", "", "()V", "canWriteToMediaStore", "", "context", "Landroid/content/Context;", "getAudioUri", "Landroid/net/Uri;", "getDownloadUri", "getImageUri", "getLegacyUri", "directory", "", "getVideoUri", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StorageUtil {

    @NotNull
    public static final StorageUtil INSTANCE = new StorageUtil();

    private StorageUtil() {
    }

    public final boolean canWriteToMediaStore(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT > 28 || PermissionUtil.INSTANCE.hasPermissions(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    @NotNull
    public final Uri getAudioUri() {
        Uri EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }

    @NotNull
    public final Uri getDownloadUri() {
        if (Build.VERSION.SDK_INT < 29) {
            String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
            return getLegacyUri(DIRECTORY_DOWNLOADS);
        }
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(uri, "{\n      MediaStore.Downl…XTERNAL_CONTENT_URI\n    }");
        return uri;
    }

    @NotNull
    public final Uri getImageUri() {
        Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }

    @NotNull
    public final Uri getLegacyUri(@NotNull String directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Uri uriFromFile = Uri.fromFile(Environment.getExternalStoragePublicDirectory(directory));
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(Environment.get…blicDirectory(directory))");
        return uriFromFile;
    }

    @NotNull
    public final Uri getVideoUri() {
        Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }
}
