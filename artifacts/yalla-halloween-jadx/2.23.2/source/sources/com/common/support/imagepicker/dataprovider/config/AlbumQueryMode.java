package com.common.support.imagepicker.dataprovider.config;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;IJ)V", "getValue", "()J", "setValue", "(J)V", "QUERY_ALL", "QUERY_IMAGES_ONLY", "QUERY_STATIC_IMAGES_ONLY", "QUERY_VIDEO_ONLY", "Companion", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum AlbumQueryMode {
    QUERY_ALL(0),
    QUERY_IMAGES_ONLY(1),
    QUERY_STATIC_IMAGES_ONLY(2),
    QUERY_VIDEO_ONLY(3);

    private long value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String unknownCategoryName = "";

    @NotNull
    private static String allMediaCategoryName = "";

    @NotNull
    private static String allImageCategoryName = "";

    @NotNull
    private static String allStaticImageCategoryName = "";

    @NotNull
    private static String allVideoCategoryName = "";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode$Companion;", "", "()V", "allImageCategoryName", "", "getAllImageCategoryName$dataprovider_release", "()Ljava/lang/String;", "setAllImageCategoryName$dataprovider_release", "(Ljava/lang/String;)V", "allMediaCategoryName", "getAllMediaCategoryName$dataprovider_release", "setAllMediaCategoryName$dataprovider_release", "allStaticImageCategoryName", "getAllStaticImageCategoryName$dataprovider_release", "setAllStaticImageCategoryName$dataprovider_release", "allVideoCategoryName", "getAllVideoCategoryName$dataprovider_release", "setAllVideoCategoryName$dataprovider_release", "unknownCategoryName", "getUnknownCategoryName$dataprovider_release", "setUnknownCategoryName$dataprovider_release", "setMediaCategoryName", "", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAllImageCategoryName$dataprovider_release() {
            return AlbumQueryMode.allImageCategoryName;
        }

        @NotNull
        public final String getAllMediaCategoryName$dataprovider_release() {
            return AlbumQueryMode.allMediaCategoryName;
        }

        @NotNull
        public final String getAllStaticImageCategoryName$dataprovider_release() {
            return AlbumQueryMode.allStaticImageCategoryName;
        }

        @NotNull
        public final String getAllVideoCategoryName$dataprovider_release() {
            return AlbumQueryMode.allVideoCategoryName;
        }

        @NotNull
        public final String getUnknownCategoryName$dataprovider_release() {
            return AlbumQueryMode.unknownCategoryName;
        }

        public final void setAllImageCategoryName$dataprovider_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AlbumQueryMode.allImageCategoryName = str;
        }

        public final void setAllMediaCategoryName$dataprovider_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AlbumQueryMode.allMediaCategoryName = str;
        }

        public final void setAllStaticImageCategoryName$dataprovider_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AlbumQueryMode.allStaticImageCategoryName = str;
        }

        public final void setAllVideoCategoryName$dataprovider_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AlbumQueryMode.allVideoCategoryName = str;
        }

        public final void setMediaCategoryName(@Nullable String unknownCategoryName, @Nullable String allMediaCategoryName, @Nullable String allImageCategoryName, @Nullable String allStaticImageCategoryName, @Nullable String allVideoCategoryName) {
            if (unknownCategoryName == null) {
                unknownCategoryName = "";
            }
            setUnknownCategoryName$dataprovider_release(unknownCategoryName);
            if (allMediaCategoryName == null) {
                allMediaCategoryName = "";
            }
            setAllMediaCategoryName$dataprovider_release(allMediaCategoryName);
            if (allImageCategoryName == null) {
                allImageCategoryName = "";
            }
            setAllImageCategoryName$dataprovider_release(allImageCategoryName);
            if (allStaticImageCategoryName == null) {
                allStaticImageCategoryName = "";
            }
            setAllStaticImageCategoryName$dataprovider_release(allStaticImageCategoryName);
            if (allVideoCategoryName == null) {
                allVideoCategoryName = "";
            }
            setAllVideoCategoryName$dataprovider_release(allVideoCategoryName);
        }

        public final void setUnknownCategoryName$dataprovider_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AlbumQueryMode.unknownCategoryName = str;
        }
    }

    AlbumQueryMode(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    public final void setValue(long j) {
        this.value = j;
    }
}
