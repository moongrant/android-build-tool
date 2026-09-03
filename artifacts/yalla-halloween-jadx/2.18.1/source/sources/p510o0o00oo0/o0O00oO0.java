package p510o0o00oo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p405o0Oo0OO0.OooO0o;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00oO0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f41995OooO00o;

    public o0O00oO0(Function0<Unit> function0) {
        this.f41995OooO00o = function0;
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onFinished() {
        Function0<Unit> function0 = this.f41995OooO00o;
        if (function0 != null) {
            function0.invoke();
        }
        o00O00.OooO0O0("ddddddddddonFinished");
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onPause() {
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onRepeat() {
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onStep(int i, double d) {
    }
}
