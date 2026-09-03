package p307o0O0o0o;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0O0o0.OooO;
import o0O0o0.OooO0OO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f36249OooO00o = new o000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000OO0 f36250OooO0O0 = new o0000OO0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000O0O0 f36251OooO0OO;

    @Override // o0O0o0.OooO
    public final Metadata OooO0O0(OooO0OO oooO0OO, ByteBuffer byteBuffer) {
        int i;
        long j;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int iOooOo0O;
        int iOooOOo0;
        int iOooOOo1;
        boolean z4;
        long jOooOOo;
        List list;
        long j4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j5;
        int i2;
        int i3;
        int iOooOOo2;
        boolean z9;
        long jOooOOo2;
        o000O0O0 o000o0o1 = this.f36251OooO0OO;
        if (o000o0o1 == null || oooO0OO.f36067OoooO != o000o0o1.OooO0OO()) {
            o000O0O0 o000o0o2 = new o000O0O0(oooO0OO.f13640Oooo);
            this.f36251OooO0OO = o000o0o2;
            o000o0o2.OooO00o(oooO0OO.f13640Oooo - oooO0OO.f36067OoooO);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f36249OooO00o.OooOoO0(bArrArray, iLimit);
        this.f36250OooO0O0.OooOO0(bArrArray, iLimit);
        this.f36250OooO0O0.OooOOO0(39);
        long jOooO0oO = (((long) this.f36250OooO0O0.OooO0oO(1)) << 32) | ((long) this.f36250OooO0O0.OooO0oO(32));
        this.f36250OooO0O0.OooOOO0(20);
        int iOooO0oO = this.f36250OooO0O0.OooO0oO(12);
        int iOooO0oO2 = this.f36250OooO0O0.OooO0oO(8);
        this.f36249OooO00o.OooOoo0(14);
        Metadata.Entry spliceNullCommand = null;
        if (iOooO0oO2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iOooO0oO2 != 255) {
            long j6 = 128;
            if (iOooO0oO2 == 4) {
                o000 o000Var = this.f36249OooO00o;
                int iOooOOo3 = o000Var.OooOOo0();
                ArrayList arrayList2 = new ArrayList(iOooOOo3);
                int i4 = 0;
                while (i4 < iOooOOo3) {
                    long jOooOOo3 = o000Var.OooOOo();
                    boolean z10 = (o000Var.OooOOo0() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i = iOooOOo3;
                        j = j6;
                        arrayList = arrayList3;
                        z = false;
                        z2 = false;
                        j2 = -9223372036854775807L;
                        z3 = false;
                        j3 = -9223372036854775807L;
                        iOooOo0O = 0;
                        iOooOOo0 = 0;
                        iOooOOo1 = 0;
                    } else {
                        int iOooOOo4 = o000Var.OooOOo0();
                        boolean z11 = (iOooOOo4 & 128) != 0;
                        boolean z12 = (iOooOOo4 & 64) != 0;
                        boolean z13 = (iOooOOo4 & 32) != 0;
                        long jOooOOo4 = z12 ? o000Var.OooOOo() : -9223372036854775807L;
                        if (z12) {
                            i = iOooOOo3;
                        } else {
                            int iOooOOo5 = o000Var.OooOOo0();
                            ArrayList arrayList4 = new ArrayList(iOooOOo5);
                            int i5 = 0;
                            while (i5 < iOooOOo5) {
                                arrayList4.add(new SpliceScheduleCommand.OooO0O0(o000Var.OooOOo0(), o000Var.OooOOo(), null));
                                i5++;
                                iOooOOo5 = iOooOOo5;
                                iOooOOo3 = iOooOOo3;
                            }
                            i = iOooOOo3;
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long jOooOOo0 = o000Var.OooOOo0();
                            j = 128;
                            z4 = (jOooOOo0 & 128) != 0;
                            jOooOOo = ((((jOooOOo0 & 1) << 32) | o000Var.OooOOo()) * 1000) / 90;
                        } else {
                            j = 128;
                            z4 = false;
                            jOooOOo = -9223372036854775807L;
                        }
                        z3 = z4;
                        j3 = jOooOOo;
                        arrayList = arrayList3;
                        iOooOo0O = o000Var.OooOo0O();
                        z = z11;
                        z2 = z12;
                        j2 = jOooOOo4;
                        iOooOOo0 = o000Var.OooOOo0();
                        iOooOOo1 = o000Var.OooOOo0();
                    }
                    arrayList2.add(new SpliceScheduleCommand.OooO0OO(jOooOOo3, z10, z, z2, arrayList, j2, z3, j3, iOooOo0O, iOooOOo0, iOooOOo1));
                    i4++;
                    j6 = j;
                    iOooOOo3 = i;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList2);
            } else if (iOooO0oO2 == 5) {
                o000 o000Var2 = this.f36249OooO00o;
                o000O0O0 o000o0o3 = this.f36251OooO0OO;
                long jOooOOo5 = o000Var2.OooOOo();
                boolean z14 = (o000Var2.OooOOo0() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z14) {
                    list = listEmptyList;
                    j4 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    j5 = -9223372036854775807L;
                    i2 = 0;
                    i3 = 0;
                    iOooOOo2 = 0;
                } else {
                    int iOooOOo6 = o000Var2.OooOOo0();
                    boolean z15 = (iOooOOo6 & 128) != 0;
                    boolean z16 = (iOooOOo6 & 64) != 0;
                    boolean z17 = (iOooOOo6 & 32) != 0;
                    boolean z18 = (iOooOOo6 & 16) != 0;
                    long jOooO00o = (!z16 || z18) ? -9223372036854775807L : TimeSignalCommand.OooO00o(o000Var2, jOooO0oO);
                    if (!z16) {
                        int iOooOOo7 = o000Var2.OooOOo0();
                        ArrayList arrayList5 = new ArrayList(iOooOOo7);
                        for (int i6 = 0; i6 < iOooOOo7; i6++) {
                            int iOooOOo8 = o000Var2.OooOOo0();
                            long jOooO00o2 = !z18 ? TimeSignalCommand.OooO00o(o000Var2, jOooO0oO) : -9223372036854775807L;
                            arrayList5.add(new SpliceInsertCommand.OooO0O0(iOooOOo8, jOooO00o2, o000o0o3.OooO0O0(jOooO00o2), null));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z17) {
                        long jOooOOo1 = o000Var2.OooOOo0();
                        z9 = (jOooOOo1 & 128) != 0;
                        jOooOOo2 = ((((jOooOOo1 & 1) << 32) | o000Var2.OooOOo()) * 1000) / 90;
                    } else {
                        z9 = false;
                        jOooOOo2 = -9223372036854775807L;
                    }
                    int iOooOo0O2 = o000Var2.OooOo0O();
                    int iOooOOo9 = o000Var2.OooOOo0();
                    i2 = iOooOo0O2;
                    z8 = z9;
                    iOooOOo2 = o000Var2.OooOOo0();
                    list = listEmptyList;
                    j5 = jOooOOo2;
                    i3 = iOooOOo9;
                    z5 = z15;
                    j4 = jOooO00o;
                    z7 = z18;
                    z6 = z16;
                }
                spliceNullCommand = new SpliceInsertCommand(jOooOOo5, z14, z5, z6, z7, j4, o000o0o3.OooO0O0(j4), list, z8, j5, i2, i3, iOooOOo2);
            } else if (iOooO0oO2 == 6) {
                o000 o000Var3 = this.f36249OooO00o;
                o000O0O0 o000o0o4 = this.f36251OooO0OO;
                long jOooO00o3 = TimeSignalCommand.OooO00o(o000Var3, jOooO0oO);
                spliceNullCommand = new TimeSignalCommand(jOooO00o3, o000o0o4.OooO0O0(jOooO00o3));
            }
        } else {
            o000 o000Var4 = this.f36249OooO00o;
            long jOooOOo6 = o000Var4.OooOOo();
            int i7 = iOooO0oO - 4;
            byte[] bArr = new byte[i7];
            o000Var4.OooO0OO(bArr, 0, i7);
            spliceNullCommand = new PrivateCommand(jOooOOo6, bArr, jOooO0oO);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
