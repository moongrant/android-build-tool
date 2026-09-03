package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f8469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8470OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f8471OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f8472OooO0oo;

    public class OooO00o implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, byte[] bArr, String str3) {
        super("GEOB");
        this.f8470OooO0o0 = str;
        this.f8469OooO0o = str2;
        this.f8471OooO0oO = str3;
        this.f8472OooO0oo = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return o00.OooO00o(this.f8470OooO0o0, geobFrame.f8470OooO0o0) && o00.OooO00o(this.f8469OooO0o, geobFrame.f8469OooO0o) && o00.OooO00o(this.f8471OooO0oO, geobFrame.f8471OooO0oO) && Arrays.equals(this.f8472OooO0oo, geobFrame.f8472OooO0oo);
    }

    public final int hashCode() {
        String str = this.f8470OooO0o0;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8469OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8471OooO0oO;
        return Arrays.hashCode(this.f8472OooO0oo) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f8473OooO0Oo + ": mimeType=" + this.f8470OooO0o0 + ", filename=" + this.f8469OooO0o + ", description=" + this.f8471OooO0oO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8470OooO0o0);
        parcel.writeString(this.f8469OooO0o);
        parcel.writeString(this.f8471OooO0oO);
        parcel.writeByteArray(this.f8472OooO0oo);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8470OooO0o0 = string;
        this.f8469OooO0o = parcel.readString();
        this.f8471OooO0oO = parcel.readString();
        this.f8472OooO0oo = parcel.createByteArray();
    }
}
