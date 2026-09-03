package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f6383OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6384OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f6385OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f6386OooO0oo;

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

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6384OooO0o0 = string;
        this.f6383OooO0o = parcel.readString();
        this.f6385OooO0oO = parcel.readString();
        this.f6386OooO0oo = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return OooO0o.OooO00o(this.f6384OooO0o0, geobFrame.f6384OooO0o0) && OooO0o.OooO00o(this.f6383OooO0o, geobFrame.f6383OooO0o) && OooO0o.OooO00o(this.f6385OooO0oO, geobFrame.f6385OooO0oO) && Arrays.equals(this.f6386OooO0oo, geobFrame.f6386OooO0oo);
    }

    public final int hashCode() {
        String str = this.f6384OooO0o0;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6383OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6385OooO0oO;
        return Arrays.hashCode(this.f6386OooO0oo) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f6387OooO0Oo + ": mimeType=" + this.f6384OooO0o0 + ", filename=" + this.f6383OooO0o + ", description=" + this.f6385OooO0oO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6384OooO0o0);
        parcel.writeString(this.f6383OooO0o);
        parcel.writeString(this.f6385OooO0oO);
        parcel.writeByteArray(this.f6386OooO0oo);
    }
}
