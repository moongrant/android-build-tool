package com.common.support.imagepicker.mediaedit.entities;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006&"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/entities/MediaEditConfig;", "Landroid/os/Parcelable;", "rootPath", "", "saveToAlbum", "", "needCompress", "needDeduplication", "(Ljava/lang/String;ZZZ)V", "getNeedCompress", "()Z", "setNeedCompress", "(Z)V", "getNeedDeduplication", "setNeedDeduplication", "getRootPath", "()Ljava/lang/String;", "setRootPath", "(Ljava/lang/String;)V", "getSaveToAlbum", "setSaveToAlbum", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MediaEditConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MediaEditConfig> CREATOR = new Creator();
    private boolean needCompress;
    private boolean needDeduplication;

    @Nullable
    private String rootPath;
    private boolean saveToAlbum;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MediaEditConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaEditConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MediaEditConfig(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaEditConfig[] newArray(int i) {
            return new MediaEditConfig[i];
        }
    }

    public MediaEditConfig() {
        this(null, false, false, false, 15, null);
    }

    public static /* synthetic */ MediaEditConfig copy$default(MediaEditConfig mediaEditConfig, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaEditConfig.rootPath;
        }
        if ((i & 2) != 0) {
            z = mediaEditConfig.saveToAlbum;
        }
        if ((i & 4) != 0) {
            z2 = mediaEditConfig.needCompress;
        }
        if ((i & 8) != 0) {
            z3 = mediaEditConfig.needDeduplication;
        }
        return mediaEditConfig.copy(str, z, z2, z3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRootPath() {
        return this.rootPath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSaveToAlbum() {
        return this.saveToAlbum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNeedCompress() {
        return this.needCompress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNeedDeduplication() {
        return this.needDeduplication;
    }

    @NotNull
    public final MediaEditConfig copy(@Nullable String rootPath, boolean saveToAlbum, boolean needCompress, boolean needDeduplication) {
        return new MediaEditConfig(rootPath, saveToAlbum, needCompress, needDeduplication);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaEditConfig)) {
            return false;
        }
        MediaEditConfig mediaEditConfig = (MediaEditConfig) other;
        return Intrinsics.areEqual(this.rootPath, mediaEditConfig.rootPath) && this.saveToAlbum == mediaEditConfig.saveToAlbum && this.needCompress == mediaEditConfig.needCompress && this.needDeduplication == mediaEditConfig.needDeduplication;
    }

    public final boolean getNeedCompress() {
        return this.needCompress;
    }

    public final boolean getNeedDeduplication() {
        return this.needDeduplication;
    }

    @Nullable
    public final String getRootPath() {
        return this.rootPath;
    }

    public final boolean getSaveToAlbum() {
        return this.saveToAlbum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        String str = this.rootPath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.saveToAlbum;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.needCompress;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.needDeduplication;
        return i2 + (z3 ? 1 : z3);
    }

    public final void setNeedCompress(boolean z) {
        this.needCompress = z;
    }

    public final void setNeedDeduplication(boolean z) {
        this.needDeduplication = z;
    }

    public final void setRootPath(@Nullable String str) {
        this.rootPath = str;
    }

    public final void setSaveToAlbum(boolean z) {
        this.saveToAlbum = z;
    }

    @NotNull
    public String toString() {
        return "MediaEditConfig(rootPath=" + this.rootPath + ", saveToAlbum=" + this.saveToAlbum + ", needCompress=" + this.needCompress + ", needDeduplication=" + this.needDeduplication + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.rootPath);
        parcel.writeInt(this.saveToAlbum ? 1 : 0);
        parcel.writeInt(this.needCompress ? 1 : 0);
        parcel.writeInt(this.needDeduplication ? 1 : 0);
    }

    public MediaEditConfig(@Nullable String str, boolean z, boolean z2, boolean z3) {
        this.rootPath = str;
        this.saveToAlbum = z;
        this.needCompress = z2;
        this.needDeduplication = z3;
    }

    public /* synthetic */ MediaEditConfig(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? true : z3);
    }
}
