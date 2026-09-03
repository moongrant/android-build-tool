package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f14483Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14484Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final String f14485Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final byte[] f14486OoooO00;

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
        this.f14484Oooo0oO = str;
        this.f14485Oooo0oo = str2;
        this.f14483Oooo = i;
        this.f14486OoooO00 = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f14483Oooo == apicFrame.f14483Oooo && o000OOo0.OooO00o(this.f14484Oooo0oO, apicFrame.f14484Oooo0oO) && o000OOo0.OooO00o(this.f14485Oooo0oo, apicFrame.f14485Oooo0oo) && Arrays.equals(this.f14486OoooO00, apicFrame.f14486OoooO00);
    }

    public final int hashCode() {
        int i = (527 + this.f14483Oooo) * 31;
        String str = this.f14484Oooo0oO;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14485Oooo0oo;
        return Arrays.hashCode(this.f14486OoooO00) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f14506Oooo0o;
        String str2 = this.f14484Oooo0oO;
        String str3 = this.f14485Oooo0oo;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 25))));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14484Oooo0oO);
        parcel.writeString(this.f14485Oooo0oo);
        parcel.writeInt(this.f14483Oooo);
        parcel.writeByteArray(this.f14486OoooO00);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14484Oooo0oO = string;
        this.f14485Oooo0oo = parcel.readString();
        this.f14483Oooo = parcel.readInt();
        this.f14486OoooO00 = parcel.createByteArray();
    }
}
