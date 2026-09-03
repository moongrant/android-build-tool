package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import o000O000.OooO0o;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SchemeData[] f6154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f6155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f6156OooO0o0;

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

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f6157OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final String f6158OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final UUID f6159OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f6160OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final byte[] f6161OooO0oo;

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

        public SchemeData(Parcel parcel) {
            this.f6159OooO0o0 = new UUID(parcel.readLong(), parcel.readLong());
            this.f6158OooO0o = parcel.readString();
            String string = parcel.readString();
            int i = OooO0o.f34423OooO00o;
            this.f6160OooO0oO = string;
            this.f6161OooO0oo = parcel.createByteArray();
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
            return OooO0o.OooO00o(this.f6158OooO0o, schemeData.f6158OooO0o) && OooO0o.OooO00o(this.f6160OooO0oO, schemeData.f6160OooO0oO) && OooO0o.OooO00o(this.f6159OooO0o0, schemeData.f6159OooO0o0) && Arrays.equals(this.f6161OooO0oo, schemeData.f6161OooO0oo);
        }

        public final int hashCode() {
            if (this.f6157OooO0Oo == 0) {
                int iHashCode = this.f6159OooO0o0.hashCode() * 31;
                String str = this.f6158OooO0o;
                this.f6157OooO0Oo = Arrays.hashCode(this.f6161OooO0oo) + o0OO00O.OooO00o(this.f6160OooO0oO, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f6157OooO0Oo;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f6159OooO0o0;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f6158OooO0o);
            parcel.writeString(this.f6160OooO0oO);
            parcel.writeByteArray(this.f6161OooO0oo);
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f6155OooO0o = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = OooO0o.f34423OooO00o;
        this.f6154OooO0Oo = schemeDataArr;
        int length = schemeDataArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C.f6153OooO00o;
        if (uuid.equals(schemeData3.f6159OooO0o0)) {
            return uuid.equals(schemeData4.f6159OooO0o0) ? 0 : 1;
        }
        return schemeData3.f6159OooO0o0.compareTo(schemeData4.f6159OooO0o0);
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
        return OooO0o.OooO00o(this.f6155OooO0o, drmInitData.f6155OooO0o) && Arrays.equals(this.f6154OooO0Oo, drmInitData.f6154OooO0Oo);
    }

    public final int hashCode() {
        if (this.f6156OooO0o0 == 0) {
            String str = this.f6155OooO0o;
            this.f6156OooO0o0 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6154OooO0Oo);
        }
        return this.f6156OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6155OooO0o);
        parcel.writeTypedArray(this.f6154OooO0Oo, 0);
    }
}
