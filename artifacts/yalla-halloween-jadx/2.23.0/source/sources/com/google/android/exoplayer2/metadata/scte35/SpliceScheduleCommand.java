package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<OooO0OO> f12643OooO0Oo;

    public class OooO00o implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f12644OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f12645OooO0O0;

        public OooO0O0(int i, long j) {
            this.f12644OooO00o = i;
            this.f12645OooO0O0 = j;
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f12643OooO0Oo = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<OooO0OO> list = this.f12643OooO0Oo;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0OO oooO0OO = list.get(i2);
            parcel.writeLong(oooO0OO.f12647OooO00o);
            parcel.writeByte(oooO0OO.f12648OooO0O0 ? (byte) 1 : (byte) 0);
            parcel.writeByte(oooO0OO.f12649OooO0OO ? (byte) 1 : (byte) 0);
            parcel.writeByte(oooO0OO.f12650OooO0Oo ? (byte) 1 : (byte) 0);
            List<OooO0O0> list2 = oooO0OO.f12651OooO0o;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                OooO0O0 oooO0O0 = list2.get(i3);
                parcel.writeInt(oooO0O0.f12644OooO00o);
                parcel.writeLong(oooO0O0.f12645OooO0O0);
            }
            parcel.writeLong(oooO0OO.f12652OooO0o0);
            parcel.writeByte(oooO0OO.f12653OooO0oO ? (byte) 1 : (byte) 0);
            parcel.writeLong(oooO0OO.f12654OooO0oo);
            parcel.writeInt(oooO0OO.f12646OooO);
            parcel.writeInt(oooO0OO.f12655OooOO0);
            parcel.writeInt(oooO0OO.f12656OooOO0O);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new OooO0OO(parcel));
        }
        this.f12643OooO0Oo = Collections.unmodifiableList(arrayList);
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f12646OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f12647OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f12648OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f12649OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f12650OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final List<OooO0O0> f12651OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f12652OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f12653OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final long f12654OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f12655OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f12656OooOO0O;

        public OooO0OO(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f12647OooO00o = j;
            this.f12648OooO0O0 = z;
            this.f12649OooO0OO = z2;
            this.f12650OooO0Oo = z3;
            this.f12651OooO0o = Collections.unmodifiableList(arrayList);
            this.f12652OooO0o0 = j2;
            this.f12653OooO0oO = z4;
            this.f12654OooO0oo = j3;
            this.f12646OooO = i;
            this.f12655OooOO0 = i2;
            this.f12656OooOO0O = i3;
        }

        public OooO0OO(Parcel parcel) {
            this.f12647OooO00o = parcel.readLong();
            this.f12648OooO0O0 = parcel.readByte() == 1;
            this.f12649OooO0OO = parcel.readByte() == 1;
            this.f12650OooO0Oo = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new OooO0O0(parcel.readInt(), parcel.readLong()));
            }
            this.f12651OooO0o = Collections.unmodifiableList(arrayList);
            this.f12652OooO0o0 = parcel.readLong();
            this.f12653OooO0oO = parcel.readByte() == 1;
            this.f12654OooO0oo = parcel.readLong();
            this.f12646OooO = parcel.readInt();
            this.f12655OooOO0 = parcel.readInt();
            this.f12656OooOO0O = parcel.readInt();
        }
    }
}
