package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Objects;
import p319o0O0oOo.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final Format f14474OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final Format f14475o000oOoO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f14476Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final byte[] f14477OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final long f14478OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f14479OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final long f14480OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f14481OoooOO0;

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
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13180OooOO0O = "application/id3";
        f14475o000oOoO = oooO0O0.OooO00o();
        Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
        oooO0O1.f13180OooOO0O = "application/x-scte35";
        f14474OoooOOO = oooO0O1.OooO00o();
        CREATOR = new OooO00o();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f14476Oooo = str;
        this.f14479OoooO00 = str2;
        this.f14478OoooO0 = j;
        this.f14480OoooO0O = j2;
        this.f14477OoooO = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public final Format Oooo0OO() {
        String str = this.f14476Oooo;
        Objects.requireNonNull(str);
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f14474OoooOOO;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f14475o000oOoO;
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
        return this.f14478OoooO0 == eventMessage.f14478OoooO0 && this.f14480OoooO0O == eventMessage.f14480OoooO0O && o00.OooO00o(this.f14476Oooo, eventMessage.f14476Oooo) && o00.OooO00o(this.f14479OoooO00, eventMessage.f14479OoooO00) && Arrays.equals(this.f14477OoooO, eventMessage.f14477OoooO);
    }

    public final int hashCode() {
        if (this.f14481OoooOO0 == 0) {
            String str = this.f14476Oooo;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f14479OoooO00;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f14478OoooO0;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f14480OoooO0O;
            this.f14481OoooOO0 = Arrays.hashCode(this.f14477OoooO) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f14481OoooOO0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public final byte[] o0000() {
        if (Oooo0OO() != null) {
            return this.f14477OoooO;
        }
        return null;
    }

    public final String toString() {
        String str = this.f14476Oooo;
        long j = this.f14480OoooO0O;
        long j2 = this.f14478OoooO0;
        String str2 = this.f14479OoooO00;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 79)));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14476Oooo);
        parcel.writeString(this.f14479OoooO00);
        parcel.writeLong(this.f14478OoooO0);
        parcel.writeLong(this.f14480OoooO0O);
        parcel.writeByteArray(this.f14477OoooO);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i = o00.f36680OooO00o;
        this.f14476Oooo = string;
        this.f14479OoooO00 = parcel.readString();
        this.f14478OoooO0 = parcel.readLong();
        this.f14480OoooO0O = parcel.readLong();
        this.f14477OoooO = parcel.createByteArray();
    }
}
