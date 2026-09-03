package com.google.android.exoplayer2;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OooO00o extends oo0o0Oo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f11030OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.o00Ooo f11031OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f11032OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f11033OooOO0 = false;

    public OooO00o(com.google.android.exoplayer2.source.o00Ooo o00ooo2) {
        this.f11031OooO = o00ooo2;
        this.f11032OooO0oo = o00ooo2.getLength();
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooO00o(boolean z) {
        if (this.f11032OooO0oo == 0) {
            return -1;
        }
        if (this.f11033OooOO0) {
            z = false;
        }
        int iOooO0o = z ? this.f11031OooO.OooO0o() : 0;
        while (OooOoO0(iOooO0o).OooOOo0()) {
            iOooO0o = OooOo(iOooO0o, z);
            if (iOooO0o == -1) {
                return -1;
            }
        }
        return OooOoO0(iOooO0o).OooO00o(z) + OooOo0o(iOooO0o);
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooO0O0(Object obj) {
        int iOooO0O0;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iOooOOo = OooOOo(obj2);
        if (iOooOOo == -1 || (iOooO0O0 = OooOoO0(iOooOOo).OooO0O0(obj3)) == -1) {
            return -1;
        }
        return OooOo0O(iOooOOo) + iOooO0O0;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooO0OO(boolean z) {
        int i = this.f11032OooO0oo;
        if (i == 0) {
            return -1;
        }
        if (this.f11033OooOO0) {
            z = false;
        }
        com.google.android.exoplayer2.source.o00Ooo o00ooo2 = this.f11031OooO;
        int iOooO0Oo = z ? o00ooo2.OooO0Oo() : i - 1;
        while (OooOoO0(iOooO0Oo).OooOOo0()) {
            if (z) {
                iOooO0Oo = o00ooo2.OooO0O0(iOooO0Oo);
            } else {
                iOooO0Oo = iOooO0Oo > 0 ? iOooO0Oo - 1 : -1;
            }
            if (iOooO0Oo == -1) {
                return -1;
            }
        }
        return OooOoO0(iOooO0Oo).OooO0OO(z) + OooOo0o(iOooO0Oo);
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooO0o0(int i, int i2, boolean z) {
        if (this.f11033OooOO0) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iOooOo00 = OooOo00(i);
        int iOooOo0o = OooOo0o(iOooOo00);
        int iOooO0o0 = OooOoO0(iOooOo00).OooO0o0(i - iOooOo0o, i2 != 2 ? i2 : 0, z);
        if (iOooO0o0 != -1) {
            return iOooOo0o + iOooO0o0;
        }
        int iOooOo = OooOo(iOooOo00, z);
        while (iOooOo != -1 && OooOoO0(iOooOo).OooOOo0()) {
            iOooOo = OooOo(iOooOo, z);
        }
        if (iOooOo != -1) {
            return OooOoO0(iOooOo).OooO00o(z) + OooOo0o(iOooOo);
        }
        if (i2 == 2) {
            return OooO00o(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final oo0o0Oo.OooO0O0 OooO0oO(int i, oo0o0Oo.OooO0O0 oooO0O0, boolean z) {
        int iOooOOoo = OooOOoo(i);
        int iOooOo0o = OooOo0o(iOooOOoo);
        OooOoO0(iOooOOoo).OooO0oO(i - OooOo0O(iOooOOoo), oooO0O0, z);
        oooO0O0.f12906OooO0o += iOooOo0o;
        if (z) {
            Object objOooOo0 = OooOo0(iOooOOoo);
            Object obj = oooO0O0.f12907OooO0o0;
            obj.getClass();
            oooO0O0.f12907OooO0o0 = Pair.create(objOooOo0, obj);
        }
        return oooO0O0;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final oo0o0Oo.OooO0O0 OooO0oo(Object obj, oo0o0Oo.OooO0O0 oooO0O0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iOooOOo = OooOOo(obj2);
        int iOooOo0o = OooOo0o(iOooOOo);
        OooOoO0(iOooOOo).OooO0oo(obj3, oooO0O0);
        oooO0O0.f12906OooO0o += iOooOo0o;
        oooO0O0.f12907OooO0o0 = obj;
        return oooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0033, code lost:
    
        r0 = -1;
     */
    @Override // com.google.android.exoplayer2.oo0o0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooOO0o(int i, int i2, boolean z) {
        int iOooO0O0;
        if (this.f11033OooOO0) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iOooOo00 = OooOo00(i);
        int iOooOo0o = OooOo0o(iOooOo00);
        int iOooOO0o = OooOoO0(iOooOo00).OooOO0o(i - iOooOo0o, i2 != 2 ? i2 : 0, z);
        if (iOooOO0o != -1) {
            return iOooOo0o + iOooOO0o;
        }
        com.google.android.exoplayer2.source.o00Ooo o00ooo2 = this.f11031OooO;
        if (z) {
            iOooO0O0 = o00ooo2.OooO0O0(iOooOo00);
        } else if (iOooOo00 > 0) {
            iOooO0O0 = iOooOo00 - 1;
        }
        while (iOooO0O0 != -1 && OooOoO0(iOooO0O0).OooOOo0()) {
            if (z) {
                iOooO0O0 = o00ooo2.OooO0O0(iOooO0O0);
            } else {
                iOooO0O0 = iOooO0O0 > 0 ? iOooO0O0 - 1 : -1;
            }
        }
        if (iOooO0O0 != -1) {
            return OooOoO0(iOooO0O0).OooO0OO(z) + OooOo0o(iOooO0O0);
        }
        if (i2 == 2) {
            return OooO0OO(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final Object OooOOO0(int i) {
        int iOooOOoo = OooOOoo(i);
        return Pair.create(OooOo0(iOooOOoo), OooOoO0(iOooOOoo).OooOOO0(i - OooOo0O(iOooOOoo)));
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final oo0o0Oo.OooO0OO OooOOOO(int i, oo0o0Oo.OooO0OO oooO0OO, long j) {
        int iOooOo00 = OooOo00(i);
        int iOooOo0o = OooOo0o(iOooOo00);
        int iOooOo0O = OooOo0O(iOooOo00);
        OooOoO0(iOooOo00).OooOOOO(i - iOooOo0o, oooO0OO, j);
        Object objOooOo0 = OooOo0(iOooOo00);
        if (!oo0o0Oo.OooO0OO.f12912OooOo0.equals(oooO0OO.f12928OooO0Oo)) {
            objOooOo0 = Pair.create(objOooOo0, oooO0OO.f12928OooO0Oo);
        }
        oooO0OO.f12928OooO0Oo = objOooOo0;
        oooO0OO.f12940OooOOo += iOooOo0O;
        oooO0OO.f12942OooOOoo += iOooOo0O;
        return oooO0OO;
    }

    public abstract int OooOOo(Object obj);

    public abstract int OooOOoo(int i);

    public final int OooOo(int i, boolean z) {
        if (z) {
            return this.f11031OooO.OooO0OO(i);
        }
        if (i < this.f11032OooO0oo - 1) {
            return i + 1;
        }
        return -1;
    }

    public abstract Object OooOo0(int i);

    public abstract int OooOo00(int i);

    public abstract int OooOo0O(int i);

    public abstract int OooOo0o(int i);

    public abstract oo0o0Oo OooOoO0(int i);
}
