package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f6339OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6340OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f6341OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6342OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f6343OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f6344OooO0oo;

    public class OooO00o implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    static {
        androidx.media3.common.OooO00o.C0136OooO00o c0136OooO00o = new androidx.media3.common.OooO00o.C0136OooO00o();
        c0136OooO00o.f6184OooO00o = "application/id3";
        new androidx.media3.common.OooO00o(c0136OooO00o);
        androidx.media3.common.OooO00o.C0136OooO00o c0136OooO00o2 = new androidx.media3.common.OooO00o.C0136OooO00o();
        c0136OooO00o2.f6184OooO00o = "application/x-scte35";
        new androidx.media3.common.OooO00o(c0136OooO00o2);
        CREATOR = new OooO00o();
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6340OooO0Oo = string;
        this.f6342OooO0o0 = parcel.readString();
        this.f6341OooO0o = parcel.readLong();
        this.f6343OooO0oO = parcel.readLong();
        this.f6344OooO0oo = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f6341OooO0o == eventMessage.f6341OooO0o && this.f6343OooO0oO == eventMessage.f6343OooO0oO && OooO0o.OooO00o(this.f6340OooO0Oo, eventMessage.f6340OooO0Oo) && OooO0o.OooO00o(this.f6342OooO0o0, eventMessage.f6342OooO0o0) && Arrays.equals(this.f6344OooO0oo, eventMessage.f6344OooO0oo);
    }

    public final int hashCode() {
        if (this.f6339OooO == 0) {
            String str = this.f6340OooO0Oo;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f6342OooO0o0;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f6341OooO0o;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f6343OooO0oO;
            this.f6339OooO = Arrays.hashCode(this.f6344OooO0oo) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f6339OooO;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f6340OooO0Oo + ", id=" + this.f6343OooO0oO + ", durationMs=" + this.f6341OooO0o + ", value=" + this.f6342OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6340OooO0Oo);
        parcel.writeString(this.f6342OooO0o0);
        parcel.writeLong(this.f6341OooO0o);
        parcel.writeLong(this.f6343OooO0oO);
        parcel.writeByteArray(this.f6344OooO0oo);
    }
}
