package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import p086o000OooO.o0O0O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final String f14517Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f14518Oooo0oo;

    public class OooO00o implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f14517Oooo0oO = str2;
        this.f14518Oooo0oo = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return this.f14506Oooo0o.equals(textInformationFrame.f14506Oooo0o) && o000OOo0.OooO00o(this.f14517Oooo0oO, textInformationFrame.f14517Oooo0oO) && o000OOo0.OooO00o(this.f14518Oooo0oo, textInformationFrame.f14518Oooo0oo);
    }

    public final int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.f14506Oooo0o, 527, 31);
        String str = this.f14517Oooo0oO;
        int iHashCode = (iOooO00o + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14518Oooo0oo;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f14506Oooo0o;
        String str2 = this.f14517Oooo0oO;
        String str3 = this.f14518Oooo0oo;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 22))));
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14506Oooo0o);
        parcel.writeString(this.f14517Oooo0oO);
        parcel.writeString(this.f14518Oooo0oo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInformationFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        super(string);
        this.f14517Oooo0oO = parcel.readString();
        this.f14518Oooo0oo = parcel.readString();
    }
}
