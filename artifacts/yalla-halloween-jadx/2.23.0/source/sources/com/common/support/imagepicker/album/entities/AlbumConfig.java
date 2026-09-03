package com.common.support.imagepicker.album.entities;

import com.common.support.imagepicker.album.config.AlbumMultiMode;
import com.common.support.imagepicker.dataprovider.config.AlbumQueryMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0005J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/common/support/imagepicker/album/entities/AlbumConfig;", "", "queryMode", "Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode;", "showCamera", "", "multiMode", "Lcom/common/support/imagepicker/album/config/AlbumMultiMode;", "(Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode;ZLcom/common/support/imagepicker/album/config/AlbumMultiMode;)V", "getMultiMode", "()Lcom/common/support/imagepicker/album/config/AlbumMultiMode;", "getQueryMode", "()Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode;", "getShowCamera", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "isMultiMode", "isSingleMode", "toString", "", "album_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AlbumConfig {

    @NotNull
    private final AlbumMultiMode multiMode;

    @NotNull
    private final AlbumQueryMode queryMode;
    private final boolean showCamera;

    public AlbumConfig() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ AlbumConfig copy$default(AlbumConfig albumConfig, AlbumQueryMode albumQueryMode, boolean z, AlbumMultiMode albumMultiMode, int i, Object obj) {
        if ((i & 1) != 0) {
            albumQueryMode = albumConfig.queryMode;
        }
        if ((i & 2) != 0) {
            z = albumConfig.showCamera;
        }
        if ((i & 4) != 0) {
            albumMultiMode = albumConfig.multiMode;
        }
        return albumConfig.copy(albumQueryMode, z, albumMultiMode);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AlbumQueryMode getQueryMode() {
        return this.queryMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowCamera() {
        return this.showCamera;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AlbumMultiMode getMultiMode() {
        return this.multiMode;
    }

    @NotNull
    public final AlbumConfig copy(@NotNull AlbumQueryMode queryMode, boolean showCamera, @NotNull AlbumMultiMode multiMode) {
        Intrinsics.checkNotNullParameter(queryMode, "queryMode");
        Intrinsics.checkNotNullParameter(multiMode, "multiMode");
        return new AlbumConfig(queryMode, showCamera, multiMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlbumConfig)) {
            return false;
        }
        AlbumConfig albumConfig = (AlbumConfig) other;
        return this.queryMode == albumConfig.queryMode && this.showCamera == albumConfig.showCamera && this.multiMode == albumConfig.multiMode;
    }

    @NotNull
    public final AlbumMultiMode getMultiMode() {
        return this.multiMode;
    }

    @NotNull
    public final AlbumQueryMode getQueryMode() {
        return this.queryMode;
    }

    public final boolean getShowCamera() {
        return this.showCamera;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iHashCode = this.queryMode.hashCode() * 31;
        boolean z = this.showCamera;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.multiMode.hashCode() + ((iHashCode + r1) * 31);
    }

    public final boolean isMultiMode() {
        return this.multiMode == AlbumMultiMode.MODE_MULTI;
    }

    public final boolean isSingleMode() {
        return this.multiMode == AlbumMultiMode.MODE_SINGLE;
    }

    @NotNull
    public String toString() {
        return "AlbumConfig(queryMode=" + this.queryMode + ", showCamera=" + this.showCamera + ", multiMode=" + this.multiMode + ')';
    }

    public AlbumConfig(@NotNull AlbumQueryMode queryMode, boolean z, @NotNull AlbumMultiMode multiMode) {
        Intrinsics.checkNotNullParameter(queryMode, "queryMode");
        Intrinsics.checkNotNullParameter(multiMode, "multiMode");
        this.queryMode = queryMode;
        this.showCamera = z;
        this.multiMode = multiMode;
    }

    public /* synthetic */ AlbumConfig(AlbumQueryMode albumQueryMode, boolean z, AlbumMultiMode albumMultiMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AlbumQueryMode.QUERY_ALL : albumQueryMode, (i & 2) != 0 ? false : z, (i & 4) != 0 ? AlbumMultiMode.MODE_SINGLE : albumMultiMode);
    }
}
