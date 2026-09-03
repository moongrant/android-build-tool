package p155o00OoO0;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p144o00Oo.o000O0;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0OOO0o;
import p174o00OooOo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends oo0oOO0<o0OOO0o, o00oOoo<?>> implements o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00Oo0.OooO00o f37947OooO0Oo;

    @Override // p174o00OooOo.oo0oOO0
    public final int OooO0O0(@Nullable o00oOoo<?> o00oooo2) {
        o00oOoo<?> o00oooo3 = o00oooo2;
        if (o00oooo3 == null) {
            return 1;
        }
        return o00oooo3.getSize();
    }

    @Override // p174o00OooOo.oo0oOO0
    public final void OooO0OO(@NonNull o0OOO0o o0ooo0o2, @Nullable o00oOoo<?> o00oooo2) {
        o00oOoo<?> o00oooo3 = o00oooo2;
        o00Oo0.OooO00o oooO00o = this.f37947OooO0Oo;
        if (oooO00o == null || o00oooo3 == null) {
            return;
        }
        ((o000O0) oooO00o).f37563OooO0o0.OooO00o(o00oooo3, true);
    }

    @SuppressLint({"InlinedApi"})
    public final void OooO0o(int i) {
        long j;
        if (i >= 40) {
            OooO0o0(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.f38358OooO0O0;
            }
            OooO0o0(j / 2);
        }
    }
}
