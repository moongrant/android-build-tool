package o000Oo0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.TreeSet;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34806OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f34807OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TreeSet<o00Oo0> f34808OooO0OO = new TreeSet<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<OooO00o> f34809OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOo f34810OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f34811OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f34812OooO0O0;

        public OooO00o(long j, long j2) {
            this.f34811OooO00o = j;
            this.f34812OooO0O0 = j2;
        }
    }

    public OooOO0O(int i, String str, OooOo oooOo) {
        this.f34806OooO00o = i;
        this.f34807OooO0O0 = str;
        this.f34810OooO0o0 = oooOo;
    }

    public final long OooO00o(long j, long j2) {
        p080o000OoO.o00Oo0.OooO00o(j >= 0);
        p080o000OoO.o00Oo0.OooO00o(j2 >= 0);
        o00Oo0 o00oo0OooO0O0 = OooO0O0(j, j2);
        boolean z = !o00oo0OooO0O0.f34788OooO0oO;
        long j3 = LongCompanionObject.MAX_VALUE;
        long j4 = o00oo0OooO0O0.f34786OooO0o;
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
        long jMax = o00oo0OooO0O0.f34787OooO0o0 + j4;
        if (jMax < j3) {
            for (o00Oo0 o00oo1 : this.f34808OooO0OO.tailSet(o00oo0OooO0O0, false)) {
                long j6 = o00oo1.f34787OooO0o0;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + o00oo1.f34786OooO0o);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final o00Oo0 OooO0O0(long j, long j2) {
        long j3;
        o00Oo0 o00oo1 = new o00Oo0(this.f34807OooO0O0, j, -1L, -9223372036854775807L, null);
        TreeSet<o00Oo0> treeSet = this.f34808OooO0OO;
        o00Oo0 o00oo0Floor = treeSet.floor(o00oo1);
        if (o00oo0Floor != null && o00oo0Floor.f34787OooO0o0 + o00oo0Floor.f34786OooO0o > j) {
            return o00oo0Floor;
        }
        o00Oo0 o00oo0Ceiling = treeSet.ceiling(o00oo1);
        if (o00oo0Ceiling != null) {
            long j4 = o00oo0Ceiling.f34787OooO0o0 - j;
            if (j2 == -1) {
                j3 = j4;
            } else {
                j2 = Math.min(j4, j2);
                j3 = j2;
            }
        } else {
            j3 = j2;
        }
        return new o00Oo0(this.f34807OooO0O0, j, j3, -9223372036854775807L, null);
    }

    public final boolean OooO0OO(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList<OooO00o> arrayList = this.f34809OooO0Oo;
            if (i >= arrayList.size()) {
                return false;
            }
            OooO00o oooO00o = arrayList.get(i);
            long j3 = oooO00o.f34812OooO0O0;
            long j4 = oooO00o.f34811OooO00o;
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
        if (obj == null || OooOO0O.class != obj.getClass()) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f34806OooO00o == oooOO0O.f34806OooO00o && this.f34807OooO0O0.equals(oooOO0O.f34807OooO0O0) && this.f34808OooO0OO.equals(oooOO0O.f34808OooO0OO) && this.f34810OooO0o0.equals(oooOO0O.f34810OooO0o0);
    }

    public final int hashCode() {
        return this.f34810OooO0o0.hashCode() + androidx.compose.animation.OooO0O0.OooO00o(this.f34807OooO0O0, this.f34806OooO00o * 31, 31);
    }
}
