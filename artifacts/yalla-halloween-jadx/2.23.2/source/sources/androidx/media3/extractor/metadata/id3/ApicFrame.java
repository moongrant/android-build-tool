package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f8450OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8451OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8452OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f8453OooO0oo;

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

    public ApicFrame(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.f8451OooO0o0 = str;
        this.f8450OooO0o = str2;
        this.f8452OooO0oO = i;
        this.f8453OooO0oo = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f8452OooO0oO == apicFrame.f8452OooO0oO && o00.OooO00o(this.f8451OooO0o0, apicFrame.f8451OooO0o0) && o00.OooO00o(this.f8450OooO0o, apicFrame.f8450OooO0o) && Arrays.equals(this.f8453OooO0oo, apicFrame.f8453OooO0oo);
    }

    public final int hashCode() {
        int i = (527 + this.f8452OooO0oO) * 31;
        String str = this.f8451OooO0o0;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8450OooO0o;
        return Arrays.hashCode(this.f8453OooO0oo) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, androidx.media3.common.Metadata.Entry
    public final void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
        oooO00o.OooO00o(this.f8452OooO0oO, this.f8453OooO0oo);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f8473OooO0Oo + ": mimeType=" + this.f8451OooO0o0 + ", description=" + this.f8450OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8451OooO0o0);
        parcel.writeString(this.f8450OooO0o);
        parcel.writeInt(this.f8452OooO0oO);
        parcel.writeByteArray(this.f8453OooO0oo);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8451OooO0o0 = string;
        this.f8450OooO0o = parcel.readString();
        this.f8452OooO0oO = parcel.readInt();
        this.f8453OooO0oo = parcel.createByteArray();
    }
}
