package com.yalla.yalla.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/yalla/yalla/model/media/MediaVideoItemModel;", "Landroid/os/Parcelable;", "filePath", "", "duration", "", "percent", "", "(Ljava/lang/String;JF)V", "getDuration", "()J", "getFilePath", "()Ljava/lang/String;", "getPercent", "()F", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MediaVideoItemModel implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<MediaVideoItemModel> CREATOR = new Creator();
    private final long duration;

    @NotNull
    private final String filePath;
    private final float percent;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MediaVideoItemModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaVideoItemModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MediaVideoItemModel(parcel.readString(), parcel.readLong(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaVideoItemModel[] newArray(int i) {
            return new MediaVideoItemModel[i];
        }
    }

    public MediaVideoItemModel(@NotNull String filePath, long j, float f) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.duration = j;
        this.percent = f;
    }

    public static /* synthetic */ MediaVideoItemModel copy$default(MediaVideoItemModel mediaVideoItemModel, String str, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaVideoItemModel.filePath;
        }
        if ((i & 2) != 0) {
            j = mediaVideoItemModel.duration;
        }
        if ((i & 4) != 0) {
            f = mediaVideoItemModel.percent;
        }
        return mediaVideoItemModel.copy(str, j, f);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    @NotNull
    public final MediaVideoItemModel copy(@NotNull String filePath, long duration, float percent) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new MediaVideoItemModel(filePath, duration, percent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaVideoItemModel)) {
            return false;
        }
        MediaVideoItemModel mediaVideoItemModel = (MediaVideoItemModel) other;
        return Intrinsics.areEqual(this.filePath, mediaVideoItemModel.filePath) && this.duration == mediaVideoItemModel.duration && Float.compare(this.percent, mediaVideoItemModel.percent) == 0;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        int iHashCode = this.filePath.hashCode() * 31;
        long j = this.duration;
        return Float.floatToIntBits(this.percent) + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @NotNull
    public String toString() {
        return "MediaVideoItemModel(filePath=" + this.filePath + ", duration=" + this.duration + ", percent=" + this.percent + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.filePath);
        parcel.writeLong(this.duration);
        parcel.writeFloat(this.percent);
    }
}
