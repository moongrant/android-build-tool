package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<OooO0OO> f14540Oooo0o;

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

    public SpliceScheduleCommand(List<OooO0OO> list) {
        this.f14540Oooo0o = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f14540Oooo0o.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0OO oooO0OO = this.f14540Oooo0o.get(i2);
            parcel.writeLong(oooO0OO.f14544OooO00o);
            parcel.writeByte(oooO0OO.f14545OooO0O0 ? (byte) 1 : (byte) 0);
            parcel.writeByte(oooO0OO.f14546OooO0OO ? (byte) 1 : (byte) 0);
            parcel.writeByte(oooO0OO.f14547OooO0Oo ? (byte) 1 : (byte) 0);
            int size2 = oooO0OO.f14548OooO0o.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                OooO0O0 oooO0O0 = oooO0OO.f14548OooO0o.get(i3);
                parcel.writeInt(oooO0O0.f14541OooO00o);
                parcel.writeLong(oooO0O0.f14542OooO0O0);
            }
            parcel.writeLong(oooO0OO.f14549OooO0o0);
            parcel.writeByte(oooO0OO.f14550OooO0oO ? (byte) 1 : (byte) 0);
            parcel.writeLong(oooO0OO.f14551OooO0oo);
            parcel.writeInt(oooO0OO.f14543OooO);
            parcel.writeInt(oooO0OO.f14552OooOO0);
            parcel.writeInt(oooO0OO.f14553OooOO0O);
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14541OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f14542OooO0O0;

        public OooO0O0(int i, long j) {
            this.f14541OooO00o = i;
            this.f14542OooO0O0 = j;
        }

        public OooO0O0(int i, long j, OooO00o oooO00o) {
            this.f14541OooO00o = i;
            this.f14542OooO0O0 = j;
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new OooO0OO(parcel));
        }
        this.f14540Oooo0o = Collections.unmodifiableList(arrayList);
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f14543OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f14544OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f14545OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f14546OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f14547OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final List<OooO0O0> f14548OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f14549OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f14550OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final long f14551OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f14552OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f14553OooOO0O;

        public OooO0OO(long j, boolean z, boolean z2, boolean z3, List<OooO0O0> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f14544OooO00o = j;
            this.f14545OooO0O0 = z;
            this.f14546OooO0OO = z2;
            this.f14547OooO0Oo = z3;
            this.f14548OooO0o = Collections.unmodifiableList(list);
            this.f14549OooO0o0 = j2;
            this.f14550OooO0oO = z4;
            this.f14551OooO0oo = j3;
            this.f14543OooO = i;
            this.f14552OooOO0 = i2;
            this.f14553OooOO0O = i3;
        }

        public OooO0OO(Parcel parcel) {
            this.f14544OooO00o = parcel.readLong();
            this.f14545OooO0O0 = parcel.readByte() == 1;
            this.f14546OooO0OO = parcel.readByte() == 1;
            this.f14547OooO0Oo = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new OooO0O0(parcel.readInt(), parcel.readLong()));
            }
            this.f14548OooO0o = Collections.unmodifiableList(arrayList);
            this.f14549OooO0o0 = parcel.readLong();
            this.f14550OooO0oO = parcel.readByte() == 1;
            this.f14551OooO0oo = parcel.readLong();
            this.f14543OooO = parcel.readInt();
            this.f14552OooOO0 = parcel.readInt();
            this.f14553OooOO0O = parcel.readInt();
        }
    }
}
