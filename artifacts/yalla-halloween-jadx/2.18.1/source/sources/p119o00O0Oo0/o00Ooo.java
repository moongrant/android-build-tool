package p119o00O0Oo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p103o000oo00.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f30752OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f30753OooO0O0;

    public o00Ooo(Function0<Unit> function0, Function0<Unit> function1) {
        this.f30752OooO00o = function0;
        this.f30753OooO0O0 = function1;
    }

    @Override // p103o000oo00.OooOO0O
    public final void OooO00o() {
        Function0<Unit> function0 = this.f30753OooO0O0;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // p103o000oo00.OooOO0O
    public final void OooO0O0() {
        Function0<Unit> function0 = this.f30752OooO00o;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
