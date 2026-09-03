package p555o0oOOo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p214o00oO0.o00OO000;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o000000;
import p243o00oo00O.o000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O extends o000OO<o000000, o00OOOO0<?>> implements o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00000OO.OooO00o f44643OooO0Oo;

    public o00000O(long j) {
        super(j);
    }

    @Override // p243o00oo00O.o000OO
    public final int OooO0O0(@Nullable o00OOOO0<?> o00oooo1) {
        o00OOOO0<?> o00oooo2 = o00oooo1;
        if (o00oooo2 == null) {
            return 1;
        }
        return o00oooo2.getSize();
    }

    @Override // p243o00oo00O.o000OO
    public final void OooO0OO(@NonNull o000000 o000000Var, @Nullable o00OOOO0<?> o00oooo1) {
        o00OOOO0<?> o00oooo2 = o00oooo1;
        o00000OO.OooO00o oooO00o = this.f44643OooO0Oo;
        if (oooO00o == null || o00oooo2 == null) {
            return;
        }
        ((o00OO000) oooO00o).f33446OooO0o0.OooO00o(o00oooo2, true);
    }
}
