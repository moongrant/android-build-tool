package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f14507Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14508Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f14509Oooo0oo;

    public class OooO00o implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f14508Oooo0oO = str;
        this.f14509Oooo0oo = str2;
        this.f14507Oooo = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return o000OOo0.OooO00o(this.f14509Oooo0oo, internalFrame.f14509Oooo0oo) && o000OOo0.OooO00o(this.f14508Oooo0oO, internalFrame.f14508Oooo0oO) && o000OOo0.OooO00o(this.f14507Oooo, internalFrame.f14507Oooo);
    }

    public final int hashCode() {
        String str = this.f14508Oooo0oO;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14509Oooo0oo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14507Oooo;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f14506Oooo0o;
        String str2 = this.f14508Oooo0oO;
        String str3 = this.f14509Oooo0oo;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 23))));
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14506Oooo0o);
        parcel.writeString(this.f14508Oooo0oO);
        parcel.writeString(this.f14507Oooo);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14508Oooo0oO = string;
        this.f14509Oooo0oo = parcel.readString();
        this.f14507Oooo = parcel.readString();
    }
}
