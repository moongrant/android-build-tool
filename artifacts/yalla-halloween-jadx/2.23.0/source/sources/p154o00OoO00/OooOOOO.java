package p154o00OoO00;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o0OO0O0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f38146OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f38147OooO0O0;

    public OooOOOO(Function0<Unit> function0, Function0<Unit> function1) {
        this.f38146OooO00o = function0;
        this.f38147OooO0O0 = function1;
    }

    @Override // o0OO0O0.OooO0OO
    public final void OooO00o() {
    }

    @Override // o0OO0O0.OooO0OO
    public final void OooO0O0() {
        Function0<Unit> function0 = this.f38146OooO00o;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o0OO0O0.OooO0OO
    public final void OooO0OO(int i) {
        Function0<Unit> function0;
        if (i != 1 || (function0 = this.f38147OooO0O0) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // o0OO0O0.OooO0OO
    public final void onPause() {
    }
}
