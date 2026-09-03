package p223o00oOOo0;

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
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O0000O;
import p636o0ooOO.O0000000;
import p636o0ooOO.O0OO00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000 extends O0OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f39753OooO00o = new o00Oo00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOOOo f39754OooO0O0 = new o00OOOOo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0O0000O f39755OooO0OO;

    @Override // p636o0ooOO.O0OO00
    public final Metadata OooO0O0(O0000000 o0000000, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        long j;
        long j2;
        ArrayList arrayList;
        long j3;
        long j4;
        boolean z;
        boolean z2;
        boolean z3;
        int iOooOoOO;
        int iOooOo0O;
        int iOooOo0O2;
        long jOooOo0o;
        boolean z4;
        List list;
        long j5;
        long j6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2;
        int iOooOo0O3;
        boolean z9;
        o0O0000O o0o0000o2 = this.f39755OooO0OO;
        if (o0o0000o2 == null || o0000000.f57395OooOO0o != o0o0000o2.OooO0Oo()) {
            o0O0000O o0o0000o3 = new o0O0000O(o0000000.f11677OooO0oo);
            this.f39755OooO0OO = o0o0000o3;
            o0o0000o3.OooO00o(o0000000.f11677OooO0oo - o0000000.f57395OooOO0o);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        o00Oo00 o00oo00 = this.f39753OooO00o;
        o00oo00.OooOooo(iLimit, bArrArray);
        o00OOOOo o00ooooo2 = this.f39754OooO0O0;
        o00ooooo2.OooOO0(iLimit, bArrArray);
        o00ooooo2.OooOOO0(39);
        long jOooO0oO = (((long) o00ooooo2.OooO0oO(1)) << 32) | ((long) o00ooooo2.OooO0oO(32));
        o00ooooo2.OooOOO0(20);
        int iOooO0oO = o00ooooo2.OooO0oO(12);
        int iOooO0oO2 = o00ooooo2.OooO0oO(8);
        o00oo00.Oooo00o(14);
        if (iOooO0oO2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iOooO0oO2 != 255) {
            long j7 = 0;
            long j8 = 1;
            long jOooOo0o2 = -9223372036854775807L;
            if (iOooO0oO2 == 4) {
                int iOooOo0O4 = o00oo00.OooOo0O();
                ArrayList arrayList2 = new ArrayList(iOooOo0O4);
                int i3 = 0;
                while (i3 < iOooOo0O4) {
                    long jOooOo0o3 = o00oo00.OooOo0o();
                    boolean z10 = (o00oo00.OooOo0O() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        j = j8;
                        j2 = j7;
                        arrayList = arrayList3;
                        j3 = -9223372036854775807L;
                        j4 = -9223372036854775807L;
                        z = false;
                        z2 = false;
                        z3 = false;
                        iOooOoOO = 0;
                        iOooOo0O = 0;
                        iOooOo0O2 = 0;
                    } else {
                        int iOooOo0O5 = o00oo00.OooOo0O();
                        boolean z11 = (iOooOo0O5 & 128) != 0;
                        boolean z12 = (iOooOo0O5 & 64) != 0;
                        boolean z13 = (iOooOo0O5 & 32) != 0;
                        long jOooOo0o4 = z12 ? o00oo00.OooOo0o() : -9223372036854775807L;
                        if (!z12) {
                            int iOooOo0O6 = o00oo00.OooOo0O();
                            ArrayList arrayList4 = new ArrayList(iOooOo0O6);
                            for (int i4 = 0; i4 < iOooOo0O6; i4++) {
                                arrayList4.add(new SpliceScheduleCommand.OooO0O0(o00oo00.OooOo0O(), o00oo00.OooOo0o()));
                            }
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long jOooOo0O = o00oo00.OooOo0O();
                            j2 = 0;
                            z4 = (jOooOo0O & 128) != 0;
                            j = 1;
                            jOooOo0o = ((((jOooOo0O & 1) << 32) | o00oo00.OooOo0o()) * 1000) / 90;
                        } else {
                            j = 1;
                            j2 = 0;
                            jOooOo0o = -9223372036854775807L;
                            z4 = false;
                        }
                        z3 = z4;
                        arrayList = arrayList3;
                        z = z11;
                        z2 = z12;
                        j3 = jOooOo0o4;
                        j4 = jOooOo0o;
                        iOooOoOO = o00oo00.OooOoOO();
                        iOooOo0O = o00oo00.OooOo0O();
                        iOooOo0O2 = o00oo00.OooOo0O();
                    }
                    arrayList2.add(new SpliceScheduleCommand.OooO0OO(jOooOo0o3, z10, z, z2, arrayList, j3, z3, j4, iOooOoOO, iOooOo0O, iOooOo0O2));
                    i3++;
                    j7 = j2;
                    j8 = j;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList2);
            } else if (iOooO0oO2 == 5) {
                o0O0000O o0o0000o4 = this.f39755OooO0OO;
                long jOooOo0o5 = o00oo00.OooOo0o();
                boolean z14 = (o00oo00.OooOo0O() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z14) {
                    list = listEmptyList;
                    j5 = -9223372036854775807L;
                    j6 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i = 0;
                    i2 = 0;
                    iOooOo0O3 = 0;
                } else {
                    int iOooOo0O7 = o00oo00.OooOo0O();
                    boolean z15 = (iOooOo0O7 & 128) != 0;
                    boolean z16 = (iOooOo0O7 & 64) != 0;
                    boolean z17 = (iOooOo0O7 & 32) != 0;
                    boolean z18 = (iOooOo0O7 & 16) != 0;
                    long jOooO00o = (!z16 || z18) ? -9223372036854775807L : TimeSignalCommand.OooO00o(jOooO0oO, o00oo00);
                    if (!z16) {
                        int iOooOo0O8 = o00oo00.OooOo0O();
                        ArrayList arrayList5 = new ArrayList(iOooOo0O8);
                        for (int i5 = 0; i5 < iOooOo0O8; i5++) {
                            int iOooOo0O9 = o00oo00.OooOo0O();
                            long jOooO00o2 = !z18 ? TimeSignalCommand.OooO00o(jOooO0oO, o00oo00) : -9223372036854775807L;
                            arrayList5.add(new SpliceInsertCommand.OooO0O0(iOooOo0O9, jOooO00o2, o0o0000o4.OooO0O0(jOooO00o2)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z17) {
                        long jOooOo0O2 = o00oo00.OooOo0O();
                        z9 = (jOooOo0O2 & 128) != 0;
                        jOooOo0o2 = ((((jOooOo0O2 & 1) << 32) | o00oo00.OooOo0o()) * 1000) / 90;
                    } else {
                        z9 = false;
                    }
                    int iOooOoOO2 = o00oo00.OooOoOO();
                    int iOooOo0O10 = o00oo00.OooOo0O();
                    z8 = z9;
                    iOooOo0O3 = o00oo00.OooOo0O();
                    list = listEmptyList;
                    z5 = z15;
                    i = iOooOoOO2;
                    i2 = iOooOo0O10;
                    j6 = jOooOo0o2;
                    long j9 = jOooO00o;
                    z7 = z18;
                    z6 = z16;
                    j5 = j9;
                }
                spliceNullCommand = new SpliceInsertCommand(jOooOo0o5, z14, z5, z6, z7, j5, o0o0000o4.OooO0O0(j5), list, z8, j6, i, i2, iOooOo0O3);
            } else if (iOooO0oO2 != 6) {
                spliceNullCommand = null;
            } else {
                o0O0000O o0o0000o5 = this.f39755OooO0OO;
                long jOooO00o3 = TimeSignalCommand.OooO00o(jOooO0oO, o00oo00);
                spliceNullCommand = new TimeSignalCommand(jOooO00o3, o0o0000o5.OooO0O0(jOooO00o3));
            }
        } else {
            long jOooOo0o6 = o00oo00.OooOo0o();
            int i6 = iOooO0oO - 4;
            byte[] bArr = new byte[i6];
            o00oo00.OooO0Oo(0, i6, bArr);
            spliceNullCommand = new PrivateCommand(jOooOo0o6, bArr, jOooO0oO);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
