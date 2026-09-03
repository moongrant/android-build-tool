package com.common.support.imagepicker.dataprovider.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.common.support.imagepicker.dataprovider.config.AlbumQueryMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/entities/AlbumSource;", "Landroid/os/Parcelable;", "id", "", "_name", "", "data", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "(JLjava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getId", "()J", "name", "getName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlbumSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumSource.kt\ncom/common/support/imagepicker/dataprovider/entities/AlbumSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class AlbumSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlbumSource> CREATOR = new Creator();

    @NotNull
    private final String _name;

    @NotNull
    private final List<AlbumItem> data;
    private final long id;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlbumSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumSource createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(AlbumSource.class.getClassLoader()));
            }
            return new AlbumSource(j, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumSource[] newArray(int i) {
            return new AlbumSource[i];
        }
    }

    public AlbumSource(long j, @NotNull String _name, @NotNull List<AlbumItem> data) {
        Intrinsics.checkNotNullParameter(_name, "_name");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = j;
        this._name = _name;
        this.data = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<AlbumItem> getData() {
        return this.data;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        String str = this._name;
        return str.length() == 0 ? AlbumQueryMode.INSTANCE.getUnknownCategoryName$dataprovider_release() : str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this._name);
        List<AlbumItem> list = this.data;
        parcel.writeInt(list.size());
        Iterator<AlbumItem> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }

    public /* synthetic */ AlbumSource(long j, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? new ArrayList() : list);
    }
}
