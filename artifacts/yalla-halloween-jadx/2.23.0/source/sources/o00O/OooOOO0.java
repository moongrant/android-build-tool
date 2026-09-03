package o00O;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p126o00O0oOo.o000OOo;
import p127o00O0oo.o0000;
import p127o00O0oo.o0O0O00;
import p532o0o0Oo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends o00000OO<o000OOo, o0000<?>> implements OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO.OooO00o f35953OooO0Oo;

    @Override // p532o0o0Oo.o00000OO
    public final int OooO0O0(@Nullable o0000<?> o0000Var) {
        o0000<?> o0000Var2 = o0000Var;
        if (o0000Var2 == null) {
            return 1;
        }
        return o0000Var2.getSize();
    }

    @Override // p532o0o0Oo.o00000OO
    public final void OooO0OO(@NonNull o000OOo o000ooo2, @Nullable o0000<?> o0000Var) {
        o0000<?> o0000Var2 = o0000Var;
        OooOOO.OooO00o oooO00o = this.f35953OooO0Oo;
        if (oooO00o == null || o0000Var2 == null) {
            return;
        }
        ((o0O0O00) oooO00o).f36849OooO0o0.OooO00o(o0000Var2, true);
    }

    @SuppressLint({"InlinedApi"})
    public final void OooO0o(int i) {
        long j;
        if (i >= 40) {
            OooO0o0(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.f54566OooO0O0;
            }
            OooO0o0(j / 2);
        }
    }
}
