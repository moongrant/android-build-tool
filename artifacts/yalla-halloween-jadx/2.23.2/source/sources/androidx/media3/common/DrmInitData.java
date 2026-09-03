package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SchemeData[] f6225OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f6226OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f6227OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6228OooO0oO;

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

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.f6226OooO0o = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f6225OooO0Oo = schemeDataArr;
        this.f6228OooO0oO = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    @CheckResult
    public final DrmInitData OooO00o(@Nullable String str) {
        return o00.OooO00o(this.f6226OooO0o, str) ? this : new DrmInitData(str, false, this.f6225OooO0Oo);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C.f6206OooO00o;
        if (uuid.equals(schemeData3.f6231OooO0o0)) {
            return uuid.equals(schemeData4.f6231OooO0o0) ? 0 : 1;
        }
        return schemeData3.f6231OooO0o0.compareTo(schemeData4.f6231OooO0o0);
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
        return o00.OooO00o(this.f6226OooO0o, drmInitData.f6226OooO0o) && Arrays.equals(this.f6225OooO0Oo, drmInitData.f6225OooO0Oo);
    }

    public final int hashCode() {
        if (this.f6227OooO0o0 == 0) {
            String str = this.f6226OooO0o;
            this.f6227OooO0o0 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6225OooO0Oo);
        }
        return this.f6227OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6226OooO0o);
        parcel.writeTypedArray(this.f6225OooO0Oo, 0);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f6229OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final String f6230OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final UUID f6231OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f6232OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final byte[] f6233OooO0oo;

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
            this.f6231OooO0o0 = uuid;
            this.f6230OooO0o = str;
            str2.getClass();
            this.f6232OooO0oO = str2;
            this.f6233OooO0oo = bArr;
        }

        public final boolean OooO00o(UUID uuid) {
            UUID uuid2 = C.f6206OooO00o;
            UUID uuid3 = this.f6231OooO0o0;
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
            return o00.OooO00o(this.f6230OooO0o, schemeData.f6230OooO0o) && o00.OooO00o(this.f6232OooO0oO, schemeData.f6232OooO0oO) && o00.OooO00o(this.f6231OooO0o0, schemeData.f6231OooO0o0) && Arrays.equals(this.f6233OooO0oo, schemeData.f6233OooO0oo);
        }

        public final int hashCode() {
            if (this.f6229OooO0Oo == 0) {
                int iHashCode = this.f6231OooO0o0.hashCode() * 31;
                String str = this.f6230OooO0o;
                this.f6229OooO0Oo = Arrays.hashCode(this.f6233OooO0oo) + androidx.compose.animation.OooO0O0.OooO00o(this.f6232OooO0oO, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f6229OooO0Oo;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f6231OooO0o0;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f6230OooO0o);
            parcel.writeString(this.f6232OooO0oO);
            parcel.writeByteArray(this.f6233OooO0oo);
        }

        public SchemeData(Parcel parcel) {
            this.f6231OooO0o0 = new UUID(parcel.readLong(), parcel.readLong());
            this.f6230OooO0o = parcel.readString();
            String string = parcel.readString();
            int i = o00.f34910OooO00o;
            this.f6232OooO0oO = string;
            this.f6233OooO0oo = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f6226OooO0o = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = o00.f34910OooO00o;
        this.f6225OooO0Oo = schemeDataArr;
        this.f6228OooO0oO = schemeDataArr.length;
    }
}
