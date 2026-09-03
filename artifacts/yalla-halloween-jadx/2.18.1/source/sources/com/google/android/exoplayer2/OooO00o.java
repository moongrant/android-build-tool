package com.google.android.exoplayer2;

import android.util.Pair;
import java.util.Objects;
import p310o0O0o0oo.o00O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o extends o000oOoO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f13189OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O f13190OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f13191OooO0Oo = false;

    public OooO00o(o00O o00o2) {
        this.f13190OooO0OO = o00o2;
        this.f13189OooO0O0 = o00o2.OooO00o();
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooO00o(boolean z) {
        if (this.f13189OooO0O0 == 0) {
            return -1;
        }
        if (this.f13191OooO0Oo) {
            z = false;
        }
        int iOooO0O0 = z ? this.f13190OooO0OO.OooO0O0() : 0;
        while (OooOo0o(iOooO0O0).OooOOOO()) {
            iOooO0O0 = OooOo0O(iOooO0O0, z);
            if (iOooO0O0 == -1) {
                return -1;
            }
        }
        return OooOo0o(iOooO0O0).OooO00o(z) + OooOo0(iOooO0O0);
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooO0O0(Object obj) {
        int iOooO0O0;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iOooOOOo = OooOOOo(obj2);
        if (iOooOOOo == -1 || (iOooO0O0 = OooOo0o(iOooOOOo).OooO0O0(obj3)) == -1) {
            return -1;
        }
        return OooOo00(iOooOOOo) + iOooO0O0;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooO0OO(boolean z) {
        int i = this.f13189OooO0O0;
        if (i == 0) {
            return -1;
        }
        if (this.f13191OooO0Oo) {
            z = false;
        }
        int iOooO0oO = z ? this.f13190OooO0OO.OooO0oO() : i - 1;
        while (OooOo0o(iOooO0oO).OooOOOO()) {
            if (z) {
                iOooO0oO = this.f13190OooO0OO.OooO0Oo(iOooO0oO);
            } else {
                iOooO0oO = iOooO0oO > 0 ? iOooO0oO - 1 : -1;
            }
            if (iOooO0oO == -1) {
                return -1;
            }
        }
        return OooOo0o(iOooO0oO).OooO0OO(z) + OooOo0(iOooO0oO);
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final o000oOoO.OooO0O0 OooO0o(int i, o000oOoO.OooO0O0 oooO0O0, boolean z) {
        int iOooOOo0 = OooOOo0(i);
        int iOooOo0 = OooOo0(iOooOOo0);
        OooOo0o(iOooOOo0).OooO0o(i - OooOo00(iOooOOo0), oooO0O0, z);
        oooO0O0.f14559OooO0OO += iOooOo0;
        if (z) {
            Object objOooOOoo = OooOOoo(iOooOOo0);
            Object obj = oooO0O0.f14558OooO0O0;
            Objects.requireNonNull(obj);
            oooO0O0.f14558OooO0O0 = Pair.create(objOooOOoo, obj);
        }
        return oooO0O0;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooO0o0(int i, int i2, boolean z) {
        if (this.f13191OooO0Oo) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iOooOOo = OooOOo(i);
        int iOooOo0 = OooOo0(iOooOOo);
        int iOooO0o0 = OooOo0o(iOooOOo).OooO0o0(i - iOooOo0, i2 != 2 ? i2 : 0, z);
        if (iOooO0o0 != -1) {
            return iOooOo0 + iOooO0o0;
        }
        int iOooOo0O = OooOo0O(iOooOOo, z);
        while (iOooOo0O != -1 && OooOo0o(iOooOo0O).OooOOOO()) {
            iOooOo0O = OooOo0O(iOooOo0O, z);
        }
        if (iOooOo0O != -1) {
            return OooOo0o(iOooOo0O).OooO00o(z) + OooOo0(iOooOo0O);
        }
        if (i2 == 2) {
            return OooO00o(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final o000oOoO.OooO0O0 OooO0oO(Object obj, o000oOoO.OooO0O0 oooO0O0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iOooOOOo = OooOOOo(obj2);
        int iOooOo0 = OooOo0(iOooOOOo);
        OooOo0o(iOooOOOo).OooO0oO(obj3, oooO0O0);
        oooO0O0.f14559OooO0OO += iOooOo0;
        oooO0O0.f14558OooO0O0 = obj;
        return oooO0O0;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final Object OooOO0O(int i) {
        int iOooOOo0 = OooOOo0(i);
        return Pair.create(OooOOoo(iOooOOo0), OooOo0o(iOooOOo0).OooOO0O(i - OooOo00(iOooOOo0)));
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final o000oOoO.OooO0OO OooOOO0(int i, o000oOoO.OooO0OO oooO0OO, long j) {
        int iOooOOo = OooOOo(i);
        int iOooOo0 = OooOo0(iOooOOo);
        int iOooOo00 = OooOo00(iOooOOo);
        OooOo0o(iOooOOo).OooOOO0(i - iOooOo0, oooO0OO, j);
        Object objOooOOoo = OooOOoo(iOooOOo);
        if (!o000oOoO.OooO0OO.f14564OooOOo0.equals(oooO0OO.f14566OooO00o)) {
            objOooOOoo = Pair.create(objOooOOoo, oooO0OO.f14566OooO00o);
        }
        oooO0OO.f14566OooO00o = objOooOOoo;
        oooO0OO.f14576OooOO0o += iOooOo00;
        oooO0OO.f14578OooOOO0 += iOooOo00;
        return oooO0OO;
    }

    public abstract int OooOOOo(Object obj);

    public abstract int OooOOo(int i);

    public abstract int OooOOo0(int i);

    public abstract Object OooOOoo(int i);

    public abstract int OooOo0(int i);

    public abstract int OooOo00(int i);

    public final int OooOo0O(int i, boolean z) {
        if (z) {
            return this.f13190OooO0OO.OooO0o0(i);
        }
        if (i < this.f13189OooO0O0 - 1) {
            return i + 1;
        }
        return -1;
    }

    public abstract o000oOoO OooOo0o(int i);
}
