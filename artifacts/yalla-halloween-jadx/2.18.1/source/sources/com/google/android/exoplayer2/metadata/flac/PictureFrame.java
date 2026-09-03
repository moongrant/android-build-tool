package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p086o000OooO.o0O0O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f14464Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f14465Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14466Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f14467Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final byte[] f14468OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f14469OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f14470OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f14471OoooO0O;

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
        this.f14465Oooo0o = i;
        this.f14466Oooo0oO = str;
        this.f14467Oooo0oo = str2;
        this.f14464Oooo = i2;
        this.f14470OoooO00 = i3;
        this.f14469OoooO0 = i4;
        this.f14471OoooO0O = i5;
        this.f14468OoooO = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ Format Oooo0OO() {
        return null;
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
        return this.f14465Oooo0o == pictureFrame.f14465Oooo0o && this.f14466Oooo0oO.equals(pictureFrame.f14466Oooo0oO) && this.f14467Oooo0oo.equals(pictureFrame.f14467Oooo0oo) && this.f14464Oooo == pictureFrame.f14464Oooo && this.f14470OoooO00 == pictureFrame.f14470OoooO00 && this.f14469OoooO0 == pictureFrame.f14469OoooO0 && this.f14471OoooO0O == pictureFrame.f14471OoooO0O && Arrays.equals(this.f14468OoooO, pictureFrame.f14468OoooO);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14468OoooO) + ((((((((o0O0O00.OooO00o(this.f14467Oooo0oo, o0O0O00.OooO00o(this.f14466Oooo0oO, (this.f14465Oooo0o + 527) * 31, 31), 31) + this.f14464Oooo) * 31) + this.f14470OoooO00) * 31) + this.f14469OoooO0) * 31) + this.f14471OoooO0O) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000() {
        return null;
    }

    public final String toString() {
        String str = this.f14466Oooo0oO;
        String str2 = this.f14467Oooo0oo;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 32)));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14465Oooo0o);
        parcel.writeString(this.f14466Oooo0oO);
        parcel.writeString(this.f14467Oooo0oo);
        parcel.writeInt(this.f14464Oooo);
        parcel.writeInt(this.f14470OoooO00);
        parcel.writeInt(this.f14469OoooO0);
        parcel.writeInt(this.f14471OoooO0O);
        parcel.writeByteArray(this.f14468OoooO);
    }

    public PictureFrame(Parcel parcel) {
        this.f14465Oooo0o = parcel.readInt();
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14466Oooo0oO = string;
        this.f14467Oooo0oo = parcel.readString();
        this.f14464Oooo = parcel.readInt();
        this.f14470OoooO00 = parcel.readInt();
        this.f14469OoooO0 = parcel.readInt();
        this.f14471OoooO0O = parcel.readInt();
        this.f14468OoooO = parcel.createByteArray();
    }
}
