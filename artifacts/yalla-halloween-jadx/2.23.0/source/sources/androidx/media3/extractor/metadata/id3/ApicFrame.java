package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f6364OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6365OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6366OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f6367OooO0oo;

    public class OooO00o implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6365OooO0o0 = string;
        this.f6364OooO0o = parcel.readString();
        this.f6366OooO0oO = parcel.readInt();
        this.f6367OooO0oo = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f6366OooO0oO == apicFrame.f6366OooO0oO && OooO0o.OooO00o(this.f6365OooO0o0, apicFrame.f6365OooO0o0) && OooO0o.OooO00o(this.f6364OooO0o, apicFrame.f6364OooO0o) && Arrays.equals(this.f6367OooO0oo, apicFrame.f6367OooO0oo);
    }

    public final int hashCode() {
        int i = (527 + this.f6366OooO0oO) * 31;
        String str = this.f6365OooO0o0;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6364OooO0o;
        return Arrays.hashCode(this.f6367OooO0oo) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f6387OooO0Oo + ": mimeType=" + this.f6365OooO0o0 + ", description=" + this.f6364OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6365OooO0o0);
        parcel.writeString(this.f6364OooO0o);
        parcel.writeInt(this.f6366OooO0oO);
        parcel.writeByteArray(this.f6367OooO0oo);
    }
}
