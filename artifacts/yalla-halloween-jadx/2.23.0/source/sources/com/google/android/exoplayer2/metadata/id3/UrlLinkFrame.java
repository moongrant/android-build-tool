package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f12607OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f12608OooO0o0;

    public class OooO00o implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f12608OooO0o0 = str2;
        this.f12607OooO0o = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f12594OooO0Oo.equals(urlLinkFrame.f12594OooO0Oo) && o0O00.OooO00o(this.f12608OooO0o0, urlLinkFrame.f12608OooO0o0) && o0O00.OooO00o(this.f12607OooO0o, urlLinkFrame.f12607OooO0o);
    }

    public final int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.f12594OooO0Oo, 527, 31);
        String str = this.f12608OooO0o0;
        int iHashCode = (iOooO00o + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12607OooO0o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12594OooO0Oo + ": url=" + this.f12607OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12594OooO0Oo);
        parcel.writeString(this.f12608OooO0o0);
        parcel.writeString(this.f12607OooO0o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        super(string);
        this.f12608OooO0o0 = parcel.readString();
        this.f12607OooO0o = parcel.readString();
    }
}
