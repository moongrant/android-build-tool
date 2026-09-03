package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f14524Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f14525Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f14526Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f14527Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final List<OooO0O0> f14528OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final long f14529OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f14530OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final long f14531OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final boolean f14532OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int f14533OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final int f14534OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final int f14535OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final long f14536o000oOoO;

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

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<OooO0O0> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f14525Oooo0o = j;
        this.f14526Oooo0oO = z;
        this.f14527Oooo0oo = z2;
        this.f14524Oooo = z3;
        this.f14530OoooO00 = z4;
        this.f14529OoooO0 = j2;
        this.f14531OoooO0O = j3;
        this.f14528OoooO = Collections.unmodifiableList(list);
        this.f14532OoooOO0 = z5;
        this.f14536o000oOoO = j4;
        this.f14533OoooOOO = i;
        this.f14534OoooOOo = i2;
        this.f14535OoooOo0 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f14525Oooo0o);
        parcel.writeByte(this.f14526Oooo0oO ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14527Oooo0oo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14524Oooo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14530OoooO00 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f14529OoooO0);
        parcel.writeLong(this.f14531OoooO0O);
        int size = this.f14528OoooO.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = this.f14528OoooO.get(i2);
            parcel.writeInt(oooO0O0.f14537OooO00o);
            parcel.writeLong(oooO0O0.f14538OooO0O0);
            parcel.writeLong(oooO0O0.f14539OooO0OO);
        }
        parcel.writeByte(this.f14532OoooOO0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f14536o000oOoO);
        parcel.writeInt(this.f14533OoooOOO);
        parcel.writeInt(this.f14534OoooOOo);
        parcel.writeInt(this.f14535OoooOo0);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14537OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f14538OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f14539OooO0OO;

        public OooO0O0(int i, long j, long j2) {
            this.f14537OooO00o = i;
            this.f14538OooO0O0 = j;
            this.f14539OooO0OO = j2;
        }

        public OooO0O0(int i, long j, long j2, OooO00o oooO00o) {
            this.f14537OooO00o = i;
            this.f14538OooO0O0 = j;
            this.f14539OooO0OO = j2;
        }
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f14525Oooo0o = parcel.readLong();
        this.f14526Oooo0oO = parcel.readByte() == 1;
        this.f14527Oooo0oo = parcel.readByte() == 1;
        this.f14524Oooo = parcel.readByte() == 1;
        this.f14530OoooO00 = parcel.readByte() == 1;
        this.f14529OoooO0 = parcel.readLong();
        this.f14531OoooO0O = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new OooO0O0(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f14528OoooO = Collections.unmodifiableList(arrayList);
        this.f14532OoooOO0 = parcel.readByte() == 1;
        this.f14536o000oOoO = parcel.readLong();
        this.f14533OoooOOO = parcel.readInt();
        this.f14534OoooOOo = parcel.readInt();
        this.f14535OoooOo0 = parcel.readInt();
    }
}
