package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooOo f12544OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooOo f12545OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f12546OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f12547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f12548OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f12549OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f12550OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final byte[] f12551OooO0oo;

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
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.f11244OooOO0O = "application/id3";
        f12544OooOO0 = oooO00o.OooO00o();
        OooOo.OooO00o oooO00o2 = new OooOo.OooO00o();
        oooO00o2.f11244OooOO0O = "application/x-scte35";
        f12545OooOO0O = oooO00o2.OooO00o();
        CREATOR = new OooO00o();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f12547OooO0Oo = str;
        this.f12549OooO0o0 = str2;
        this.f12548OooO0o = j;
        this.f12550OooO0oO = j2;
        this.f12551OooO0oo = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public final OooOo OooOo0() {
        String str = this.f12547OooO0Oo;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f12545OooOO0O;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f12544OooOO0;
            default:
                return null;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void OooooOo(MediaMetadata.OooO00o oooO00o) {
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
        return this.f12548OooO0o == eventMessage.f12548OooO0o && this.f12550OooO0oO == eventMessage.f12550OooO0oO && o0O00.OooO00o(this.f12547OooO0Oo, eventMessage.f12547OooO0Oo) && o0O00.OooO00o(this.f12549OooO0o0, eventMessage.f12549OooO0o0) && Arrays.equals(this.f12551OooO0oo, eventMessage.f12551OooO0oo);
    }

    public final int hashCode() {
        if (this.f12546OooO == 0) {
            String str = this.f12547OooO0Oo;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12549OooO0o0;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f12548OooO0o;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f12550OooO0oO;
            this.f12546OooO = Arrays.hashCode(this.f12551OooO0oo) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f12546OooO;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public final byte[] o0000OO() {
        if (OooOo0() != null) {
            return this.f12551OooO0oo;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f12547OooO0Oo + ", id=" + this.f12550OooO0oO + ", durationMs=" + this.f12548OooO0o + ", value=" + this.f12549OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12547OooO0Oo);
        parcel.writeString(this.f12549OooO0o0);
        parcel.writeLong(this.f12548OooO0o);
        parcel.writeLong(this.f12550OooO0oO);
        parcel.writeByteArray(this.f12551OooO0oo);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12547OooO0Oo = string;
        this.f12549OooO0o0 = parcel.readString();
        this.f12548OooO0o = parcel.readLong();
        this.f12550OooO0oO = parcel.readLong();
        this.f12551OooO0oo = parcel.createByteArray();
    }
}
