package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f12590OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f12591OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f12592OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f12593OooO0oo;

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
        this.f12591OooO0o0 = str;
        this.f12590OooO0o = str2;
        this.f12592OooO0oO = str3;
        this.f12593OooO0oo = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return o0O00.OooO00o(this.f12591OooO0o0, geobFrame.f12591OooO0o0) && o0O00.OooO00o(this.f12590OooO0o, geobFrame.f12590OooO0o) && o0O00.OooO00o(this.f12592OooO0oO, geobFrame.f12592OooO0oO) && Arrays.equals(this.f12593OooO0oo, geobFrame.f12593OooO0oo);
    }

    public final int hashCode() {
        String str = this.f12591OooO0o0;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12590OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12592OooO0oO;
        return Arrays.hashCode(this.f12593OooO0oo) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12594OooO0Oo + ": mimeType=" + this.f12591OooO0o0 + ", filename=" + this.f12590OooO0o + ", description=" + this.f12592OooO0oO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12591OooO0o0);
        parcel.writeString(this.f12590OooO0o);
        parcel.writeString(this.f12592OooO0oO);
        parcel.writeByteArray(this.f12593OooO0oo);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12591OooO0o0 = string;
        this.f12590OooO0o = parcel.readString();
        this.f12592OooO0oO = parcel.readString();
        this.f12593OooO0oo = parcel.createByteArray();
    }
}
