package o000O00O;

import android.util.Pair;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class OooO00o extends androidx.media3.common.Oooo0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f33954OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f33955OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.o00Ooo f33956OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f33957OooOO0O = false;

    public OooO00o(androidx.media3.exoplayer.source.o00Ooo o00ooo2) {
        this.f33956OooOO0 = o00ooo2;
        this.f33955OooO = o00ooo2.getLength();
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooO0Oo(boolean z) {
        if (this.f33955OooO == 0) {
            return -1;
        }
        if (this.f33957OooOO0O) {
            z = false;
        }
        int iOooO0o = z ? this.f33956OooOO0.OooO0o() : 0;
        while (OooOoo0(iOooO0o).OooOo00()) {
            iOooO0o = OooOoOO(iOooO0o, z);
            if (iOooO0o == -1) {
                return -1;
            }
        }
        return OooOoo0(iOooO0o).OooO0Oo(z) + OooOoO(iOooO0o);
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooO0o(boolean z) {
        int i = this.f33955OooO;
        if (i == 0) {
            return -1;
        }
        if (this.f33957OooOO0O) {
            z = false;
        }
        androidx.media3.exoplayer.source.o00Ooo o00ooo2 = this.f33956OooOO0;
        int iOooO0Oo = z ? o00ooo2.OooO0Oo() : i - 1;
        while (OooOoo0(iOooO0Oo).OooOo00()) {
            if (z) {
                iOooO0Oo = o00ooo2.OooO0O0(iOooO0Oo);
            } else {
                iOooO0Oo = iOooO0Oo > 0 ? iOooO0Oo - 1 : -1;
            }
            if (iOooO0Oo == -1) {
                return -1;
            }
        }
        return OooOoo0(iOooO0Oo).OooO0o(z) + OooOoO(iOooO0Oo);
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooO0o0(Object obj) {
        int iOooO0o0;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iOooOo0 = OooOo0(obj2);
        if (iOooOo0 == -1 || (iOooO0o0 = OooOoo0(iOooOo0).OooO0o0(obj3)) == -1) {
            return -1;
        }
        return OooOoO0(iOooOo0) + iOooO0o0;
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooO0oo(int i, int i2, boolean z) {
        if (this.f33957OooOO0O) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iOooOo0o = OooOo0o(i);
        int iOooOoO = OooOoO(iOooOo0o);
        int iOooO0oo = OooOoo0(iOooOo0o).OooO0oo(i - iOooOoO, i2 != 2 ? i2 : 0, z);
        if (iOooO0oo != -1) {
            return iOooOoO + iOooO0oo;
        }
        int iOooOoOO = OooOoOO(iOooOo0o, z);
        while (iOooOoOO != -1 && OooOoo0(iOooOoOO).OooOo00()) {
            iOooOoOO = OooOoOO(iOooOoOO, z);
        }
        if (iOooOoOO != -1) {
            return OooOoo0(iOooOoOO).OooO0Oo(z) + OooOoO(iOooOoOO);
        }
        if (i2 == 2) {
            return OooO0Oo(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Oooo0
    public final androidx.media3.common.Oooo0.OooO0O0 OooOO0(int i, androidx.media3.common.Oooo0.OooO0O0 oooO0O0, boolean z) {
        int iOooOo0O = OooOo0O(i);
        int iOooOoO = OooOoO(iOooOo0O);
        OooOoo0(iOooOo0O).OooOO0(i - OooOoO0(iOooOo0O), oooO0O0, z);
        oooO0O0.f6642OooO0o += iOooOoO;
        if (z) {
            Object objOooOo = OooOo(iOooOo0O);
            Object obj = oooO0O0.f6643OooO0o0;
            obj.getClass();
            oooO0O0.f6643OooO0o0 = Pair.create(objOooOo, obj);
        }
        return oooO0O0;
    }

    @Override // androidx.media3.common.Oooo0
    public final androidx.media3.common.Oooo0.OooO0O0 OooOO0O(Object obj, androidx.media3.common.Oooo0.OooO0O0 oooO0O0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iOooOo0 = OooOo0(obj2);
        int iOooOoO = OooOoO(iOooOo0);
        OooOoo0(iOooOo0).OooOO0O(obj3, oooO0O0);
        oooO0O0.f6642OooO0o += iOooOoO;
        oooO0O0.f6643OooO0o0 = obj;
        return oooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0033, code lost:
    
        r0 = -1;
     */
    @Override // androidx.media3.common.Oooo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooOOOO(int i, int i2, boolean z) {
        int iOooO0O0;
        if (this.f33957OooOO0O) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iOooOo0o = OooOo0o(i);
        int iOooOoO = OooOoO(iOooOo0o);
        int iOooOOOO = OooOoo0(iOooOo0o).OooOOOO(i - iOooOoO, i2 != 2 ? i2 : 0, z);
        if (iOooOOOO != -1) {
            return iOooOoO + iOooOOOO;
        }
        androidx.media3.exoplayer.source.o00Ooo o00ooo2 = this.f33956OooOO0;
        if (z) {
            iOooO0O0 = o00ooo2.OooO0O0(iOooOo0o);
        } else if (iOooOo0o > 0) {
            iOooO0O0 = iOooOo0o - 1;
        }
        while (iOooO0O0 != -1 && OooOoo0(iOooO0O0).OooOo00()) {
            if (z) {
                iOooO0O0 = o00ooo2.OooO0O0(iOooO0O0);
            } else {
                iOooO0O0 = iOooO0O0 > 0 ? iOooO0O0 - 1 : -1;
            }
        }
        if (iOooO0O0 != -1) {
            return OooOoo0(iOooO0O0).OooO0o(z) + OooOoO(iOooO0O0);
        }
        if (i2 == 2) {
            return OooO0o(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Oooo0
    public final Object OooOOOo(int i) {
        int iOooOo0O = OooOo0O(i);
        return Pair.create(OooOo(iOooOo0O), OooOoo0(iOooOo0O).OooOOOo(i - OooOoO0(iOooOo0O)));
    }

    @Override // androidx.media3.common.Oooo0
    public final androidx.media3.common.Oooo0.OooO0o OooOOo(int i, androidx.media3.common.Oooo0.OooO0o oooO0o, long j) {
        int iOooOo0o = OooOo0o(i);
        int iOooOoO = OooOoO(iOooOo0o);
        int iOooOoO0 = OooOoO0(iOooOo0o);
        OooOoo0(iOooOo0o).OooOOo(i - iOooOoO, oooO0o, j);
        Object objOooOo = OooOo(iOooOo0o);
        if (!androidx.media3.common.Oooo0.OooO0o.f6652OooOo0.equals(oooO0o.f6669OooO0Oo)) {
            objOooOo = Pair.create(objOooOo, oooO0o.f6669OooO0Oo);
        }
        oooO0o.f6669OooO0Oo = objOooOo;
        oooO0o.f6681OooOOo += iOooOoO0;
        oooO0o.f6683OooOOoo += iOooOoO0;
        return oooO0o;
    }

    public abstract Object OooOo(int i);

    public abstract int OooOo0(Object obj);

    public abstract int OooOo0O(int i);

    public abstract int OooOo0o(int i);

    public abstract int OooOoO(int i);

    public abstract int OooOoO0(int i);

    public final int OooOoOO(int i, boolean z) {
        if (z) {
            return this.f33956OooOO0.OooO0OO(i);
        }
        if (i < this.f33955OooO - 1) {
            return i + 1;
        }
        return -1;
    }

    public abstract androidx.media3.common.Oooo0 OooOoo0(int i);
}
