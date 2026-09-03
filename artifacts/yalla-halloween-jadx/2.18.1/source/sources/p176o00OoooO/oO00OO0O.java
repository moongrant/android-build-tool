package p176o00OoooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p497o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class oO00OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f32846Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f32847Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(o0O00OO<Boolean> o0o00oo2, Function0<Unit> function0) {
        super(0);
        this.f32846Oooo0o = o0o00oo2;
        this.f32847Oooo0oO = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        OooOOO0.OooO().OooOOO0(this.f32846Oooo0o.getValue().booleanValue());
        this.f32847Oooo0oO.invoke();
        return Unit.INSTANCE;
    }
}
