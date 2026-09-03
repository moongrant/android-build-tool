package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import p086o000OooO.o0O0O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f13706Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final SchemeData[] f13707Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f13708Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final String f13709Oooo0oo;

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

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.f13709Oooo0oo = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f13707Oooo0o = schemeDataArr;
        this.f13706Oooo = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public final DrmInitData OooO00o(@Nullable String str) {
        return o000OOo0.OooO00o(this.f13709Oooo0oo, str) ? this : new DrmInitData(str, false, this.f13707Oooo0o);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C.f13105OooO00o;
        if (uuid.equals(schemeData3.f13712Oooo0oO)) {
            return uuid.equals(schemeData4.f13712Oooo0oO) ? 0 : 1;
        }
        return schemeData3.f13712Oooo0oO.compareTo(schemeData4.f13712Oooo0oO);
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
        return o000OOo0.OooO00o(this.f13709Oooo0oo, drmInitData.f13709Oooo0oo) && Arrays.equals(this.f13707Oooo0o, drmInitData.f13707Oooo0o);
    }

    public final int hashCode() {
        if (this.f13708Oooo0oO == 0) {
            String str = this.f13709Oooo0oo;
            this.f13708Oooo0oO = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f13707Oooo0o);
        }
        return this.f13708Oooo0oO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13709Oooo0oo);
        parcel.writeTypedArray(this.f13707Oooo0o, 0);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final String f13710Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f13711Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final UUID f13712Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public final String f13713Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @Nullable
        public final byte[] f13714OoooO00;

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

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            Objects.requireNonNull(uuid);
            this.f13712Oooo0oO = uuid;
            this.f13713Oooo0oo = str;
            Objects.requireNonNull(str2);
            this.f13710Oooo = str2;
            this.f13714OoooO00 = bArr;
        }

        public final boolean OooO00o(UUID uuid) {
            return C.f13105OooO00o.equals(this.f13712Oooo0oO) || uuid.equals(this.f13712Oooo0oO);
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
            return o000OOo0.OooO00o(this.f13713Oooo0oo, schemeData.f13713Oooo0oo) && o000OOo0.OooO00o(this.f13710Oooo, schemeData.f13710Oooo) && o000OOo0.OooO00o(this.f13712Oooo0oO, schemeData.f13712Oooo0oO) && Arrays.equals(this.f13714OoooO00, schemeData.f13714OoooO00);
        }

        public final int hashCode() {
            if (this.f13711Oooo0o == 0) {
                int iHashCode = this.f13712Oooo0oO.hashCode() * 31;
                String str = this.f13713Oooo0oo;
                this.f13711Oooo0o = Arrays.hashCode(this.f13714OoooO00) + o0O0O00.OooO00o(this.f13710Oooo, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f13711Oooo0o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f13712Oooo0oO.getMostSignificantBits());
            parcel.writeLong(this.f13712Oooo0oO.getLeastSignificantBits());
            parcel.writeString(this.f13713Oooo0oo);
            parcel.writeString(this.f13710Oooo);
            parcel.writeByteArray(this.f13714OoooO00);
        }

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            Objects.requireNonNull(uuid);
            this.f13712Oooo0oO = uuid;
            this.f13713Oooo0oo = null;
            this.f13710Oooo = str;
            this.f13714OoooO00 = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f13712Oooo0oO = new UUID(parcel.readLong(), parcel.readLong());
            this.f13713Oooo0oo = parcel.readString();
            String string = parcel.readString();
            int i = o000OOo0.f36740OooO00o;
            this.f13710Oooo = string;
            this.f13714OoooO00 = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f13709Oooo0oo = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = o000OOo0.f36740OooO00o;
        this.f13707Oooo0o = schemeDataArr;
        this.f13706Oooo = schemeDataArr.length;
    }
}
