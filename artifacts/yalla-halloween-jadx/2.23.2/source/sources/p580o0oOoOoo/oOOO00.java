package p580o0oOoOoo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p579o0oOoOoO.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO0O0O f56557OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00(oOO0O0O ooo0o0o) {
        super(1);
        this.f56557OooO0Oo = ooo0o0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f56557OooO0Oo.f56534OooO00o.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
