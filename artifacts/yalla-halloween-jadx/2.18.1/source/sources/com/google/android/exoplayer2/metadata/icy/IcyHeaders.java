package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;
import java.util.Map;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public final String f14474Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f14475Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final String f14476Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final String f14477Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f14478OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f14479OoooO00;

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

    public IcyHeaders(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        o00000O0.OooO00o(i2 == -1 || i2 > 0);
        this.f14475Oooo0o = i;
        this.f14476Oooo0oO = str;
        this.f14477Oooo0oo = str2;
        this.f14474Oooo = str3;
        this.f14479OoooO00 = z;
        this.f14478OoooO0 = i2;
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
        int i3 = -1;
        boolean z2 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        String strValueOf = String.valueOf(str4);
                        Log.w("IcyHeaders", strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        String strValueOf2 = String.valueOf(str4);
                        Log.w("IcyHeaders", strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                        i = i2;
                        z = false;
                    }
                }
                i = i2;
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
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
                        String strValueOf3 = String.valueOf(str5);
                        Log.w("IcyHeaders", strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        String strValueOf4 = String.valueOf(str5);
                        Log.w("IcyHeaders", strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new IcyHeaders(i, str, str2, str3, zEquals, i3);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ Format Oooo0OO() {
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
        return this.f14475Oooo0o == icyHeaders.f14475Oooo0o && o000OOo0.OooO00o(this.f14476Oooo0oO, icyHeaders.f14476Oooo0oO) && o000OOo0.OooO00o(this.f14477Oooo0oo, icyHeaders.f14477Oooo0oo) && o000OOo0.OooO00o(this.f14474Oooo, icyHeaders.f14474Oooo) && this.f14479OoooO00 == icyHeaders.f14479OoooO00 && this.f14478OoooO0 == icyHeaders.f14478OoooO0;
    }

    public final int hashCode() {
        int i = (527 + this.f14475Oooo0o) * 31;
        String str = this.f14476Oooo0oO;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14477Oooo0oo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14474Oooo;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f14479OoooO00 ? 1 : 0)) * 31) + this.f14478OoooO0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000() {
        return null;
    }

    public final String toString() {
        String str = this.f14477Oooo0oo;
        String str2 = this.f14476Oooo0oO;
        int i = this.f14475Oooo0o;
        int i2 = this.f14478OoooO0;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 80)));
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i);
        sb.append(", metadataInterval=");
        sb.append(i2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14475Oooo0o);
        parcel.writeString(this.f14476Oooo0oO);
        parcel.writeString(this.f14477Oooo0oo);
        parcel.writeString(this.f14474Oooo);
        boolean z = this.f14479OoooO00;
        int i2 = o000OOo0.f36740OooO00o;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f14478OoooO0);
    }

    public IcyHeaders(Parcel parcel) {
        this.f14475Oooo0o = parcel.readInt();
        this.f14476Oooo0oO = parcel.readString();
        this.f14477Oooo0oo = parcel.readString();
        this.f14474Oooo = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14479OoooO00 = parcel.readInt() != 0;
        this.f14478OoooO0 = parcel.readInt();
    }
}
