package com.common.support.imagepicker.dataprovider.entities;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "Landroid/os/Parcelable;", "originItem", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "editItem", "source", "", "(Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;I)V", "getEditItem", "()Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "setEditItem", "(Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;)V", "getOriginItem", "setOriginItem", "getSource", "()I", "setSource", "(I)V", "describeContents", "isEditable", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AlbumItemWrapper implements Parcelable {
    public static final int TYPE_ALBUM = 0;
    public static final int TYPE_CAMERA = 1;

    @Nullable
    private AlbumItem editItem;

    @NotNull
    private AlbumItem originItem;
    private int source;

    @NotNull
    public static final Parcelable.Creator<AlbumItemWrapper> CREATOR = new Creator();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlbumItemWrapper> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumItemWrapper createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlbumItemWrapper((AlbumItem) parcel.readParcelable(AlbumItemWrapper.class.getClassLoader()), (AlbumItem) parcel.readParcelable(AlbumItemWrapper.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumItemWrapper[] newArray(int i) {
            return new AlbumItemWrapper[i];
        }
    }

    public AlbumItemWrapper(@NotNull AlbumItem originItem, @Nullable AlbumItem albumItem, int i) {
        Intrinsics.checkNotNullParameter(originItem, "originItem");
        this.originItem = originItem;
        this.editItem = albumItem;
        this.source = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final AlbumItem getEditItem() {
        return this.editItem;
    }

    @NotNull
    public final AlbumItem getOriginItem() {
        return this.originItem;
    }

    public final int getSource() {
        return this.source;
    }

    public final boolean isEditable() {
        return !this.originItem.isGif();
    }

    public final void setEditItem(@Nullable AlbumItem albumItem) {
        this.editItem = albumItem;
    }

    public final void setOriginItem(@NotNull AlbumItem albumItem) {
        Intrinsics.checkNotNullParameter(albumItem, "<set-?>");
        this.originItem = albumItem;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    @NotNull
    public String toString() {
        AlbumItem albumItem = this.originItem;
        AlbumItem albumItem2 = this.editItem;
        int i = this.source;
        StringBuilder sb = new StringBuilder("AlbumItemWrapper(\noriginItem=");
        sb.append(albumItem);
        sb.append("\n, \neditItem=");
        sb.append(albumItem2);
        sb.append("\n, \nsource=");
        return OooOO0.OooO00o(sb, i, "\n)");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.originItem, flags);
        parcel.writeParcelable(this.editItem, flags);
        parcel.writeInt(this.source);
    }

    public /* synthetic */ AlbumItemWrapper(AlbumItem albumItem, AlbumItem albumItem2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(albumItem, (i2 & 2) != 0 ? null : albumItem2, (i2 & 4) != 0 ? 0 : i);
    }
}
