package p061o0000o0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0O0O00 f27887OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList<o0O0O00> f27888OooO0O0 = new ArrayList<>();

    public o0Oo0oo(o0O0O00 o0o0o00) {
        this.f27887OooO00o = null;
        this.f27887OooO00o = o0o0o00;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    public final long OooO00o(o00O0O o00o0o2, long j) {
        o0O0O00 o0o0o00 = o00o0o2.f27861OooO0Oo;
        if (o0o0o00 instanceof o0ooOOo) {
            return j;
        }
        int size = o00o0o2.f27867OooOO0O.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            Oooo0 oooo0 = (Oooo0) o00o0o2.f27867OooOO0O.get(i);
            if (oooo0 instanceof o00O0O) {
                o00O0O o00o0o3 = (o00O0O) oooo0;
                if (o00o0o3.f27861OooO0Oo != o0o0o00) {
                    jMin = Math.min(jMin, OooO00o(o00o0o3, ((long) o00o0o3.f27862OooO0o) + j));
                }
            }
        }
        if (o00o0o2 != o0o0o00.f27871OooO) {
            return jMin;
        }
        long jOooOO0 = j - o0o0o00.OooOO0();
        return Math.min(Math.min(jMin, OooO00o(o0o0o00.f27879OooO0oo, jOooOO0)), jOooOO0 - ((long) o0o0o00.f27879OooO0oo.f27862OooO0o));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    public final long OooO0O0(o00O0O o00o0o2, long j) {
        o0O0O00 o0o0o00 = o00o0o2.f27861OooO0Oo;
        if (o0o0o00 instanceof o0ooOOo) {
            return j;
        }
        int size = o00o0o2.f27867OooOO0O.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            Oooo0 oooo0 = (Oooo0) o00o0o2.f27867OooOO0O.get(i);
            if (oooo0 instanceof o00O0O) {
                o00O0O o00o0o3 = (o00O0O) oooo0;
                if (o00o0o3.f27861OooO0Oo != o0o0o00) {
                    jMax = Math.max(jMax, OooO0O0(o00o0o3, ((long) o00o0o3.f27862OooO0o) + j));
                }
            }
        }
        if (o00o0o2 != o0o0o00.f27879OooO0oo) {
            return jMax;
        }
        long jOooOO0 = j + o0o0o00.OooOO0();
        return Math.max(Math.max(jMax, OooO0O0(o0o0o00.f27871OooO, jOooOO0)), jOooOO0 - ((long) o0o0o00.f27871OooO.f27862OooO0o));
    }
}
