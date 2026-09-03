package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.OooO0OO;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f8502OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f8503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f8504OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f8505OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f8506OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f8507OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f8508OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final List<OooO0O0> f8509OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f8510OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f8511OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f8512OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f8513OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f8514OooOOOo;

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
        public final int f8515OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f8516OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f8517OooO0OO;

        public OooO0O0(int i, long j, long j2) {
            this.f8515OooO00o = i;
            this.f8516OooO0O0 = j;
            this.f8517OooO0OO = j2;
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<OooO0O0> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f8503OooO0Oo = j;
        this.f8505OooO0o0 = z;
        this.f8504OooO0o = z2;
        this.f8506OooO0oO = z3;
        this.f8507OooO0oo = z4;
        this.f8502OooO = j2;
        this.f8508OooOO0 = j3;
        this.f8509OooOO0O = Collections.unmodifiableList(list);
        this.f8510OooOO0o = z5;
        this.f8512OooOOO0 = j4;
        this.f8511OooOOO = i;
        this.f8513OooOOOO = i2;
        this.f8514OooOOOo = i3;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f8502OooO);
        sb.append(", programSplicePlaybackPositionUs= ");
        return OooO0OO.OooO0O0(sb, this.f8508OooOO0, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8503OooO0Oo);
        parcel.writeByte(this.f8505OooO0o0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8504OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8506OooO0oO ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8507OooO0oo ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8502OooO);
        parcel.writeLong(this.f8508OooOO0);
        List<OooO0O0> list = this.f8509OooOO0O;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = list.get(i2);
            parcel.writeInt(oooO0O0.f8515OooO00o);
            parcel.writeLong(oooO0O0.f8516OooO0O0);
            parcel.writeLong(oooO0O0.f8517OooO0OO);
        }
        parcel.writeByte(this.f8510OooOO0o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8512OooOOO0);
        parcel.writeInt(this.f8511OooOOO);
        parcel.writeInt(this.f8513OooOOOO);
        parcel.writeInt(this.f8514OooOOOo);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f8503OooO0Oo = parcel.readLong();
        this.f8505OooO0o0 = parcel.readByte() == 1;
        this.f8504OooO0o = parcel.readByte() == 1;
        this.f8506OooO0oO = parcel.readByte() == 1;
        this.f8507OooO0oo = parcel.readByte() == 1;
        this.f8502OooO = parcel.readLong();
        this.f8508OooOO0 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new OooO0O0(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f8509OooOO0O = Collections.unmodifiableList(arrayList);
        this.f8510OooOO0o = parcel.readByte() == 1;
        this.f8512OooOOO0 = parcel.readLong();
        this.f8511OooOOO = parcel.readInt();
        this.f8513OooOOOO = parcel.readInt();
        this.f8514OooOOOo = parcel.readInt();
    }
}
