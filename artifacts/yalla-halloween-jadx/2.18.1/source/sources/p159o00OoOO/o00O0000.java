package p159o00OoOO;

import java.util.Objects;
import java.util.TimerTask;
import o00OO00O.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 extends TimerTask {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00 f32470Oooo0o;

    public o00O0000(o00 o00Var) {
        this.f32470Oooo0o = o00Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        o00 o00Var = this.f32470Oooo0o;
        Objects.requireNonNull(o00Var.f32385OooO0oO);
        o00Var.OooOO0(OooO0O0.OooO00o(8, 100, null));
    }
}
