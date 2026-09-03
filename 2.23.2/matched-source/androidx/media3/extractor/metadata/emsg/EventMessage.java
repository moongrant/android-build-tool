package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooOO0 f8423OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooOO0 f8424OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8425OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f8426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f8427OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f8428OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f8429OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f8430OooO0oo;

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
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        oooO00o.f6445OooOO0O = "application/id3";
        f8423OooOO0 = oooO00o.OooO00o();
        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
        oooO00o2.f6445OooOO0O = "application/x-scte35";
        f8424OooOO0O = oooO00o2.OooO00o();
        CREATOR = new OooO00o();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f8426OooO0Oo = str;
        this.f8428OooO0o0 = str2;
        this.f8427OooO0o = j;
        this.f8429OooO0oO = j2;
        this.f8430OooO0oo = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    @Nullable
    public final OooOO0 OooOo0() {
        String str = this.f8426OooO0Oo;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f8424OooOO0O;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f8423OooOO0;
            default:
                return null;
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
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f8427OooO0o == eventMessage.f8427OooO0o && this.f8429OooO0oO == eventMessage.f8429OooO0oO && o00.OooO00o(this.f8426OooO0Oo, eventMessage.f8426OooO0Oo) && o00.OooO00o(this.f8428OooO0o0, eventMessage.f8428OooO0o0) && Arrays.equals(this.f8430OooO0oo, eventMessage.f8430OooO0oo);
    }

    public final int hashCode() {
        if (this.f8425OooO == 0) {
            String str = this.f8426OooO0Oo;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f8428OooO0o0;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f8427OooO0o;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f8429OooO0oO;
            this.f8425OooO = Arrays.hashCode(this.f8430OooO0oo) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f8425OooO;
    }

    @Override // androidx.media3.common.Metadata.Entry
    @Nullable
    public final byte[] o0000OO() {
        if (OooOo0() != null) {
            return this.f8430OooO0oo;
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f8426OooO0Oo + ", id=" + this.f8429OooO0oO + ", durationMs=" + this.f8427OooO0o + ", value=" + this.f8428OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8426OooO0Oo);
        parcel.writeString(this.f8428OooO0o0);
        parcel.writeLong(this.f8427OooO0o);
        parcel.writeLong(this.f8429OooO0oO);
        parcel.writeByteArray(this.f8430OooO0oo);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f8426OooO0Oo = string;
        this.f8428OooO0o0 = parcel.readString();
        this.f8427OooO0o = parcel.readLong();
        this.f8429OooO0oO = parcel.readLong();
        this.f8430OooO0oo = parcel.createByteArray();
    }
}
