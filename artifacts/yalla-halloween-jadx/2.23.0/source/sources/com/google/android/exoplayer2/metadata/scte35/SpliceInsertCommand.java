package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f12627OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f12628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f12629OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f12630OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f12631OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f12632OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f12633OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final List<OooO0O0> f12634OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f12635OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f12636OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f12637OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f12638OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f12639OooOOOo;

    public class OooO00o implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f12640OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f12641OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f12642OooO0OO;

        public OooO0O0(int i, long j, long j2) {
            this.f12640OooO00o = i;
            this.f12641OooO0O0 = j;
            this.f12642OooO0OO = j2;
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<OooO0O0> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f12628OooO0Oo = j;
        this.f12630OooO0o0 = z;
        this.f12629OooO0o = z2;
        this.f12631OooO0oO = z3;
        this.f12632OooO0oo = z4;
        this.f12627OooO = j2;
        this.f12633OooOO0 = j3;
        this.f12634OooOO0O = Collections.unmodifiableList(list);
        this.f12635OooOO0o = z5;
        this.f12637OooOOO0 = j4;
        this.f12636OooOOO = i;
        this.f12638OooOOOO = i2;
        this.f12639OooOOOo = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12628OooO0Oo);
        parcel.writeByte(this.f12630OooO0o0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12629OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12631OooO0oO ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12632OooO0oo ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12627OooO);
        parcel.writeLong(this.f12633OooOO0);
        List<OooO0O0> list = this.f12634OooOO0O;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = list.get(i2);
            parcel.writeInt(oooO0O0.f12640OooO00o);
            parcel.writeLong(oooO0O0.f12641OooO0O0);
            parcel.writeLong(oooO0O0.f12642OooO0OO);
        }
        parcel.writeByte(this.f12635OooOO0o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12637OooOOO0);
        parcel.writeInt(this.f12636OooOOO);
        parcel.writeInt(this.f12638OooOOOO);
        parcel.writeInt(this.f12639OooOOOo);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f12628OooO0Oo = parcel.readLong();
        this.f12630OooO0o0 = parcel.readByte() == 1;
        this.f12629OooO0o = parcel.readByte() == 1;
        this.f12631OooO0oO = parcel.readByte() == 1;
        this.f12632OooO0oo = parcel.readByte() == 1;
        this.f12627OooO = parcel.readLong();
        this.f12633OooOO0 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new OooO0O0(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f12634OooOO0O = Collections.unmodifiableList(arrayList);
        this.f12635OooOO0o = parcel.readByte() == 1;
        this.f12637OooOOO0 = parcel.readLong();
        this.f12636OooOOO = parcel.readInt();
        this.f12638OooOOOO = parcel.readInt();
        this.f12639OooOOOo = parcel.readInt();
    }
}
