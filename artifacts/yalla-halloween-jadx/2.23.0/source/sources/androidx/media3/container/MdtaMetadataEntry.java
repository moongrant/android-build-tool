package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.OooO;
import java.util.Arrays;
import kotlin.UByte;
import o000O000.OooO0o;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f6270OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6271OooO0oO;

    public class OooO00o implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6268OooO0Oo = string;
        this.f6270OooO0o0 = parcel.createByteArray();
        this.f6269OooO0o = parcel.readInt();
        this.f6271OooO0oO = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f6268OooO0Oo.equals(mdtaMetadataEntry.f6268OooO0Oo) && Arrays.equals(this.f6270OooO0o0, mdtaMetadataEntry.f6270OooO0o0) && this.f6269OooO0o == mdtaMetadataEntry.f6269OooO0o && this.f6271OooO0oO == mdtaMetadataEntry.f6271OooO0oO;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6270OooO0o0) + o0OO00O.OooO00o(this.f6268OooO0Oo, 527, 31)) * 31) + this.f6269OooO0o) * 31) + this.f6271OooO0oO;
    }

    public final String toString() {
        String str;
        byte[] bArr = this.f6270OooO0o0;
        int i = this.f6271OooO0oO;
        if (i == 1) {
            int i2 = OooO0o.f34423OooO00o;
            str = new String(bArr, OooO.f19059OooO0OO);
        } else if (i == 23) {
            int i3 = OooO0o.f34423OooO00o;
            o000O000.OooO00o.OooO00o(bArr.length == 4);
            str = String.valueOf(Float.intBitsToFloat(((bArr[1] & UByte.MAX_VALUE) << 16) | (bArr[0] << 24) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)));
        } else if (i != 67) {
            str = OooO0o.OooO(bArr);
        } else {
            int i4 = OooO0o.f34423OooO00o;
            o000O000.OooO00o.OooO00o(bArr.length == 4);
            str = String.valueOf((bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8) | bArr[3]);
        }
        return OooO0OO.OooO0OO(new StringBuilder("mdta: key="), this.f6268OooO0Oo, ", value=", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6268OooO0Oo);
        parcel.writeByteArray(this.f6270OooO0o0);
        parcel.writeInt(this.f6269OooO0o);
        parcel.writeInt(this.f6271OooO0oO);
    }
}
