package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/PixelSize;", "Lcoil/size/Size;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PixelSize extends Size {

    @NotNull
    public static final Parcelable.Creator<PixelSize> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f9946Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f9947Oooo0oO;

    public static final class OooO00o implements Parcelable.Creator<PixelSize> {
        @Override // android.os.Parcelable.Creator
        public final PixelSize createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixelSize(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PixelSize[] newArray(int i) {
            return new PixelSize[i];
        }
    }

    public PixelSize(@Px int i, @Px int i2) {
        this.f9946Oooo0o = i;
        this.f9947Oooo0oO = i2;
        if (!(i > 0 && i2 > 0)) {
            throw new IllegalArgumentException("width and height must be > 0.".toString());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PixelSize)) {
            return false;
        }
        PixelSize pixelSize = (PixelSize) obj;
        return this.f9946Oooo0o == pixelSize.f9946Oooo0o && this.f9947Oooo0oO == pixelSize.f9947Oooo0oO;
    }

    public final int hashCode() {
        return (this.f9946Oooo0o * 31) + this.f9947Oooo0oO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PixelSize(width=");
        sbOooO0o0.append(this.f9946Oooo0o);
        sbOooO0o0.append(", height=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f9947Oooo0oO, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f9946Oooo0o);
        out.writeInt(this.f9947Oooo0oO);
    }
}
