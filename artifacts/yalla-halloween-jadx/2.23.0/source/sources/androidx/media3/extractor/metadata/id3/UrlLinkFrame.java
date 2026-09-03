package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import o000O000.OooO0o;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f6400OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f6401OooO0o0;

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

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        super(string);
        this.f6401OooO0o0 = parcel.readString();
        this.f6400OooO0o = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f6387OooO0Oo.equals(urlLinkFrame.f6387OooO0Oo) && OooO0o.OooO00o(this.f6401OooO0o0, urlLinkFrame.f6401OooO0o0) && OooO0o.OooO00o(this.f6400OooO0o, urlLinkFrame.f6400OooO0o);
    }

    public final int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.f6387OooO0Oo, 527, 31);
        String str = this.f6401OooO0o0;
        int iHashCode = (iOooO00o + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6400OooO0o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f6387OooO0Oo + ": url=" + this.f6400OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6387OooO0Oo);
        parcel.writeString(this.f6401OooO0o0);
        parcel.writeString(this.f6400OooO0o);
    }
}
