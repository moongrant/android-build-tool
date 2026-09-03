package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.animation.OooO0O0;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f8486OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f8487OooO0o0;

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
        this.f8487OooO0o0 = str2;
        this.f8486OooO0o = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f8473OooO0Oo.equals(urlLinkFrame.f8473OooO0Oo) && o00.OooO00o(this.f8487OooO0o0, urlLinkFrame.f8487OooO0o0) && o00.OooO00o(this.f8486OooO0o, urlLinkFrame.f8486OooO0o);
    }

    public final int hashCode() {
        int iOooO00o = OooO0O0.OooO00o(this.f8473OooO0Oo, 527, 31);
        String str = this.f8487OooO0o0;
        int iHashCode = (iOooO00o + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8486OooO0o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f8473OooO0Oo + ": url=" + this.f8486OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8473OooO0Oo);
        parcel.writeString(this.f8487OooO0o0);
        parcel.writeString(this.f8486OooO0o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        super(string);
        this.f8487OooO0o0 = parcel.readString();
        this.f8486OooO0o = parcel.readString();
    }
}
