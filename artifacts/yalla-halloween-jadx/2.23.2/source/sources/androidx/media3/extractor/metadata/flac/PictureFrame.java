package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.animation.OooO0O0;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.OooOO0;
import java.util.Arrays;
import p080o000OoO.o00;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f8431OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f8432OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f8433OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8434OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8435OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f8436OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f8437OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final byte[] f8438OooOO0O;

    public class OooO00o implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f8432OooO0Oo = i;
        this.f8434OooO0o0 = str;
        this.f8433OooO0o = str2;
        this.f8435OooO0oO = i2;
        this.f8436OooO0oo = i3;
        this.f8431OooO = i4;
        this.f8437OooOO0 = i5;
        this.f8438OooOO0O = bArr;
    }

    public static PictureFrame OooO00o(o000O000 o000o001) {
        int iOooO0o = o000o001.OooO0o();
        String strOooOo00 = o000o001.OooOo00(o000o001.OooO0o(), OooOO0.f18590OooO00o);
        String strOooOOoo = o000o001.OooOOoo(o000o001.OooO0o());
        int iOooO0o2 = o000o001.OooO0o();
        int iOooO0o3 = o000o001.OooO0o();
        int iOooO0o4 = o000o001.OooO0o();
        int iOooO0o5 = o000o001.OooO0o();
        int iOooO0o6 = o000o001.OooO0o();
        byte[] bArr = new byte[iOooO0o6];
        o000o001.OooO0Oo(0, iOooO0o6, bArr);
        return new PictureFrame(iOooO0o, strOooOo00, strOooOOoo, iOooO0o2, iOooO0o3, iOooO0o4, iOooO0o5, bArr);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ androidx.media3.common.OooOO0 OooOo0() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f8432OooO0Oo == pictureFrame.f8432OooO0Oo && this.f8434OooO0o0.equals(pictureFrame.f8434OooO0o0) && this.f8433OooO0o.equals(pictureFrame.f8433OooO0o) && this.f8435OooO0oO == pictureFrame.f8435OooO0oO && this.f8436OooO0oo == pictureFrame.f8436OooO0oo && this.f8431OooO == pictureFrame.f8431OooO && this.f8437OooOO0 == pictureFrame.f8437OooOO0 && Arrays.equals(this.f8438OooOO0O, pictureFrame.f8438OooOO0O);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8438OooOO0O) + ((((((((OooO0O0.OooO00o(this.f8433OooO0o, OooO0O0.OooO00o(this.f8434OooO0o0, (this.f8432OooO0Oo + 527) * 31, 31), 31) + this.f8435OooO0oO) * 31) + this.f8436OooO0oo) * 31) + this.f8431OooO) * 31) + this.f8437OooOO0) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
        oooO00o.OooO00o(this.f8432OooO0Oo, this.f8438OooOO0O);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f8434OooO0o0 + ", description=" + this.f8433OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8432OooO0Oo);
        parcel.writeString(this.f8434OooO0o0);
        parcel.writeString(this.f8433OooO0o);
        parcel.writeInt(this.f8435OooO0oO);
        parcel.writeInt(this.f8436OooO0oo);
        parcel.writeInt(this.f8431OooO);
        parcel.writeInt(this.f8437OooOO0);
        parcel.writeByteArray(this.f8438OooOO0O);
    }

    public PictureFrame(Parcel parcel) {
        this.f8432OooO0Oo = parcel.readInt();
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8434OooO0o0 = string;
        this.f8433OooO0o = parcel.readString();
        this.f8435OooO0oO = parcel.readInt();
        this.f8436OooO0oo = parcel.readInt();
        this.f8431OooO = parcel.readInt();
        this.f8437OooOO0 = parcel.readInt();
        this.f8438OooOO0O = parcel.createByteArray();
    }
}
