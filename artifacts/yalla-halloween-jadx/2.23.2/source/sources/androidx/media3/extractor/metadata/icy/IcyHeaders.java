package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import java.util.Map;
import o000Oo0.o0OoOo0;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f8441OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f8442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f8443OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f8444OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f8445OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f8446OooO0oo;

    public class OooO00o implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        o00Oo0.OooO00o(i2 == -1 || i2 > 0);
        this.f8442OooO0Oo = i;
        this.f8444OooO0o0 = str;
        this.f8443OooO0o = str2;
        this.f8445OooO0oO = str3;
        this.f8446OooO0oo = z;
        this.f8441OooO = i2;
    }

    @Nullable
    public static IcyHeaders OooO00o(Map<String, List<String>> map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List<String> list = map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        Log.OooO0o("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        o0OoOo0.OooO0O0("Invalid bitrate header: ", str4, "IcyHeaders");
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        Log.OooO0o("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        o0OoOo0.OooO0O0("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        int i5 = i3;
        if (z) {
            return new IcyHeaders(i, i5, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ OooOO0 OooOo0() {
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f8442OooO0Oo == icyHeaders.f8442OooO0Oo && o00.OooO00o(this.f8444OooO0o0, icyHeaders.f8444OooO0o0) && o00.OooO00o(this.f8443OooO0o, icyHeaders.f8443OooO0o) && o00.OooO00o(this.f8445OooO0oO, icyHeaders.f8445OooO0oO) && this.f8446OooO0oo == icyHeaders.f8446OooO0oo && this.f8441OooO == icyHeaders.f8441OooO;
    }

    public final int hashCode() {
        int i = (527 + this.f8442OooO0Oo) * 31;
        String str = this.f8444OooO0o0;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8443OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8445OooO0oO;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f8446OooO0oo ? 1 : 0)) * 31) + this.f8441OooO;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
        String str = this.f8443OooO0o;
        if (str != null) {
            oooO00o.f6333OooOooo = str;
        }
        String str2 = this.f8444OooO0o0;
        if (str2 != null) {
            oooO00o.f6330OooOoo = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f8443OooO0o + "\", genre=\"" + this.f8444OooO0o0 + "\", bitrate=" + this.f8442OooO0Oo + ", metadataInterval=" + this.f8441OooO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8442OooO0Oo);
        parcel.writeString(this.f8444OooO0o0);
        parcel.writeString(this.f8443OooO0o);
        parcel.writeString(this.f8445OooO0oO);
        int i2 = o00.f34910OooO00o;
        parcel.writeInt(this.f8446OooO0oo ? 1 : 0);
        parcel.writeInt(this.f8441OooO);
    }

    public IcyHeaders(Parcel parcel) {
        this.f8442OooO0Oo = parcel.readInt();
        this.f8444OooO0o0 = parcel.readString();
        this.f8443OooO0o = parcel.readString();
        this.f8445OooO0oO = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8446OooO0oo = parcel.readInt() != 0;
        this.f8441OooO = parcel.readInt();
    }
}
