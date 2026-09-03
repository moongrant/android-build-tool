package com.google.android.exoplayer2;

import androidx.annotation.VisibleForTesting;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OooO0OO implements Player {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f11040OooO00o = new oo0o0Oo.OooO0OO();

    @Override // com.google.android.exoplayer2.Player
    public final void OooO0O0() {
        Oooo00O(true);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooO0o() {
        o00o0O(OooOo00(), 4);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooO0oO() {
        int iO00O0O;
        if (OooOO0().OooOOo0() || OooO0Oo()) {
            return;
        }
        boolean zOoooOo0 = OoooOo0();
        if (o0OoOo0() && !OooooO0()) {
            if (!zOoooOo0 || (iO00O0O = o00O0O()) == -1) {
                return;
            }
            if (iO00O0O == OooOo00()) {
                o00Oo0(-9223372036854775807L, true, OooOo00(), 7);
                return;
            } else {
                o00o0O(iO00O0O, 7);
                return;
            }
        }
        if (zOoooOo0) {
            long currentPosition = getCurrentPosition();
            OoooO0();
            if (currentPosition <= 3000) {
                int iO00O0O2 = o00O0O();
                if (iO00O0O2 == -1) {
                    return;
                }
                if (iO00O0O2 == OooOo00()) {
                    o00Oo0(-9223372036854775807L, true, OooOo00(), 7);
                    return;
                } else {
                    o00o0O(iO00O0O2, 7);
                    return;
                }
            }
        }
        o00Ooo(7, 0L);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooOOO0() {
        if (OooOO0().OooOOo0() || OooO0Oo()) {
            return;
        }
        if (!Oooo00o()) {
            if (o0OoOo0() && Oooo0OO()) {
                o00o0O(OooOo00(), 9);
                return;
            }
            return;
        }
        int iOoOO = ooOO();
        if (iOoOO == -1) {
            return;
        }
        if (iOoOO == OooOo00()) {
            o00Oo0(-9223372036854775807L, true, OooOo00(), 9);
        } else {
            o00o0O(iOoOO, 9);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooOOOO() {
        oo0o0Oo oo0o0ooOooOO0 = OooOO0();
        if (oo0o0ooOooOO0.OooOOo0()) {
            return -9223372036854775807L;
        }
        return o0O00.OoooOO0(oo0o0ooOooOO0.OooOOO(OooOo00(), this.f11040OooO00o).f12941OooOOo0);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooOo() {
        o00ooo(12, OooOOo0());
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooOoO0() {
        o00ooo(11, -OooOoO());
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean Oooo00o() {
        return ooOO() != -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean Oooo0O0(int i) {
        return Oooo().f11344OooO0Oo.f40569OooO00o.get(i);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean Oooo0OO() {
        oo0o0Oo oo0o0ooOooOO0 = OooOO0();
        return !oo0o0ooOooOO0.OooOOo0() && oo0o0ooOooOO0.OooOOO(OooOo00(), this.f11040OooO00o).f12935OooOO0o;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Oooo0oo(int i, long j) {
        o00Oo0(j, false, i, 10);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean OoooOo0() {
        return o00O0O() != -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OoooOoo(long j) {
        o00Ooo(5, j);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean OooooO0() {
        oo0o0Oo oo0o0ooOooOO0 = OooOO0();
        return !oo0o0ooOooOO0.OooOOo0() && oo0o0ooOooOO0.OooOOO(OooOo00(), this.f11040OooO00o).f12934OooOO0O;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlaying() {
        return OooOOoo() == 3 && OooOOO() && Oooo0o0() == 0;
    }

    public final int o00O0O() {
        oo0o0Oo oo0o0ooOooOO0 = OooOO0();
        if (oo0o0ooOooOO0.OooOOo0()) {
            return -1;
        }
        int iOooOo00 = OooOo00();
        int iOooOo0 = OooOo0();
        if (iOooOo0 == 1) {
            iOooOo0 = 0;
        }
        return oo0o0ooOooOO0.OooOO0o(iOooOo00, iOooOo0, OooOo0O());
    }

    @VisibleForTesting(otherwise = 4)
    public abstract void o00Oo0(long j, boolean z, int i, int i2);

    public final void o00Ooo(int i, long j) {
        o00Oo0(j, false, OooOo00(), i);
    }

    public final void o00o0O(int i, int i2) {
        o00Oo0(-9223372036854775807L, false, i, i2);
    }

    public final void o00ooo(int i, long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        o00Ooo(i, Math.max(currentPosition, 0L));
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean o0OoOo0() {
        oo0o0Oo oo0o0ooOooOO0 = OooOO0();
        return !oo0o0ooOooOO0.OooOOo0() && oo0o0ooOooOO0.OooOOO(OooOo00(), this.f11040OooO00o).OooO00o();
    }

    public final int ooOO() {
        oo0o0Oo oo0o0ooOooOO0 = OooOO0();
        if (oo0o0ooOooOO0.OooOOo0()) {
            return -1;
        }
        int iOooOo00 = OooOo00();
        int iOooOo0 = OooOo0();
        if (iOooOo0 == 1) {
            iOooOo0 = 0;
        }
        return oo0o0ooOooOO0.OooO0o0(iOooOo00, iOooOo0, OooOo0O());
    }

    @Override // com.google.android.exoplayer2.Player
    public final void pause() {
        Oooo00O(false);
    }
}
