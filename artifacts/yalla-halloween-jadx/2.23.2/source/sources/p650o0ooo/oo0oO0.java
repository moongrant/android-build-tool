package p650o0ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0oo00 f59055OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<String, o0O0oo00, Unit> f59056OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0oO0(o0O0oo00 o0o0oo00, Function2<? super String, ? super o0O0oo00, Unit> function2) {
        super(0);
        this.f59055OooO0Oo = o0o0oo00;
        this.f59056OooO0o0 = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O0oo00 o0o0oo00 = this.f59055OooO0Oo;
        o0o0oo00.f58662OooO00o.setValue(Boolean.TRUE);
        this.f59056OooO0o0.invoke(o0o0oo00.f58665OooO0Oo.getValue(), o0o0oo00);
        return Unit.INSTANCE;
    }
}
