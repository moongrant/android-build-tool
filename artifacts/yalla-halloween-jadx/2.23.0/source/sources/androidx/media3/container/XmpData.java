package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator<XmpData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f6274OooO0Oo;

    public class OooO00o implements Parcelable.Creator<XmpData> {
        @Override // android.os.Parcelable.Creator
        public final XmpData createFromParcel(Parcel parcel) {
            return new XmpData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final XmpData[] newArray(int i) {
            return new XmpData[i];
        }
    }

    public XmpData(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = OooO0o.f34423OooO00o;
        this.f6274OooO0Oo = bArrCreateByteArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6274OooO0Oo, ((XmpData) obj).f6274OooO0Oo);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6274OooO0Oo);
    }

    public final String toString() {
        return "XMP: " + OooO0o.OooO(this.f6274OooO0Oo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f6274OooO0Oo);
    }
}
