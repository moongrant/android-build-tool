package p257o00ooOO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f34441Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f34442Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f34443Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(boolean z, o0O00OO<Boolean> o0o00oo2, Function0<Unit> function0) {
        super(0);
        this.f34441Oooo0o = z;
        this.f34442Oooo0oO = o0o00oo2;
        this.f34443Oooo0oo = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f34441Oooo0o) {
            this.f34442Oooo0oO.setValue(Boolean.FALSE);
        }
        this.f34443Oooo0oo.invoke();
        return Unit.INSTANCE;
    }
}
