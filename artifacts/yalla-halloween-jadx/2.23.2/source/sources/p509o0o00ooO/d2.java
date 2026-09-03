package p509o0o00ooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f50646OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(w1 w1Var) {
        super(0);
        this.f50646OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f50646OooO0Oo.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
