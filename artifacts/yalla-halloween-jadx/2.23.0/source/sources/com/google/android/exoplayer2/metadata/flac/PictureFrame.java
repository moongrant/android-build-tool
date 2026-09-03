package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.base.OooO;
import java.util.Arrays;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f12552OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f12553OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f12554OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f12555OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f12556OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f12557OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f12558OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final byte[] f12559OooOO0O;

    public class OooO00o implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f12553OooO0Oo = i;
        this.f12555OooO0o0 = str;
        this.f12554OooO0o = str2;
        this.f12556OooO0oO = i2;
        this.f12557OooO0oo = i3;
        this.f12552OooO = i4;
        this.f12558OooOO0 = i5;
        this.f12559OooOO0O = bArr;
    }

    public static PictureFrame OooO00o(o00Oo00 o00oo00) {
        int iOooO0o = o00oo00.OooO0o();
        String strOooOo00 = o00oo00.OooOo00(o00oo00.OooO0o(), OooO.f19057OooO00o);
        String strOooOOoo = o00oo00.OooOOoo(o00oo00.OooO0o());
        int iOooO0o2 = o00oo00.OooO0o();
        int iOooO0o3 = o00oo00.OooO0o();
        int iOooO0o4 = o00oo00.OooO0o();
        int iOooO0o5 = o00oo00.OooO0o();
        int iOooO0o6 = o00oo00.OooO0o();
        byte[] bArr = new byte[iOooO0o6];
        o00oo00.OooO0Oo(0, iOooO0o6, bArr);
        return new PictureFrame(iOooO0o, strOooOo00, strOooOOoo, iOooO0o2, iOooO0o3, iOooO0o4, iOooO0o5, bArr);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ OooOo OooOo0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void OooooOo(MediaMetadata.OooO00o oooO00o) {
        oooO00o.OooO00o(this.f12553OooO0Oo, this.f12559OooOO0O);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f12553OooO0Oo == pictureFrame.f12553OooO0Oo && this.f12555OooO0o0.equals(pictureFrame.f12555OooO0o0) && this.f12554OooO0o.equals(pictureFrame.f12554OooO0o) && this.f12556OooO0oO == pictureFrame.f12556OooO0oO && this.f12557OooO0oo == pictureFrame.f12557OooO0oo && this.f12552OooO == pictureFrame.f12552OooO && this.f12558OooOO0 == pictureFrame.f12558OooOO0 && Arrays.equals(this.f12559OooOO0O, pictureFrame.f12559OooOO0O);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12559OooOO0O) + ((((((((o0OO00O.OooO00o(this.f12554OooO0o, o0OO00O.OooO00o(this.f12555OooO0o0, (this.f12553OooO0Oo + 527) * 31, 31), 31) + this.f12556OooO0oO) * 31) + this.f12557OooO0oo) * 31) + this.f12552OooO) * 31) + this.f12558OooOO0) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f12555OooO0o0 + ", description=" + this.f12554OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12553OooO0Oo);
        parcel.writeString(this.f12555OooO0o0);
        parcel.writeString(this.f12554OooO0o);
        parcel.writeInt(this.f12556OooO0oO);
        parcel.writeInt(this.f12557OooO0oo);
        parcel.writeInt(this.f12552OooO);
        parcel.writeInt(this.f12558OooOO0);
        parcel.writeByteArray(this.f12559OooOO0O);
    }

    public PictureFrame(Parcel parcel) {
        this.f12553OooO0Oo = parcel.readInt();
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12555OooO0o0 = string;
        this.f12554OooO0o = parcel.readString();
        this.f12556OooO0oO = parcel.readInt();
        this.f12557OooO0oo = parcel.readInt();
        this.f12552OooO = parcel.readInt();
        this.f12558OooOO0 = parcel.readInt();
        this.f12559OooOO0O = parcel.createByteArray();
    }
}
