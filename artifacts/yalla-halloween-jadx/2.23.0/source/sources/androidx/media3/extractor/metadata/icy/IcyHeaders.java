package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f6355OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6356OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f6357OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f6358OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f6359OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f6360OooO0oo;

    public class OooO00o implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(Parcel parcel) {
        this.f6356OooO0Oo = parcel.readInt();
        this.f6358OooO0o0 = parcel.readString();
        this.f6357OooO0o = parcel.readString();
        this.f6359OooO0oO = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6360OooO0oo = parcel.readInt() != 0;
        this.f6355OooO = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f6356OooO0Oo == icyHeaders.f6356OooO0Oo && OooO0o.OooO00o(this.f6358OooO0o0, icyHeaders.f6358OooO0o0) && OooO0o.OooO00o(this.f6357OooO0o, icyHeaders.f6357OooO0o) && OooO0o.OooO00o(this.f6359OooO0oO, icyHeaders.f6359OooO0oO) && this.f6360OooO0oo == icyHeaders.f6360OooO0oo && this.f6355OooO == icyHeaders.f6355OooO;
    }

    public final int hashCode() {
        int i = (527 + this.f6356OooO0Oo) * 31;
        String str = this.f6358OooO0o0;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6357OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6359OooO0oO;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6360OooO0oo ? 1 : 0)) * 31) + this.f6355OooO;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f6357OooO0o + "\", genre=\"" + this.f6358OooO0o0 + "\", bitrate=" + this.f6356OooO0Oo + ", metadataInterval=" + this.f6355OooO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6356OooO0Oo);
        parcel.writeString(this.f6358OooO0o0);
        parcel.writeString(this.f6357OooO0o);
        parcel.writeString(this.f6359OooO0oO);
        int i2 = OooO0o.f34423OooO00o;
        parcel.writeInt(this.f6360OooO0oo ? 1 : 0);
        parcel.writeInt(this.f6355OooO);
    }
}
