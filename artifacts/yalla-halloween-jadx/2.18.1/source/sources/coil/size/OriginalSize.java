package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/OriginalSize;", "Lcoil/size/Size;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public final class OriginalSize extends Size {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final OriginalSize f9945Oooo0o = new OriginalSize();

    @NotNull
    public static final Parcelable.Creator<OriginalSize> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<OriginalSize> {
        @Override // android.os.Parcelable.Creator
        public final OriginalSize createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OriginalSize.f9945Oooo0o;
        }

        @Override // android.os.Parcelable.Creator
        public final OriginalSize[] newArray(int i) {
            return new OriginalSize[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String toString() {
        return "coil.size.OriginalSize";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }
}
