package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Log;
import java.util.List;
import java.util.Map;
import p200o00o0o.o000O00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f12562OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f12563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f12564OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f12565OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f12566OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f12567OooO0oo;

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
        o00O000o.OooO00o(i2 == -1 || i2 > 0);
        this.f12563OooO0Oo = i;
        this.f12565OooO0o0 = str;
        this.f12564OooO0o = str2;
        this.f12566OooO0oO = str3;
        this.f12567OooO0oo = z;
        this.f12562OooO = i2;
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
                        o000O00.OooO00o("Invalid bitrate header: ", str4, "IcyHeaders");
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
                        o000O00.OooO00o("Invalid metadata interval: ", str5, "IcyHeaders");
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

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ OooOo OooOo0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void OooooOo(MediaMetadata.OooO00o oooO00o) {
        String str = this.f12564OooO0o;
        if (str != null) {
            oooO00o.f11027OooOooo = str;
        }
        String str2 = this.f12565OooO0o0;
        if (str2 != null) {
            oooO00o.f11024OooOoo = str2;
        }
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
        return this.f12563OooO0Oo == icyHeaders.f12563OooO0Oo && o0O00.OooO00o(this.f12565OooO0o0, icyHeaders.f12565OooO0o0) && o0O00.OooO00o(this.f12564OooO0o, icyHeaders.f12564OooO0o) && o0O00.OooO00o(this.f12566OooO0oO, icyHeaders.f12566OooO0oO) && this.f12567OooO0oo == icyHeaders.f12567OooO0oo && this.f12562OooO == icyHeaders.f12562OooO;
    }

    public final int hashCode() {
        int i = (527 + this.f12563OooO0Oo) * 31;
        String str = this.f12565OooO0o0;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12564OooO0o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12566OooO0oO;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12567OooO0oo ? 1 : 0)) * 31) + this.f12562OooO;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f12564OooO0o + "\", genre=\"" + this.f12565OooO0o0 + "\", bitrate=" + this.f12563OooO0Oo + ", metadataInterval=" + this.f12562OooO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12563OooO0Oo);
        parcel.writeString(this.f12565OooO0o0);
        parcel.writeString(this.f12564OooO0o);
        parcel.writeString(this.f12566OooO0oO);
        int i2 = o0O00.f40595OooO00o;
        parcel.writeInt(this.f12567OooO0oo ? 1 : 0);
        parcel.writeInt(this.f12562OooO);
    }

    public IcyHeaders(Parcel parcel) {
        this.f12563OooO0Oo = parcel.readInt();
        this.f12565OooO0o0 = parcel.readString();
        this.f12564OooO0o = parcel.readString();
        this.f12566OooO0oO = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12567OooO0oo = parcel.readInt() != 0;
        this.f12562OooO = parcel.readInt();
    }
}
