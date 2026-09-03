package com.google.android.exoplayer2.metadata.id3;

import Oooo000.o00O0O;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f14502Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14503Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f14504Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final byte[] f14505OoooO00;

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

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f14503Oooo0oO = str;
        this.f14504Oooo0oo = str2;
        this.f14502Oooo = str3;
        this.f14505OoooO00 = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return o000OOo0.OooO00o(this.f14503Oooo0oO, geobFrame.f14503Oooo0oO) && o000OOo0.OooO00o(this.f14504Oooo0oo, geobFrame.f14504Oooo0oo) && o000OOo0.OooO00o(this.f14502Oooo, geobFrame.f14502Oooo) && Arrays.equals(this.f14505OoooO00, geobFrame.f14505OoooO00);
    }

    public final int hashCode() {
        String str = this.f14503Oooo0oO;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14504Oooo0oo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14502Oooo;
        return Arrays.hashCode(this.f14505OoooO00) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f14506Oooo0o;
        String str2 = this.f14503Oooo0oO;
        String str3 = this.f14504Oooo0oo;
        String str4 = this.f14502Oooo;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str4, o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 36)))));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        return o00O0O.OooO0O0(sb, str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14503Oooo0oO);
        parcel.writeString(this.f14504Oooo0oo);
        parcel.writeString(this.f14502Oooo);
        parcel.writeByteArray(this.f14505OoooO00);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14503Oooo0oO = string;
        this.f14504Oooo0oo = parcel.readString();
        this.f14502Oooo = parcel.readString();
        this.f14505OoooO00 = parcel.createByteArray();
    }
}
