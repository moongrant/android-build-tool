package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f12571OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f12572OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f12573OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f12574OooO0oo;

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
        this.f12572OooO0o0 = str;
        this.f12571OooO0o = str2;
        this.f12573OooO0oO = i;
        this.f12574OooO0oo = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void OooooOo(MediaMetadata.OooO00o oooO00o) {
        oooO00o.OooO00o(this.f12573OooO0oO, this.f12574OooO0oo);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f12573OooO0oO == apicFrame.f12573OooO0oO && o0O00.OooO00o(this.f12572OooO0o0, apicFrame.f12572OooO0o0) && o0O00.OooO00o(this.f12571OooO0o, apicFrame.f12571OooO0o) && Arrays.equals(this.f12574OooO0oo, apicFrame.f12574OooO0oo);
    }

    public final int hashCode() {
        int i = (527 + this.f12573OooO0oO) * 31;
        String str = this.f12572OooO0o0;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12571OooO0o;
        return Arrays.hashCode(this.f12574OooO0oo) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12594OooO0Oo + ": mimeType=" + this.f12572OooO0o0 + ", description=" + this.f12571OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12572OooO0o0);
        parcel.writeString(this.f12571OooO0o);
        parcel.writeInt(this.f12573OooO0oO);
        parcel.writeByteArray(this.f12574OooO0oo);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12572OooO0o0 = string;
        this.f12571OooO0o = parcel.readString();
        this.f12573OooO0oO = parcel.readInt();
        this.f12574OooO0oo = parcel.createByteArray();
    }
}
