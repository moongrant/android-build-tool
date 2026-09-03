package p246o00oo0o0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.TreeSet;
import kotlin.jvm.internal.LongCompanionObject;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f40677OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f40678OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TreeSet<o00O00> f40679OooO0OO = new TreeSet<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<OooO00o> f40680OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00O0000 f40681OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f40682OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f40683OooO0O0;

        public OooO00o(long j, long j2) {
            this.f40682OooO00o = j;
            this.f40683OooO0O0 = j2;
        }
    }

    public o000O(int i, String str, o00O0000 o00o0001) {
        this.f40677OooO00o = i;
        this.f40678OooO0O0 = str;
        this.f40681OooO0o0 = o00o0001;
    }

    public final long OooO00o(long j, long j2) {
        o00O000o.OooO00o(j >= 0);
        o00O000o.OooO00o(j2 >= 0);
        o00O00 o00o00OooO0O0 = OooO0O0(j, j2);
        boolean z = !o00o00OooO0O0.f40720OooO0oO;
        long j3 = LongCompanionObject.MAX_VALUE;
        long j4 = o00o00OooO0O0.f40718OooO0o;
        if (z) {
            if (!(j4 == -1)) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long jMax = o00o00OooO0O0.f40719OooO0o0 + j4;
        if (jMax < j3) {
            for (o00O00 o00o01 : this.f40679OooO0OO.tailSet(o00o00OooO0O0, false)) {
                long j6 = o00o01.f40719OooO0o0;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + o00o01.f40718OooO0o);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final o00O00 OooO0O0(long j, long j2) {
        long j3;
        o00O00 o00o01 = new o00O00(this.f40678OooO0O0, j, -1L, -9223372036854775807L, null);
        TreeSet<o00O00> treeSet = this.f40679OooO0OO;
        o00O00 o00o00Floor = treeSet.floor(o00o01);
        if (o00o00Floor != null && o00o00Floor.f40719OooO0o0 + o00o00Floor.f40718OooO0o > j) {
            return o00o00Floor;
        }
        o00O00 o00o00Ceiling = treeSet.ceiling(o00o01);
        if (o00o00Ceiling != null) {
            long j4 = o00o00Ceiling.f40719OooO0o0 - j;
            if (j2 == -1) {
                j3 = j4;
            } else {
                j2 = Math.min(j4, j2);
                j3 = j2;
            }
        } else {
            j3 = j2;
        }
        return new o00O00(this.f40678OooO0O0, j, j3, -9223372036854775807L, null);
    }

    public final boolean OooO0OO(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList<OooO00o> arrayList = this.f40680OooO0Oo;
            if (i >= arrayList.size()) {
                return false;
            }
            OooO00o oooO00o = arrayList.get(i);
            long j3 = oooO00o.f40683OooO0O0;
            long j4 = oooO00o.f40682OooO00o;
            if (j3 != -1 ? j2 != -1 && j4 <= j && j + j2 <= j4 + j3 : j >= j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000O.class != obj.getClass()) {
            return false;
        }
        o000O o000o = (o000O) obj;
        return this.f40677OooO00o == o000o.f40677OooO00o && this.f40678OooO0O0.equals(o000o.f40678OooO0O0) && this.f40679OooO0OO.equals(o000o.f40679OooO0OO) && this.f40681OooO0o0.equals(o000o.f40681OooO0o0);
    }

    public final int hashCode() {
        return this.f40681OooO0o0.hashCode() + o0OO00O.OooO00o(this.f40678OooO0O0, this.f40677OooO00o * 31, 31);
    }
}
