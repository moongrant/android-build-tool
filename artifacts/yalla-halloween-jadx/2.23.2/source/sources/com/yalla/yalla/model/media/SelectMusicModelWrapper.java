package com.yalla.yalla.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/model/media/SelectMusicModelWrapper;", "Landroid/os/Parcelable;", "from", "Lcom/yalla/yalla/model/media/SelectMusicFrom;", "selectMusicModel", "Lcom/yalla/yalla/model/media/SelectMusicModel;", "(Lcom/yalla/yalla/model/media/SelectMusicFrom;Lcom/yalla/yalla/model/media/SelectMusicModel;)V", "getFrom", "()Lcom/yalla/yalla/model/media/SelectMusicFrom;", "getSelectMusicModel", "()Lcom/yalla/yalla/model/media/SelectMusicModel;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SelectMusicModelWrapper implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SelectMusicModelWrapper> CREATOR = new Creator();

    @NotNull
    private final SelectMusicFrom from;

    @Nullable
    private final SelectMusicModel selectMusicModel;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectMusicModelWrapper> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SelectMusicModelWrapper createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectMusicModelWrapper(SelectMusicFrom.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SelectMusicModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SelectMusicModelWrapper[] newArray(int i) {
            return new SelectMusicModelWrapper[i];
        }
    }

    public SelectMusicModelWrapper(@NotNull SelectMusicFrom from, @Nullable SelectMusicModel selectMusicModel) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.from = from;
        this.selectMusicModel = selectMusicModel;
    }

    public static /* synthetic */ SelectMusicModelWrapper copy$default(SelectMusicModelWrapper selectMusicModelWrapper, SelectMusicFrom selectMusicFrom, SelectMusicModel selectMusicModel, int i, Object obj) {
        if ((i & 1) != 0) {
            selectMusicFrom = selectMusicModelWrapper.from;
        }
        if ((i & 2) != 0) {
            selectMusicModel = selectMusicModelWrapper.selectMusicModel;
        }
        return selectMusicModelWrapper.copy(selectMusicFrom, selectMusicModel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelectMusicFrom getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SelectMusicModel getSelectMusicModel() {
        return this.selectMusicModel;
    }

    @NotNull
    public final SelectMusicModelWrapper copy(@NotNull SelectMusicFrom from, @Nullable SelectMusicModel selectMusicModel) {
        Intrinsics.checkNotNullParameter(from, "from");
        return new SelectMusicModelWrapper(from, selectMusicModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectMusicModelWrapper)) {
            return false;
        }
        SelectMusicModelWrapper selectMusicModelWrapper = (SelectMusicModelWrapper) other;
        return this.from == selectMusicModelWrapper.from && Intrinsics.areEqual(this.selectMusicModel, selectMusicModelWrapper.selectMusicModel);
    }

    @NotNull
    public final SelectMusicFrom getFrom() {
        return this.from;
    }

    @Nullable
    public final SelectMusicModel getSelectMusicModel() {
        return this.selectMusicModel;
    }

    public int hashCode() {
        int iHashCode = this.from.hashCode() * 31;
        SelectMusicModel selectMusicModel = this.selectMusicModel;
        return iHashCode + (selectMusicModel == null ? 0 : selectMusicModel.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelectMusicModelWrapper(from=" + this.from + ", selectMusicModel=" + this.selectMusicModel + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.from.name());
        SelectMusicModel selectMusicModel = this.selectMusicModel;
        if (selectMusicModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectMusicModel.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SelectMusicModelWrapper(SelectMusicFrom selectMusicFrom, SelectMusicModel selectMusicModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SelectMusicFrom.UN_KNOW : selectMusicFrom, selectMusicModel);
    }
}
