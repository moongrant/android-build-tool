package p341o0OO0ooo;

import java.io.IOException;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 extends oo0ooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f42719OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(o000Oo0 o000oo1, o0o0000 o0o0000Var) {
        super(o0o0000Var);
        this.f42719OooO0o0 = o000oo1;
    }

    @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
    public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
        o000Oo0 o000oo1 = this.f42719OooO0o0;
        int i = o000oo1.f42742OooO0O0;
        if (i == 0) {
            return -1L;
        }
        long jOooOO0O = super.OooOO0O(oo0oooo, Math.min(j, i));
        if (jOooOO0O == -1) {
            return -1L;
        }
        o000oo1.f42742OooO0O0 = (int) (((long) o000oo1.f42742OooO0O0) - jOooOO0O);
        return jOooOO0O;
    }
}
