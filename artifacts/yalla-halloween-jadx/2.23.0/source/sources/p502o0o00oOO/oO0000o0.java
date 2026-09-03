package p502o0o00oOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oo0000 f49525OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(o0oo0000 o0oo0000Var) {
        super(0);
        this.f49525OooO0Oo = o0oo0000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f49525OooO0Oo.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
