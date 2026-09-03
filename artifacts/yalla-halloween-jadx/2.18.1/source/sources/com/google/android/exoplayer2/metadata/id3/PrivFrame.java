package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14515Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final byte[] f14516Oooo0oo;

    public class OooO00o implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f14515Oooo0oO = str;
        this.f14516Oooo0oo = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return o000OOo0.OooO00o(this.f14515Oooo0oO, privFrame.f14515Oooo0oO) && Arrays.equals(this.f14516Oooo0oo, privFrame.f14516Oooo0oo);
    }

    public final int hashCode() {
        String str = this.f14515Oooo0oO;
        return Arrays.hashCode(this.f14516Oooo0oo) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f14506Oooo0o;
        String str2 = this.f14515Oooo0oO;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 8)));
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14515Oooo0oO);
        parcel.writeByteArray(this.f14516Oooo0oo);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14515Oooo0oO = string;
        this.f14516Oooo0oo = parcel.createByteArray();
    }
}
