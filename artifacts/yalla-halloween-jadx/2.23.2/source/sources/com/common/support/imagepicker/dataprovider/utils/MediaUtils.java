package com.common.support.imagepicker.dataprovider.utils;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.webkit.MimeTypeMap;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010&\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010'\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010(\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/utils/MediaUtils;", "", "()V", "AUDIO_AAC", "", "AUDIO_UNSPECIFIED", "IMAGE_GIF", "IMAGE_HEIC", "IMAGE_HEIF", "IMAGE_JPEG", "IMAGE_PNG", "IMAGE_WEBP", "LONG_TEXT", "OCTET", "UNKNOWN", "VCARD", "VIDEO_MP4", "VIDEO_UNSPECIFIED", "VIEW_ONCE", "retriever", "Landroid/media/MediaMetadataRetriever;", "getRetriever", "()Landroid/media/MediaMetadataRetriever;", "retriever$delegate", "Lkotlin/Lazy;", "getCorrectedMimeType", "mimeType", "getVideoWidthAndHeightByOrientation", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "source", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "isAudioType", "", "contentType", "isImageOrVideoType", "isImageType", "isImageVideoOrAudioType", "isOctetStream", "isVideoType", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaUtils {

    @NotNull
    public static final String AUDIO_AAC = "audio/aac";

    @NotNull
    public static final String AUDIO_UNSPECIFIED = "audio/*";

    @NotNull
    public static final String IMAGE_GIF = "image/gif";

    @NotNull
    public static final String IMAGE_HEIC = "image/heic";

    @NotNull
    public static final String IMAGE_HEIF = "image/heif";

    @NotNull
    public static final String IMAGE_JPEG = "image/jpeg";

    @NotNull
    public static final String IMAGE_PNG = "image/png";

    @NotNull
    public static final String IMAGE_WEBP = "image/webp";

    @NotNull
    public static final String LONG_TEXT = "text/x-signal-plain";

    @NotNull
    public static final String OCTET = "application/octet-stream";

    @NotNull
    public static final String UNKNOWN = "*/*";

    @NotNull
    public static final String VCARD = "text/x-vcard";

    @NotNull
    public static final String VIDEO_MP4 = "video/mp4";

    @NotNull
    public static final String VIDEO_UNSPECIFIED = "video/*";

    @NotNull
    public static final String VIEW_ONCE = "application/x-signal-view-once";

    @NotNull
    public static final MediaUtils INSTANCE = new MediaUtils();

    /* JADX INFO: renamed from: retriever$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy retriever = LazyKt.lazy(new Function0<MediaMetadataRetriever>() { // from class: com.common.support.imagepicker.dataprovider.utils.MediaUtils$retriever$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MediaMetadataRetriever invoke() {
            return new MediaMetadataRetriever();
        }
    });

    private MediaUtils() {
    }

    private final MediaMetadataRetriever getRetriever() {
        return (MediaMetadataRetriever) retriever.getValue();
    }

    @NotNull
    public final String getCorrectedMimeType(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return (Intrinsics.areEqual(mimeType, "image/jpg") && MimeTypeMap.getSingleton().hasMimeType("image/jpeg")) ? "image/jpeg" : mimeType;
    }

    @NotNull
    public final Pair<Integer, Integer> getVideoWidthAndHeightByOrientation(@NotNull Context context, @NotNull AlbumItem source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        getRetriever().setDataSource(context, source.getContentUri());
        String strExtractMetadata = getRetriever().extractMetadata(24);
        Integer numValueOf = strExtractMetadata != null ? Integer.valueOf(Integer.parseInt(strExtractMetadata)) : null;
        return ((numValueOf != null && numValueOf.intValue() == 90) || (numValueOf != null && numValueOf.intValue() == 270)) ? new Pair<>(Integer.valueOf(source.getHeight()), Integer.valueOf(source.getWidth())) : new Pair<>(Integer.valueOf(source.getWidth()), Integer.valueOf(source.getHeight()));
    }

    public final boolean isAudioType(@Nullable String contentType) {
        return contentType != null && (StringsKt__StringsJVMKt.startsWith$default(contentType, "audio/", false, 2, null) || Intrinsics.areEqual(contentType, "vnd.android.cursor.dir/audio"));
    }

    public final boolean isImageOrVideoType(@Nullable String contentType) {
        return isImageType(contentType) || isVideoType(contentType);
    }

    public final boolean isImageType(@Nullable String contentType) {
        return contentType != null && (StringsKt__StringsJVMKt.startsWith$default(contentType, "image/", false, 2, null) || Intrinsics.areEqual(contentType, "vnd.android.cursor.dir/image"));
    }

    public final boolean isImageVideoOrAudioType(@Nullable String contentType) {
        return isImageOrVideoType(contentType) || isAudioType(contentType);
    }

    public final boolean isOctetStream(@Nullable String contentType) {
        return Intrinsics.areEqual("application/octet-stream", contentType);
    }

    public final boolean isVideoType(@Nullable String contentType) {
        return contentType != null && (StringsKt__StringsJVMKt.startsWith$default(contentType, "video/", false, 2, null) || Intrinsics.areEqual(contentType, "vnd.android.cursor.dir/video"));
    }
}
