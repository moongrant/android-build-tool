package o0O0O00;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f41878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<o0OoOo0> f41879OooO0O0 = new ArrayList<>();

    public Oooo000(o0OoOo0 o0oooo0) {
        this.f41878OooO00o = null;
        this.f41878OooO00o = o0oooo0;
    }

    public static long OooO00o(OooOO0 oooOO1, long j) {
        o0OoOo0 o0oooo0 = oooOO1.f41863OooO0Oo;
        if (o0oooo0 instanceof OooOo00) {
            return j;
        }
        ArrayList arrayList = oooOO1.f41869OooOO0O;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            OooO0o oooO0o = (OooO0o) arrayList.get(i);
            if (oooO0o instanceof OooOO0) {
                OooOO0 oooOO2 = (OooOO0) oooO0o;
                if (oooOO2.f41863OooO0Oo != o0oooo0) {
                    jMin = Math.min(jMin, OooO00o(oooOO2, ((long) oooOO2.f41864OooO0o) + j));
                }
            }
        }
        if (oooOO1 != o0oooo0.f41886OooO) {
            return jMin;
        }
        long jOooOO0 = o0oooo0.OooOO0();
        OooOO0 oooOO3 = o0oooo0.f41894OooO0oo;
        long j2 = j - jOooOO0;
        return Math.min(Math.min(jMin, OooO00o(oooOO3, j2)), j2 - ((long) oooOO3.f41864OooO0o));
    }

    public static long OooO0O0(OooOO0 oooOO1, long j) {
        o0OoOo0 o0oooo0 = oooOO1.f41863OooO0Oo;
        if (o0oooo0 instanceof OooOo00) {
            return j;
        }
        ArrayList arrayList = oooOO1.f41869OooOO0O;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            OooO0o oooO0o = (OooO0o) arrayList.get(i);
            if (oooO0o instanceof OooOO0) {
                OooOO0 oooOO2 = (OooOO0) oooO0o;
                if (oooOO2.f41863OooO0Oo != o0oooo0) {
                    jMax = Math.max(jMax, OooO0O0(oooOO2, ((long) oooOO2.f41864OooO0o) + j));
                }
            }
        }
        if (oooOO1 != o0oooo0.f41894OooO0oo) {
            return jMax;
        }
        long jOooOO0 = o0oooo0.OooOO0();
        OooOO0 oooOO3 = o0oooo0.f41886OooO;
        long j2 = j + jOooOO0;
        return Math.max(Math.max(jMax, OooO0O0(oooOO3, j2)), j2 - ((long) oooOO3.f41864OooO0o));
    }
}
