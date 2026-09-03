package p524o0o0OO0o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53524OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(o0O00 o0o01) {
        super(0);
        this.f53524OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00 o0o01 = this.f53524OooO0Oo;
        o0o01.OooOO0o().f58264OooO0oo.OooO0oo();
        if (!StringsKt.isBlank(o0o01.f53471OooOOo0)) {
            o0o01.OooOOOo(o0o01.f53471OooOOo0, true);
        } else {
            o0o01.OooOOO(true);
        }
        return Unit.INSTANCE;
    }
}
