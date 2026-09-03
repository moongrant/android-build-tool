package com.yalla.yalla.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/media/MediaVideoInfo;", "Landroid/os/Parcelable;", "videoItemList", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/media/MediaVideoItemModel;", "Lkotlin/collections/ArrayList;", "videoPlayRangeStart", "", "videoPlayRangeEnd", "(Ljava/util/ArrayList;JJ)V", "getVideoItemList", "()Ljava/util/ArrayList;", "getVideoPlayRangeEnd", "()J", "setVideoPlayRangeEnd", "(J)V", "getVideoPlayRangeStart", "setVideoPlayRangeStart", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MediaVideoInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MediaVideoInfo> CREATOR = new Creator();

    @Nullable
    private final ArrayList<MediaVideoItemModel> videoItemList;
    private long videoPlayRangeEnd;
    private long videoPlayRangeStart;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MediaVideoInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaVideoInfo createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(MediaVideoItemModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new MediaVideoInfo(arrayList, parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaVideoInfo[] newArray(int i) {
            return new MediaVideoInfo[i];
        }
    }

    public MediaVideoInfo(@Nullable ArrayList<MediaVideoItemModel> arrayList, long j, long j2) {
        this.videoItemList = arrayList;
        this.videoPlayRangeStart = j;
        this.videoPlayRangeEnd = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaVideoInfo copy$default(MediaVideoInfo mediaVideoInfo, ArrayList arrayList, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = mediaVideoInfo.videoItemList;
        }
        if ((i & 2) != 0) {
            j = mediaVideoInfo.videoPlayRangeStart;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = mediaVideoInfo.videoPlayRangeEnd;
        }
        return mediaVideoInfo.copy(arrayList, j3, j2);
    }

    @Nullable
    public final ArrayList<MediaVideoItemModel> component1() {
        return this.videoItemList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getVideoPlayRangeStart() {
        return this.videoPlayRangeStart;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getVideoPlayRangeEnd() {
        return this.videoPlayRangeEnd;
    }

    @NotNull
    public final MediaVideoInfo copy(@Nullable ArrayList<MediaVideoItemModel> videoItemList, long videoPlayRangeStart, long videoPlayRangeEnd) {
        return new MediaVideoInfo(videoItemList, videoPlayRangeStart, videoPlayRangeEnd);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaVideoInfo)) {
            return false;
        }
        MediaVideoInfo mediaVideoInfo = (MediaVideoInfo) other;
        return Intrinsics.areEqual(this.videoItemList, mediaVideoInfo.videoItemList) && this.videoPlayRangeStart == mediaVideoInfo.videoPlayRangeStart && this.videoPlayRangeEnd == mediaVideoInfo.videoPlayRangeEnd;
    }

    @Nullable
    public final ArrayList<MediaVideoItemModel> getVideoItemList() {
        return this.videoItemList;
    }

    public final long getVideoPlayRangeEnd() {
        return this.videoPlayRangeEnd;
    }

    public final long getVideoPlayRangeStart() {
        return this.videoPlayRangeStart;
    }

    public int hashCode() {
        ArrayList<MediaVideoItemModel> arrayList = this.videoItemList;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        long j = this.videoPlayRangeStart;
        int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.videoPlayRangeEnd;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final void setVideoPlayRangeEnd(long j) {
        this.videoPlayRangeEnd = j;
    }

    public final void setVideoPlayRangeStart(long j) {
        this.videoPlayRangeStart = j;
    }

    @NotNull
    public String toString() {
        return "MediaVideoInfo(videoItemList=" + this.videoItemList + ", videoPlayRangeStart=" + this.videoPlayRangeStart + ", videoPlayRangeEnd=" + this.videoPlayRangeEnd + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ArrayList<MediaVideoItemModel> arrayList = this.videoItemList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<MediaVideoItemModel> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeLong(this.videoPlayRangeStart);
        parcel.writeLong(this.videoPlayRangeEnd);
    }

    public /* synthetic */ MediaVideoInfo(ArrayList arrayList, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, j, j2);
    }
}
