package p502o0o00oOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Ooooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oo0000 f49612OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f49613OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49614OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(o0oo0000 o0oo0000Var, int i, o0OOO0 o0ooo1) {
        super(0);
        this.f49612OooO0Oo = o0oo0000Var;
        this.f49614OooO0o0 = i;
        this.f49613OooO0o = o0ooo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function2<? super Integer, ? super Boolean, Unit> function2 = this.f49612OooO0Oo.f49493OooOO0;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(this.f49614OooO0o0), Boolean.valueOf(this.f49613OooO0o.OooO0Oo()));
        }
        return Unit.INSTANCE;
    }
}
