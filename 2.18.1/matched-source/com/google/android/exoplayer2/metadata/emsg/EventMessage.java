package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Objects;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final Format f14456OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final Format f14457OoooO0O;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final long f14458Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f14459Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f14460Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final long f14461Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f14462OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final byte[] f14463OoooO00;

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
        oooO0O0.f13163OooOO0O = "application/id3";
        f14457OoooO0O = oooO0O0.OooO00o();
        Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
        oooO0O1.f13163OooOO0O = "application/x-scte35";
        f14456OoooO = oooO0O1.OooO00o();
        CREATOR = new OooO00o();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f14459Oooo0o = str;
        this.f14460Oooo0oO = str2;
        this.f14461Oooo0oo = j;
        this.f14458Oooo = j2;
        this.f14463OoooO00 = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public final Format Oooo0OO() {
        String str = this.f14459Oooo0o;
        Objects.requireNonNull(str);
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f14456OoooO;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f14457OoooO0O;
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
        return this.f14461Oooo0oo == eventMessage.f14461Oooo0oo && this.f14458Oooo == eventMessage.f14458Oooo && o000OOo0.OooO00o(this.f14459Oooo0o, eventMessage.f14459Oooo0o) && o000OOo0.OooO00o(this.f14460Oooo0oO, eventMessage.f14460Oooo0oO) && Arrays.equals(this.f14463OoooO00, eventMessage.f14463OoooO00);
    }

    public final int hashCode() {
        if (this.f14462OoooO0 == 0) {
            String str = this.f14459Oooo0o;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f14460Oooo0oO;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f14461Oooo0oo;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f14458Oooo;
            this.f14462OoooO0 = Arrays.hashCode(this.f14463OoooO00) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f14462OoooO0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public final byte[] o0000() {
        if (Oooo0OO() != null) {
            return this.f14463OoooO00;
        }
        return null;
    }

    public final String toString() {
        String str = this.f14459Oooo0o;
        long j = this.f14458Oooo;
        long j2 = this.f14461Oooo0oo;
        String str2 = this.f14460Oooo0oO;
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
        parcel.writeString(this.f14459Oooo0o);
        parcel.writeString(this.f14460Oooo0oO);
        parcel.writeLong(this.f14461Oooo0oo);
        parcel.writeLong(this.f14458Oooo);
        parcel.writeByteArray(this.f14463OoooO00);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f14459Oooo0o = string;
        this.f14460Oooo0oO = parcel.readString();
        this.f14461Oooo0oo = parcel.readLong();
        this.f14458Oooo = parcel.readLong();
        this.f14463OoooO00 = parcel.createByteArray();
    }
}
