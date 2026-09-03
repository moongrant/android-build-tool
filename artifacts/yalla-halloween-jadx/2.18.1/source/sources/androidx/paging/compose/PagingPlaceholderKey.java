package androidx.paging.compose;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "paging-compose_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"BanParcelableUsage"})
final /* data */ class PagingPlaceholderKey implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f8811Oooo0o;

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
        this.f8811Oooo0o = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagingPlaceholderKey) && this.f8811Oooo0o == ((PagingPlaceholderKey) obj).f8811Oooo0o;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF8811Oooo0o() {
        return this.f8811Oooo0o;
    }

    @NotNull
    public final String toString() {
        return o0O0ooO.OooO00o(OooO00o.OooO00o.OooO0o0("PagingPlaceholderKey(index="), this.f8811Oooo0o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f8811Oooo0o);
    }
}
