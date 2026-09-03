package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public final byte[] f14895Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f14896Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f14897Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f14898Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f14899OoooO00;

    public class OooO00o implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        public final ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ColorInfo[] newArray(int i) {
            return new ColorInfo[i];
        }
    }

    public ColorInfo(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.f14896Oooo0o = i;
        this.f14897Oooo0oO = i2;
        this.f14898Oooo0oo = i3;
        this.f14895Oooo = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.f14896Oooo0o == colorInfo.f14896Oooo0o && this.f14897Oooo0oO == colorInfo.f14897Oooo0oO && this.f14898Oooo0oo == colorInfo.f14898Oooo0oo && Arrays.equals(this.f14895Oooo, colorInfo.f14895Oooo);
    }

    public final int hashCode() {
        if (this.f14899OoooO00 == 0) {
            this.f14899OoooO00 = Arrays.hashCode(this.f14895Oooo) + ((((((527 + this.f14896Oooo0o) * 31) + this.f14897Oooo0oO) * 31) + this.f14898Oooo0oo) * 31);
        }
        return this.f14899OoooO00;
    }

    public final String toString() {
        int i = this.f14896Oooo0o;
        int i2 = this.f14897Oooo0oO;
        int i3 = this.f14898Oooo0oo;
        boolean z = this.f14895Oooo != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14896Oooo0o);
        parcel.writeInt(this.f14897Oooo0oO);
        parcel.writeInt(this.f14898Oooo0oo);
        int i2 = this.f14895Oooo != null ? 1 : 0;
        int i3 = o000OOo0.f36740OooO00o;
        parcel.writeInt(i2);
        byte[] bArr = this.f14895Oooo;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f14896Oooo0o = parcel.readInt();
        this.f14897Oooo0oO = parcel.readInt();
        this.f14898Oooo0oo = parcel.readInt();
        int i = o000OOo0.f36740OooO00o;
        this.f14895Oooo = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
