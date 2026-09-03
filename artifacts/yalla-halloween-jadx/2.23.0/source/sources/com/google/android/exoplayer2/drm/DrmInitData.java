package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SchemeData[] f11750OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f11751OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f11752OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f11753OooO0oO;

    public class OooO00o implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData() {
        throw null;
    }

    public DrmInitData(@Nullable String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    @CheckResult
    public final DrmInitData OooO00o(@Nullable String str) {
        return o0O00.OooO00o(this.f11751OooO0o, str) ? this : new DrmInitData(str, false, this.f11750OooO0Oo);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C.f10896OooO00o;
        if (uuid.equals(schemeData3.f11756OooO0o0)) {
            return uuid.equals(schemeData4.f11756OooO0o0) ? 0 : 1;
        }
        return schemeData3.f11756OooO0o0.compareTo(schemeData4.f11756OooO0o0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return o0O00.OooO00o(this.f11751OooO0o, drmInitData.f11751OooO0o) && Arrays.equals(this.f11750OooO0Oo, drmInitData.f11750OooO0Oo);
    }

    public final int hashCode() {
        if (this.f11752OooO0o0 == 0) {
            String str = this.f11751OooO0o;
            this.f11752OooO0o0 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f11750OooO0Oo);
        }
        return this.f11752OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11751OooO0o);
        parcel.writeTypedArray(this.f11750OooO0Oo, 0);
    }

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.f11751OooO0o = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f11750OooO0Oo = schemeDataArr;
        this.f11753OooO0oO = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f11754OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final String f11755OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final UUID f11756OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f11757OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final byte[] f11758OooO0oo;

        public class OooO00o implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData() {
            throw null;
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            uuid.getClass();
            this.f11756OooO0o0 = uuid;
            this.f11755OooO0o = str;
            str2.getClass();
            this.f11757OooO0oO = str2;
            this.f11758OooO0oo = bArr;
        }

        public final boolean OooO00o(UUID uuid) {
            UUID uuid2 = C.f10896OooO00o;
            UUID uuid3 = this.f11756OooO0o0;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return o0O00.OooO00o(this.f11755OooO0o, schemeData.f11755OooO0o) && o0O00.OooO00o(this.f11757OooO0oO, schemeData.f11757OooO0oO) && o0O00.OooO00o(this.f11756OooO0o0, schemeData.f11756OooO0o0) && Arrays.equals(this.f11758OooO0oo, schemeData.f11758OooO0oo);
        }

        public final int hashCode() {
            if (this.f11754OooO0Oo == 0) {
                int iHashCode = this.f11756OooO0o0.hashCode() * 31;
                String str = this.f11755OooO0o;
                this.f11754OooO0Oo = Arrays.hashCode(this.f11758OooO0oo) + o0OO00O.OooO00o(this.f11757OooO0oO, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f11754OooO0Oo;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f11756OooO0o0;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f11755OooO0o);
            parcel.writeString(this.f11757OooO0oO);
            parcel.writeByteArray(this.f11758OooO0oo);
        }

        public SchemeData(Parcel parcel) {
            this.f11756OooO0o0 = new UUID(parcel.readLong(), parcel.readLong());
            this.f11755OooO0o = parcel.readString();
            String string = parcel.readString();
            int i = o0O00.f40595OooO00o;
            this.f11757OooO0oO = string;
            this.f11758OooO0oo = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f11751OooO0o = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = o0O00.f40595OooO00o;
        this.f11750OooO0Oo = schemeDataArr;
        this.f11753OooO0oO = schemeDataArr.length;
    }
}
