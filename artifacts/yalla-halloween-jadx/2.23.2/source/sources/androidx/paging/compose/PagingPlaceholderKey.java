package androidx.paging.compose;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.OooO0O0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "paging-compose_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
public final /* data */ class PagingPlaceholderKey implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f10365OooO0Oo;

    public static final class OooO00o implements Parcelable.Creator<PagingPlaceholderKey> {
        @Override // android.os.Parcelable.Creator
        public final PagingPlaceholderKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PagingPlaceholderKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PagingPlaceholderKey[] newArray(int i) {
            return new PagingPlaceholderKey[i];
        }
    }

    public PagingPlaceholderKey(int i) {
        this.f10365OooO0Oo = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagingPlaceholderKey) && this.f10365OooO0Oo == ((PagingPlaceholderKey) obj).f10365OooO0Oo;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF10365OooO0Oo() {
        return this.f10365OooO0Oo;
    }

    @NotNull
    public final String toString() {
        return OooO0O0.OooO00o(new StringBuilder("PagingPlaceholderKey(index="), this.f10365OooO0Oo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f10365OooO0Oo);
    }
}
