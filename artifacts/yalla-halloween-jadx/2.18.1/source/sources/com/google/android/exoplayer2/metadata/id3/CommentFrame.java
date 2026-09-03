package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f14499Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14500Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f14501Oooo0oo;

    public class OooO00o implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f14500Oooo0oO = str;
        this.f14501Oooo0oo = str2;
        this.f14499Oooo = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return o000OOo0.OooO00o(this.f14501Oooo0oo, commentFrame.f14501Oooo0oo) && o000OOo0.OooO00o(this.f14500Oooo0oO, commentFrame.f14500Oooo0oO) && o000OOo0.OooO00o(this.f14499Oooo, commentFrame.f14499Oooo);
    }

    public final int hashCode() {
        String str = this.f14500Oooo0oO;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14501Oooo0oo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14499Oooo;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f14506Oooo0o;
        String str2 = this.f14500Oooo0oO;
        String str3 = this.f14501Oooo0oo;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 25))));
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14506Oooo0o);
        parcel.writeString(this.f14500Oooo0oO);
        parcel.writeString(this.f14499Oooo);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14500Oooo0oO = string;
        this.f14501Oooo0oo = parcel.readString();
        this.f14499Oooo = parcel.readString();
    }
}
