package com.yalla.yalla.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006&"}, d2 = {"Lcom/yalla/yalla/model/media/SelectMusicModel;", "Landroid/os/Parcelable;", "durationMs", "", "displayName", "", "titleKey", "startPosition", "filePath", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getDurationMs", "()J", "getFilePath", "getStartPosition", "setStartPosition", "(J)V", "getTitleKey", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SelectMusicModel implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SelectMusicModel> CREATOR = new Creator();

    @NotNull
    private final String displayName;
    private final long durationMs;

    @NotNull
    private final String filePath;
    private long startPosition;

    @NotNull
    private final String titleKey;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectMusicModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SelectMusicModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectMusicModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SelectMusicModel[] newArray(int i) {
            return new SelectMusicModel[i];
        }
    }

    public SelectMusicModel(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3) {
        OooO0OO.OooO00o(str, "displayName", str2, "titleKey", str3, "filePath");
        this.durationMs = j;
        this.displayName = str;
        this.titleKey = str2;
        this.startPosition = j2;
        this.filePath = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleKey() {
        return this.titleKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartPosition() {
        return this.startPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final SelectMusicModel copy(long durationMs, @NotNull String displayName, @NotNull String titleKey, long startPosition, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(titleKey, "titleKey");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new SelectMusicModel(durationMs, displayName, titleKey, startPosition, filePath);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectMusicModel)) {
            return false;
        }
        SelectMusicModel selectMusicModel = (SelectMusicModel) other;
        return this.durationMs == selectMusicModel.durationMs && Intrinsics.areEqual(this.displayName, selectMusicModel.displayName) && Intrinsics.areEqual(this.titleKey, selectMusicModel.titleKey) && this.startPosition == selectMusicModel.startPosition && Intrinsics.areEqual(this.filePath, selectMusicModel.filePath);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getStartPosition() {
        return this.startPosition;
    }

    @NotNull
    public final String getTitleKey() {
        return this.titleKey;
    }

    public int hashCode() {
        long j = this.durationMs;
        int iOooO00o = o0OO00O.OooO00o(this.titleKey, o0OO00O.OooO00o(this.displayName, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        long j2 = this.startPosition;
        return this.filePath.hashCode() + ((iOooO00o + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final void setStartPosition(long j) {
        this.startPosition = j;
    }

    @NotNull
    public String toString() {
        return "SelectMusicModel(durationMs=" + this.durationMs + ", displayName=" + this.displayName + ", titleKey=" + this.titleKey + ", startPosition=" + this.startPosition + ", filePath=" + this.filePath + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.durationMs);
        parcel.writeString(this.displayName);
        parcel.writeString(this.titleKey);
        parcel.writeLong(this.startPosition);
        parcel.writeString(this.filePath);
    }
}
