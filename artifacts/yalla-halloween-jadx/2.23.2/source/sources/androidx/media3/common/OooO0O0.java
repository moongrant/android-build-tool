package androidx.media3.common;

import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import o000O00O.o00O0OO;
import o000O00O.oo0oOO0;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class OooO0O0 implements Player {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0.OooO0o f6355OooO00o = new Oooo0.OooO0o();

    public final void OooO0OO() {
        oo0oOO0 oo0ooo0;
        Pair<Object, Long> pairO00ooo;
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        oooO.o00000();
        ArrayList arrayList = oooO.f7135OooOOOO;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        o00O0OO o00o0oo2 = oooO.f7179Oooooo0;
        int iO00O0O = oooO.o00O0O(o00o0oo2);
        long jO0OoOo0 = oooO.o0OoOo0(o00o0oo2);
        int size2 = arrayList.size();
        oooO.f7155Oooo00O++;
        for (int i = iMin - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        oooO.f7158Oooo0OO = oooO.f7158Oooo0OO.OooO00o(iMin);
        oo0oOO0 oo0ooo1 = new oo0oOO0(arrayList, oooO.f7158Oooo0OO);
        Oooo0 oooo0 = o00o0oo2.f34105OooO00o;
        boolean z = false;
        if (oooo0.OooOo00() || oo0ooo1.OooOo00()) {
            oo0ooo0 = oo0ooo1;
            boolean z2 = !oooo0.OooOo00() && oo0ooo0.OooOo00();
            int i2 = z2 ? -1 : iO00O0O;
            if (z2) {
                jO0OoOo0 = -9223372036854775807L;
            }
            pairO00ooo = oooO.o00ooo(oo0ooo0, i2, jO0OoOo0);
        } else {
            pairO00ooo = oooo0.OooOOO0(oooO.f6355OooO00o, oooO.f7133OooOOO, iO00O0O, o00.Oooo0OO(jO0OoOo0));
            Object obj = pairO00ooo.first;
            if (oo0ooo1.OooO0o0(obj) != -1) {
                oo0ooo0 = oo0ooo1;
            } else {
                oo0ooo0 = oo0ooo1;
                Object objOooo0 = androidx.media3.exoplayer.OooOO0O.Oooo0(oooO.f6355OooO00o, oooO.f7133OooOOO, oooO.f7151OooOooo, oooO.f7154Oooo000, obj, oooo0, oo0ooo0);
                if (objOooo0 != null) {
                    Oooo0.OooO0O0 oooO0O0 = oooO.f7133OooOOO;
                    oo0ooo0.OooOO0O(objOooo0, oooO0O0);
                    int i3 = oooO0O0.f6642OooO0o;
                    pairO00ooo = oooO.o00ooo(oo0ooo0, i3, o00.o000oOoO(oo0ooo0.OooOOo0(i3, oooO.f6355OooO00o).f6680OooOOOo));
                } else {
                    pairO00ooo = oooO.o00ooo(oo0ooo0, -1, -9223372036854775807L);
                }
            }
        }
        o00O0OO o00o0ooO00o0O = oooO.o00o0O(o00o0oo2, oo0ooo0, pairO00ooo);
        int i4 = o00o0ooO00o0O.f34110OooO0o0;
        if (i4 != 1 && i4 != 4 && iMin > 0 && iMin == size2 && iO00O0O >= o00o0ooO00o0O.f34105OooO00o.OooOOoo()) {
            z = true;
        }
        if (z) {
            o00o0ooO00o0O = o00o0ooO00o0O.OooO0oO(4);
        }
        oooO.f7131OooOO0O.f7243OooOO0O.OooO0oO(iMin, oooO.f7158Oooo0OO).OooO00o();
        oooO.o000000O(o00o0ooO00o0O, 0, 1, !o00o0ooO00o0O.f34106OooO0O0.f33816OooO00o.equals(oooO.f7179Oooooo0.f34106OooO0O0.f33816OooO00o), 4, oooO.ooOO(o00o0ooO00o0O), -1, false);
    }

    @Override // androidx.media3.common.Player
    public final void OooO0Oo() {
        ((androidx.media3.exoplayer.OooO) this).o0OOO0o(true);
    }

    @Override // androidx.media3.common.Player
    public final void OooO0oo() {
        OooooO0(((androidx.media3.exoplayer.OooO) this).Oooo0oO(), 4);
    }

    @Override // androidx.media3.common.Player
    public final void OooOO0() {
        int iOoooOoo;
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        if (oooO.OooOo0().OooOo00() || oooO.OooO0o()) {
            return;
        }
        boolean zOooo00O = Oooo00O();
        if (OoooOo0() && !Oooo0o0()) {
            if (!zOooo00O || (iOoooOoo = OoooOoo()) == -1) {
                return;
            }
            if (iOoooOoo == oooO.Oooo0oO()) {
                Ooooo00(-9223372036854775807L, true, oooO.Oooo0oO());
                return;
            } else {
                OooooO0(iOoooOoo, 7);
                return;
            }
        }
        if (zOooo00O) {
            long currentPosition = oooO.getCurrentPosition();
            oooO.o00000();
            if (currentPosition <= 3000) {
                int iOoooOoo2 = OoooOoo();
                if (iOoooOoo2 == -1) {
                    return;
                }
                if (iOoooOoo2 == oooO.Oooo0oO()) {
                    Ooooo00(-9223372036854775807L, true, oooO.Oooo0oO());
                    return;
                } else {
                    OooooO0(iOoooOoo2, 7);
                    return;
                }
            }
        }
        Ooooo0o(7, 0L);
    }

    @Override // androidx.media3.common.Player
    public final boolean OooOOO0() {
        return OoooOoO() != -1;
    }

    @Override // androidx.media3.common.Player
    public final boolean OooOOo() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        Oooo0 oooo0OooOo0 = oooO.OooOo0();
        return !oooo0OooOo0.OooOo00() && oooo0OooOo0.OooOOo0(oooO.Oooo0oO(), this.f6355OooO00o).f6676OooOO0o;
    }

    @Override // androidx.media3.common.Player
    public final boolean OooOOo0(int i) {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        oooO.o00000();
        return oooO.f7160Oooo0o0.OooO0OO(i);
    }

    @Override // androidx.media3.common.Player
    public final void OooOo() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        if (oooO.OooOo0().OooOo00() || oooO.OooO0o()) {
            return;
        }
        if (!OooOOO0()) {
            if (OoooOo0() && OooOOo()) {
                OooooO0(oooO.Oooo0oO(), 9);
                return;
            }
            return;
        }
        int iOoooOoO = OoooOoO();
        if (iOoooOoO == -1) {
            return;
        }
        if (iOoooOoO == oooO.Oooo0oO()) {
            Ooooo00(-9223372036854775807L, true, oooO.Oooo0oO());
        } else {
            OooooO0(iOoooOoO, 9);
        }
    }

    @Override // androidx.media3.common.Player
    public final void OooOoO(int i, long j) {
        Ooooo00(j, false, i);
    }

    @Override // androidx.media3.common.Player
    public final long OooOoo() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        Oooo0 oooo0OooOo0 = oooO.OooOo0();
        if (oooo0OooOo0.OooOo00()) {
            return -9223372036854775807L;
        }
        return oooo0OooOo0.OooOOo0(oooO.Oooo0oO(), this.f6355OooO00o).OooO0OO();
    }

    @Override // androidx.media3.common.Player
    public final void Oooo0(long j) {
        Ooooo0o(5, j);
    }

    @Override // androidx.media3.common.Player
    public final boolean Oooo00O() {
        return OoooOoo() != -1;
    }

    @Override // androidx.media3.common.Player
    public final boolean Oooo0o0() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        Oooo0 oooo0OooOo0 = oooO.OooOo0();
        return !oooo0OooOo0.OooOo00() && oooo0OooOo0.OooOOo0(oooO.Oooo0oO(), this.f6355OooO00o).f6675OooOO0O;
    }

    @Override // androidx.media3.common.Player
    public final void OoooOO0() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        oooO.o00000();
        OooooOO(12, oooO.f7143OooOo0O);
    }

    @Override // androidx.media3.common.Player
    public final boolean OoooOo0() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        Oooo0 oooo0OooOo0 = oooO.OooOo0();
        return !oooo0OooOo0.OooOo00() && oooo0OooOo0.OooOOo0(oooO.Oooo0oO(), this.f6355OooO00o).OooO0Oo();
    }

    public final int OoooOoO() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        Oooo0 oooo0OooOo0 = oooO.OooOo0();
        if (oooo0OooOo0.OooOo00()) {
            return -1;
        }
        int iOooo0oO = oooO.Oooo0oO();
        oooO.o00000();
        int i = oooO.f7151OooOooo;
        if (i == 1) {
            i = 0;
        }
        oooO.o00000();
        return oooo0OooOo0.OooO0oo(iOooo0oO, i, oooO.f7154Oooo000);
    }

    public final int OoooOoo() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        Oooo0 oooo0OooOo0 = oooO.OooOo0();
        if (oooo0OooOo0.OooOo00()) {
            return -1;
        }
        int iOooo0oO = oooO.Oooo0oO();
        oooO.o00000();
        int i = oooO.f7151OooOooo;
        if (i == 1) {
            i = 0;
        }
        oooO.o00000();
        return oooo0OooOo0.OooOOOO(iOooo0oO, i, oooO.f7154Oooo000);
    }

    @VisibleForTesting(otherwise = 4)
    public abstract void Ooooo00(long j, boolean z, int i);

    public final void Ooooo0o(int i, long j) {
        Ooooo00(j, false, ((androidx.media3.exoplayer.OooO) this).Oooo0oO());
    }

    public final void OooooO0(int i, int i2) {
        Ooooo00(-9223372036854775807L, false, i);
    }

    public final void OooooOO(int i, long j) {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        long currentPosition = oooO.getCurrentPosition() + j;
        long jO00Oo0 = oooO.o00Oo0();
        if (jO00Oo0 != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, jO00Oo0);
        }
        Ooooo0o(i, Math.max(currentPosition, 0L));
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        return oooO.Oooo0o() == 3 && oooO.OooOoOO() && oooO.OooOo00() == 0;
    }

    @Override // androidx.media3.common.Player
    public final void o000oOoO() {
        androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) this;
        oooO.o00000();
        OooooOO(11, -oooO.f7141OooOo0);
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        ((androidx.media3.exoplayer.OooO) this).o0OOO0o(false);
    }
}
