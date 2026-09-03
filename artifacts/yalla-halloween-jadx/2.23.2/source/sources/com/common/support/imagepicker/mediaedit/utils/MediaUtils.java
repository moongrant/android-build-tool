package com.common.support.imagepicker.mediaedit.utils;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MediaUtils;", "", "()V", "IMAGE_JPEG", "", "OCTET", "extractVideoSize", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getCorrectedMimeType", "mimeType", "getDefaultRootPath", "Ljava/io/File;", "getMimeType", "getVideoDuration", "", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/Long;", "isOctetStream", "", "contentType", "sendBroadcastToSystemMedia", "", "contentUri", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaUtils {

    @NotNull
    public static final String IMAGE_JPEG = "image/jpeg";

    @NotNull
    public static final MediaUtils INSTANCE = new MediaUtils();

    @NotNull
    public static final String OCTET = "application/octet-stream";

    private MediaUtils() {
    }

    private final String getCorrectedMimeType(String mimeType) {
        return (Intrinsics.areEqual(mimeType, "image/jpg") && MimeTypeMap.getSingleton().hasMimeType("image/jpeg")) ? "image/jpeg" : mimeType;
    }

    private final boolean isOctetStream(String contentType) {
        return Intrinsics.areEqual("application/octet-stream", contentType);
    }

    @NotNull
    public final Pair<Integer, Integer> extractVideoSize(@NotNull Context context, @NotNull Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        int i = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 0;
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        int i2 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
        int i3 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
        mediaMetadataRetriever.release();
        return (i3 == 90 || i3 == 270) ? new Pair<>(Integer.valueOf(i2), Integer.valueOf(i)) : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @NotNull
    public final File getDefaultRootPath() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublic…nment.DIRECTORY_PICTURES)");
        return externalStoragePublicDirectory;
    }

    @Nullable
    public final String getMimeType(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return null;
        }
        String type = context.getContentResolver().getType(uri);
        if (type == null || isOctetStream(type)) {
            String extension = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNullExpressionValue(extension, "extension");
            String lowerCase = extension.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            type = singleton.getMimeTypeFromExtension(lowerCase);
        }
        return type != null ? getCorrectedMimeType(type) : "";
    }

    @Nullable
    public final Long getVideoDuration(@NotNull Context context, @NotNull Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        if (strExtractMetadata != null) {
            return Long.valueOf(Long.parseLong(strExtractMetadata));
        }
        return null;
    }

    public final void sendBroadcastToSystemMedia(@NotNull Context context, @NotNull Uri contentUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(contentUri);
            context.sendBroadcast(intent);
            Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
    }
}
