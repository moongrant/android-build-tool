package p530o0o0OOOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53438OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(o0O00oO0 o0o00oo1) {
        super(0);
        this.f53438OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00oO0 o0o00oo1 = this.f53438OooO0Oo;
        o0o00oo1.OooOO0o().f44845OooO0oo.OooO0oo();
        if (!StringsKt.isBlank(o0o00oo1.f53405OooOOo0)) {
            o0o00oo1.OooOOOo(o0o00oo1.f53405OooOOo0, true);
        } else {
            o0o00oo1.OooOOO(true);
        }
        return Unit.INSTANCE;
    }
}
